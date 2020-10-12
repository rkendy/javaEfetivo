package cap01;

/**
 * Implemente a propriedade de um singleton com um constructor privado ou um
 * tipo enum.
 */
public class Item03 {

    private static final Item03 INSTANCE = new Item03();

    private Item03() {
    }

    /**
     * Static Factory. Vantagens:
     * 
     * 1) API deixa claro que eh um singleton.
     * 
     * 2) Flexibilidade para mudar sem alterar a api.
     * 
     * 3) Utilizar como supplier: Item03::instance
     * 
     */
    public static Item03 getInstance() {
        return INSTANCE;
    }

    /**
     * Garantir que seja Serializable:
     * 
     * 1) implements Serializable.
     * 
     * 2) Todos os campos devem ser 'transient' (para que nao sejam serializados).
     * 
     * 3) Metodo readResolve, para quando a classe for deserializada, nao seja
     * criada uma nova instancia.
     * 
     * Ou Utilizar enum (ver Item03Enum.java)
     * 
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        // Static Factory:
        Item03 item03 = Item03.getInstance();

        // Enum:
        Item03Enum singleton = Item03Enum.INSTANCE;
        singleton.doSomething();
        // Or: Item03Enum.INSTANCE.doSomething();
    }
}
