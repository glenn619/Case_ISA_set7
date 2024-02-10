package pkge;

public class Beverage {
	String type;
	Beverage(String type){
		this.type=type;
	}
	public static void main(String[]args)
	{
		Beverage tea= new tea("hot");
		System.out.print("tea"+tea.type);
	}
}
