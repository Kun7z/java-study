//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] arrayMultidimensional = {{"Eric", "João"}, {"Kevin", "Damke"}};

        System.out.println(arrayMultidimensional[0][0]); // Eric
        System.out.println(arrayMultidimensional[0][1]); // João
        System.out.println(arrayMultidimensional[1][0]); // Kevin
        System.out.println(arrayMultidimensional[1][1]); // Damke

        int[][] arrayMultidimensional2 = new int[2][1];
        arrayMultidimensional2[0][0] = 1;
        System.out.println(arrayMultidimensional2[0][0]);
    }
}