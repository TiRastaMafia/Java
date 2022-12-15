
public class Drinks {
    protected String name;
    protected String type;
    protected int volume;
    protected int temperature;
    
    public Drinks(String name, String type, int volume, int temperature) {
        this.name = name;
        this.type = type;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s,\n %s,\n %d,\n %d\n", name, type, volume, temperature);
    }
}