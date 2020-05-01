import java.util.Random;

public class Exercise7{
public static void main(String[] args)
  public int[] reorganize(int [] numbers){
    Random rnd = new Random();
    for (int i = numbers.length - 1; 1 >= 0; i--){
        int index = rnd.nextInt(i + 1);
        int[] numbers2 = {15, 25, 35, 45, 65, 75, 85, 95};

        int a = numbers[index];
        numbers[index] = numbers[i];
        numbers[i] = a;
    
    return numbers2;
}



    
}
}