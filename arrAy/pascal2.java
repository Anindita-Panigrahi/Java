public class pascal2 {
    public static long ncr(int n , int r){
        long res=1;
        for(int i=0; i<r ;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static void pascal(int r){
        for (int c=1;c<=r;c++){
            System.out.print(ncr(r - 1, c - 1)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int row = 5;
        System.out.print("Row " + row + " of Pascal's Triangle: ");
        pascal(row);

}
}

