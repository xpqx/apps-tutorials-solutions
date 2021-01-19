package test.comboLock.cracker;

public class ComboLockTestDriver {
	public static void main(String[] args) {

		ComboLock lock = new ComboLock(10, 20, 30);
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.open(10,20,30): "+lock.open(10,20,30));
		System.out.println("lock.isOpen(): " + lock.isOpen());
		lock.close();
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.open(11,20,30): "+lock.open(11,20,30));
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.changeComb(11, 20, 30, 11, 22, 33): "
				+ lock.changeComb(11, 20, 30, 11, 22, 33));
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.open(11,22,33): "+lock.open(11,22,33));
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.changeComb(10, 20, 30, 15, 25, 35): "
				+ lock.changeComb(10, 20, 30, 15, 25, 35));
		System.out.println("lock.isOpen(): " + lock.isOpen());
		System.out.println("lock.open(15,25,35): "+lock.open(15,25,35));
		System.out.println("lock.isOpen(): " + lock.isOpen());


	}

}
