package org.masque.qiniu.config;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.io.PutRet;
import com.qiniu.api.rs.PutPolicy;
import org.json.JSONException;

/**
 * Created by Masque on 14-4-28.
 */
public class UploadFile {
    public static void main(String[] args) {
        Mac mac = InitKey.getMac();
        PutPolicy putPolicy = new PutPolicy(InitKey.BUCKET_NAME);
        String uptoken = null;
        try {
            uptoken = putPolicy.token(mac);
        } catch (AuthException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        PutExtra extra = new PutExtra();
        String key = "1.jpg";
        String localFile = "C:\\Users\\Masque\\Desktop\\设计图.jpg";
        PutRet ret = IoApi.putFile(uptoken, key, localFile, extra);
        System.out.print(ret.ok());
    }
}
