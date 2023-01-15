package cn.edkso.oco.db.dao;

import cn.edkso.oco.db.pojo.TbModule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbModuleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    TbModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}