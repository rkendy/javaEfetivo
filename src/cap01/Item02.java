package cap01;

/**
 * Cogite o uso de um builder quando se deparar com muitos parametros no
 * construtor.
 * 
 * 
 */
public class Item02 {
    private final int attributeA;
    private final int attributeB;
    private final int attributeC;

    public static class Builder {
        private int attributeA;
        private int attributeB;
        private int attributeC;

        public Builder() {
        }

        public Builder attributeA(int val) {
            attributeA = val;
            return this;
        }

        public Builder attributeB(int val) {
            attributeB = val;
            return this;
        }

        public Builder attributeC(int val) {
            attributeC = val;
            return this;
        }

        public Item02 build() {
            return new Item02(this);
        }
    }

    private Item02(Builder builder) {
        attributeA = builder.attributeA;
        attributeB = builder.attributeB;
        attributeC = builder.attributeC;
    }

    @Override
    public String toString() {
        return "A: " + attributeA + "\nB: " + attributeB + "\nC: " + attributeC + "\n";
    }

    public static void main(String[] args) {
        Item02 item02 = new Item02.Builder().attributeA(10).attributeB(20).attributeC(30).build();
        System.out.println(item02);
    }
}
