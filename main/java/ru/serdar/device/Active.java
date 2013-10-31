package ru.serdar.device;
import ru.serdar.utils.IpUtils;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 14:27
 * To change this template use File | Settings | File Templates.
 */
public abstract class Active extends Device {
    private Long ipAddress;

    public Long getIpAddress() {
        return ipAddress;
    }

    public String getStringIpAddress() {
        return IpUtils.longToIp(this.ipAddress);
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = IpUtils.ipToLong(ipAddress);
    }


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
