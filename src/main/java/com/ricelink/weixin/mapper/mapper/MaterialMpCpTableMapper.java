package com.ricelink.weixin.mapper.mapper;

import com.ricelink.weixin.mapper.model.MaterialMpCpTable;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface MaterialMpCpTableMapper extends Mapper<MaterialMpCpTable> {
    MaterialMpCpTable selectByMpcpIdAndWeixinType(MaterialMpCpTable mpCpTable);

    int deleteMpcpIdAndWeixinType(MaterialMpCpTable mpCpTable);
}