public class DiningRoom {
private int location = 13;
private int[] destinations = {10, 14};
private String[] objectsInRoom = {"Candelabra", "Food"};

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

public String objectEffect(int selection)
{
if (selection == 0)
return "The candelabra light up by themselves and you see a death shadow!";
return "You look at the plate and saw a human hand!";
}
}