package com.cxr.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pb_admin_log")
public class PbAdminLog {
    /**
     * 日志Id
     */
	@Id
    private Integer logId;

    /**
     * 操作内容
     */
    private String logContent;

    /**
     * 操作日期
     */
    private Date logDate;

   
    
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private PbAdmin admin;
    /**
     * 日志Id
     * @return log_id 日志Id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 日志Id
     * @param logId 日志Id
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 操作内容
     * @return log_content 操作内容
     */
    public String getLogContent() {
        return logContent;
    }

    /**
     * 操作内容
     * @param logContent 操作内容
     */
    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    /**
     * 操作日期
     * @return log_date 操作日期
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * 操作日期
     * @param logDate 操作日期
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

}