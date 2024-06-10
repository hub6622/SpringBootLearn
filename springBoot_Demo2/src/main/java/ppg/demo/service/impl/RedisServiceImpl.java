package ppg.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import ppg.demo.service.RedisService;

import java.util.List;
import java.util.Set;

@Service
public class RedisServiceImpl implements RedisService {
//    Spring Boot 自动配置 RedisConnectionFactory 和 RedisTemplate
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public Boolean deleteValue(String key) {
        return redisTemplate.delete(key);
    }
    public void connection() {

        System.out.println(redisTemplate.getConnectionFactory().getConnection().ping());
//        return redisTemplate.getConnectionFactory();
    }
    public void setValue(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }
    public void ListRightPush(String listKey, Object value) {
        redisTemplate.opsForList().rightPush(listKey, value);
    }

    public List<Object> range(String listKey, long start, long end) {
        return redisTemplate.opsForList().range(listKey, start, end);
    }
    public void addSet(String setKey, Object value) {
        redisTemplate.opsForSet().add(setKey, value);
    }

    public Set<Object> members(String setKey) {
        return redisTemplate.opsForSet().members(setKey);
    }
    public void putHash(String hashKey, String field, Object value) {
        redisTemplate.opsForHash().put(hashKey, field, value);
    }

    public Object getFromHash(String hashKey, String field) {
        return redisTemplate.opsForHash().get(hashKey, field);
    }

}
