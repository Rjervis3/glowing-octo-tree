package Binary;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTreeTest {

	@Test
	public void test() {
		  Entry A = new Entry ("Terry", "Walker", "walkert@math.grin.edu");
	      Entry B = new Entry ("Henry", "Walker", "walker@cs.grinnell.edu");
	      Entry C = new Entry ("Barbara", "Walker", "barbara@cs.grin.edu");
	        
	      BSTree<Entry> a = new BSTree<Entry>();
	      
	      a.insert(A);
	      a.insert(B);
	      a.insert(C);
	      
	      a.print();
	      
	      assertEquals(a.nodeLevel(A), 1);
	      assertEquals(a.nodeLevel(B), 1);
	      assertEquals(a.nodeLevel(C), 1);
	}

}
