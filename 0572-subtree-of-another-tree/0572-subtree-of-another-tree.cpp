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

    bool isIdentical(TreeNode* node, TreeNode* subRoot){
        if(node == nullptr && subRoot == nullptr) return true;
        if(node == nullptr || subRoot == nullptr || node->val != subRoot->val){
            return false;
        }
        if(!isIdentical(node->left,subRoot->left)){
            return false;
        }
        if(!isIdentical(node->right, subRoot->right)){
            return false;
        }
        return true;
    }
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        if(root == nullptr) return false;
        if(root -> val == subRoot -> val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        bool x = isSubtree(root -> left, subRoot);
        bool y = isSubtree(root -> right, subRoot);
        return x || y;
    }
};