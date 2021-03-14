package wzorce_projektowe.builder;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isUsbEnabled;
    private boolean isBlueToothEnabled;

    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isUsbEnabled = computerBuilder.isUsbEnabled;
        this.isBlueToothEnabled = computerBuilder.isBlueToothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isUsbEnabled() {
        return isUsbEnabled;
    }

    public boolean isBlueToothEnabled() {
        return isBlueToothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isUsbEnabled=" + isUsbEnabled +
                ", isBlueToothEnabled=" + isBlueToothEnabled +
                '}';
    }

    //builder class
    public static class ComputerBuilder {

        //wymagane elementy
        private String HDD;
        private String RAM;

        //dodatkowe (opcjonalne) elementy
        private boolean isUsbEnabled;
        private boolean isBlueToothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setUsbEnabled(boolean usbEnabled) {
            isUsbEnabled = usbEnabled;
            return this;
        }

        public ComputerBuilder setBlueToothEnabled(boolean blueToothEnabled) {
            isBlueToothEnabled = blueToothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}