package com.beike.hcc.blog.util;

import java.security.MessageDigest;

public class EncodeByMd5 {
    //密码加密


    public static String encodeByMD5(String originstr) {
        if (originstr != null) {
            try {
                ////创建具有指定算法名称的信息摘要
                MessageDigest md = MessageDigest.getInstance("MD5");
                //使用指定的字节数组对摘要进行最后的更新，然后完成摘要计算
                byte[] results = md.digest(originstr.getBytes());
                String resultString = results.toString();
                return resultString;
            } catch (Exception ex) {

                ex.printStackTrace();
            }
        }
        return null;


    }
}
