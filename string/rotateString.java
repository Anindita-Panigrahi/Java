public class rotateString {

    public static boolean isRoate( String s, String goal){

        if(s.length() != goal.length()) return false;

        String combined = s+s;
        int m = goal.length();

        for(int i=0; i<= combined.length()-m ; i++){
            if(combined.substring(i, i+m).equals(goal)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(isRoate(s,goal));
    }
    
}
