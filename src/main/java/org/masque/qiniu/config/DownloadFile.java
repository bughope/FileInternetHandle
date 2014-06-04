package org.masque.qiniu.config;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.rs.GetPolicy;
import com.qiniu.api.rs.URLUtils;

/**
 * Created by Masque on 14-4-28.
 *
 */
public class DownloadFile {
    public static void main(String[] args) {
        String baseUrl = null;
        try {
            baseUrl = URLUtils.makeBaseUrl("bughope.qiniudn.com", "1.jpg");
            Mac mac = InitKey.getMac();
            GetPolicy getPolicy = new GetPolicy();
            String downloadUrl = getPolicy.makeRequest(baseUrl, mac);
            System.out.println(downloadUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
