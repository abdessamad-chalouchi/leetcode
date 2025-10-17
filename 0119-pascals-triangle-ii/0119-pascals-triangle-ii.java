class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);

        for (int i = 2; i <= rowIndex + 1; i++) {
            List<Integer> listTmp = new ArrayList<>();
            listTmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                int tmp = res.get(res.size() - 1).get(j) + res.get(res.size() - 1).get(j - 1);
                listTmp.add(tmp);
            }
            listTmp.add(1);
            res.add(listTmp);
        }
        return res.getLast();
    }
}