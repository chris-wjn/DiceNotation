public class SimpleDiceNotation {
    private int dice;
    private int sides;
    public SimpleDiceNotation () {
        dice = 1;
        sides = 6;
    }
    public SimpleDiceNotation (String s) {
        String[] splitString = s.split("D", 2);
        dice = Integer.parseInt(splitString[0]);
        sides = Integer.parseInt(splitString[1]);
    }
    public SimpleDiceNotation (SimpleDiceNotation sdn) {
        this.dice = sdn.dice;
        this.sides = sdn.sides;
    }
    public int roll() {
        int total = 0;
        for (int i = 1; i <= this.dice; i++) {
            int dRoll = (int) (Math.random()*sides) + 1;
            total += dRoll;
        }
        return total;
    }
    public String toString() {
        String returnString = new String();
        returnString = returnString + dice + "D" + sides;
        return returnString;
    }
    public boolean equals(SimpleDiceNotation sdn) {
        boolean isTrue = false;
        if (this.dice == sdn.dice && this.sides == sdn.sides) return true;
        return false;
    }
}