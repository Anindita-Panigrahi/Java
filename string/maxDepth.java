public class maxDepth {
    public static int parenthesesDepth( String s ){
        int count=0, max=0;
        for(int i=0; i< s.length() ; i++){
            char ch= s.charAt(i);
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count --;
            }
            max= Math.max(count,max);
        }
        return max;
    
    }
    public static void main(String args[]){
        String s = "(1)+((2))+(((3)))";
        System.out.println("The maximum length of parentheses is = " + parenthesesDepth(s));
    }
}
