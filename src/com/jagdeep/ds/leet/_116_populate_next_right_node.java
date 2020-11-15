package com.jagdeep.ds.leet;

public class _116_populate_next_right_node {

    static class TreeLinkNode {
        public int val;
        public TreeLinkNode left;
        public TreeLinkNode right;
        public TreeLinkNode neighbor;

        public TreeLinkNode() {
        }

        public TreeLinkNode(int _val) {
            val = _val;
        }

        public TreeLinkNode(int _val, TreeLinkNode _left, TreeLinkNode _right, TreeLinkNode _neighbor) {
            val = _val;
            left = _left;
            right = _right;
            neighbor = _neighbor;
        }

        @Override
        public String toString() {
            return ""+val;
        }
    }

    /*
                            0
                      1             2
                  3              5     6
                                      7   8
    */
    public static void main(String[] args) {

        TreeLinkNode root = new TreeLinkNode(0);

        TreeLinkNode n1 = new TreeLinkNode(1);
        TreeLinkNode n2 = new TreeLinkNode(2);
        TreeLinkNode n3 = new TreeLinkNode(3);
        TreeLinkNode n5 = new TreeLinkNode(5);
        TreeLinkNode n6 = new TreeLinkNode(6);
        TreeLinkNode n7 = new TreeLinkNode(7);
        TreeLinkNode n8 = new TreeLinkNode(8);
        TreeLinkNode n9 = new TreeLinkNode(9);

        root.left = n1;
        root.right = n2;

        n1.left = n3;

        n3.left = n9;

        n2.left = n5;
        n2.right = n6;

        n6.left = n7;
        n6.right = n8;

        _116_populate_next_right_node populate_next_right_node = new _116_populate_next_right_node();
        populate_next_right_node.connect(root);

        System.out.println(root);
    }

    public void connect(TreeLinkNode root) {
        TreeLinkNode level_start = root;
        while (level_start != null) {
            TreeLinkNode cur = level_start;
            while (cur != null) {
                if (cur.left != null) cur.left.neighbor = cur.right;
                if (cur.right != null && cur.neighbor != null) cur.right.neighbor = cur.neighbor.left;

                cur = cur.neighbor;
            }
            level_start = level_start.left;
        }
    }

    public void connect2(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        // populate the right neighbor for left child
        if (root.left != null) {
            if (root.right != null) {
                root.left.neighbor = root.right;
            }
            // find first non-null node after left child at its level
            else {
                TreeLinkNode parentNeighbor = root.neighbor;
                TreeLinkNode neighborNode;
                while (parentNeighbor != null) {
                    neighborNode = (parentNeighbor.left != null) ? parentNeighbor.left : parentNeighbor.right;

                    // we have found the non-null neighbor for left child
                    if (neighborNode != null) {
                        root.left.neighbor = neighborNode;
                        break;
                    }

                    parentNeighbor = parentNeighbor.neighbor;
                }
            }
        }

        // populate the right neighbor for right child
        if (root.right != null) {
            // find first non-null node after right child at its level
            TreeLinkNode parentNeighbor = root.neighbor;
            TreeLinkNode neighborNode;

            while (parentNeighbor != null) {
                neighborNode = (parentNeighbor.left != null) ? parentNeighbor.left : parentNeighbor.right;

                // we have found the non-null neighbor for right child
                if (neighborNode != null) {
                    root.right.neighbor = neighborNode;
                    break;
                }

                parentNeighbor = parentNeighbor.neighbor;
            }
        }

        /*
          Populating neighbors in the right sub-tree before that of left sub-tree
          allows us to access all nodes at the level of current node using neighbor-node chain
          while populating neighbors for current node's child nodes.
        */

        // populate neighbors in the right sub-tree first
        connect2(root.right);

        // and then populate neighbors in the left sub-tree
        connect2(root.left);
    }
}
