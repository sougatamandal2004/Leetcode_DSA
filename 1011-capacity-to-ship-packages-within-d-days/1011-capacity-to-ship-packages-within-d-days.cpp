class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int low = *max_element(weights.begin(), weights.end());
        int high = accumulate(weights.begin(), weights.end(), 0);

        while(low <= high){
            int mid = (low+high)/2;
            int noOfDays = calculateDays(weights, mid);
            if(noOfDays <= days){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }

    int calculateDays(vector<int>& wt, int cap){
        int days = 1, load = 0;
        for(int i=0;i<wt.size();i++){
            if(wt[i] + load > cap){
                days += 1;
                load = wt[i];
            } else{
                load += wt[i];
            }
        }
        return days;
    }
};