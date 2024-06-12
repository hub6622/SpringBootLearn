package ppg.demo.service;


import java.util.List;
import java.util.Set;

public interface RedisService {

    Boolean deleteValue(String key);

    void connection();

    void setValue(String key, Object value);

    Object getValue(String key);

    void ListRightPush(String listKey, Object value);

    List<Object> range(String listKey, long start, long end);

    void addSet(String setKey, Object value);

    Set<Object> members(String setKey);

    void putHash(String hashKey, String field, Object value);

    Object getFromHash(String hashKey, String field);
    void append(String key, Object value);
}