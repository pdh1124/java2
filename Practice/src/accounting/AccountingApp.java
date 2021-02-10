package accounting;

public class AccountingApp {

	public static void main(String[] args) {
		
		//상품 계산하기
		
		double valueOfSupply = Double.parseDouble(args[0]); //상품 가격
		//Double.parseDouble는 String을 double형으로 바꾸는 명령
		double vatRate = 0.1; //부가세의 퍼센트
		double expenseRate = 0.3; //원가
		double vat = valueOfSupply * vatRate; //부가세 
		double total = valueOfSupply + vat; //합계
		double expense = valueOfSupply * expenseRate; //상품의 원가
		double income = valueOfSupply - expense; //순수익
		double dividend1 = income * 0.5; //수익 분배 1
		double dividend2 = income * 0.3; //수익 분배 2
		double dividend3 = income * 0.2; //수익 분배 3
		
		System.out.println("value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);
		

	}

}
