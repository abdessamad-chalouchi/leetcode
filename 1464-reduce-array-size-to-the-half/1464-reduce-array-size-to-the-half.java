class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        // if (n ==2){
        //     return 1;
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int i = 0;
        int sum = 0;
        while (sum < (n/2)) {
            sum += list.get(i).getValue();
            i++;
        }
        return i;
    }
}