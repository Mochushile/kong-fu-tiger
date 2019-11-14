package aijin;

import com.kong.tiger.MainApplication;
import com.kong.tiger.dto.RiscustomerVO;
import com.kong.tiger.dto.RiskAijinScoreVO;
import com.kong.tiger.service.RiskAijinScoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/10/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={MainApplication.class})

public class AijinTest {
    @Autowired
    RiskAijinScoreService riskAijinScoreService;
    @Test
    public void test1(){

        RiskAijinScoreVO riskAijinScoreById = riskAijinScoreService.getRiskAijinScoreById(460L);
        List<RiscustomerVO> riskAijinCustomers = riskAijinScoreService.getRiskAijinCustomers("2019-09-15 00:00:00");
        riskAijinCustomers.stream().forEach(cust->{
            System.out.println(cust.getCustomer());
        });
    }
}
