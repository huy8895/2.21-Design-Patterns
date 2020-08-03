package Command;

public class Light {
    boolean status;

    void turnOn() {
        this.status = true;
    }

    void turnOff(){
        this.status = false;
    }

    @Override
    public String toString() {
        return "Light{" +
                "status=" + (status? "On":"Off") +
                '}';
    }
}
