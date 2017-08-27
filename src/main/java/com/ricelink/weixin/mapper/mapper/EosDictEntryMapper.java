package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.EosDictEntry;
import com.ricelink.weixin.vo.DictInfoVO;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface EosDictEntryMapper extends Mapper<EosDictEntry> {
    List<DictInfoVO> selectDictInfo(String dictTypeId);

    List<Map> selectCity();

    List<Map> selectCountry();

    List<Map> selectAddress();

    List<Map> selectDictInfoFilter1(String dictCode);
}