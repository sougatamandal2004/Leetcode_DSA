/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:

    int height(TreeNode* root){
        if(root == nullptr) return 0;
        int lh = height(root -> left);
        int rh = height(root -> right);
        return 1 + max(lh, rh);
    }
    bool isBalanced(TreeNode* root) {
        if(root == NULL) return true;

        int leftHeight = height(root -> left);
        int rightHeight = height(root -> right);

        int diff = abs(leftHeight - rightHeight);

        bool currNodeAns = (diff <= 1);

        bool leftAns = isBalanced(root -> left);
        bool rightAns = isBalanced(root -> right);

        if(currNodeAns && leftAns && rightAns) return true;
        else return false;
    }
};