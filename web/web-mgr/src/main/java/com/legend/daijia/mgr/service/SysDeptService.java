package com.legend.daijia.mgr.service;

import com.legend.daijia.model.entity.system.SysDept;

import java.util.List;

public interface SysDeptService {

    List<SysDept> findNodes();

    List<SysDept> findUserNodes();

    void updateStatus(Long id, Integer status);

    SysDept getById(Long id);

    void save(SysDept sysDept);

    void update(SysDept sysDept);

    void remove(Long id);
}