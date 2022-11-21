
public class Beer {
	private String name;
	private String style;
	private double strength;
	public Beer(String name, String style, double strength) {
		this.name = name;
		this.style = style;
		this.strength = strength;
	}
	
	public String getName() {return name;}
	public String getStyle() {return style;}
	public double getStrength() {return strength;}
	public String toString() {
		return "Name: "+name+", style: "+style+", strength: "+strength;
	}
	
	
}
