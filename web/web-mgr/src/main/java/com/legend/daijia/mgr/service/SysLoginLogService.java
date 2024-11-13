package com.legend.daijia.mgr.service;

import com.legend.daijia.model.entity.system.SysLoginLog;
import com.legend.daijia.model.query.system.SysLoginLogQuery;
import com.legend.daijia.model.vo.base.PageVo;

public interface SysLoginLogService {

    PageVo<SysLoginLog> findPage(Long page, Long limit, SysLoginLogQuery sysLoginLogQuery);

    /**
     * 记录登录信息
     *
     * @param sysLoginLog
     * @return
     */
    void recordLoginLog(SysLoginLog sysLoginLog);

    SysLoginLog getById(Long id);
}
