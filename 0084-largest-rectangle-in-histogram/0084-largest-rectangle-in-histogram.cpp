class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int n = heights.size();
        vector<int> leftMin(n,0);
        vector<int> rightMin(n,0);
        stack<int> st;
        //left minimum value index
        for(int i=0;i<n;i++){
            while(!st.empty() && heights[st.top()] >= heights[i]){
                st.pop();
            }
            leftMin[i] = st.empty() ? -1 : st.top();
            st.push(i);
        }
        // right minimum value index
        while(!st.empty()){
            st.pop();
        }
        for(int i=n-1; i>=0;i--) {
            while(!st.empty() && heights[st.top()] >= heights[i]){
                st.pop();
            }
            rightMin[i] = st.empty() ? n : st.top();
            st.push(i);
        }
        //now calculation part
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int currArea = heights[i] * (rightMin[i] - leftMin[i] - 1);
            maxArea = max(maxArea, currArea);
        }
        return maxArea;
    }
};