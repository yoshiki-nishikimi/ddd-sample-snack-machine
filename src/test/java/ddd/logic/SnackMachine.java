package ddd.logic;

public final class SnackMachine {
	private int oneCentCoinCount;
	private int tenCentCoinCount;
	private int quarterCentCoinCount;
	private int oneDollarCount;
	private int fiveDollarCount;
	private int twentyDollarCount;
	
	public void insertMoney(int oneCentCoinCount,
			int tenCentCoinCount,
			int quarterCentCoinCount,
			int oneDollarCount,
			int fiveDollarCount,
			int twentyDollarCount
			) {
		oneCentCoinCount += oneCentCoinCount;
		tenCentCoinCount += tenCentCoinCount;
		quarterCentCoinCount += quarterCentCoinCount;
		oneDollarCount += oneDollarCount;
		fiveDollarCount += fiveDollarCount;
		twentyDollarCount += twentyDollarCount;
	}
	
	public void returnMoney() {}

}
