package ppg.demo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import ppg.demo.pojo.User;
import java.util.Calendar;
import java.util.HashMap;
public class JwtToken {
    public String encode(User user){
        HashMap<String, Object> map=new HashMap<>();
//        创建时间instance
        Calendar instance = Calendar.getInstance();
//        设置时间 默认秒
        instance.add(Calendar.SECOND,60*60*2);
//        创建token添加头，有效载荷，和签名
        String token = JWT.create()
                .withHeader(map)
                .withClaim("id", user.getId())
                .withClaim("username",user.getName())
//                获取instance时间，设置有效时间
                .withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256("PPG"));
        return token;

    }
}
