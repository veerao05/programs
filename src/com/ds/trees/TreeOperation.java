package com.ds.trees;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }

}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    /* Function to print REVERSE level order traversal a tree
    Time Complexity:  O(n^2)
    Auxiliary Space: O(h), where h is the height of the tree, this space is due to the recursive call stack*/
    void reverseLevelOrder(TreeNode node) {
        int h = height(node);
        int i;
        for (i = h; i >= 1; i--)
        //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
        {
            printCurrentOrder(node, i);
        }
    }

    /*
    Time Complexity: O(N2), where N is the number of nodes in the skewed tree.
    Auxiliary Space: O(1) If the recursion stack is considered the space used is O(N).
     */
    void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printCurrentOrder(root, i);
        }
    }

    /*
    Time Complexity: O(N)
    Auxiliary Space: O(N) due to recursive stack.
     */
    int height(TreeNode node) {
        if (node == null) return 0;
        else {
            int lheight = height(node.left);
            int rheight = height(node.right);

            if (lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
        }

    }

    void printCurrentOrder(TreeNode node, int level) {
        if (node == null) return;
        if (level == 1) System.out.print(node.data + " ");
        else if (level > 1) {
            printCurrentOrder(node.left, level - 1);
            printCurrentOrder(node.right, level - 1);
        }

    }

    void printLevelOrderUsingQueue() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // Enqueue left child
            if (Objects.nonNull(tempNode.right)) {
                queue.add(tempNode.right);
            }

            // Enqueue right child
            if (Objects.nonNull(tempNode.left)) {
                queue.add(tempNode.left);
            }
        }

    }

    /*
    Time Complexity: O(N2)
    Auxiliary Space: O(N) for call stack
     */
    int diameter(TreeNode root) {
        // base case if tree is empty
        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int lheight = height(root.left);
        int rheight = height(root.right);

        // get the diameter of left and right sub-trees
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right
          subtree + 1
         */
        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
    }

    public static void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }

    /*
    Time Complexity: O(n), where n is the number of nodes in the tree.
    This is because we need to visit each node in the tree exactly once to swap its left and right child nodes.
    Auxiliary Space: O(h), where h is the height of the binary tree
     */
    public static TreeNode mirrorTree(TreeNode node) {
        if (node == null) return null;
        TreeNode left = mirrorTree(node.left);
        TreeNode right = mirrorTree(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    /*
    Iterative Preorder Traversal
    Given a Binary Tree, write an iterative function to print the Preorder traversal of the given binary tree.
   Refer to this for recursive preorder traversal of Binary Tree. To convert an inherently recursive procedure to iterative, we need an explicit stack.
   Following is a simple stack based iterative process to print Preorder traversal.
   Create an empty stack nodeStack and push root node to stack.
   Do the following while nodeStack is not empty.
   Pop an item from the stack and print it.
   Push right child of a popped item to stack
   Push left child of a popped item to stack
   The right child is pushed before the left child to make sure that the left subtree is processed first.
   */
    static void iterativePreeOrder(TreeNode node) {
        if (node == null) return;
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(node);

         /* Pop all items one by one. Do following for every popped item
         a) print it
         b) push its right child
         c) push its left child
         Note that right child is pushed first so that left is processed first */

        while (!nodeStack.empty()) {

            // Pop the top item from stack and print it
            TreeNode latestNode = nodeStack.peek();
            System.out.println(latestNode.data + " ");
            nodeStack.pop();

            // Push right and left children of the popped node to stack
            if (Objects.nonNull(latestNode.right)) {
                nodeStack.push(latestNode.right);
            }
            if (Objects.nonNull(latestNode.left)) {
                nodeStack.push(latestNode.left);
            }
        }


    }

    /*
    Algorithm Inorder(tree)
    Traverse the left subtree, i.e., call Inorder(left->subtree)
    Visit the root.
    Traverse the right subtree, i.e., call Inorder(right->subtree)
    In Order traversal recursion
    Time Complexity: O(N)
    Auxiliary Space: If we don’t consider the size of the stack for function calls then O(1) otherwise O(h) where h is the height of the tree.
     */
    static void printInorder(TreeNode node) {
        if (node == null)
            return;
        // First recur on left child
        printInorder(node.left);

        // Then print the data of node
        System.out.print(node.data + " ");

        // Now recur on right child
        printInorder(node.right);
    }

    /*
    Algorithm Preorder(tree)
    Visit the root.
    Traverse the left subtree, i.e., call Preorder(left->subtree)
    Traverse the right subtree, i.e., call Preorder(right->subtree)
     */
    // Given a binary tree, print its nodes in preorder
    static void printPreorder(TreeNode node) {
        if (node == null)
            return;

        // First print data of node
        System.out.print(node.data + " ");

        // Then recur on left subtree
        printPreorder(node.left);

        // Now recur on right subtree
        printPreorder(node.right);
    }

    /*
    Algorithm Postorder(tree)
   Traverse the left subtree, i.e., call Postorder(left->subtree)
   Traverse the right subtree, i.e., call Postorder(right->subtree)
   Visit the root
   Given a binary tree, print its nodes according to the
   "bottom-up" postorder traversal.
   Time Complexity: O(N)
   Auxiliary Space: If we don’t consider the size of the stack for function calls then O(1) otherwise O(h) where h is the height of the tree.
   */
    static void printPostorder(TreeNode node) {
        if (node == null)
            return;

        // First recur on left subtree
        printPostorder(node.left);

        // Then recur on right subtree
        printPostorder(node.right);

        // Now deal with the node
        System.out.print(node.data + " ");
    }

    /*
    1. Push root to first stack.
    2. Loop while first stack is not empty
    2.1 Pop a node from first stack and push it to second stack
    2.2 Push left and right children of the popped node to first stack
    3. Print contents of second stack
    Time complexity: O(n) where n is no of nodes in a binary tree
    Auxiliary space: O(n) because using stack s1 and s2
     */
    static void postOrderIterative(TreeNode root) {
        Stack s1 = new Stack<>();
        Stack s2 = new Stack<>();

        if (root == null)
            return;

        // push root to first stack
        s1.push(root);

        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            TreeNode temp = (TreeNode) s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if (Objects.nonNull(temp.left))
                s1.push(temp.left);
            if (Objects.nonNull(temp.right))
                s1.push(temp.right);
        }

        // Print all elements of second stack
        while (!s2.isEmpty()) {
            TreeNode temp = (TreeNode) s2.pop();
            System.out.print(temp.data + " ");
        }

    }

    /*
    Create an empty stack (say S).
    Initialize the current node as root.
    Push the current node to S and set current = current->left until current is NULL
    If current is NULL and the stack is not empty then:
    Pop the top item from the stack.
    Print the popped item and set current = popped_item->right
    Go to step 3.
    If current is NULL and the stack is empty then we are done.
    Time Complexity: O(N) where N is the number of nodes in the tree
    Auxiliary Space: O(N)
    */
    static void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        if (curr == null) return;
        // Traverse the tree
        while (Objects.nonNull(curr) || stack.size() > 0) {

            // Reach the left most Node of the
            // curr Node
            while (Objects.nonNull(curr)) {
                // Place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                stack.push(curr);
                curr = curr.left;
            }
            // Current must be NULL at this point
            curr = stack.pop();
            System.out.println(curr.data + " ");

            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }

    }
    /* left view of tree
       Input:
                  4
               /   \
             5     2
                  /   \
               3     1
             /  \
          6    7

       Output: 4 5 3 6
       Time Complexity: O(N), where n is the number of nodes in the binary tree.
       Auxiliary Space: O(N) since using space for auxiliary queue

     */
    static void printLeftView(TreeNode node){
        if(node == null) return;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            // number of nodes at current level
            int n= queue.size();
            // Traverse all nodes of current level
            for (int i=1;i<=n;i++){
                TreeNode temp=queue.poll();
                // Print the left most element at
                // the level
                if(i==1)System.out.println(temp.data + " ");
                //if left child is not null add to queue
                if(Objects.nonNull(temp.left))queue.add(temp.left);
                //if right child is not null add to queue
                if(Objects.nonNull(temp.right))queue.add(temp.right);
            }
        }

    }

    /* right view of tree
      Input:
          1
       /     \
     2        3
   /   \       /  \
  4     5   6    7
                 \
                   8
  Output: Right view of the tree is 1 3 7 8
  Time Complexity: O(N), where n is the number of nodes in the binary tree.
  Auxiliary Space: O(N) since using space for auxiliary queue
  The idea is to use Level Order Traversal as the last node every level gives the right view of the binary tree.
  Follow the steps below to solve the problem:
  Perform level order traversal on the tree
  At every level print the last node of that level

 */
    static void printRightView(TreeNode node){
        if(node == null) return;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){

            int n= queue.size();
            // traverse all the nodes of the current level
            for (int i=0;i<n;i++){
                TreeNode temp=queue.peek();
                queue.remove();
                //print the last node of the tree
                if(i==n-1)System.out.println(temp.data + " ");
                //if left child is not null add to queue
                if(Objects.nonNull(temp.left))queue.add(temp.left);
                //if right child is not null add to queue
                if(Objects.nonNull(temp.right))queue.add(temp.right);
            }
        }

    }
    /* pending : BFS and DFS */

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(5);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(6);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(4);

        System.out.print("\nLeft view of the tree: \n");
        printLeftView(tree.root);

        System.out.print("\nRight view of the tree: \n");
        printRightView(tree.root);

        System.out.print("\nInPreOrder traversal of tree using recursion:: \n");
        printPreorder(tree.root);

        System.out.print("\nInPreOrder traversal of tree using iteration:: \n");
        iterativePreeOrder(tree.root);

        System.out.print("\nInOrder traversal of tree:: \n");
        printInorder(tree.root);

        System.out.print("\nInOrder traversal of tree iterative:: \n");
        inOrderIterative(tree.root);


        System.out.print("\nInPostOrder traversal of tree:: \n");
        postOrderIterative(tree.root);

        System.out.print("\nInPostOrder traversal of tree iterative:: \n");
        printPostorder(tree.root);


        System.out.println("\nLevel order traversal of"
                + "binary tree is \n");
        tree.printLevelOrder();

        System.out.println();

        System.out.println("\nLevel order traversal of "
                + "binary tree using Queue is \n");
        tree.printLevelOrderUsingQueue();
        System.out.println();

        System.out.println("\nReverse Level order traversal of"
                + "binary tree using Queue is \n");
        tree.reverseLevelOrder(tree.root);
        System.out.println();

        System.out.println("\nHeight of the tree \n" + tree.height(tree.root));

        System.out.println("\nDiameter of the tree \n" + tree.diameter(tree.root));

        System.out.print("\nInorder of original tree: \n");
        inOrder(tree.root);
        mirrorTree(tree.root);

        System.out.print("\nInorder of mirror tree: \n");
        inOrder(tree.root);


    }
}
