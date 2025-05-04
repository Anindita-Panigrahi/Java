import java.util.*;
public class union {

    static void union(int arr1[],int arr2[],int m,int n){
    int i=0;
    int j=0;
    int lastPrint = Integer.MIN_VALUE;
    System.out.println(lastPrint);
    while(i<m && j<n){
        if(arr1[i]<arr2[j]){
            if(arr1[i]!=lastPrint){
            System.out.print(arr1[i]+" ");
            lastPrint = arr1[i];
            }
            i++;
        }else if(arr2[j]<arr1[i]){
            if(lastPrint!=arr2[j]){
            System.out.print(arr2[j]+" ");
            lastPrint=arr2[j];
            }
            j++;
        }else{
            if(lastPrint!=arr1[i]){
            System.out.print(arr1[i]+" ");
            lastPrint = arr1[i];}
            i++;
            j++;
        }
    }
    while(i<m){
        if(lastPrint!=arr1[i]){
        System.out.print(arr1[i]+" ");
    }i++;
}
    while(j<n){
        if(lastPrint!=arr1[j]){
        System.out.print(arr2[j++]+" ");
    }}
    }
    public static void main(String[] args) {
    int n=5;
    int m=5;
    int arr1[]={2, 2, 3, 4, 5};
    int arr2[]={1,1,2, 3,4};
    union(arr1,arr2,m,n);
    }
    
}
