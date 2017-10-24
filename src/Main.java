public class Main {




    public static void main(String[] args)
    {
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        int vector = {1,2,3};
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
}

