
class sortedOrNot {
    static boolean checkIf (int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i+1]>arr[i]){
                return true;
            }
            else{
                return false;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,4};
        
        System.out.println(checkIf(arr));
    
    }
    
}
