package cn.edkso.oco.db.dao;

import cn.edkso.oco.db.pojo.SysConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}