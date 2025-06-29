import java.util.*;
public class isomorphicString {
    public static boolean ifIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Character> mapST = new HashMap<>();
        HashMap <Character, Character> mapTS = new HashMap<>();

        //check if already in hashmap if not put the pair there

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(mapST.containsKey(ch1)){
                if(mapST.get(ch1) != ch2) return false;
            }
            else{
                mapST.put(ch1,ch2);
            }

            if(mapTS.containsKey(ch2)){
                if(mapTS.get(ch2) != ch1) return false;
            }
            else{
                mapTS.put(ch2,ch1);
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Is '" + s1 + "' isomorphic to '" + t1 +" ->" + ifIsomorphic(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Is '" + s2 + "' isomorphic to '" + t2 +" ->" + ifIsomorphic(s2, t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Is '" + s3 + "' isomorphic to '" + t3 +" ->" + ifIsomorphic(s3, t3));
    }
}
