class Solution {
public:
    int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;   // all initial full bottles
        int empty = numBottles;

        while (empty >= numExchange) {
            // Exchange
            empty -= numExchange;
            numExchange++; // cost increases
            total++;       // drank 1 new full bottle
            empty++;       // that bottle turns empty
        }
        return total;
    }
};