//********************************************************************************
// PANTHERID:  [6179555]
// CLASS: COP 2210 – [2021]
// ASSIGNMENT # [3]
// DATE: [3/23/2021]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class HauntedHouse {
private final FrontDoor frontDoor;
private LivingRoom livingRoom;
private FirstFloorBathroom firstFloorBathroom;
private DiningRoom diningRoom;
private Kitchen kitchen;
private Pantry pantry;
private Stairs stairs;
private MasterBedroom masterBedroom;
private MasterBathroom masterBathroom;
private BedroomOne bedroomOne;
private BedroomTwo bedroomTwo;
private Bathroom secondFloorBathroom;
private int playerPosition;
private String roomName;
private String playerName;
private List<Integer> roomConnections;
private List<String> itemsInRoom;
private ImageIcon icon;

// Constructs and initialize a haunted house along

public HauntedHouse(String name)
{
this.playerName = name;
frontDoor = new FrontDoor();
this.playerPosition = frontDoor.getLocation();
}

// Set the player's name

public void sePlayerName(String name)
{
this.playerName = name;
}

// Updates player's position

public void setPlayerPosition(int position)
{
this.playerPosition = position;
}

//Get the name of a room.

public String getRoomName(int position)
{
switch (position)
{
case 10:
this.roomName = "Front Door";
break;
case 11:
this.roomName = "Living Room";
break;
case 12:
this.roomName = "First Floor Bathroom";
break;
case 13:
this.roomName = "Dining Room";
break;
case 14:
this.roomName = "Kitchen";
break;
case 15:
this.roomName = "Pantry";
break;
case 16:
this.roomName = "Stairs";
break;
case 20:
this.roomName = "Master Bedroom";
break;
case 21:
this.roomName = "Master Bathroom";
break;
case 22:
this.roomName = "Bedroom One";
break;
case 23:
this.roomName = "Bedroom Two";
break;
case 24:
this.roomName = "Second Floor Bathroom";
break;
default:
this.roomName = "NA";
}

return this.roomName;
}

// Prints a welcome message

public void WelcomeMessage()
{
JOptionPane.showMessageDialog(null,
"Hello " + this.playerName + ".\n Welcome to Haunted House!");

displayPosition();
}


public void displayPosition()
{
if (this.playerPosition == 10)
{

}
else if (this.playerPosition == 11)
{

}
else if (this.playerPosition == 12)
{
}
else if (this.playerPosition == 13)
{
}
else if (this.playerPosition == 14)
{
}
else if (this.playerPosition == 15)
{
}
else if (this.playerPosition == 16)
{
}
else if (this.playerPosition == 20)
{
}
else if (this.playerPosition == 21)
{
}
else if (this.playerPosition == 22)
{
}
else if (this.playerPosition == 23)
{
}
else

JOptionPane.showMessageDialog(null,
"<html><h2>Your Current position: " +
getRoomName(this.playerPosition) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
}


public List<Integer> getConnections(int[] possibleDestinations)
{
this.roomConnections = new ArrayList<>();

for (int i=0; i<possibleDestinations.length; i++)
{
this.roomConnections.add(possibleDestinations[i]);
}

return this.roomConnections;
}


public List<String> getItemsinRoom(String[] items)
{
this.itemsInRoom = new ArrayList<>();

for (int i=0; i<items.length; i++)
{
this.itemsInRoom.add(items[i]);
}

return this.itemsInRoom;
}

// Initialize a room object given its position

public void openDoor(int roomPosition)
{
if (roomPosition == 11)
this.livingRoom = new LivingRoom();
else if (roomPosition == 12)
this.firstFloorBathroom = new FirstFloorBathroom();
else if (roomPosition == 13)
this.diningRoom = new DiningRoom();
else if (roomPosition == 14)
this.kitchen = new Kitchen();
else if (roomPosition == 15)
this.pantry = new Pantry();
else if (roomPosition == 16)
this.stairs = new Stairs();
else if (roomPosition == 20)
this.masterBedroom = new MasterBedroom();
else if (roomPosition == 21)
this.masterBathroom = new MasterBathroom();
else if (roomPosition == 22)
this.bedroomOne = new BedroomOne();
else if (roomPosition == 23)
this.bedroomTwo = new BedroomTwo();
else
this.secondFloorBathroom = new Bathroom();


}

public void openRoom(int currentPosition)
{
switch (currentPosition)
{
case 10:
openDoor(10);
getConnections(frontDoor.getPossibleDestinations());
getItemsinRoom(frontDoor.getObjectsInRoom());
setPlayerPosition(10);
displayPosition();
break;
case 11:
openDoor(11);
getConnections(livingRoom.getPossibleDestinations());
getItemsinRoom(livingRoom.getObjectsInRoom());
setPlayerPosition(11);
displayPosition();
break;
case 12:
openDoor(12);
getConnections(firstFloorBathroom.getPossibleDestinations());
getItemsinRoom(firstFloorBathroom.getObjectsInRoom());
setPlayerPosition(12);
displayPosition();
break;
case 13:
openDoor(13);
getConnections(diningRoom.getPossibleDestinations());
getItemsinRoom(diningRoom.getObjectsInRoom());
setPlayerPosition(13);
displayPosition();
break;
case 14:
openDoor(14);
getConnections(kitchen.getPossibleDestinations());
getItemsinRoom(kitchen.getObjectsInRoom());
setPlayerPosition(14);
displayPosition();
break;
case 15:
openDoor(15);
getConnections(pantry.getPossibleDestinations());
getItemsinRoom(pantry.getObjectsInRoom());
setPlayerPosition(15);
displayPosition();
break;
case 16:
openDoor(16);
getConnections(stairs.getPossibleDestinations());
getItemsinRoom(stairs.getObjectsInRoom());
setPlayerPosition(16);
displayPosition();
break;
case 20:
openDoor(20);
getConnections(masterBedroom.getPossibleDestinations());
getItemsinRoom(masterBedroom.getObjectsInRoom());
setPlayerPosition(20);
displayPosition();
break;
case 21:
openDoor(21);
getConnections(masterBathroom.getPossibleDestinations());
getItemsinRoom(masterBathroom.getObjectsInRoom());
setPlayerPosition(21);
displayPosition();
break;
case 22:
openDoor(22);
getConnections(bedroomOne.getPossibleDestinations());
getItemsinRoom(bedroomOne.getObjectsInRoom());
setPlayerPosition(22);
displayPosition();
break;
case 23:
openDoor(23);
getConnections(bedroomTwo.getPossibleDestinations());
getItemsinRoom(bedroomTwo.getObjectsInRoom());
setPlayerPosition(23);
displayPosition();
break;
case 24:
openDoor(24);
getConnections(secondFloorBathroom.getPossibleDestinations());
getItemsinRoom(secondFloorBathroom.getObjectsInRoom());
setPlayerPosition(24);
displayPosition();
break;
default:
this.roomName = "NA";
}
}

public int displayOptions(Object[] options)
{
int choice;
int i = 0;

options = new Object[2];

options[0] = "Move";
options[1] = "Stay";

choice = JOptionPane.showOptionDialog(null,
"Would you like to move to another room or stay?",
"",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[0]);

return choice;
}

public int switchRooms()
{
Object[] options = new Object[this.roomConnections.size()];
int i = 0;
int choice;

for (Integer connection: this.roomConnections)
{
options[i] = getRoomName(connection.intValue());
i++;
}

i = 0;

choice = JOptionPane.showOptionDialog(null,
"Wich room would you like to visit?",
"",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[0]);

return choice;
}

public int pickItemsInRoom()
{
Object[] options = new Object[this.itemsInRoom.size()];
int i = 0;
int choice;

for (String item: this.itemsInRoom)
{
options[i] = item;
i++;
}

i = 0;

choice = JOptionPane.showOptionDialog(null,
"Wich item would you like to pick?",
"",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[0]);

return choice;
}

public void showItem(int currentPosition, int choice)
{
switch (currentPosition)
{
case 10:
JOptionPane.showMessageDialog(null,
"<html><h2>"+frontDoor.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 11:
JOptionPane.showMessageDialog(null,
"<html><h2>"+livingRoom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 12:
JOptionPane.showMessageDialog(null,
"<html><h2>"+firstFloorBathroom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 13:
JOptionPane.showMessageDialog(null,
"<html><h2>"+diningRoom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 14:
JOptionPane.showMessageDialog(null,
"<html><h2>"+kitchen.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 15:
JOptionPane.showMessageDialog(null,
"<html><h2>"+pantry.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 16:
JOptionPane.showMessageDialog(null,
"<html><h2>"+stairs.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 20:
JOptionPane.showMessageDialog(null,
"<html><h2>"+masterBedroom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 21:
JOptionPane.showMessageDialog(null,
"<html><h2>"+masterBathroom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 22:
JOptionPane.showMessageDialog(null,
"<html><h2>"+bedroomOne.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 23:
JOptionPane.showMessageDialog(null,
"<html><h2>"+bedroomTwo.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
case 24:
JOptionPane.showMessageDialog(null,
"<html><h2>"+secondFloorBathroom.objectEffect(choice) + "</h2></html>" +
'\n',
"",
JOptionPane.PLAIN_MESSAGE,
icon);
break;
default:
this.roomName = "NA";
}
}

public void game()
{
boolean changeRoom = false;

Object[] options = null;
int choice;

WelcomeMessage();

choice = displayOptions(options);
getConnections(frontDoor.getPossibleDestinations());
getItemsinRoom(frontDoor.getObjectsInRoom());

if (choice == 0)
{
changeRoom = true;
}

else
{
showItem(this.playerPosition, choice);
}

while (true)
{
if (changeRoom == true)
{
choice = switchRooms();
openRoom(this.roomConnections.get(choice));
changeRoom = false;
}

else
{
choice = pickItemsInRoom();

showItem(this.playerPosition, choice);
changeRoom = false;

if (this.itemsInRoom.get(choice) == "key" )
break;

}

choice = displayOptions(options);

if (choice == 0)
changeRoom = true;
}
}
}