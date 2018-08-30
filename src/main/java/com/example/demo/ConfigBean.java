package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @Title : 
 * @author : yangyang
 * @date : 2018年7月17日
 * @Description : 
 */
@Component  
//@ConfigurationProperties(prefix = "devconfig")//获取前缀为devconfig下的配置信息  
public class ConfigBean {   
    private String ip;//名字与配置文件中一致  
    private Integer port;    
    public String getIp() {  
        return ip;  
    }    
    public void setIp(String ip) {  
        this.ip = ip;  
    }    
    public Integer getPort() {  
        return port;  
    }    
    public void setPort(Integer port) {  
        this.port = port;  
    }  
}
