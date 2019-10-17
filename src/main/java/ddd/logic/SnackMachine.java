package ddd.logic;

public final class SnackMachine {
	private int oneCentCount;
	private int tenCentCount;
	private int quarterCentCount;
	private int oneDollarCount;
	private int fiveDollarCount;
	private int twentyDollarCount;
	
	private int oneCentCountInTransaction;
	private int tenCentCountInTransaction;
	private int quarterCentCountInTransaction;
	private int oneDollarCountInTransaction;
	private int fiveDollarCountInTransaction;
	private int twentyDollarCountInTransaction;

	
	public void insertMoney(int oneCentCount,
			int tenCentCount,
			int quarterCentCount,
			int oneDollarCount,
			int fiveDollarCount,
			int twentyDollarCount
			) {
		oneCentCountInTransaction += oneCentCount;
		tenCentCountInTransaction += tenCentCount;
		quarterCentCountInTransaction += quarterCentCount;
		oneDollarCountInTransaction += oneDollarCount;
		fiveDollarCountInTransaction += fiveDollarCount;
		twentyDollarCountInTransaction += twentyDollarCount;
	}
	
	public void returnMoney() {
		oneCentCountInTransaction = 0;
		tenCentCountInTransaction = 0;
		quarterCentCountInTransaction = 0;
		oneDollarCountInTransaction = 0;
		fiveDollarCountInTransaction = 0;
		twentyDollarCountInTransaction = 0;
	}
	
	public void buySnack() {
		oneCentCount += oneCentCountInTransaction;
		tenCentCount += tenCentCountInTransaction;
		quarterCentCount += quarterCentCountInTransaction;
		oneDollarCount += oneDollarCountInTransaction;
		fiveDollarCount += fiveDollarCountInTransaction;
		twentyDollarCount += twentyDollarCountInTransaction;
		
		oneCentCountInTransaction = 0;
		tenCentCountInTransaction = 0;
		quarterCentCountInTransaction = 0;
		oneDollarCountInTransaction = 0;
		fiveDollarCountInTransaction = 0;
		twentyDollarCountInTransaction = 0;
	}

}
