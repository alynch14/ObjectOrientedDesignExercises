public class Client{
    public static void main(String[] args){
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightsOnCommand(light);
        Command lightsOff = new LightsOffComand(light);

        control.setCommand(lightsOn);
        control.pressButton();
        
        control.setCommand(lightsOff);
        control.pressButton();
    }
}