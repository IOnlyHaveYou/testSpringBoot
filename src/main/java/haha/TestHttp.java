package haha;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TestHttp {
    public String client(String url, HttpMethod method , MultiValueMap<String,String > paeams){
        RestTemplate template = new RestTemplate();
        ResponseEntity<String>  response1 = template.getForEntity(url ,String.class);
        return response1.getBody();
    }
}
