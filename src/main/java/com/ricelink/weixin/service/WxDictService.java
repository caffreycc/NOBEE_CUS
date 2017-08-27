package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.EosDictEntryMapper;
import com.ricelink.weixin.mapper.model.EosDictEntry;
import com.ricelink.weixin.vo.DictInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/7/26 0026.
 */
@Service
public class WxDictService extends BaseService<EosDictEntry> {
    @Autowired
    private EosDictEntryMapper eosDictEntryMapper;
    public List<DictInfoVO> selectDictInfo(String dictTypeId)
    {
        return this.eosDictEntryMapper.selectDictInfo(dictTypeId);
    }

    public List<Map> selectCity() {
        return this.eosDictEntryMapper.selectCity();
    }

    public List<Map> selectCountry() {
        return this.eosDictEntryMapper.selectCountry();
    }

    public List<Map> selectAddress() {
        return this.eosDictEntryMapper.selectAddress();
    }

    public List<Map> selectDictInfoFilter1(String dictCode) {
        return this.eosDictEntryMapper.selectDictInfoFilter1(dictCode);
    }
}
