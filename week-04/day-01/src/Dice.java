
public class Dice {
  //    You have a Dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6

  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.roll();

    int rollCount = 0;

    for (int i = 0; i < 6; i++) {
      System.out.print(myDice.getCurrent(i) + " | ");
    }

    for (int j = 0; j < 6; j++) {
      while (myDice.getCurrent(j) != 6) {
        myDice.reroll(j);
        rollCount += 1;
      }
    }

    System.out.println();

    for (int k = 0; k < 6; k++) {
      System.out.print(myDice.getCurrent(k) + " | ");
    }

    System.out.println();
    System.out.println("Total rerolls needed: " + rollCount);
  }
}