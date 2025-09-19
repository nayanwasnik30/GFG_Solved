class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // LinkedHashMap keeps the order of first appearance
        Map<Integer,Integer> map = new LinkedHashMap<>();

        // Count the frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // “Like your code” — outer loop over the array
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            // only add if we haven’t added this value before
            if (map.containsKey(value)) {
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(value);
                inner.add(map.get(value));
                list.add(inner);
                map.remove(value); // remove so we don’t add duplicates
            }
        }

        return list;

    }
}