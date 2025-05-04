
public class selection {

    public static void selectSort(int arr[]) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest =j;

                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }
    public static void main(String args[]) {
        int arr[] = { 7, 5, 3, 9, 1 };
        selectSort(arr);
        

    }
}
