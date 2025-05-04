public class reverse {
    public static String revString(String s){
        s=s.trim();                                    //it removes extra space before and after the string if present
        String[] words = s.split("\\s+");        //used to split string when it finds " "
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            reversed.append(words[i]);
            if(i!=0){
                reversed.append(" ");              // if its not the end add spaces between word
            }

        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "  hello   world  ";
        System.out.println("\"" + revString(s) + "\"");  // Output: "world hello"
    }
}

