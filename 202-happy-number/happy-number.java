class Solution {
    public boolean isHappy(int n) {
//         ArrayList<Integer> arr= new ArrayList<>();
//         while (n != 1 && !arr.contains(n)) {
//     arr.add(n);
//     n = square(n);
// }
// return n == 1;
        int slow=square(n);
        int fast= square(square(n));
        while(slow!=fast){
            slow=square(slow);
            fast= square(square(fast));
            if (slow==1){
                return true;
            }
            

        }
        if (slow==1){
                return true;
            }
        return false;

        
    }
    public int square(int x){
        int sum=0;
        while(x!=0){
            int i=x%10;
            x=x/10;
            sum=sum+i*i;

        }
        return sum;
    }
}