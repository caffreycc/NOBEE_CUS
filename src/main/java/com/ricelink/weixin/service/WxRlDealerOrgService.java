package com.ricelink.weixin.service;

import com.ricelink.baseframe.common.service.BaseService;
import com.ricelink.weixin.mapper.mapper.RlDealerOrgMapper;
import com.ricelink.weixin.mapper.model.RlDealerOrg;
import com.ricelink.weixin.utils.LocationUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chenshengju on 2017/8/16 0016.
 */
@Service
public class WxRlDealerOrgService extends BaseService<RlDealerOrg> {
    @Autowired
    private RlDealerOrgMapper rlDealerOrgMapper;


    public  List<Map> selectRlDealerOrg(Map orgId) {
        return rlDealerOrgMapper.selectRlDealerOrg(orgId);
    }

    public String selectOrgIntroduce(String orgId) {

        return rlDealerOrgMapper.selectOrgIntroduce(orgId);
    }

    public List<Map> selectNearbyOrg(Double latitude, Double longitude) {
        List<Map<String, Object>> mapList = rlDealerOrgMapper.selectNearbyOrg();
        List<Map> mapResultList = new ArrayList<>();
        for (Map<String, Object> map : mapList) {
            String storeLatitudes = (String) map.get("storeLatitude");
            String storeLongitudes = (String) map.get("storeLongitude");
            Double storeLatitude;
            Double storeLongitude;
            if (StringUtils.isNoneBlank(storeLatitudes, storeLongitudes)) {
                storeLatitude = Double.parseDouble(storeLatitudes);
                storeLongitude = Double.parseDouble(storeLongitudes);
                Double distance = LocationUtils.getDistance(latitude, longitude, storeLatitude, storeLongitude);
                //五十公里为附近
                if (distance < 50000) {
                    map.put("distance", distance);
                    mapResultList.add(map);
                }
            }
        }
        return mapResultList;


    }

    public List<Map> selectRlDealerOrgNoOrgId(String customerId) {
        return rlDealerOrgMapper.selectRlDealerOrgNoOrgId(customerId);
    }

    public Map selectStoreDetails(String orgId) {
        return rlDealerOrgMapper.selectStoreDetails(orgId);
    }

    public Map<String, String> selectOrgGuiDeaById(String orgId) {
        return rlDealerOrgMapper.selectOrgGuiDeaById(orgId);
    }
}
