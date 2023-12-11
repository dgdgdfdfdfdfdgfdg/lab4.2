import java.util.Random;

public class RandomSplit {
    public static int[] RandomSplitting(int amount, int num_split){
        int max_value = amount;
        int[] splits =  new int[num_split];
        for (int i = 0;i<splits.length-1;i++) {
            Random r = new Random();
            splits[i] = r.nextInt(max_value+1);
            max_value -= splits[i];
        }
        splits[splits.length-1]=max_value;
        for(int i=0;i< splits.length;i++){
          splits[i] =   (int)((double) splits[i]/Food.values()[i].getCallories()*100);
        }
        return splits;
    }
}
