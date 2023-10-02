public class FirstFloorBathroom {
private int location = 12;
private int[] destinations = {11};
private String[] objectsInRoom = {"Mirror", "Shower", "Toilet"};

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
return "There is a bloody face looking back at you!";
else if (selection == 1)
return "The room suddenly steams up and you feel fingers touching the back of your neck!";
return "The toliet spewed out blood!";
}
}