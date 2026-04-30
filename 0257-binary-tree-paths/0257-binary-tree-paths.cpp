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
    void calculate(TreeNode* root, vector<string>& v, string s) {
        if (root == nullptr) return;
        if(root -> left == nullptr && root -> right == nullptr) {
            v.push_back(s + to_string(root -> val));
            return;
        }
        if(root -> left) calculate(root -> left, v, s + to_string(root -> val) + "->");
        if(root -> right) calculate(root -> right, v, s + to_string(root -> val) + "->");
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> v;
        if(root == nullptr) return v;
        calculate(root, v, "");
        return v;
    }
};