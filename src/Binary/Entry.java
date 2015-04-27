package Binary;

import java.lang.Comparable;

public class Entry implements Comparable <Entry> {
    // a generic entry in a directory
    // use "protected" here, so variables may be accessed in subclasses
    protected String firstName;
    protected String lastName;
    protected String eMail;

    public Entry () {
        firstName = "";
        lastName = "";
        eMail = "";
    }

    public Entry (String first, String last, String eAddress) {
        firstName = first;
        lastName = last;
        eMail = eAddress;
    }

    // equals method for another Entry
    public boolean equals (Entry otherEntry) {
        return (firstName.equals(otherEntry.firstName)
                && lastName.equals(otherEntry.lastName));
    }

    // compareTo method for another Entry
    public int compareTo (Entry otherEntry) {
        if (lastName.equals(otherEntry.lastName))
            return firstName.compareTo(otherEntry.firstName);
        else return lastName.compareTo(otherEntry.lastName);
    }

    // toString method to yield nicely formatted output string
    public String toString () {
        return "\nName:  " + firstName + " " + lastName
            + "\n   E-mail Address:  " + eMail + "\n";

    }

    public static void main (String [] argv) {
        // set up three objects
        Entry A = new Entry ("Terry", "Walker", "walkert@math.grin.edu");
        Entry B = new Entry ("Henry", "Walker", "walker@cs.grinnell.edu");
        Entry C = new Entry ("Barbara", "Walker", "barbara@cs.grin.edu");
        
        // print objects
        System.out.println();
        System.out.println ("Person A:" + A);
        System.out.println ("Person B:" + B);
        System.out.println ("Person C:" + C);

        // check comparisons
        System.out.println();
        System.out.println ("Results of equals for entries");
        System.out.println ("\tA\tB\tC");
        System.out.println ("A\t"+A.equals(A)+"\t"+A.equals(B)+"\t"+A.equals(C));
        System.out.println ("B\t"+B.equals(A)+"\t"+B.equals(B)+"\t"+B.equals(C));
        System.out.println ("C\t"+C.equals(A)+"\t"+C.equals(B)+"\t"+C.equals(C));

        System.out.println();
        System.out.println ("Results of compareTo for entries");
        System.out.println ("\tA\tB\tC");
        System.out.println ("A\t" + A.compareTo(A) + "\t"
                       + A.compareTo(B) + "\t" + A.compareTo(C));
        System.out.println ("B\t" + B.compareTo(A) + "\t"
                       + B.compareTo(B) + "\t"+B.compareTo(C));
        System.out.println ("C\t" + C.compareTo(A) + "\t"
                       + C.compareTo(B) + "\t"+C.compareTo(C));

    } // end of testing in main
}
