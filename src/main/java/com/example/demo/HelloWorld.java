package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title : 
 * @author : yangyang
 * @date : 2018年7月17日
 * @Description : 
 */
@RestController
@RequestMapping("/test")
public class HelloWorld {
    
    @RequestMapping("/index")
    public String index(){
        return "Hello Spring Boot!";
    }
    
    @Value("${ip}")//获取application.yml文件中名为ip的value值  
    private String ip;  
    @Value("${port}")//获取application.yml文件中名为port的value值,并且自动完成数据类型转换  
    private Integer port;    
    @RequestMapping("/config")  
    public String config() {  
        return "ip:"+ip+",port:"+port;  
    }
    
    //自动注入,实例化bean  
    @Autowired  
    private ConfigBean configBean;  
    @RequestMapping("/config1")  
    public String config1() {  
        return "另一种方式:   ip:"+configBean.getIp()+",port:"+configBean.getPort();  
    }  

}
