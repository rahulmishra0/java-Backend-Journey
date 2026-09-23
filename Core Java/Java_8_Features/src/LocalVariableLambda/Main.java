package LocalVariableLambda;

public class Main {
    int x = 20;
    //int a = 33; //instance variable
//    public static void main(String[] args) {
//        doSomething();
//   }

    private void doSomething(){
       // int a = 2; //local variable
        Employee emp = () ->{
            //a = 3; //local variable can be changed because in lambda local variable is final.
            return "100";
        };
        System.out.println(emp.getSalary());
    }
    //Anonymous inner class
    Employee emp1 = new Employee() {
        int x = 10;
        @Override
        public String getSalary() {
            System.out.println(this.x);
            return "100";
        }
    };
}
