package com.legend.daijia.mgr.service;

import com.legend.daijia.model.entity.system.SysOperLog;
import com.legend.daijia.model.query.system.SysOperLogQuery;
import com.legend.daijia.model.vo.base.PageVo;

public interface SysOperLogService {

    PageVo<SysOperLog> findPage(Long page, Long limit, SysOperLogQuery sysOperLogQuery);

    /**
     * 保存系统日志记录
     */
    void saveSysLog(SysOperLog sysOperLog);

    SysOperLog getById(Long id);
}
