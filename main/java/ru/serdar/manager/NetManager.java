package ru.serdar.manager;

import ru.serdar.device.Device;
import ru.serdar.device.DeviceEnum;
import ru.serdar.device.PC;
import ru.serdar.net.Network;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public class NetManager {
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    private Network network = null;


    public static void main (String ... agr){
        NetManager manager= new NetManager();
        manager.setNetwork(new Network());
        final String INPUT = " put string type device;Name device;Ip device delimiter;";
        Scanner sc = new Scanner(System.in);
        int count=0;
        while(true){
        try{
                if(count == 0 )
                    System.out.println(INPUT);


                String addDevice =sc.nextLine();
                if(addDevice != null && addDevice.length()>0 ){
                    if(addDevice.equals("exit")){
                        System.exit(0);
                    }
                    System.out.println(addDevice+"---"+count);
                    count++;
                    Pattern p = Pattern.compile("(.*);(.*);(.*)");
                    Matcher m = p.matcher(addDevice);
                        if(m.matches()){
                            switch (DeviceEnum.valueOf(m.group(1).toUpperCase())){
                               case PC:
                                   Device d = new PC();
                                   d.setName(m.group(2));
                                   d.setDescription(m.group(3));
                               break;
                               default:
                                   System.out.println("Can't fount this type ="+m.group(0));
                               break;
                            }

                            for (int i=1; i<=m.groupCount(); i++)
                                System.out.println(m.group(i));
                        }else{
                            System.out.println(INPUT);
                        }
                    }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println("ощибка");
        }
        }
    }
}