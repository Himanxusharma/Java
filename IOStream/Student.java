package IOStream;
import java.io.Serializable;

public class Student implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String name;
    private static String Address;
    private int mob;
    private transient int id;

    Student() {
    };

    Student(String name, String Address, int mob,int id) {
        this.name = name;
        this.Address = Address;
        this.mob = mob;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAddress: " + Address + "\nMob : " + mob + "\nid: " + id;
    }
}
