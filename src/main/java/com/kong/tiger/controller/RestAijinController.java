package com.kong.tiger.controller;

import com.kong.tiger.dto.RiskAijinScoreVO;
import com.kong.tiger.service.RiskAijinScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/25.
 */
@RestController
@RequestMapping("/aijin")
public class RestAijinController {

    @Value("${com.kong.tiger.score}")
    private String name;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RiskAijinScoreService riskAijinScoreService;

    /**
     * 切换多环境测试
     * @return
     */
    @RequestMapping(value = "/name")
    public String getPropertyString(){
        return name;
    }

    /**
     * Redis单机版集成测试
     * @return
     */
    @RequestMapping(value = "/redis")
    public String getRedisString(){
        return stringRedisTemplate.opsForValue().get("aaa");
    }

    /**
     * 访问mysql数据库测试
     * @return
     */
    @RequestMapping(value = "/info")
    @ResponseBody
    public RiskAijinScoreVO getAijinInfo(){
        RiskAijinScoreVO riskAijinScoreById = riskAijinScoreService.getRiskAijinScoreById(460L);
        return riskAijinScoreById;
    }

}
