package Binary;

public class Faculty extends Entry {
    // Faculty have four special fields
    private String office;
    private int extension;
    private String dept;
    private int firstYear;

    public Faculty (String first, String last, String addr, String room,
             int ext, String department, int yr) {
        super(first, last, addr);
        office = room;
        extension = ext;
        dept = department;
        firstYear = yr;
    }

    // toString method to yield nicely formatted output string
    public String toString () {
        return super.toString()
            + "   Office:  " + office+ "\tOffice Extenstion:  " + extension
            + "\n   Department:  " + dept
            + "\n   First Year at Grinnell:  " + firstYear + "\n";
    }

    public static void main (String [] argv) {
        // set up three objects
        Faculty A = new Faculty ("Janet", "Gibson", "gibson@grinnell.edu",
                                 "Science 0420", 3168,
                                 "Psychology", 1989);
        Faculty B = new Faculty ("Henry", "Walker", "walker@cs.grinnell.edu",
                                 "Science 2420", 4208, 
                                 "Mathematics and Computer Science", 1973);
        Faculty C = new Faculty ("John", "Stone", "stone@math.grin.edu",
                                 "Science 2418", 3181,
                                 "Mathematics and Computer Science", 1983);
        Faculty D = new Faculty ("Samuel", "Rebelsky", "rebelsky@cs.grin.edu",
                                 "Science 2427", 4410,
                                 "Mathematics and Computer Science", 1997);

        // print objects
        System.out.println();
        System.out.println ("Person A:" + A);
        System.out.println ("Person B:" + B);
        System.out.println ("Person C:" + C);
        System.out.println ("Person D:" + D);

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
