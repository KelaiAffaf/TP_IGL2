/**
 * Created by Afaf kelai on 24/10/2017.
 */
public class VectorHelper {


   private int array[] = {51, 24, 19, 5, 37, 76, 61, 99, 101, 36};

    public VectorHelper() {
    }

    public void Max_Min()
    {
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;


        for (int nombre:array)
            System.out.print(nombre+" ");

        for(int i = 0; i < array.length; i++){
            if(array[i] < maxVal)
                maxVal = array[i];
            if(array[i] > minVal)
                minVal = array[i];
        }

        System.out.print("\nValeur minimale = "+maxVal);
        System.out.print("\nValeur maximale = "+minVal);


    }

     public void formule{

        for (int i=0 ;i<array.length;i++)
        {
            array[i]=(array[i]*6/2);
            System.out.println("V");
        }
    }
}
