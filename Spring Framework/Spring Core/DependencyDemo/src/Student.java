public class Student {

    private final int rollNum;
    private final String name;
    private Course course; //Course object

    //maine final ko declare nahi kiya isliye constructor banana pada
    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    //constructor Dependency injection
    public Student(int rollNum, String name, Course course) {
        this.rollNum = rollNum;
        this.name = name;
        this.course = course;
    }

    //sirf course ka hi setter banega kyuki baki dono final h
    public void setCourse(Course course) {
        this.course = course;
    }

    public void display(){
        System.out.println("Student roll num : "+rollNum);
        System.out.println("Student Name : "+name);

        if (course == null){
            System.out.println("No Course Assigned");
            return;
        }

        System.out.println("Assigned Course "+course.getCourseName());
        course.read();
    }

}
