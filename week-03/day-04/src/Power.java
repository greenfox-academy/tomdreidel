public class Power {

  public static void main(String[] args) {

    int base = 2;
    int power = 10;

    System.out.println(powerizer(base, power));
  }

  private static int powerizer(int base, int power) {
    if (base < 1 || power < 1) {
      return 0;
    }
    else if (power == 1) {
      return base;
    }
    return base *= powerizer(base, (power -1));
  }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).