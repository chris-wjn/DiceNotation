public class DiceTest {
    public static void main (String[] args) {
        SimpleDiceNotation dice1 = new SimpleDiceNotation();
        SimpleDiceNotation dice2 = new SimpleDiceNotation("3D20");
        SimpleDiceNotation dice3 = new SimpleDiceNotation();
        System.out.println("SDN TEST");
        System.out.println(dice1 + " " + dice2 + " " + dice3);
        int roll1 = dice1.roll(), roll2 = dice2.roll();
        if (dice1.equals(dice3)) System.out.println("working as intended");
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println("");
        System.out.println("");
        System.out.println("ADN TEST");
        AdvancedDiceNotation die1 = new AdvancedDiceNotation("1D6+1D6+1D6+5");
        System.out.println(die1.roll());
    }
}   