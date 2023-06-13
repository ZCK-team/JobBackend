package com.wms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.PositionInformation;
import com.wms.mapper.PositionInformationMapper;
import com.wms.service.PositionInformationService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionInformationServiceImpl extends ServiceImpl<PositionInformationMapper, PositionInformation>  implements PositionInformationService {
    @Resource
    private PositionInformationMapper positionInformationMapper;



}


