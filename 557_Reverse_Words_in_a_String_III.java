class Solution {
    public String reverseWords(String s) {
        String[] sArrays = s.split(" ");
        String res ="";
        for(String each:sArrays){
        	res += " " + reverseWord(each);
        }
        return res.substring(1);
    }
    private String reverseWord(String s){
    	String res = "";
    	for(int i = 0;i<s.length();i++){
    		res = s.charAt(i)+res;
    	}
    	return res;
    }
}

/*public class Solution {
    public String reverseWords(String s) {
        char [] words = s.toCharArray();
        int i = 0;
        int e = end(words, i);
        while (e < s.length()) {
            reverseWord(words, i, e);
            i = e + 2;
            e = end(words, i);
        }
        
        return new String(words);
    }
    
    private int end(char[] words, int s) {
        while (s < words.length && words[s] != ' ') s += 1;
        return s - 1;
    }
    private void reverseWord(char[] words, int s, int e) {
        while (s < e) {
            char temp = words[s];
            words[s] = words[e];
            words[e] = temp;
            s += 1;
            e -= 1;
        }
    }

}*/