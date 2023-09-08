public class Computer
{   
    private String Name;
    private boolean Power;
    private String Hdd;
    private int Ram;
    private String Cpu;
    private String Motherboard;
    private boolean Fans;
    private boolean NetworkStatus;
    private boolean BluetoothStatus;
    private double BatteryPercentage;
    private String Type;
    private String OS;

    public Computer-dk(String name, boolean power, String os, String cpu)
    {
        Name = name;
        Power = power;
        OS = os;
        Cpu = cpu;
    }

    public void TurnWebcam()
    {}

    public void TurnMicrophone()
    {}

    public void Power()
    {}

    public void Reboot()
    {}

    public void Boot()
    {
        RunSystemSoftwareAndApps();
    }

    public void Input()
    {}

    public void Volume()
    {}

    private void RunSystemSoftwareAndApps()
    {}

    private void TurnOnLedLights()
    {}

    private void Save()
    {}

    private void Load()
    {}

    private void TurnProtection()
    {}

}