
public class Sales {
	
	String whatWasSold;
	long howMuchWasSold;
	long profit;
	
	Sales(String what, long how, long profit){
		setWhatWasSold(what);
		setHowMuchWasSold(how);
		setProfit(profit);
		
	}
	
	//setter for what was sold
	
	void setWhatWasSold(String what) {
		whatWasSold = what;
	}
	
	//getter for what was sold
	
	String getWhatWasSold() {
		return whatWasSold;
	}
	
	//setter for how much was sold
	void setHowMuchWasSold(long how) {
		howMuchWasSold = how;
		
	}
	
	//getter for how much was sold
	long getHowMuchWasSold() {
		return howMuchWasSold;
	}
	
	//setter for profit
	void setProfit(long prof) {
		profit = prof;
	}
	
	//getter for profit
	long getProfit() {
		return profit;
	}
	
	//print out sales object.
	void printSales() {
		System.out.println("You sold " + howMuchWasSold  
				            + " of " + whatWasSold + " for " + profit);
	}
	

}
