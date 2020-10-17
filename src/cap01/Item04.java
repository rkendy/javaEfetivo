package cap01;

/**
 * Implemente a nao instanciacao atraves de construtores privados.
 */
public class Item04 { // Classe utilitaria nao instanciavel

    // Construtor padrao suprimido para nao instanciacao:
    private Item04() {
        throw new AssertionError();
    }

    public static final String SOME_VALUE = "XYZ";

    public static final void method() {
        // Do something...
    }

    public static void main(String[] args) {
        System.out.println(Item04.SOME_VALUE);
    }
}