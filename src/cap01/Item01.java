package cap01;

/**
 * Considere os métodos static factory em vez dos construtores.
 * 
 * 1) Ao contrário dos construtores, possuem nomes.
 * 
 * 2) Nao precisam retornar um novo objeto sempre que invocados.
 */
public class Item01 {
    public static Item01 algumNomeSignificativo() {
        return new Item01();
    }

    public static Item01 algumNomeSignificativoQueRecebeParametro(String nome) {
        return new Item01(nome);
    }

    private Item01() {
    }

    private Item01(String nome) {
        // ...
    }

    private static Item01 item01 = new Item01();;

    public static Item01 naoRetornaNovoObjeto() {
        return item01;
    }
}
