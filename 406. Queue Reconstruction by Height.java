class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
        	@Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }

        });
        List<int[]> list = new LinkedList<>();
        for(int[] cur:people){
        	list.add(cur[1],cur);
        }
        return list.toArray(new int[people.length][]);
    }
}