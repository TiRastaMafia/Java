public class Coffee extends Drinks {
    // если нужны доп переменные то они будут private


    public Coffee(String name,  String type, int volume, int temperature) {
        super(name, type, volume, temperature);
            
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s,\n %s,\n %d\n %d\n", name, type, volume, temperature);
    }

    
}
