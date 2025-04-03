
public class Review01 {

    public static void main(String[] args) {
        // int Costが原価　 double taxinが税価格
        int Cost = 1500;
        int taxin = tax( Cost);

        System.out.println(Cost+"円の商品の税込価格は"+(Cost+taxin)+"円（消費税は"+taxin+"円）です。");
 }

    public static  int tax(int x) {
        double result =(int) x*0.1;
        return (int) result;
    }
}
