package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<Integer>  extends ArrayList<Integer> {
  public  int getRandomElement(){
      Random rand = new Random();
     int  randNumber = rand.nextInt(this.size());
      return (int) this.remove(randNumber);
  }
}
