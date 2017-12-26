
public class stockPrice {
	public static int maxProfit(int[] prices) {
		if(prices.length==0 || prices == null) return 0;
		int profit = 0;
		int min = prices[0];
		for(int i=1; i<prices.length; i++){
			if(prices[i]<min) min = prices[i];
			else{
				if(profit<prices[i]-min) profit= prices[i]-min;
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(p));
	}

}
