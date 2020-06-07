package haha;

import haha.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestRedis {

    @Autowired
    private  RedisUtil redisUtil;

    public Map<String,String> hehea() {
//        RedisUtil redisUtil = new RedisUtil();

        redisUtil.set("test","test的value");
        Map<String,String> map = new HashMap<>();
        map.put("code","200");
        map.put("msg" ,(String)redisUtil.get("test"));

        System.out.println(redisUtil.get("test"));
        return map;
    }
}
