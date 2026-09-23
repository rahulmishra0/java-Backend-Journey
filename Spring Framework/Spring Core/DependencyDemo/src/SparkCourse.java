public class SparkCourse implements Course{
    @Override
    public String getCourseName() {
        return "Java Full Stack";
    }

    @Override
    public void read() {
        System.out.println("Java, Spring Boot");
    }
}
