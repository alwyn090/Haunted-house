public class MasterBathroom {
private int location = 21;
private int[] destinations = {20};
private String[] objectsInRoom = {"Intricate Oil Lamp", "Shower", "Sink"};

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
return "A genie pops out who will grant you 3 wishes!";
else if (selection == 1)
return "Suddenly you hear singing in the shower, but no one is there!";
return "The sink spewed out blood!";
}
}