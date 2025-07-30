package all;

public class TV
{
    //test block
    public static void main(String[] args)
    {
        TV t1 = new TV();
        TV t2 = new TV();

        t1.turnOn();
        t1.setChannel(30);
        t1.setVolume(3);
        
        /////
        
        t2.turnOn();
        t2.channelUp();
        t2.channelUp();
        t2.volumeUp();

        System.out.println("t1 channel is: " + t1.channel + "\n" + "and volume is: " + t1.volumeLevel);
        System.out.println("t2 channel is: " + t2.channel + "\n" + "and volume is: " + t2.volumeLevel);


    }

    //attributes
    int channel, volumeLevel;
    boolean on;

    //methods
    public TV()
    {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }

    public void setChannel(int newChannel)
    {
        if (newChannel >=1 && newChannel <= 120 && on == true)
        channel = newChannel;
        else
        channel = 1;
    }

    public void setVolume(int newVolumeLevel)
    {
        if (newVolumeLevel >= 1 && newVolumeLevel <=7 && on == true)
        volumeLevel = newVolumeLevel;
        else
        volumeLevel = 1;
    }

    public void channelUp()
    {
        if (channel < 120 && on == true)
        channel ++;
    }

    public void channelDown()
    {
        if (channel >1 && on == true)
        channel --;
    }

    public void volumeUp()
    {
        if(on == true && volumeLevel < 7)
        volumeLevel ++;
    }

    public void volumeDown()
    {
        if(volumeLevel >1 && on == true)
        volumeLevel --;
    }


}
