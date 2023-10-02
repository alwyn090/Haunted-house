public class Bathroom {
private int location = 24;
private int[] destinations = {22, 23};
private String[] objectsInRoom = {"Mirror", "Shower", "Mystical item"};

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
// Create different outcomes
public String objectEffect(int selection)
{
if (selection == 0)
return "There is a bloody face looking back at you!";
else if (selection == 1)
return "Room suddenly steams up and you feel fingers touching the back of your neck!";
return "You decided to use the item and exorcised the ghost!";
}
}