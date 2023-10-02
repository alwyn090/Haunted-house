public class Kitchen {
private int location = 14;
private int[] destinations = {13, 15};
private String[] objectsInRoom = {"Refrigerator", "Cabinet", "Knife"};

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
return "You found some delicious soul food!";
else if (selection == 1)
return "The dishes and glasses started flying at you!\n" +
"You get hit in the head and feel you start moving towards a light!";
return "The knife started to float and came at you!";
}
}