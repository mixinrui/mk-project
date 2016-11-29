package com.mikai.factory;

import net.sf.json.JSONObject;

/**
 * Created by mk on 16/8/27.
 */
public class Test {
    public static void main(String[] args) {
        try {
        String a = "";
        if(a==""){
                throw  new Exception("a is null");
            }
        }catch (Exception e) {
            System.out.println("fsfsf");
        }
    }

    String jsonStr = "{\n" +
            "  \"returnCode\": 200,\n" +
            "  \"returnMsg\": \"success\",\n" +
            "  \"data\": {\n" +
            "    \"1\": {\n" +
            "      \"fishCardId\": 1,\n" +
            "      \"tags\": \"网络问题,老师网络问题,接通,网络卡顿严重\",\n" +
            "      \"comment\": null\n" +
            "    },\n" +
            "    \"2\": {\n" +
            "      \"fishCardId\": 2,\n" +
            "      \"tags\": \"网络问题,学生网络问题,未接通\",\n" +
            "      \"comment\": null\n" +
            "    },\n" +
            "    \"3\": {\n" +
            "      \"fishCardId\": 3,\n" +
            "      \"tags\": \"学生问题,学生旷课,未接通3\",\n" +
            "      \"comment\": null\n" +
            "    }\n" +
            "  }\n" +
            "}";
    JSONObject jsonObject = new JSONObject();







}
