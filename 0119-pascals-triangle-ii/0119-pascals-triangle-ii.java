class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 2; i <= rowIndex + 1; i++) {
            List<Integer> listTmp = new ArrayList<>();
            listTmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                int tmp = list.get(j) + list.get(j - 1);
                listTmp.add(tmp);
            }
            listTmp.add(1);
            list = listTmp;
        }
        return list;
    }
}