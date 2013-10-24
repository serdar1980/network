package ru.serdar.device;

import java.util.Collections;
import ru.serdar.demon.Demon;
import ru.serdar.net.Network;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 14:24
 * To change this template use File | Settings | File Templates.
 */
public abstract class Device {
    String name;
    String description = null;
    Collections ports = null;
    Demon demon = null;

   public abstract void connectTo();
   public abstract String getName();
   public abstract void setName(String name);
   public abstract String getDescription();
   public abstract void setDescription(String description);

}
