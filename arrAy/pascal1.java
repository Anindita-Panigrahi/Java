public class pascal1 {
    public static long ncr(int n , int r){
        long res=1;
        for(int i=0; i<r ;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
    public static int pascal(int r,int c){
        int element = (int) ncr(r-1, c-1);  //here the as we have used long for the res but taking int we have used (int) ncr..
        return element;
    }
    public static void main(String args[]){
        int r = 5; // row number
        int c = 3; // col number
        int element = pascal(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }

}

