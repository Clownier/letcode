class Solution {
    public boolean judgeCircle(String moves) {
        return judgeUpAndDown(moves)&&judgeRightAndLeft(moves);
    }
    private boolean judgeRightAndLeft(String moves){
    	int i = 0;
    	char[] strChar = moves.toCharArray();
    	for(char c:strChar){
    		if(c == 'R')
    			i++;
    		if(c == 'L')
    			i--;
    	}
    	return i == 0;
    }
    private boolean judgeUpAndDown(String moves){
    	int i = 0;
    	char[] strChar = moves.toCharArray();
    	for(char c:strChar){
    		if(c == 'U')
    			i++;
    		if(c == 'D')
    			i--;
    	}
    	return i == 0;
    }
}