package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //��������Ϳ� powder�Ĵ� �Ű������� �ְ� 
		Powder powder =new Powder(); //Powder�� ���� ��Ḧ �־���� ��.
		powderPrinter.setMaterial(powder); //PowderPrinter�� ����� powder�� �־��ָ�
		
		
		System.out.println(powderPrinter);
	
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); //��������Ϳ� powder�Ĵ� �Ű������� �ְ� 
		Plastic plastic =new Plastic(); //Powder�� ���� ��Ḧ �־���� ��.
		plasticPrinter.setMaterial(plastic); //PowderPrinter�� ����� powder�� �־��ָ�
		
		
		System.out.println(plasticPrinter);
		
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
