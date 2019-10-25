package com.kong.tiger.service.impl;

import com.kong.tiger.dao.RiskAijinScoreDAO;
import com.kong.tiger.dto.RiscustomerVO;
import com.kong.tiger.dto.RiskAijinScoreQuery;
import com.kong.tiger.dto.RiskAijinScoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.kong.tiger.service.RiskAijinScoreService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * <b>类名：</b>RiskAijinScoreServiceImpl.java<br>
 * <p><b>描述：</b>爱金信息表服务实现类 </p>
 * @author <font color='blue'>baoleiliu</font> 
 * @email baoleiliu@huashenghaoche.com
 * @version 1.0
 * @date  2019-10-21 14:12:07
 */
@Service
public class RiskAijinScoreServiceImpl implements RiskAijinScoreService {

    @Autowired
    private RiskAijinScoreDAO riskAijinScoreDAO;


    @Override
    public RiskAijinScoreVO getRiskAijinScoreById(Long id) {
        return riskAijinScoreDAO.getOne(id);
    }
    public List<RiscustomerVO> getRiskAijinCustomers(String date){
        return  riskAijinScoreDAO.getRiskAijinCustomers(date);
    }
}

