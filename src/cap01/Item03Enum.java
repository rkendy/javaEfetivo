package cap01;

/**
 * Singleton tb pode ser implementado como enum de um unico elemento.
 * 
 * Uso: Item03Enum.INSTANCE.doSomething();
 */
public enum Item03Enum {
    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something...");
    }
}
