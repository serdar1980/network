package ru.serdar.net;
import ru.serdar.device.Device;
import ru.serdar.device.Active;

import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
public class Network {
    private Map<String, Device> devices;
    private Set<Long> unicIp;



    public void addElement(Device device){
        if(device instanceof Active){
            if(unicIp.add(((Active)device).getIpAddress())){
                devices.put(device.getName(),device);
            }else{
                System.out.println("Dublicate IP");
            }
        }else{
            devices.put(device.getName(),device);
        }


    }

    public void removeElement(String ipAddress, String name){

    }

}
