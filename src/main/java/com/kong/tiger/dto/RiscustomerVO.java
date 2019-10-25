package com.kong.tiger.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * <b>类名：</b>Riscustomer.java<br>
 * <p><b>描述：</b>客户基本信息 </p>
 * @author <font color='blue'>baoleiliu</font>
 * @email baoleiliu@huashenghaoche.com
 * @version 1.0
 * @date  2019-06-10 16:02:32
 */
public class RiscustomerVO {

	/**
	 *  主键
	 */
	private Long id;



	private String idsStr ;


	 public String getIdsStr() {
		 return idsStr;
	 }

	 public void setIdsStr(String idsStr) {
		 this.idsStr = idsStr;
	 }

	 /**
	 *  是否企业客户
	 */
	private String isEnterprise;
	/**
	 *  客户编码
	 */
	private String customerCode;
	/**
	 *  对公对私

	 */
	private String customerType;
	/**
	 *  客户名称
	 */
	private String customer;
	/**
	 *  手机号
	 */
	private String phone;
	/**
	 *  邮箱
	 */
	private String email;
	/**
	 *  证件类型
	 */
	private String idType;
	/**
	 *  身份证
	 */
	private String idCard;
	/**
	 *  民族
	 */
	private String nation;
	/**
	 *  银行代码
	 */
	private String bankCode;
	/**
	 *  银行卡号
	 */
	private String bankNum;
	/**
	 *  开户行
	 */
	private String openBank;
	/**
	 *  年龄
	 */
	private String age;
	/**
	 *  证件有效期起
	 */
	private String idTermStart;
	/**
	 *  证件有效期止
	 */
	private String idTermEnd;
	/**
	 *  证件地址
	 */
	private String idAddress;
	/**
	 *  学历
	 */
	private String education;
	/**
	 *  居住省
	 */
	private String province;
	/**
	 *  居住市
	 */
	private String city;
	/**
	 *  居住区
	 */
	private String district;
	/**
	 *  详细地址
	 */
	private String addess;
	/**
	 *  单位名称
	 */
	private String company;
	/**
	 *  单位地址
	 */
	private String unitAddress;
	/**
	 *  单位电话
	 */
	private String unitTel;
	/**
	 *  删除状态：Ｙ｜Ｎ
	 */
	private String deleteStatus;
	/**
	 *  创建时间
	 */
	private String createTime;
	/**
	 *  创建人
	 */
	private String createUser;
	/**
	 *  修改时间
	 */
	private String updateTime;
	/**
	 *  修改人
	 */
	private String updateUser;
	/**
	 *  电子签章ID
	 */
	private String esId;
	/**
	 *  活体认证结果
	 */
	private String laResult;
	/**
	 *  活体认证时间
	 */
	private String laDate;
	/**
	 *  最高授信额度
	 */
	private BigDecimal maxCredit;

	public BigDecimal getTempCredit() {
		return tempCredit;
	}

	public void setTempCredit(BigDecimal tempCredit) {
		this.tempCredit = tempCredit;
	}

	/**
	 *  风控授信额度
	 */

	private BigDecimal tempCredit;
	/**
	 *  驾驶证号
	 */
	private String driverLicenseId;
	/**
	 *  准驾车型
	 */
	private String applyType;
	/**
	 *  驾照档案编号
	 */
	private String driverLicenseNum;
	/**
	 *  单位省
	 */
	private String unitProvince;
	/**
	 *  单位市
	 */
	private String unitCity;
	/**
	 *  单位区
	 */
	private String unitDistrict;

	/**
	 *  主键（批量上下架使用）
	 */
	private List<Integer> ids;

	/**
	 *  用户中心的用户的uuid
	 */
	private Long userId;
	/**
	 *  出生日期
	 */
	private String birthday;
	/**
	 *  发证机关
	 */
	private String certAddress;
	/**
	 *  性别
	 */
	private Integer sex;
	/**
	 * 信审首次评估日
	 */
	private String firstCreditDate;
	/**
	 * 学位 0 其他 1名誉博士 2博士 3硕士 4学士 9未知
	 */
	private String degree;
	/**
	 *  婚姻状况,10未婚 20已婚 21初婚 22再婚 23复婚 30丧偶 40离婚 90未说明的婚姻状况
	 */
	private String marry;
	/**
	 * 驾照初领日期
	 */
	private String driverFirstDate;
	/**
	 * 驾驶证起始日
	 */
	private String driverStartDate;
	/**
	 * 驾驶证截止日
	 */
	private String driverEndDate;
	/**
	 * 驾驶证状态 A 正常 SJN 延期换证 B 满分 SJP 延期体检 C 转出 SJR 注销可恢复 D 暂扣 SJS 逾期未审验 E 撤销 SJT 延期审验 F 吊销 SJU 扣留 G 注销 Z 其他 H 违法未处理 M 逾期未换证 I 事故未处理 N 延期换证 J 停止使用 P 延期体检 K 协查 R 注销可恢复 L 锁定 S 逾期未审验 M 逾期未换证 N 延期换证 P 延期体检 R 注销可恢复 S 逾期未审验 T 延期审验 U 扣留 Z 其他 SJK 扣押 T 延期审验 SJM 逾期未换证 U 扣留 SJN 延期换证 SJP 延期体检 SJR 注销可恢复 SJS 逾期未审验 SJT 延期审验 SJU 扣留
	 */
	private String driverStatus;




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
	 * 设置：是否企业客户
	 */
	public void setIsEnterprise(String isEnterprise) {
		this.isEnterprise = isEnterprise;
	}
	/**
	 * 获取：是否企业客户
	 */
	public String getIsEnterprise() {
		return isEnterprise;
	}
	/**
	 * 设置：客户编码
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * 获取：客户编码
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * 设置：对公对私

	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	/**
	 * 获取：对公对私

	 */
	public String getCustomerType() {
		return customerType;
	}
	/**
	 * 设置：客户名称
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	/**
	 * 获取：客户名称
	 */
	public String getCustomer() {
		return customer;
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
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：证件类型
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}
	/**
	 * 获取：证件类型
	 */
	public String getIdType() {
		return idType;
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
	 * 设置：民族
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}
	/**
	 * 获取：民族
	 */
	public String getNation() {
		return nation;
	}
	/**
	 * 设置：银行代码
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	/**
	 * 获取：银行代码
	 */
	public String getBankCode() {
		return bankCode;
	}
	/**
	 * 设置：银行卡号
	 */
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	/**
	 * 获取：银行卡号
	 */
	public String getBankNum() {
		return bankNum;
	}
	/**
	 * 设置：开户行
	 */
	public void setOpenBank(String openBank) {
		this.openBank = openBank;
	}
	/**
	 * 获取：开户行
	 */
	public String getOpenBank() {
		return openBank;
	}
	/**
	 * 设置：年龄
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 获取：年龄
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 设置：证件有效期起
	 */
	public void setIdTermStart(String idTermStart) {
		this.idTermStart = idTermStart;
	}
	/**
	 * 获取：证件有效期起
	 */
	public String getIdTermStart() {
		return idTermStart;
	}
	/**
	 * 设置：证件有效期止
	 */
	public void setIdTermEnd(String idTermEnd) {
		this.idTermEnd = idTermEnd;
	}
	/**
	 * 获取：证件有效期止
	 */
	public String getIdTermEnd() {
		return idTermEnd;
	}
	/**
	 * 设置：证件地址
	 */
	public void setIdAddress(String idAddress) {
		this.idAddress = idAddress;
	}
	/**
	 * 获取：证件地址
	 */
	public String getIdAddress() {
		return idAddress;
	}
	/**
	 * 设置：学历
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * 获取：学历
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * 设置：居住省
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：居住省
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：居住市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：居住市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：居住区
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * 获取：居住区
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * 设置：详细地址
	 */
	public void setAddess(String addess) {
		this.addess = addess;
	}
	/**
	 * 获取：详细地址
	 */
	public String getAddess() {
		return addess;
	}
	/**
	 * 设置：单位名称
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：单位名称
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：单位地址
	 */
	public void setUnitAddress(String unitAddress) {
		this.unitAddress = unitAddress;
	}
	/**
	 * 获取：单位地址
	 */
	public String getUnitAddress() {
		return unitAddress;
	}
	/**
	 * 设置：单位电话
	 */
	public void setUnitTel(String unitTel) {
		this.unitTel = unitTel;
	}
	/**
	 * 获取：单位电话
	 */
	public String getUnitTel() {
		return unitTel;
	}
	/**
	 * 设置：删除状态：Ｙ｜Ｎ
	 */
	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	/**
	 * 获取：删除状态：Ｙ｜Ｎ
	 */
	public String getDeleteStatus() {
		return deleteStatus;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public String getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：修改人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：修改人
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * 设置：电子签章ID
	 */
	public void setEsId(String esId) {
		this.esId = esId;
	}
	/**
	 * 获取：电子签章ID
	 */
	public String getEsId() {
		return esId;
	}
	/**
	 * 设置：活体认证结果
	 */
	public void setLaResult(String laResult) {
		this.laResult = laResult;
	}
	/**
	 * 获取：活体认证结果
	 */
	public String getLaResult() {
		return laResult;
	}
	/**
	 * 设置：活体认证时间
	 */
	public void setLaDate(String laDate) {
		this.laDate = laDate;
	}
	/**
	 * 获取：活体认证时间
	 */
	public String getLaDate() {
		return laDate;
	}
	/**
	 * 设置：最高授信额度
	 */
	public void setMaxCredit(BigDecimal maxCredit) {
		this.maxCredit = maxCredit;
	}
	/**
	 * 获取：最高授信额度
	 */
	public BigDecimal getMaxCredit() {
		return maxCredit;
	}
	/**
	 * 设置：驾驶证号
	 */
	public void setDriverLicenseId(String driverLicenseId) {
		this.driverLicenseId = driverLicenseId;
	}
	/**
	 * 获取：驾驶证号
	 */
	public String getDriverLicenseId() {
		return driverLicenseId;
	}
	/**
	 * 设置：准驾车型
	 */
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	/**
	 * 获取：准驾车型
	 */
	public String getApplyType() {
		return applyType;
	}
	/**
	 * 设置：驾照档案编号
	 */
	public void setDriverLicenseNum(String driverLicenseNum) {
		this.driverLicenseNum = driverLicenseNum;
	}
	/**
	 * 获取：驾照档案编号
	 */
	public String getDriverLicenseNum() {
		return driverLicenseNum;
	}
	/**
	 * 设置：单位省
	 */
	public void setUnitProvince(String unitProvince) {
		this.unitProvince = unitProvince;
	}
	/**
	 * 获取：单位省
	 */
	public String getUnitProvince() {
		return unitProvince;
	}
	/**
	 * 设置：单位市
	 */
	public void setUnitCity(String unitCity) {
		this.unitCity = unitCity;
	}
	/**
	 * 获取：单位市
	 */
	public String getUnitCity() {
		return unitCity;
	}
	/**
	 * 设置：单位区
	 */
	public void setUnitDistrict(String unitDistrict) {
		this.unitDistrict = unitDistrict;
	}
	/**
	 * 获取：单位区
	 */
	public String getUnitDistrict() {
		return unitDistrict;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCertAddress() {
		return certAddress;
	}

	public void setCertAddress(String certAddress) {
		this.certAddress = certAddress;
	}

	public Integer getSex() {
		return sex;
	}
	/**
	 * 设置：
	 */
	public void setFirstCreditDate(String firstCreditDate) {
		this.firstCreditDate = firstCreditDate;
	}
	/**
	 * 获取：
	 */
	public String getFirstCreditDate() {
		return firstCreditDate;
	}
	/**
	 * 设置：
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * 获取：
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * 设置：
	 */
	public void setMarry(String marry) {
		this.marry = marry;
	}
	/**
	 * 获取：
	 */
	public String getMarry() {
		return marry;
	}
	/**
	 * 设置：
	 */
	public void setDriverFirstDate(String driverFirstDate) {
		this.driverFirstDate = driverFirstDate;
	}
	/**
	 * 获取：
	 */
	public String getDriverFirstDate() {
		return driverFirstDate;
	}
	/**
	 * 设置：
	 */
	public void setDriverStartDate(String driverStartDate) {
		this.driverStartDate = driverStartDate;
	}
	/**
	 * 获取：
	 */
	public String getDriverStartDate() {
		return driverStartDate;
	}
	/**
	 * 设置：
	 */
	public void setDriverEndDate(String driverEndDate) {
		this.driverEndDate = driverEndDate;
	}
	/**
	 * 获取：
	 */
	public String getDriverEndDate() {
		return driverEndDate;
	}
	/**
	 * 设置：
	 */
	public void setDriverStatus(String driverStatus) {
		this.driverStatus = driverStatus;
	}
	/**
	 * 获取：
	 */
	public String getDriverStatus() {
		return driverStatus;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
