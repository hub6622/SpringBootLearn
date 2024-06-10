package ppg.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ppg.demo.pojo.User;
import ppg.demo.service.RedisService;
import ppg.demo.service.impl.RedisServiceImpl;
import ppg.demo.utils.JwtToken;

@SpringBootTest
class SpringBootDemo2ApplicationTests {
    @Test
    void contextLoads() {
        JwtToken jwtToken=new JwtToken();
        User user=new User();
        user.setId(2);
        user.setName("zhangsan");
        String token = jwtToken.encode(user);
        System.out.println(token);

    }
    @Test
    void TokenConfirm(){
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MiwiZXhwIjoxNzE3MzkyMDYzLCJ1c2VybmFtZSI6InpoYW5nc2FuIn0.3sXDzC4y7GE9qzM9z2eOvRmP07v9OievErapcpTr3_Q";
        try{
            JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("PPG")).build();

            DecodedJWT verify = jwtVerifier.verify(token);
            System.out.println(verify.getClaim("id"));
            System.out.println(verify.getClaim("username"));
            System.out.println("令牌过期时间：" + verify.getExpiresAt());
        }catch (SignatureVerificationException e){
            e.printStackTrace();
        }
    }
    @Autowired
    RedisService redisService;
    @Test
    void RedisConnect(){

        redisService.connection();
    }

}
