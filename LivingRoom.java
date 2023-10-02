public class LivingRoom {
private int location = 11;
private int[] destinations = {10, 12};
private String[] objectsInRoom = {"Chest", "Couch"};

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
return "Ghost escapes and scares you to death!";
return "You sit in the couch, but then it starts to float!";
}
}