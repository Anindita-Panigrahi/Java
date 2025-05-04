
public class secondLargest {
    public static int find(int arr[]){
        int largest=arr[0];
        int second_largest=-1;
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            else if((second_largest<arr[i]) && (largest != arr[i])){
                second_largest=arr[i];
            }
        }
        
        // for(int i=1;i<arr.length;i++){}
        //System.out.println("largest:" + largest );
        return(second_largest);
    }
    public static int small(int arr[]){
        int s=arr[0];
        int second_smallest=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<s){
                s=arr[i];
            }
            else if((arr[i]!=s) &&(arr[i]<second_smallest) ){
                second_smallest=arr[i];
            }
        }
        //System.out.println(s);
        //for(int i=1;i<arr.length;i++){}
            return(second_smallest);
    }

    public static void main(String args[] ){
        int arr[] = {1,2,3,4,7,7,5};
        System.out.println("{"+find(arr) + ","+ small(arr) +"}");
        



    }
}
