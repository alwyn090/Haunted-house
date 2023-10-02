public class MasterBedroom {
private int location = 20;
private int[] destinations = {16, 21};
private String[] objectsInRoom = {"Jewelry Box", "Photo"};

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
return "You found the cursed Hope Diamond and feel your doom!";
return "You look in the photo, and you're in it!";
}
}