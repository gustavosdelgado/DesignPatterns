package Builder;

public class Computer {

    private String ssd;

    private String hdd;

    private String ram;

    private String cpu;
    
    public Computer(String ssd, String hdd, String ram, String cpu) {
        this.ssd = ssd;
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
}
