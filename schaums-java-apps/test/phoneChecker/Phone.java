package test.phoneChecker;

public class Phone {

	private String areaCode, number;

	public Phone(String areaCode, String number) {
		this.areaCode = areaCode;
		this.number = number;
	}

	public Phone(Phone that) {
		this.areaCode = that.areaCode;
		this.number = that.number;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public String toString() {
		return "(" + areaCode + ")" + number.substring(0, 3) + "-" + number.substring(3);
	}

}
