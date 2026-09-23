package Problem;

class ClassRoom{
    boolean classStarted = false;

    public synchronized void waitForTeacher() throws InterruptedException {
        while (!classStarted){
            System.out.println("student : waiting for teacher........");
            wait();
        }
        System.out.println("Student : joining class!");
    }

    public synchronized void startClass(){
        System.out.println("teacher : starting class");
        classStarted = true;
        notify();
    }
}
class StudentThread extends Thread{
    private ClassRoom classRoom;

    public StudentThread(ClassRoom classRoom){
        this.classRoom = classRoom;
    }

    @Override
    public void run() {
        try {
            classRoom.waitForTeacher();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class TeacherThread extends Thread{
    private ClassRoom classRoom;

    public TeacherThread(ClassRoom classRoom){
        this.classRoom = classRoom;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        classRoom.startClass();
    }
}

public class ClassTest {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();

        StudentThread studentThread = new StudentThread(classRoom);
        TeacherThread teacherThread = new TeacherThread(classRoom);

        studentThread.start();
        teacherThread.start();
    }
}
