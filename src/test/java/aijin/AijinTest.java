package aijin;

import com.kong.tiger.MainApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2019/10/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={MainApplication.class})

public class AijinTest {
    // @Autowired
    // RiskAijinScoreService riskAijinScoreService;
    // @Test
    // public void test1(){
    //
    //     RiskAijinScoreVO riskAijinScoreById = riskAijinScoreService.getRiskAijinScoreById(460L);
    //     List<RiscustomerVO> riskAijinCustomers = riskAijinScoreService.getRiskAijinCustomers("2019-09-15 00:00:00");
    //     riskAijinCustomers.stream().forEach(cust->{
    //         System.out.println(cust.getCustomer());
    //     });
    // }
}
