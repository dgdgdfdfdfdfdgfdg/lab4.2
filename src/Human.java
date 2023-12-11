public abstract class Human {
    private  int[] normOfFood;
    protected String name;
    protected Human(String name,int normOfCal){
        this.normOfFood = RandomSplit.RandomSplitting(normOfCal, Food.values().length);
        this.name=name;
    }
    public int[] getNormOfFood(){
        return normOfFood;
    }

    public String getName(){return name;}

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return this.getName() == human.getName() && this.normOfFood == human.normOfFood;
    }
    @Override
    public String toString() {
        return this.getName() ;
    }
    @Override
    public int hashCode(){
        int result = 31;
        if (this.getClass() == Human.class) {
            int[] normOfFoodCurrent = this.getNormOfFood();

            for (Integer i : normOfFoodCurrent) {
                result = 31 * result + i;
            }
        }
        result = 31*result+this.getName().hashCode();
        return result;
    }
}
