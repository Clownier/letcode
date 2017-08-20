class Solution {
    public int countSubstrings(String s) {
    	int res = 0;
        for(int begin = 0;begin<s.length();begin++){
        	for(int end = begin+1;end<=s.length();end++){
        		if(judgePalindromicSubstring(s.substring(begin,end)))
        			res++;
        	}
        }
        return res;
    }
    private boolean judgePalindromicSubstring(String s){
    	if(s.length()==1)
    		return true;
    	char[] strChar = s.toCharArray();
    	int begin = 0;
    	int end = s.length()-1;
    	while(begin<end){
    		if(strChar[begin] != strChar[end]){
    			return false;
    		}
    		begin++;
    		end--;
    	}
    	return true;
    }
}
/*
class Solution {
    public int countSubstrings(String s) {
        int ret = 0;
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            ret += (helper(c,i,i) + helper(c,i,i+1));
        }
        return ret;
    }
    
    private int helper(char[] s, int start, int end){
        int ret = 0;
        while(start >= 0 && end < s.length && s[start--] == s[end++]){
            ret++;
        }
        return ret;
    }
}*/