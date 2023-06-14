package com.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.PositionInformation;

import java.util.List;

public interface PositionInformationService extends IService<PositionInformation> {


    List<PositionInformation> getPositionInformationAll();
    List<PositionInformation> getSalary();
    List<PositionInformation> getCityAndCityCount();
}