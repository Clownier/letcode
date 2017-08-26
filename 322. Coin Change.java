// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Arrays.sort(coins);
//         if(amount == 0)
//         	return 0;
//         int index =  coins.length -1;
//         for(;index >=0;index--){
//         	if(amount == coins[index]){
//         		return 1;
//         	}else if(amount > coins[index]){
//         		break;
//         	}
//         }
//         while(index>=0){
//         	int res = 1 + coinChange(coins,amount-coins[index]);
//         	if(res == 0){
//         		index -- ;
//         	}else{
//         		return res;
//         	}
//         }
//         return -1;
//     }
// }//本题考查动态规划而非贪心算法
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        final int INF = 0x7fff_fffe;
        for(int i = 1;i<= amount;i++){
        	dp[i] = INF;
        	for(int coin:coins)
        		if(i>=coin)
        			dp[i]=Math.max(dp[i], dp[i-coin]);
        }
        return dp[amount];
    }
}