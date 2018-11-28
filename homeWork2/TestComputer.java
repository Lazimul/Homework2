package homeWork2;

public class TestComputer {

	public static void main(String[] args) {
		computer comp1 = new computer("gray", 15 );
		comp1.nameAndModel= "Apple MacAir";
		comp1.space= 8;
		comp1.ios=10;
		comp1.mac= true;
		comp1.myComputer();
		computer.ourComputer();

		
		
		computer comp2 = new computer("black", 12, 500, false,8);
		comp2.nameAndModel = "Dell";
		comp2.price= 500;
		computer.setColor("black");
		computer.size= 18;
		comp2.hisComputer();
		computer.ourComputer();
		
				
		
			
		
		
		
		
				

	}

}
