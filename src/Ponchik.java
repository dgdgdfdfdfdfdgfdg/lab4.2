public class Ponchik {
    private void goToMoonCave(){
        System.out.println("Пончик пошёл в лунную пещеру");
    }
    Ponchik() {
        class Boot {
            private void getLost(){
                System.out.println("Ботинок потерялся");
            }
        }
        goToMoonCave();
        Boot boot = new Boot();
        boot.getLost();
    }
}
