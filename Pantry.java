public class Pantry {
private int location = 15;
private int[] destinations = {14};
private String[] objectsInRoom = {"Dusty Recipe Box", "Broom", "Crumbs"};

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
return "A recipe for chocolate devils food cake appeared our of no where!";
else if (selection == 1)
return "The broom flies up in the air as soon as you touch it!";
return "You look at the crumbs and soon a rat scurried through!";
}
}