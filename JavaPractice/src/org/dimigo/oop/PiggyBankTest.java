package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember F1 = new FamilyMember("아빠");
		FamilyMember F2 = new FamilyMember("엄마");
		FamilyMember F3 = new FamilyMember("나");
		FamilyMember F4 = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(F1, 10000);
		PiggyBank.putMoney(F2, 5000);
		PiggyBank.putMoney(F3, 2000);
		PiggyBank.putMoney(F4, 1000);
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(F3, 1000);
		PiggyBank.printBalance();
		
	}

}
