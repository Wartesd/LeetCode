class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap <Integer, Integer> hands = new TreeMap <>();
        if (hand.length % groupSize != 0) return false;
        for (int i=0; i< hand.length; i++){
            hands.put(hand[i], hands.getOrDefault(hand[i],0)+1);
        }
        while (!hands.isEmpty()){
            int key=hands.firstKey();
            hands.put(key, hands.getOrDefault(key,0)-1);
            if (hands.get(key) == 0) hands.remove(key);
            for (int count=1; count <= groupSize-1; count++){
                int card = key+count;
                if(!hands.containsKey(card)) return false;
                hands.put(card, hands.getOrDefault(card,0)-1);
                if (hands.get(card) == 0) hands.remove(card);
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna