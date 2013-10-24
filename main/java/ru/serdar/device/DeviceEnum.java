package ru.serdar.device;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 24.10.13
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public enum DeviceEnum {
        PC("pc"), ROUTER("router"), SERVE("server"), HUB("hub"), SWITCH("switch");

        private String type;

        public String getAction(){
            return this.type;
        }


        DeviceEnum(String type){
            this.type = type;
        }
}
