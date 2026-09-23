import java.lang.reflect.Field;

public class FieldInjectionDemo {

    private FieldInjectionDemo(){

    }
                    //kisme inject karna h Student m kya inject karna h Course.
    public static void injectCourse(Student student, Course course){

        try {
            Field declaredField = Student.class.getDeclaredField("course");
            declaredField.setAccessible(true); //private field ko class se bahar access karne ke liye
            declaredField.set(student, course);
        }
        catch (ReflectiveOperationException e){
            e.printStackTrace();
        }
    }
}
//Spring Boot m Field injection internally Reflection Api ka hi use karata h