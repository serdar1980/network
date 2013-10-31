package ru.serdar.utils;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Created with IntelliJ IDEA.
 * User: sskomorohov
 * Date: 21.10.13
 * Time: 18:53
 * To change this template use File | Settings | File Templates.
 */
public class IpUtils {

    public static void main(String[] args) {
        System.out.println(longToIp(Long.valueOf(args[0], 16)));
    }

    public static String toHex(String ipAddress) {
        return Long.toHexString(IpUtils.ipToLong(ipAddress));
    }

    /** Converts IPv4 address to integer representation.
     */
    private static int addrToInt(Inet4Address i4addr)
    {
        byte[] ba = i4addr.getAddress();
        return (ba[0]       << 24)
                | ((ba[1]&0xFF) << 16)
                | ((ba[2]&0xFF) << 8)
                |  (ba[3]&0xFF);
    }

    public static long ipToLong(String ipAddress) {
        long result = 0;
        String[] atoms = ipAddress.split("\\.");

        for (int i = 3; i >= 0; i--) {
            result |= (Long.parseLong(atoms[3 - i]) << (i * 8));
        }

        return result & 0xFFFFFFFF;
    }

    public static String longToIp(long ip) {
        StringBuilder sb = new StringBuilder(15);

        for (int i = 0; i < 4; i++) {
            sb.insert(0, Long.toString(ip & 0xff));

            if (i < 3) {
                sb.insert(0, '.');
            }

            ip >>= 8;
        }

        return sb.toString();
    }
}