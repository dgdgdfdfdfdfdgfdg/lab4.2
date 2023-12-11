import java.util.*;


public class Main  {
    public static void main(String[] args) throws NegativeFoodAmountException, InvalidCountOfFoodTypesException, RatException {
        List<Human> humanList = new ArrayList<Human>();
//Создаём 24 бигхьюмана и 23 смолхьюмана и незнайку
        for(int i=0; i<23; i++) {
            BigHuman Vova = new BigHuman("Vova");
            SmallHuman Stepa = new SmallHuman("Stepa");
            humanList.add(Vova);
            humanList.add(Stepa);
        }
        BigHuman Vova = new BigHuman("Vova");
        humanList.add(Vova);
        Dunno dunno = new Dunno("dunno");
        humanList.add(dunno);

//        FoodSupply foodSupply1 = 0
//        foodSupply1.generateFoodSupply();
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(Food.values()));
        System.out.println("Введите кол-во еды разных видов в граммах через пробел:");
        String input = scanner.nextLine();
        // Разделение введенной строки на числа по пробелу
        String[] numbers = input.split(" ");
        // Создание массива целых чисел для хранения введенных значений
        int[] array = new int[numbers.length];
        // Преобразование строковых значений в числа и сохранение их в массиве
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        // Ставим foodSupply
        FoodSupply foodSupply1 = new FoodSupply();
        try {
            foodSupply1.setFoodSupply(array);
        }catch (InvalidCountOfFoodTypesException e){
            if (e.getMessage().equals("Ошибка 1")) {
                System.out.println("неправильное количество видов еды");
                System.out.println("были использованы первые "+Food.values().length+" чисел");
                int[] subArray = Arrays.copyOfRange(array, 0, Food.values().length);
                foodSupply1.setFoodSupply(subArray);
            }
            else {
                System.out.println("Вы ввели видов еды меньше необходимого");
                System.out.println("Если у вас нет запасов какого-то вида еды, заполните соответсвующее поле 0");
                throw e;
            }
        }
        //Получаем и выводим foodSupplyMap для проверки
        HashMap <Food,Integer> foodSupplyMap = foodSupply1.getFoodSupply();
        System.out.println(foodSupplyMap);

        dunno.convertDays( dunno.countFood(humanList,foodSupplyMap));

        try {
            dunno.sleep();
        }catch (RatException e){
            System.out.println("Незнайка не спит из-за крысы");
        }
        Shorty shorty = new Shorty();
        Ponchik ponchik = new Ponchik();
    }
}