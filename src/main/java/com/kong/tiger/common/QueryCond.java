package com.kong.tiger.common;

import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * 查询基础类
 * 作者：李吉忠 (jihongli@huashenghaoche.com)
 * 创建时间：2018-5-30
 */
public abstract class QueryCond implements Serializable {

    private Pageable pageable;

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }
}
