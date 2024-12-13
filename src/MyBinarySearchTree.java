
public class MyBinarySearchTree<T extends Comparable<T>> {
	 private MyBinaryNode<T> root;
	    private int size;

	    public MyBinarySearchTree() {
	        this.root = null;
	        this.size = 0;
	    }
	    public void add(T key) {
	        root = addRecursive(root, key);
	    }

	    private MyBinaryNode<T> addRecursive(MyBinaryNode<T> current, T key) {
	        if (current == null) {
	            size++;
	            return new MyBinaryNode<>(key);
	        }

	        if (key.compareTo(current.key) < 0) {
	            current.left = addRecursive(current.left, key);
	        } else if (key.compareTo(current.key) > 0) {
	            current.right = addRecursive(current.right, key);
	        }

	        return current;
	    }
	    public int size() {
	        return size;
	    }
	    public boolean search(T key) {
	        return searchRecursive(root, key);
	    }

	    private boolean searchRecursive(MyBinaryNode<T> current, T key) {
	        if (current == null) {
	            return false;
	        }

	        if (key.equals(current.key)) {
	            return true;
	        }

	        return key.compareTo(current.key) < 0 
	            ? searchRecursive(current.left, key) 
	            : searchRecursive(current.right, key);
	    }
}
