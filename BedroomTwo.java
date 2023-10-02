public class BedroomTwo {
private int location = 23;
private int[] destinations = {16,20,24};
private String[] objectsInRoom = {"Dresser", "Doll House", "Doll"};

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
// find object to stop the ghost
public String objectEffect(int selection)
{
if (selection == 0)
return "The dolls start dancing on their own!";
else if (selection == 1)
return "A ghost flies out of the dresser and goes right though your body!";
return "The doll jumped at you!";
}
}