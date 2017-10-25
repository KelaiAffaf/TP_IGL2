public class Main {




    public static void main(String[] args)
    {
        
        int vector[] = {51, 24, 19, 5, 37, 76, 61, 99, 101, 36};

         VectorHelper v = new VectorHelper();
        System.out.println(" le min et le max ");
        v.Max_Min();
        System.out.println("***********************************************************");
        System.out.println("multiplier tous les éléments par 6 apres les diviseer par 2");
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

