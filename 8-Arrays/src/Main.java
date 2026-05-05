//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Posso declarar um array dessas tres formas, com o colchetes depois do tipo de dado dentro do array, com os colchetes antes da variavel ou com os colchetes depois do nome da variavel
        int[] arrayIntNumbers = {1, 234, 987};
        int[] arrayIntNumbers1 = {1, 234, 987};
        int arrayIntNumbers2[] = {1, 234, 987};

        System.out.println(arrayIntNumbers[0]); // 234
        System.out.println(arrayIntNumbers[1]); // 234
        System.out.println(arrayIntNumbers[2]); // 234

//    Criar um array com a quantidade de indices que eu quiser.

        int[] array = new int[5];
        System.out.println(array[0]); // 0 vem por default nos indices
        array[0] = 20000; //atribuo valor 20000 ao index 0
        System.out.println(array[0]);
        array[0]=123; //reatribuo valor 123 substituindo o valor 20000 no index 0.
        System.out.println(array[0]);
    }
}