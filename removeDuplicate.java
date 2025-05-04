public class removeDuplicate {
    public static void main(String args[]){
        int[] arr = {1,1, 2, 2,2, 3, 3};
        int k= removeDupli(arr);
        System.out.println("the array after removing duplicate");
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }
    }
    static int removeDupli(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]) {
                i++;
                arr[i] = arr[j];
        }
    }
    return i+1;
}
}
