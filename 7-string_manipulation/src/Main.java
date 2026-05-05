//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <Verifica> void main(String[] args) {
//        https://www.tpointtech.com/java-string doc para strings em Java

//        variaveis
        String text = "  Eric Kuntz          ";
        double number = 13.5;


//        Transformando number em string
        String numberConvertedToString = String.valueOf(number);

//        Verifica a string no index de número X
        System.out.println(numberConvertedToString.charAt(0));

//        Verifica se a string comeca com a ocorrencia informada (boolean)
        boolean result = text.startsWith("Er");
        boolean result1 = text.startsWith("Er", 1);
        System.out.println(result);
        System.out.println(result1);

//        Verifica se a string termina com a ocorrencia informada (boolean)

        boolean result3 = text.endsWith("Er");
        System.out.println(result3);

//        Veriificar tamanho da string

        int textSize = text.length();
        System.out.println(textSize); //22 de tamanho para string Eric Kuntz com espacos no final

        String textWithoutSpaces = text.trim();
        System.out.println(textWithoutSpaces);
        System.out.println(textWithoutSpaces.length());//10 pois tirou espaco do comeco e do final

//        Coloca em UPPERCASE

        String textUpperCase = text.toUpperCase();
        System.out.println(textUpperCase);

//        Coloca em Minusculo
        String textLowerCase = text.toLowerCase();
        System.out.println(textLowerCase);

//        IndexOf - acha indice de uma letra dentro da string

        int IndexLetterK = text.indexOf("K");
        System.out.println(IndexLetterK);
        int indexLetterKOffset = text.indexOf("K", 5);
        System.out.println(indexLetterKOffset);

//        lastIndexOf() - acha o indice da ultima ocorrencia dentro de uma string

        int indexLastLetterK = text.lastIndexOf("K");
        System.out.println(indexLastLetterK);
        int indexLastLetterKFromIndex = text.lastIndexOf("K", 7);
        System.out.println(indexLastLetterKFromIndex);

//        replace - substitui uma ou todas as ocorrencias por uma string, sendo uma letra ou palavra

        String textExample = "banana";
        System.out.println(textExample.replace("a", "e"));

//        substring - retorna uma string partindo de um indice X(int)

        System.out.println(text.substring(1, 3));

    }
}