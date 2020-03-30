package com.shoppingmall.utils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils
 * @Version：1.0
 */

public class JsonHelper {

    private static final ObjectMapper mapper = new ObjectMapper();

    // 对象转字符串
    public static String object2Str(Object obj){
        String result = "";
        try {
            result = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    // 字符串转JSON
    public static JSONObject strToJson(String str){
        return JSONObject.parseObject(str);
    }
    // string 转 class
    public static Object str2Class(String str,Class clazz){
        Object obj = null;
        try {
            obj = mapper.readValue(str,clazz);
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
