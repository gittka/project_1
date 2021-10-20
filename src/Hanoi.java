public class Hanoi {
    public static void main(String[] args) {
        HanoiTower(4, 'X', 'Z', 'Y');

    }
     static void  HanoiTower(int n, char depart, char intermediaire, char arrivee){
        if(n==1){
            System.out.println("Déplacer le disque"+n+" de la tige de depart:"+depart+" à l'arrivee:"+arrivee);
        }else{
            
        HanoiTower(n-1, depart,arrivee,intermediaire);
        System.out.println("Déplacer le disque"+n+" de la tige de depart:"+depart+" à l'arrivee:"+arrivee);
        HanoiTower(n-1, intermediaire,depart,arrivee);}
    }
}
