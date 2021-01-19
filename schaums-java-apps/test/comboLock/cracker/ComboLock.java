package test.comboLock.cracker;

public class ComboLock {
	
	private int n1, n2, n3;
	private boolean open;
	
	public ComboLock(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public boolean changeComb(int n1, int n2, int n3, int n4, int n5, int n6) {
		if (this.n1 != n1 || this.n2 != n2 || this.n3 != n3)
			return false;
		this.n1 = n4;
		this.n2 = n5;
		this.n3 = n6;
		open = false;
		return true;
	}
	
	public void close() {
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public boolean open(int n1, int n2, int n3) {
		if (this.n1 == n1 && this.n2 == n2 && this.n3 == n3)
			open = true;
		else open = false;
		return open;
	}
	

}
