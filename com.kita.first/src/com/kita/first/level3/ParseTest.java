package com.kita.first.level3;

public class ParseTest {
	public static void main(String[] args) {
		ScanNum test = new ScanNum();
		String str = test.inputNumString();
		int result = Utils.parseStrToInt(str);
		test.printMsg(result);
	}
	
}
