package task1;
/**
 * UnlockerMode
 */
public class UnlockerMode implements UnlockerBase {

    private int mode; // режим
    
    public void setMode(int mode) {
        this.mode = mode;
    }

    @Override
    public void confirm() {
        // TODO Auto-generated method stub
       System.out.println("Разблокировка Mode");
    }

    
}