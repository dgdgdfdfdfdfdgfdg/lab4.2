import java.util.HashMap;
import java.util.Random;

public class FoodSupply {

    private  HashMap<Food, Integer> foodSupplyMap;
    public void setFoodSupply(int[] foodSupply) throws NegativeFoodAmountException, InvalidCountOfFoodTypesException {
        foodSupplyMap = new HashMap<>();
        if (foodSupply.length > Food.values().length){
            throw new InvalidCountOfFoodTypesException("Ошибка 1");
        }else if(foodSupply.length < Food.values().length){
            throw new InvalidCountOfFoodTypesException("Ошибка 2");
        }
        for (int i=0;i<foodSupply.length;i++) {
            if (foodSupply[i]<0){throw new NegativeFoodAmountException("Негативное кол-во еды "+Food.values()[i]);}
            foodSupplyMap.put(Food.values()[i],foodSupply[i] );
        }
        this.foodSupplyMap=foodSupplyMap;

    }
    public  void generateFoodSupply()
    {
        foodSupplyMap = new HashMap<>();
        Random r = new Random();
        for (Food food : Food.values()) {
            foodSupplyMap.put(food, Math.abs(r.nextInt()));
        }
    }
    public  HashMap<Food, Integer> getFoodSupply(){
        return foodSupplyMap;
    }

}
