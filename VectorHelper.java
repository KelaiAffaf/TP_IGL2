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
        public int [] sortV (){
        int [] tmpV = new int[size];
        int tmp ;
        boolean bool = false;
        tmpV=vector;
        while (!bool){
            for (int i=0 ;i<size;i++)
            {
                if(tmpV[i]>tmpV[i+1]){
                    tmp = tmpV[i];
                    tmpV[i] = tmpV[i+1];
                    tmpV[i+1] = tmp;

                }
                else {
                    bool = true;
                }
            }
        }
        return tmpV;
    }

 public int [] sommeVectors (int [] vecteur, int size)
{   
    int [] tmp = new int [this.size];
    if (size != this.size) throw new DiffrentSizeException (){
        for (int i = 0,i<this.size;i++){
            tmp [i] = this.vector[i] + vecteur[i];
        }
    }
    return tmp;

}
public int [] InversingV ()
{
    int [] tmp = new int [this.size];
    int j = 0;
    for (int i = this.size-1;i>=0;i++)
    {
        tmp [j] = this.vector[size];
        j++;
    }
    return tmp;
}
}
