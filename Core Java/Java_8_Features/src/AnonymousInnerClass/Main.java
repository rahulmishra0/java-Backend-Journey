//Anonymous inner class tab use hota h jab functional interface ke ander ek se jada abstract class ho
//but fir lambda expression use nahi hoga
package AnonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        //Interface ka to object nahi banta
        //to ye Anonymous class h ye without name
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100";
            }

            @Override
            public String getDesignation() {
                return "";
            }
        };
        System.out.println(employee.getSalary());

    }
}
