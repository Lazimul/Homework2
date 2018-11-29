package homeWork2;

public class computer  {

	String nameAndModel; //non-static variable
	int space;
	int ios;
	boolean mac;
	int price;
	
	
	public static String color;//static variable
	static int size;
	
	//non-static method
	public void myComputer() {
		System.out.println("myComputer: "+nameAndModel+" "+space+" "+ios+" "+mac);
	}
		
	//non-static method	
	public void hisComputer() {
		System.out.println("hisComputer: "+nameAndModel+" "+price+" "+getColor());
		}
	//static method
	public static void ourComputer() {
		System.out.println("CPU info: " +color+ " "+ size);
			}
			
	//constructor1		
	
	public computer  (String nameAndModel, int space, int ios, boolean mac, int price) {
				this.nameAndModel= nameAndModel;
				this.space= space;
				this.ios= ios;
				this.mac= mac;
				this.price= price;
			}
			
	//constructor2	
	public computer (String color, int size) {
			
			computer.color=color;
			computer.size=size;
			
		}


	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		computer .color = color;
	}
			    
				
			}
		
		
	
	
	
	
	
	


