package com.sunday.usercenter.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;

@Data
public class BaseDO {

    /** ID */
    @Id
    @GeneratedValue(generator = "JDBC")
    protected Long id;

    /** 创建时间 */
    protected Long createTime;

    /** 创建人ID */
    protected Long creatorId;

    /** 修改时间 */
    protected Long updateTime;

    /** 修改人ID */
    protected Long updatorId;

    /** 删除标记 */
    protected Boolean deleteInd = false;

    public void putCreateInfo(Long creatorId) {
        long now = Instant.now().toEpochMilli();
        this.creatorId = creatorId;
        this.createTime = now;
        this.updatorId = creatorId;
        this.updateTime = now;
    }

    public void putUpdateInfo(Long updatorId) {
        this.updatorId = updatorId;
        this.updateTime = Instant.now().toEpochMilli();
    }
}
