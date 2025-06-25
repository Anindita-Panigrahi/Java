public class maxOccuranceOptimal {
    public static void maxOccured(int nums[]){
        int n=nums.length;
        int ele=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }else if(ele==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele){
                cnt1++;
            }
        }
        if(cnt1 >= (n/2)){
            System.out.println(ele + "has occured the maximum time");
        }else{
            System.out.println("no maximum occurance");
        }

    }
    public static void main(String args[]){
        int nums[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        maxOccured(nums);
    }
}
