
enum directions
{
	SOUTH,NORTH,EAST,WEST;
}
public class EnumExample {
	
	public static void main(String[] args) {
		for(directions s:directions.values())
		//System.out.println(directions.EAST);
		System.out.println(s);
	}
	

}
