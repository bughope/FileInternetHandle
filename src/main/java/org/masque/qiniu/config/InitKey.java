package org.masque.qiniu.config;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.config.Config;

/**
 * Created by Masque on 14-4-28.
 */
public final class InitKey {

   public static final  String BUCKET_NAME = "bughope";

   public static Mac getMac(){
        Config.ACCESS_KEY = "A-LGKe4t_B4cOViL63sQOQ3C5o_pUGtwOml5jfkB";
        Config.SECRET_KEY = "5Id_8_iIwD_RbiXNjj1ja3Kh2y3zBAF7Ep1sRTLA";
        Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
       return  mac;
    }
}
