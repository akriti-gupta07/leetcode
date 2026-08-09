class NumArray {
    private HashMap<Integer, Integer> maps;

    public NumArray(int[] nums) {
        maps = new HashMap<>();
        int psum = 0;

        maps.put(-1, 0);

        for (int i = 0; i < nums.length; i++) {
            psum += nums[i];
            maps.put(i, psum);
        }
    }

    public int sumRange(int left, int right) {
        return maps.get(right) - maps.get(left - 1);
    }
}