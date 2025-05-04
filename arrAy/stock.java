import java.util.*;

public class stock {
    public static void profit(int price[]) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProf=0;
        
        for (int i = 0; i < n; i++) {
            if (buyPrice<price[i] ) {
                int prof=price[i]-buyPrice;
                maxProf=Math.max(maxProf,prof);

               
            }else{
                buyPrice=price[i];
            }
            
        }
        System.out.println("Max profit ="+maxProf);
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        profit(price);

    }
}
