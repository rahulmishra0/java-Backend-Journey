public class Backend implements Course{
    @Override
    public String getCourseName() {
        return "Backend Mastery";
    }

    @Override
    public void read() {
        System.out.println("Only Backend");
    }
}
