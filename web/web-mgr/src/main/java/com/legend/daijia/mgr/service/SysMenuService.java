package com.legend.daijia.mgr.service;


import com.legend.daijia.model.entity.system.SysMenu;
import com.legend.daijia.model.vo.system.AssginMenuVo;

import java.util.List;

public interface SysMenuService {

    void save(SysMenu sysMenu);

    void update(SysMenu sysMenu);

    void remove(Long id);

    /**
     * 菜单树形数据
     * @return
     */
    List<SysMenu> findNodes();


    /**
     * 保存角色权限
     * @param  assginMenuVo
     */
    void doAssign(AssginMenuVo assginMenuVo);


    List<SysMenu> toAssign(Long roleId);
}
