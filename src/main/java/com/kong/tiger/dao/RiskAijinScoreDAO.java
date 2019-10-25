package com.kong.tiger.dao;



import com.kong.tiger.dto.RiscustomerVO;
import com.kong.tiger.dto.RiskAijinScoreQuery;
import com.kong.tiger.dto.RiskAijinScoreVO;

import java.util.List;

 /**
 * 
 * <b>类名：</b>RiskAijinScoreDAO.java<br>
 * <p><b>描述：</b>爱金信息表 </p>
 * @author <font color='blue'>baoleiliu</font> 
 * @email baoleiliu@huashenghaoche.com
 * @version 1.0
 * @date  2019-10-21 14:12:07
 */
public interface RiskAijinScoreDAO {

      RiskAijinScoreVO getOne(Long id);

     List<RiscustomerVO> getRiskAijinCustomers(String date);

}
