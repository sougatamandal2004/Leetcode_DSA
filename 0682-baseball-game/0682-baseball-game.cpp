class Solution {
public:
    bool isNumber(const string& s) {
        if (s.empty()) return false;
        int start = 0;
        if (s[0] == '-' || s[0] == '+') {
            if (s.size() == 1) return false; // string is just "+" or "-"
            start = 1;
        }
        for (int i = start; i < s.size(); ++i) {
            if (!isdigit(s[i])) {
                return false;
            }
        }
        return true;
    }

    int calPoints(vector<string>& operations) {
        stack<int> st;
        for (const string& s : operations) {
            if (isNumber(s)) {
                st.push(stoi(s));
            } else if (s == "C") {
                if (!st.empty()) st.pop();
            } else if (s == "D") {
                if (!st.empty()) {
                    int x = st.top();
                    st.push(x * 2);
                }
            } else if (s == "+") {
                if (st.size() >= 2) {
                    int x = st.top(); st.pop();
                    int y = st.top();
                    st.push(x);
                    st.push(x + y);
                }
            }
        }
        int sum = 0;
        while (!st.empty()) {
            sum += st.top();
            st.pop();
        }
        return sum;
    }
};
