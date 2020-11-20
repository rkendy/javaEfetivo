package cap01;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Dê preferencia à injeção de dependência para integrar recursos.
 */
public class Item05 {

    // Uso inapropriado de classe utilitaria estatica (ou singleton):
    private static final Lexicon dictionary = null;

    // Uso de injecao de dependencia (via constructor):
    private final Lexicon injectedDictionary;

    public Item05(Lexicon dictionary) {
        injectedDictionary = Objects.requireNonNull(dictionary);
    }

    // Ou passar um factory para o construtor, utilizando a interface Supplier<T>
    // para representar fabricas:
    public Item05(Supplier<? extends Lexicon> dictionaryFactory) {
        injectedDictionary = dictionaryFactory.get();
    }

    public static class Lexicon {
    }

    public static void main(String[] args) {
        // Example using factory:
        Supplier<Lexicon> factory = Lexicon::new;
        Item05 item = new Item05(factory);
    }
}
