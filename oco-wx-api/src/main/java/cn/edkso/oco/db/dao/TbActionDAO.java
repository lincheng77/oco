package cn.edkso.oco.db.dao;

import cn.edkso.oco.db.pojo.TbAction;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbActionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAction record);

    int insertSelective(TbAction record);

    TbAction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAction record);

    int updateByPrimaryKey(TbAction record);
}