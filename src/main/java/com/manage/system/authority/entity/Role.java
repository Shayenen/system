package com.manage.system.authority.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Data
@Table(name = "t_role")
public class Role implements Serializable {

	private static final long serialVersionUID = -1714476694755654924L;

	@Id
	@GeneratedValue(generator = "JDBC")
	@Column(name = "ROLE_ID")
	private Long roleId;

	@Column(name = "ROLE_NAME")
	//@ExportConfig(value = "角色")
	private String roleName;

	@Column(name = "REMARK")
	//@ExportConfig(value = "描述")
	private String remark;

	@Column(name = "CREATE_TIME")
	//@ExportConfig(value = "创建时间", convert = "c:cc.mrbird.common.util.poi.convert.TimeConvert")
	private Date createTime;

	@Column(name = "MODIFY_TIME")
	private Date modifyTime;
}