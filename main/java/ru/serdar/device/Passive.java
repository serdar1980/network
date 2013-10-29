package ru.serdar.device;
import ru.serdar.device.Device;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 14:35
 * To change this template use File | Settings | File Templates.
 */
public abstract class Passive extends Device {
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
