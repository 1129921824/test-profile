package cn.sunyuqiang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping(value = "helloworld",method = RequestMethod.GET)
    @ResponseBody
    public String helloworld(){
        return "Hello World";
    }
    
}
