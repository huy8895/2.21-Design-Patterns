package Command;

public class Main {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light light = new Light();

        ICommand command = new TurnOnCommand(light);
        control.setCommand(command);

        control.pressButton();
        System.out.println(light);
    }
}
