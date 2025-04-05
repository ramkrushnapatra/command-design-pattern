public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton(); // Output: Light is ON

        remote.setCommand(turnOff);
        remote.pressButton(); // Output: Light is OFF
    }
}
