/**
 *The purpose of this class is to model a television
 *Ricardo Abuabara 10/12/2021
 */
public class Television {
    private String MANUFACTURER;
    private int SCREEN_SIZE;
    private boolean powerOn = false;
    private int channel = 2;
    private int volume = 20;

    /** sets the type of screen and its size */
    public Television(String brand, int size)
    {
SCREEN_SIZE = size;
MANUFACTURER = brand;
    }
    /** sets the channel and changes the station of the television */
    public void setChannel(int station)
    {
channel = station;
    }
    /** sets the power of the television on */
    public void power()
    {
        powerOn = !powerOn;

    }
    /** sets the volume of the television up by 1 */
    public void increaseVolume()
    {

volume = volume + 1;
    }
    /** sets the volume of the television down by 1 */
    public void decreaseVolume()
    {

volume = volume - 1;
    }
    /** displays the current channel of the television */
    public int getChannel()
    {
return channel;
    }
    /** displays the current volume of the television */
    public int getVolume()
    {
return volume;
    }
    /** displays the current manufacturer of the television */
    public String getManufacturer()
    {
return MANUFACTURER;
    }
    /** displays the current screen size of television */
    public int getScreenSize()
    {
return SCREEN_SIZE;
    }

}
