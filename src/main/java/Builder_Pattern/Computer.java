package Builder_Pattern;

/**
 * Created by MacBook on 05/08/16.
 */
public class Computer {
    //All final attributes
    private final String processor;
    private final String brandRAM;
    private final int sizeRAM;
    private final String storage;
    private final String graphics;

    public Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.brandRAM = builder.brandRAM;
        this.sizeRAM = builder.sizeRAM;
        this.storage = builder.storage;
        this.graphics = builder.graphics;
    }

    //All getter, and NO setter to provde immutability
    public String getProcessor() {
        return processor;
    }
    public String getBrandRAM() {
        return brandRAM;
    }
    public int getSizeRAM() {
        return sizeRAM;
    }
    public String getStorage() {
        return storage;
    }
    public String getGraphics() {
        return graphics;
    }

    @Override
    public String toString() {
        return "Computer: "+this.processor+", "+this.brandRAM+", "+this.sizeRAM+", "+this.storage+", "+this.graphics;
    }

    public static class ComputerBuilder
    {
        private final String processor;
        private final String brandRAM;
        private int sizeRAM;
        private String storage;
        private String graphics;

        public ComputerBuilder(String processor, String brandRAM, int sizeRAM, String storage) {
            this.processor = processor;
            this.brandRAM = brandRAM;
            this.sizeRAM = sizeRAM;
            this.storage = storage;
        }
        public ComputerBuilder graphics(String graphics) {
            this.graphics = graphics;
            return this;
        }

        public Computer build() {
            Computer Computer =  new Computer(this);
            return Computer;
        }
    }
}
