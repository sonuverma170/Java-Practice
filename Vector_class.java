import java.util.Vector;

public class Vector_class 
{
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(null);
        v.add(8);
        v.add(null);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        // System.out.println(v.remove(5));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

    }

}
