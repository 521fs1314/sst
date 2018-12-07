package com.cxr.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="pb_admin")
public class PbAdmin  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 管理员Id
	 */
	@Id
	@Column(name ="admin_id")
	private Integer adminId;

	/**
	 * 姓名
	 */
	private String adminName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 盐值,用于密码加密
	 */
	private String saltVal;

	/**
	 * 管理员类型（0平台管理员，1门店管理员）
	 */
	private Integer adminType;

	/**
	 * 关联角色
	 */
	private Integer roleId;

	/**
	 * 是否启用（0否，1是）
	 */
	private Integer adminUsedFlag;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date modifyTime;

	/**
	 * 修改人
	 */
	private Integer modifyId;

	/**
	 * 删除标记
	 */
	private Integer delFlag;

	/**
	 * 最后登录时间
	 */
	private Date lastLoginTime;
	
	/**
	 * 门店id
	 */
	private Integer storeId;
	
	@OneToMany
	@JoinColumn(name="admin_id")
	private List<PbAdminLog> pbAdminLog;
	

	public List<PbAdminLog> getPbAdminLog() {
		return pbAdminLog;
	}


	public void setPbAdminLog(List<PbAdminLog> pbAdminLog) {
		this.pbAdminLog = pbAdminLog;
	}


	/**
	 * 管理员Id
	 * 
	 * @return admin_id 管理员Id
	 */
	
	public Integer getAdminId() {
		return adminId;
	}


	/**
	 * 管理员Id
	 * 
	 * @param adminId
	 *            管理员Id
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	/**
	 * 姓名
	 * 
	 * @return admin_name 姓名
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * 姓名
	 * 
	 * @param adminName
	 *            姓名
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName == null ? null : adminName.trim();
	}

	/**
	 * 密码
	 * 
	 * @return password 密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 密码
	 * 
	 * @param password
	 *            密码
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * 盐值,用于密码加密
	 * 
	 * @return salt_val 盐值,用于密码加密
	 */
	public String getSaltVal() {
		return saltVal;
	}

	/**
	 * 盐值,用于密码加密
	 * 
	 * @param saltVal
	 *            盐值,用于密码加密
	 */
	public void setSaltVal(String saltVal) {
		this.saltVal = saltVal == null ? null : saltVal.trim();
	}

	/**
	 * 管理员类型（0平台管理员，1门店管理员）
	 * 
	 * @return admin_type 管理员类型（0平台管理员，1门店管理员）
	 */
	public Integer getAdminType() {
		return adminType;
	}

	/**
	 * 管理员类型（0平台管理员，1门店管理员）
	 * 
	 * @param adminType
	 *            管理员类型（0平台管理员，1门店管理员）
	 */
	public void setAdminType(Integer adminType) {
		this.adminType = adminType;
	}

	/**
	 * 关联角色
	 * 
	 * @return role_id 关联角色
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * 关联角色
	 * 
	 * @param roleId
	 *            关联角色
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * 是否启用（0否，1是）
	 * 
	 * @return admin_used_flag 是否启用（0否，1是）
	 */
	public Integer getAdminUsedFlag() {
		return adminUsedFlag;
	}

	/**
	 * 是否启用（0否，1是）
	 * 
	 * @param adminUsedFlag
	 *            是否启用（0否，1是）
	 */
	public void setAdminUsedFlag(Integer adminUsedFlag) {
		this.adminUsedFlag = adminUsedFlag;
	}

	/**
	 * 创建时间
	 * 
	 * @return create_time 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 更新时间
	 * 
	 * @return modify_time 更新时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * 更新时间
	 * 
	 * @param modifyTime
	 *            更新时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * 修改人
	 * 
	 * @return modify_id 修改人
	 */
	public Integer getModifyId() {
		return modifyId;
	}

	/**
	 * 修改人
	 * 
	 * @param modifyId
	 *            修改人
	 */
	public void setModifyId(Integer modifyId) {
		this.modifyId = modifyId;
	}

	/**
	 * 删除标记
	 * 
	 * @return del_flag 删除标记
	 */
	public Integer getDelFlag() {
		return delFlag;
	}

	/**
	 * 删除标记
	 * 
	 * @param delFlag
	 *            删除标记
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	/**
	 * 最后登录时间
	 * 
	 * @return last_login_time 最后登录时间
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * 最后登录时间
	 * 
	 * @param lastLoginTime
	 *            最后登录时间
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}