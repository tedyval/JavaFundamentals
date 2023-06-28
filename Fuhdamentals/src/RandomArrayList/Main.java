package RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> r = new RandomArrayList();

        for (int i = 0; i < 10; i++) {
            r.add(i);

        }

        int randNum = r.getRandomElement();
        System.out.println(randNum);





    }



}
