import javax.swing.JOptionPane;

public class HauntedHouseTester {
public static void main(String[] args)
{
String name = (String) JOptionPane.showInputDialog("Please enter your name");

HauntedHouse house = new HauntedHouse(name);
house.game();

}
}
