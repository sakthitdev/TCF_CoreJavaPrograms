package day2;

public class customerDemo {

    public static void main(String[] args) {
        
        customer c1 = new customer();
        c1.setCid(101);
        c1.setName("Sathiya");
        c1.setCity("Mumbai");
        System.out.println(c1);   // object printing invokes toString()

        customer c2 = new customer();
        c2.setCid(102);
        c2.setName("Niraimathy");
        c2.setCity("Chennai");
        System.out.println(c2);

        customer c3 = new customer();
        c3.setCid(103);
        c3.setName("Sravya");
        c3.setCity("Bangalore");
        System.out.println(c3);
    }
}
