import com.example.blogboot.BlogbootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
/**
 * @ClassName : SpringbootDataJdbcApplicationTests
 * @Author : Administrator
 * @Date: 2021/7/11 9:31
 * @Description :
 */
@SpringBootTest(classes = BlogbootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootDataJdbcApplicationTests {
    @Autowired
    DataSource dataSource;
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() throws SQLException {
        boolean result = false;
        System.out.println("redis");
        try {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            operations.set("id", "2");

            result = true;
        } catch (Exception e) {
            throw e;
        }



    }
}
