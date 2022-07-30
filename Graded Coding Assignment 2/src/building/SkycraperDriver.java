package building;


public class SkycraperDriver {

	public static int totalFloors;
	public static int[] totalFloorSize;

	public static void main(String[] args) {
		ChiefArchitect objDriver = new ChiefArchitect();
		objDriver.userInputs();
		objDriver.orderOfConstruction(objDriver.totalFloorSize);
	}
}