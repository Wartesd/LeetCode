class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap <Integer, Integer> hands = new TreeMap <>();
        if (hand.length % groupSize != 0) return false;
        for (int i=0; i< hand.length; i++){
            hands.put(hand[i], hands.getOrDefault(hand[i],0)+1);
        }
        while (!hands.isEmpty()){
            int key=hands.firstKey();
            decrementOrRemove(hands,key);
            for (int count=1; count <= groupSize-1; count++){
                int card = key+count;
                if(!hands.containsKey(card)) return false;
                decrementOrRemove(hands,card);
            }
        }
        return true;
    }
    private void decrementOrRemove(TreeMap<Integer, Integer> hands, int card) {
        hands.put(card, hands.get(card) - 1);
        if (hands.get(card) == 0) hands.remove(card);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna