public class leftRotate {
    static void rotate(int arr[]){
        int i=0;
        int last= arr[0];
        for(i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }arr[arr.length-1]=last;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotate(arr);
    }
}
