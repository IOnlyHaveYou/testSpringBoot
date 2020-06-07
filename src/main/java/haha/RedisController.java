package haha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "test")
public class RedisController {
    @Autowired
    private TestRedis testRedis;
    @RequestMapping(value = "/1")
    public Map<String ,String> test (){
        return testRedis.hehea();
    }
}
