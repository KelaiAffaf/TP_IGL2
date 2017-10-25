/**
 * Created by Afaf kelai on 24/10/2017.
 */
public class VectorHelper {


   private int vector[] = {5,2,3,6,1};
   private int size = 5;

    public VectorHelper() {
    }

    public void Max_Min()
    {
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;


        for (int nombre:vector)
            System.out.print(nombre+" ");

        for(int i = 0; i < vector.length; i++){
            if(vector[i] < maxVal)
                maxVal = vector[i];
            if(vector[i] > minVal)
                minVal = vector[i];
        }

        System.out.print("\nValeur minimale = "+maxVal);
        System.out.print("\nValeur maximale = "+minVal);


    }
   /**
     * Cette Methode doit  Appliquer une formule sous forme de fonction à tous les éléments d’un vecteur. Par
     exemple, ici  multiplier tous les éléments par 6 apres les diviseer par 2.

     */


     public void formule(){

        for (int i=0 ;i<this.size;i++)
        {
            vector[i]=(vector[i]*6/2);
            System.out.println("V");
        }
    }
       /**
     * Une méthode qui permet de trier les éléments du vecteur.
     */

    public int [] sortV (){

        int [] tmpV ;

        int tmp ;
        boolean bool = false;
        tmpV=vector;
        while (!bool){
            for (int i=0 ;i<size-1;i++)
            {
                bool = true;
                if(tmpV[i]>tmpV[i+1]){
                    tmp = tmpV[i];
                    tmpV[i] = tmpV[i+1];
                    tmpV[i+1] = tmp;
                    System.out.println(tmp+"\n");
                    bool = false;
                }

            }
        }
        return tmpV;
    }

/**
* Une méthode qui fait la somme de deux vecteurs.
*/
 public int [] sommeVectors (int [] vecteur, int size)throws DiffrentSizeException
{   
    int [] tmp = new int [this.size];
    if (size != this.size) throw new DiffrentSizeException ();{
        for (int i = 0;i<this.size;i++){
            tmp [i] = this.vector[i] + vecteur[i];
        }
    }
    return tmp;

}
/**
*Une méthode qui permet l'inversement du vecteur.
*/
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
