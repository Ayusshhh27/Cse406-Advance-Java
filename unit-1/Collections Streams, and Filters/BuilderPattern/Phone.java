public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    private Phone(PhoneBuilder builder) {
        this.os = builder.os;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
    }

    public static class PhoneBuilder {
        private String os;
        private int ram;
        private String processor;
        private double screenSize;
        private int battery;

        public PhoneBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public PhoneBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public PhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public PhoneBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone [OS=" + os + ", RAM=" + ram + "GB, Processor=" + processor + ", Screen Size=" + screenSize
                + " inches, Battery=" + battery + "mAh]";
    }

    public static void main(String[] args) {
        Phone pear = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
                .setProcessor("Snapdragon")
                .setScreenSize(6.5)
                .setBattery(3000)
                .build();

        System.out.println(pear);
    }
}
