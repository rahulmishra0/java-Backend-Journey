public class StaticBlock {
    static int number;
    //static block -> use instance variable ko jagah dene ke liye
    //chahe kitne bhi object banao ye ek baar hi chalega constructor se pahle
    //and isko memory m jagah class load hote hi mil jayegi
    static {
        number = 100;
        System.out.println("static block executed");
    }

    //constructor
    StaticBlock(){
        System.out.println("constructor executed");
    }

    public static void main(String[] args) {
        StaticBlock s1 = new StaticBlock();
        StaticBlock s2 = new StaticBlock();
        System.out.println(number);
    }
}
