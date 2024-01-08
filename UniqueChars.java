/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
        String word = "" + s.charAt(0);
        Boolean check = false;
        for(int i = 1; i<s.length();i++){
            for(int j = 0;j<word.length();j++){
                if(s.charAt(i)==word.charAt(j)&&s.charAt(i)!=32){
                    check = true;
                }
            }
            if(!check){
                word += s.charAt(i);
            }
            check = false;
        }
        return word;
    }
}