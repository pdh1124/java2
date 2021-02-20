package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //재료프린터에 powder파는 매개변수를 넣고 
		Powder powder =new Powder(); //Powder에 대한 재료를 넣어줘야 함.
		powderPrinter.setMaterial(powder); //PowderPrinter에 재료인 powder를 넣어주면
		
		
		System.out.println(powderPrinter);
	
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>(); //재료프린터에 powder파는 매개변수를 넣고 
		Plastic plastic =new Plastic(); //Powder에 대한 재료를 넣어줘야 함.
		plasticPrinter.setMaterial(plastic); //PowderPrinter에 재료인 powder를 넣어주면
		
		
		System.out.println(plasticPrinter);
		
		
		powderPrinter.printing();
		plasticPrinter.printing();
	}

}
