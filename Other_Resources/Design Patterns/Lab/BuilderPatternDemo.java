class Computer {
    private String CPU;
    private String GPU;
    private int RAM; // in GB
    private int storage; // in GB

    // Private constructor to enforce use of Builder
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    // Getters for the fields (optional for this example)
    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB, Storage=" + storage + "GB]";
    }

    // Static Builder class
    public static class ComputerBuilder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        // Setter methods for each component
        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public ComputerBuilder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        // Build method to create the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Building a high-end computer
        Computer gamingPC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i9")
                .setGPU("NVIDIA RTX 4090")
                .setRAM(64)
                .setStorage(2000)
                .build();

        System.out.println(gamingPC); 
        // Output: Computer [CPU=Intel Core i9, GPU=NVIDIA RTX 4090, RAM=64GB, Storage=2000GB]

        // Building a budget computer
        Computer budgetPC = new Computer.ComputerBuilder()
                .setCPU("Intel Core i3")
                .setRAM(8)
                .setStorage(256)
                .build();

        System.out.println(budgetPC); 
        // Output: Computer [CPU=Intel Core i3, GPU=null, RAM=8GB, Storage=256GB]
    }
}
