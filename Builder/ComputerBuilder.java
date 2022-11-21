package Builder;

public class ComputerBuilder {

    private String ram;

    private String ssd;

    private String hdd;

    private String cpu;

    // required components of a computer
    public ComputerBuilder(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // non-required component
    public ComputerBuilder buildSsd(String ssd) {
        this.ssd = ssd;
        return this;
    }
    
    public Computer build() {
        return new Computer(ssd, hdd, ram, cpu);
    }

}
