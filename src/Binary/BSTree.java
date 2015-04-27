package Binary;

public class BSTree <E extends Comparable> implements Comparable<E>{

    private TreeNode root;

    BSTree () {
        root = null;
    }

    public void insert (E newEntry) {
        if (root == null)
            root = new TreeNode(newEntry);
        else {
            TreeNode ptr = root;  // pointer to node in search for leaf
            while (ptr != null) {// search for leaf
                if (newEntry.compareTo(ptr.getData()) < 0) {
                    // insert on left of given node
                    if (ptr.getLeft() == null) {
                        // when at end of tree, insert
                        ptr.setLeft(new TreeNode(newEntry));
                        return; 
                    } else 
                        // move left in tree and continue search
                        ptr = ptr.getLeft();
                } else {
                    // insert on right of given node
                    if (ptr.getRight() == null) {
                        // when at end of tree, insert
                        ptr.setRight(new TreeNode(newEntry));
                        return;
                    } else
                        // move right in tree and continue search
                        ptr = ptr.getRight();
                }
            }

            // insertion should be done by now!!
            // exception could be thrown or error message printed here!!
        }
    }
    
    public int countNodes(TreeNode<E> base)
    {
    	int count = 0;
    	if(root.getRight() == null && root.getLeft() == null)
    		return 1;
    	else if (root.getRight() == null)
    		{
    		count += countNodes(root.getLeft());
    		}
    	else if (root.getLeft() == null)
    	{
    		count += countNodes(root.getRight());
    	}
    	else
    	{
    		count+= countNodes(root.getRight())+countNodes(root.getLeft());
    	}
    	return count;
    }
    /** A method to return the level of a node
     * 
     * @param data data of node we search for
     * @return level of node or -1 if not found
     */
    public int nodeLevel(E data){
    	/* start searching at root */
    	int level = 0;
    	TreeNode ptr = root;  // pointer to node in search of data
    	
    	while(data.compareTo(ptr.data) != 0){
    		
    	if(data.compareTo(ptr.data) < 0){ // look on left side
    		ptr = ptr.getLeft();
    		level++; //move down a level
    	}
    	else if (data.compareTo(ptr) > 0)
    	{
    		ptr = ptr.getRight();
    		level++; //move down a level
    	}
    	else if (data.compareTo(ptr) == 0);
    		return level; 
    	}
    		   
    	return -1;
    }
    
    public void printLeaves () {
        System.out.println ("Directory Listing");
        printLeavesKernel (root);
        System.out.println ();
        System.out.println ("End of Listing");
    }
    
    public void printLeavesKernel (TreeNode<E> base) {
        if (base != null) {
        	printLeavesKernel (base.getLeft());
            if(base.getLeft()== null && base.getRight()==null)
            	System.out.print(base.getData());
            
            printLeavesKernel (base.getRight());         
        }
    }
    
    public void print () {
        System.out.println ("Directory Listing");
        printKernel (root);
        System.out.println ();
        System.out.println ("End of Listing");
    }

    private void printKernel (TreeNode<E> base) {
        // to print elements in a tree (using an in-order traversal),
        //     print the left subtree
        //     print the elements in a node
        //     print the right subtree
        if (base != null) {
            printKernel (base.getLeft());
            System.out.print(base.getData());
            printKernel (base.getRight());
        }
    }

    public E lookup (E desiredItem) {
        return lookupKernel (root, desiredItem);
    }

    public E lookupKernel (TreeNode<E> base, E desiredItem) {
        if (base == null)
            return null;
        else if (base.getData().compareTo(desiredItem) == 0)
            return base.getData();
        else if (base.getData().compareTo(desiredItem) < 0)
            return lookupKernel (base.getRight(), desiredItem);
        else return lookupKernel (base.getLeft(), desiredItem);
    }
    
    public E lookupIterative(TreeNode<E> base, E desiredItem)
    {
    	if (base == null)
    		return null;
    	while(base.getData().compareTo(desiredItem) != 0)
    	{
    	if(base.getData().compareTo(desiredItem) < 0)
    		base = base.getRight();
    	else base = base.getLeft();
    	}
    	
    	return base.getData();
    }
  }

