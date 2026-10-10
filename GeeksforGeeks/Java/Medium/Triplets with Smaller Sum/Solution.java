class Solution {
    int countTriplets(int target, int a[]) {
        // code here
        Arrays.sort(a);
        int count = 0;
        for(int i = 0;i<a.length-2;i++){
            
            if(i>0 && a[i]==a[i-1])continue;
            int left = i+1;
            int right = a.length-1;
            while(left<right){
                int sum = a[i]+a[left]+a[right];
                if(sum < target){
                    count += (right - left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}