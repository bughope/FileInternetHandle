package org.masque.qiniu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Masque on 14-4-28.
 */
public class FileUtil {

    public final static String DATE_FORMART = "yyyyMMddhhmmss";

    public static synchronized String getFileName(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMART);
        System.out.print(format.format(date));
        return format.format(date);
    }

    public static void main(String[] args) {
        getFileName();
    }
}
