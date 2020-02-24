public class Meal {
	private Food food;
	private Drinks drinks;
	private Afactory PartA;
	private Bfactory PartB;
	
	public void setPartAfood() {
		this.food = PartA.ACreateF();
		}
	public void setPartBfood() {
		this.food = PartB.BCreateF();
		}
	public void setPartAdrinks() {
		this.drinks = PartA.ACreateD();
		}
	public void setPartBdrinks() {
		this.drinks = PartB.BCreateD();
		}
	public Food getfood()
	{
		return food;
	}
	public Drinks getdrinks()
	{
		return drinks;
	}
}
