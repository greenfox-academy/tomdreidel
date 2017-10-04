package wanderer;

import java.util.ArrayList;
import java.util.Random;

public class EnemyLayout extends ArrayList<PositionedImage> {

  public EnemyLayout(Map map) {
    Random generator = new Random();
    int bossCount = generator.nextInt(4) + 3;
    for (int i = 0; i < bossCount; i++) {
      int tempX = generator.nextInt(9) + 1;
      int tempY = generator.nextInt(9) + 1;
      while (map.isWall(tempX, tempY)) {
        tempX = generator.nextInt(9) + 1;
        tempY = generator.nextInt(9) + 1;
      }
      if (i == 0) {
        this.add(new Boss(tempX, tempY));
      } else if (i > 0) {
        this.add(new Skeleton(tempX, tempY, i));
      }
    }
  }

//  public int fightScan(int posX, int posY) {
//    for (int i = 0; i < this.size(); i++) {
//      if (this.get(i).posX == posX && this.get(i).posY == posY) {
//        return i + 1;
//      }
//    }
//    return 0;
//  }

  public void die(PositionedImage enemy) {
    if (this.size() > 0) {
      this.remove(enemy);
    }
  }

}