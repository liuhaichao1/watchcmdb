package com.watch.grafanajson.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public Map<String,String> test(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("test","test");
        return stringStringHashMap;

    }

    @RequestMapping("tes1")
    @ResponseBody
    public Map<String,String> tes1(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("tes1","tes1");
        return stringStringHashMap;

    }
}

