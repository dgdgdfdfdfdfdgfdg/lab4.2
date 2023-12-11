import java.util.Arrays;
import java.util.Random;

public class Rat {
        public Rat() throws RatException {
            Eyes eyes = new Eyes();
            Nose  nose = new Nose();
            throw new RatException("Крыса в комнате");
        }

        private  class Eyes{
            private String color;
            private Colors generateColor(){
                Random random = new Random();
                int randomNumber = random.nextInt(5);
                return Colors.values()[randomNumber];
            }

            private Eyes(){
                Colors color=generateColor();
                System.out.println("Мышь смотрит на незнайку " +color.getWord()+ " глазами");
            }
        }
        private  class Nose{
            private Nose(){
                System.out.println("Мышь шевелит носом");
            }
        }
}
