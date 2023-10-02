public class Stairs {
private int location = 16;
private int[] destinations = {10, 20, 22, 23};
private String[] objectsInRoom = {"Rails"};

public int getLocation()
{
return this.location;
}

public int[] getPossibleDestinations()
{
return this.destinations;
}

public String[] getObjectsInRoom()
{
return this.objectsInRoom;
}
// end game with staying in stairs
public String objectEffect(int selection)
{
return "You you look down at the rails and suddenly something pushed you!";
}
}