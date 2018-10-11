public class RebuildTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length)
            return null;

        TreeNode root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);

        return root;
    }

    /**
     * @param pre     前序遍历
     * @param pStart  前序遍历开始的位置
     * @param pFinish 前序遍历结束的位置
     * @param in      中序遍历
     * @param iStart  中序遍历开始的位置
     * @param iFinish 中序遍历结束的位置
     * @return
     */
    private TreeNode construct(int[] pre, int pStart, int pFinish,
                               int[] in, int iStart, int iFinish) {

        if (pStart > pFinish || iStart > iFinish)
            return null;

        TreeNode root = new TreeNode(pre[pStart]);

        for (int i = 0; i <= iFinish; i++){
            if (pre[pStart] == in[i]){

                root.left = construct(pre, pStart + 1, pStart + (i - pStart),
                        in, pStart, i - 1);

                root.right = construct(pre, (i - iStart)
                                + pStart + 1, pFinish, in, i + 1,
                        iFinish);
            }
        }

        return root;
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
    }
}
