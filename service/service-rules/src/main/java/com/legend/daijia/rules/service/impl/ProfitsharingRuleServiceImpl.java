package com.legend.daijia.rules.service.impl;

import com.legend.daijia.rules.mapper.ProfitsharingRuleMapper;
import com.legend.daijia.rules.service.ProfitsharingRuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class ProfitsharingRuleServiceImpl implements ProfitsharingRuleService {

    @Autowired
    private ProfitsharingRuleMapper rewardRuleMapper;


}
