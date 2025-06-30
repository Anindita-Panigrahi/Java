public class anagram {
    public static boolean checkAnagram(String s, String t){
        int count[]= new int[26];  //small letter starting index a-0 to z-26

        for(char x: s.toCharArray()){ //convert string to char array
            count[x-'a']++;
        }

        for(char x: t.toCharArray()){ 
            count[x-'a']--;
        }

        for(int val: count){
            if(val !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        System.out.println(s1 + " & " + t1 + " → " + checkAnagram(s1, t1));
        
        String s2 = "rat", t2 = "car";
        System.out.println(s2 + " & " + t2 + " → " +checkAnagram(s2, t2)); 

        String s3 = "listen", t3 = "silent";
        System.out.println(s3 + " & " + t3 + " → " +checkAnagram(s3, t3)); 
    }
}
