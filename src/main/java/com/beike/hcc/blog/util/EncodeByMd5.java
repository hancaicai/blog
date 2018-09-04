package com.beike.hcc.blog.util;

import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
public class EncodeByMd5 {
    //密码加密


    public static String encodeByMD5(String originstr) {
        if (originstr != null) {
            try {
                ////创建具有指定算法名称的信息摘要
                MessageDigest md = MessageDigest.getInstance("MD5");
                //使用指定的字节数组对摘要进行最后的更新，然后完成摘要计算
                //byte 指定编码方式 数组toString得到的是数组的地址


                byte[] results = md.digest(originstr.getBytes(StandardCharsets.UTF_8));
                String resultString= Hex.encodeHexString(results);

                return resultString;
            } catch (Exception ex) {

                ex.printStackTrace();
            }
        }
        return null;


    }
}
