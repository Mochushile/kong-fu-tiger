package aijin;

import com.kong.tiger.MainApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes={MainApplication.class})
public class TestRedis {

    // @Autowired
    // private StringRedisTemplate stringRedisTemplate;
    //
    // @Autowired
    // private RedisTemplate redisTemplate;
    //
    // @Test
    // public void test() throws Exception {
    //     // Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    //     stringRedisTemplate.opsForValue().set("aaa", "111");
    //     Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    // }

}