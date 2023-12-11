import java.util.Random;

public enum Food {
    EGG(157, 12, 10, 1),
    MILK(64, 3, 3, 5),
    BEAF(187, 19, 12, 0),
    CHEESE(364, 23, 30, 0),
    APPLE(47,0, 0,10);

    private final int cal,p,f,car;
    Food(int cal, int p, int f, int car) {
        this.cal = cal;
        this.p = p;
        this.f = f;
        this.car = car;
    }

    public int getCallories() {        return   cal;    }
    public int getProteins() {        return   p;    }
    public int getFats() {        return f;    }
    public int getCarbohydrates() {        return car;    }
}
