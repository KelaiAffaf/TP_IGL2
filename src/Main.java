public class Main {




    public static void main(String[] args)
    {
        
        int vector[] = {51, 24, 19, 5, 37, 76, 61, 99, 101, 36};

        int [] somme1 ={21,15,23,5};
        VectorHelper v = new VectorHelper();
     



        System.out.println(" le min et le max ");

        v.Max_Min();
        System.out.println("\n***********************************************************");
        System.out.println("inverse les element d'un vecteur.");
        System.out.println("***********************************************************");
        v.InversingV();
        System.out.println("\n");
        System.out.println("***********************************************************");
        System.out.println("trie les elements d'un vecteur");
        System.out.println("***********************************************************");
        v.sortV();
        System.out.println("\n***********************************************************");
        System.out.println("realise la somme de deux vecteur.");
        System.out.println("***********************************************************");
        try {v.sommeVectors(somme1,somme1.length);}catch (DiffrentSizeException e){e.Message();}
        System.out.println("\n***********************************************************");
        System.out.println("multiplier tous les éléments par 6 apres les diviseer par 2");

        System.out.println("***********************************************************");

        v.formule();
        System.out.println("***********************************************************");
        System.out.println(" Inverser le tableau  ");
        v.InversingV();
        System.out.println("***********************************************************");
        System.out.println(" trie du tableau   ");
        v.sortV();
        System.out.println("***********************************************************");

    }
}

