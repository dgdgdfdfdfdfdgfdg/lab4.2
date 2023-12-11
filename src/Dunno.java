import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.min;
public class Dunno extends Human implements AbleToCountFood, AbleToConvertDays, AbleToSleep {
    private static final int normOfCal = 2000;
    public Dunno(String name) {
        super(name,normOfCal);
    }
    private static class Say{
        private  static void say(int[] yearsAndMonths) {
            System.out.println("Нам осталось еды на " + yearsAndMonths[0] + " год(а)/лет и " + yearsAndMonths[1] + " месяц(а)(ев)");
        }
        private static void say(int days) {
            System.out.println("Нам осталось еды на " + days + " д(ня)(ней)(ень)");
        }
    }
    @Override
    public int countFood(List<Human> humanlist, HashMap<Food,Integer> foodSupplyMap){
        int i = 0;
        double a = 20;
        int minNumberOfDays = (int) Math.pow(a, a);

        for (Food food : Food.values()) {
            int foodSupply =  foodSupplyMap.get(food);
            int normOfFoodForAllHumans = 0;
            for (Human human : humanlist) {
                normOfFoodForAllHumans += human.getNormOfFood()[i];
            }
            int numberOfDays = foodSupply / normOfFoodForAllHumans;
            minNumberOfDays = min(numberOfDays, minNumberOfDays);
            i++;
        }
        Say.say(minNumberOfDays);
        return minNumberOfDays;
    }
    @Override
    public int[] convertDays(int days) {
        int years = days / 360;
        int months = days / 30;
        months -= years * 12;
        int[] yearsAndMonths = new int[]{years, months};
        Say.say(yearsAndMonths);
        return yearsAndMonths;
    }
    @Override
    public void  sleep() throws RatException {
        checkingForRat();
        System.out.println("Незнайка спит");

    }
    public void checkingForRat() throws RatException{
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (randomNumber<0.5){Rat rat = new Rat();}
    }

}