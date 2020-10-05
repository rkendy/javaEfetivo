package cap01;

/**
 * Considere os métodos static factory em vez dos construtores.
 * 
 * 1) Ao contrário dos construtores, possuem nomes.
 * 
 * 2) Nao precisam retornar um novo objeto sempre que invocados (performance
 * e/ou maior controle sobre as instancias existentes).
 * 
 * 3) Podem retornar um objeto de qualquer subtipo, dando grande flexibilidade
 * na escolha do objeto retornado (mantendo-as privadas por exemplo).
 * 
 * 4) Podem variar o objeto de retorno de chamada para chamada. Ex: EnumSet
 * retorna instancias diferentes dependendo da quantidade de elementos.
 * 
 * 5) A classe do objeto retornado pode ser criada depois do static factory (Ex:
 * service provider frameworks: API de acesso ao serviço)
 * 
 * Alguns nomes utilizados:
 * 
 * from: Data.from(instant)
 * 
 * of: EnumSet.of(X,Y,Z)
 * 
 * valueOf: BigInteger.valueOf(Integer.MAX_VALUE)
 * 
 * intance/getIntance: StackWalker.getInstance(options)
 * 
 * create/newInstance: Array.newInstance(...)
 * 
 * getType: Files.getFileStore(path)
 * 
 * newType: Files.newBufferedReader(path)
 * 
 * type: Collections.list(...)
 * 
 */
public class Item01 {

    private Item01() {
    }

    private Item01(String nome) {
        // ...
    }

    // 01:
    public static Item01 algumNomeSignificativo() {
        return new Item01();
    }

    public static Item01 algumNomeSignificativoQueRecebeParametro(String nome) {
        return new Item01(nome);
    }

    // 02:
    private static Item01 item01 = new Item01();

    public static Item01 naoRetornaNovoObjeto() {
        return item01;
    }

}
