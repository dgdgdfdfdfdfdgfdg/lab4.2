import java.util.Random;

public class Shorty implements AbleToSleep{


    @Override
    public void sleep(){
        System.out.println("Коротышка спит");
    }
    Shorty() throws RatException {
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (randomNumber<0.5){
            sleep();
        }else {
            AbleToSleep anotherSleep = new AbleToSleep() {
                @Override
                public void sleep() {
                    System.out.println("Коротышка спит, задыхаясь от кошмара");
                }
            };
            anotherSleep.sleep();
        }

    }
}
