package Binary;

public class Student extends Entry {
    // Students have two special fields
    private int year;
    private String POBox;

    public Student (String first, String last, String addr, int yr, String box) {
        super(first, last, addr);
        year = yr;
        POBox = box;
    }

    // toString method to yield nicely formatted output string
    public String toString () {
        return super.toString() + "   Class Year:  " + year
                                + "\n   Campus P. O. Box:  " + POBox + "\n";
    }

    public static void main (String [] argv) {
        // set up three objects
        Student A = new Student ("Terry", "Walker", "walkert@math.grin.edu",
                                 1970, "off-campus");
        Student B = new Student ("Henry", "Walker", "walker@cs.grinnell.edu",
                                 1969, "Y-06");
        Student C = new Student ("Barbara", "Walker", "barbara@cs.grin.edu",
                                 2002, "12-34-56");

        // print objects
        System.out.println();
        System.out.println ("Person A:" + A);
        System.out.println ("Person B:" + B);
        System.out.println ("Person C:" + C);

        // since methods equals and compareTo are inherited, 
        //     testing may or may not be done 

        // check comparisons
        // System.out.println();
        // System.out.println ("Results of equals");
        // System.out.println ("\tA\tB\tC");
        // System.out.println ("A\t"+A.equals(A)+"\t"+A.equals(B)+"\t"+A.equals(C));
        // System.out.println ("B\t"+B.equals(A)+"\t"+B.equals(B)+"\t"+B.equals(C));
        // System.out.println ("C\t"+C.equals(A)+"\t"+C.equals(B)+"\t"+C.equals(C));
         
        // System.out.println ("Results of compareTo");
        // System.out.println ("\tA\tB\tC");
        // System.out.println ("A\t" + A.compareTo(A) + "\t"
        //                + A.compareTo(B) + "\t" + A.compareTo(C));
        // System.out.println ("B\t" + B.compareTo(A) + "\t"
        //                + B.compareTo(B) + "\t"+B.compareTo(C));
        // System.out.println ("C\t" + C.compareTo(A) + "\t"
        //                + C.compareTo(B) + "\t"+C.compareTo(C));
    }
}
