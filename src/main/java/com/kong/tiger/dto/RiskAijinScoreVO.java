package com.kong.tiger.dto;

import java.util.List;
 /**
 * 
 * <b>类名：</b>RiskAijinScore.java<br>
 * <p><b>描述：</b>爱金信息表 </p>
 * @author <font color='blue'>baoleiliu</font> 
 * @email baoleiliu@huashenghaoche.com
 * @version 1.0
 * @date  2019-10-21 14:12:07
 */
public class RiskAijinScoreVO {

    /**
	 *  主键
     */
	private Long id;
    /**
	 *  姓名
     */
	private String cusName;
    /**
	 *  手机号
     */
	private String phone;
    /**
	 *  身份证
     */
	private String idCard;
    /**
	 *  爱金分数
     */
	private String score;
    /**
	 *  结果
     */
	private String result;

	 /**
	 *  主键（批量上下架使用）
	 */
     private List<Integer> ids;

     private String idsStr ;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：姓名
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	/**
	 * 获取：姓名
	 */
	public String getCusName() {
		return cusName;
	}
	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：身份证
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * 获取：身份证
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * 设置：爱金分数
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * 获取：爱金分数
	 */
	public String getScore() {
		return score;
	}
	/**
	 * 设置：结果
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 获取：结果
	 */
	public String getResult() {
		return result;
	}

     public List<Integer> getIds() {
         return ids;
     }

     public void setIds(List<Integer> ids) {
         this.ids = ids;
     }

     public String getIdsStr() {
         return idsStr;
     }

     public void setIdsStr(String idsStr) {
         this.idsStr = idsStr;
     }

 }
