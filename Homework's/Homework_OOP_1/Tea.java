

public class Tea extends Drinks {
    // если нужны доп переменные то она будут private
    private String taste;

    public Tea(String name,  String type, String taste, int volume, int temperature) {
        super(name, type, volume, temperature);
        this.taste = taste; 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s,\n %s,\n %s,\n %d,\n %d\n", name, type, taste, volume, temperature);
    }
}
