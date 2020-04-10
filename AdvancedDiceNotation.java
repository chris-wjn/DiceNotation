import java.util.ArrayList;
class AdvancedDiceNotation {
    private ArrayList<SimpleDiceNotation> sdnList; //list of simple dice notation objects
    private int mod; //optional positive integer
    public AdvancedDiceNotation (String myDice) {
       sdnList = new ArrayList<SimpleDiceNotation>();
       parse(myDice);
    }
    private void parse(String myDice) {
        String parser = myDice.replace("+", "l");
        String[] splitString = parser.split("l");
        for (int i = 0; i < splitString.length-1; i++) {
            SimpleDiceNotation temp = new SimpleDiceNotation(splitString[i]);
            sdnList.add(temp);
        }
        mod = Integer.parseInt(splitString[(splitString.length)-1]);
    }
    public int roll() {
        int total = 0;
        for (int i = 0; i < sdnList.size(); i++) {
            SimpleDiceNotation temp = sdnList.get(i);
            total += temp.roll();
        }
        return total + mod;
    }
    public ArrayList<SimpleDiceNotation> showList() {
        return this.sdnList;
    }
}