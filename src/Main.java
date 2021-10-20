import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []tab={1,2,3,4,5,6,7,8,9};
        sumProductTableau(tab);
        pairTableau(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println();
        reverseTableau(tab);
        Hanoi.HanoiTower(7, 'X', 'Z', 'Y');
    }

    static void sumProductTableau(int [] tableau){
        int sum=0;
        int product=1;

         for (int j : tableau) {
             sum = sum + j;
             product = product * j;
         }
        System.out.println("La somme du tableau est "+sum+" Le produit du tableau est "+product);
    }
    static void pairTableau(int [] tableau){
        for (int k : tableau) {
            for (int i : tableau) {
                System.out.println(k + "" + i);
            }
            System.out.println();
        }
    }
    static void reverseTableau(int [] tableau){

        for (int i=0;i<tableau.length/2;i++){

            int temp= tableau[tableau.length-1-i];
            tableau[tableau.length-1-i]= tableau[i];
            tableau[i]=temp;

        }
        System.out.println(Arrays.toString(tableau));

    }
}
