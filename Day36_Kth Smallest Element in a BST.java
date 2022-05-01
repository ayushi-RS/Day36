 int k;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return ans;
    }
    
    private void inOrder(TreeNode root) {
        if(root == null || this.k <= 0) {
            return;
        }
        
        inOrder(root.left);
        if(this.k > 0) {
            ans = root.val;  //update the result only if k is greater than 0, the last value is the Kth smallest
        }
        this.k -= 1;
        if(this.k > 0) {
            inOrder(root.right); 
        }
    }
