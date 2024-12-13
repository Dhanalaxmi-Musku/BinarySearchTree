
public class BinarySearchTreeMain {

	public static void main(String[] args) {
		System.out.println("Creating BST with 56, 30, 70");
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        System.out.println("Tree Size: " + bst.size());

        System.out.println("Adding Complete Binary Tree");
        MyBinarySearchTree<Integer> completeBST = new MyBinarySearchTree<>();
        completeBST.add(56);
        completeBST.add(30);
        completeBST.add(70);
        completeBST.add(22);
        completeBST.add(40);
        completeBST.add(60);
        completeBST.add(95);
        completeBST.add(11);
        completeBST.add(65);
        completeBST.add(3);
        completeBST.add(16);
        completeBST.add(63);
        completeBST.add(67);
        System.out.println("Complete Tree Size: " + completeBST.size());

	}

}
