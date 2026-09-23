package ComparableAndComparator;

public class ComparableDemo implements Comparable<ComparableDemo>{

    int id;
    String name;

    ComparableDemo(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        System.out.println("Comparing "+this.id+" with "+o.id);
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return id+"_"+name;
    }
}
