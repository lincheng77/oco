package cn.edkso.oco.db.dao;

import cn.edkso.oco.db.pojo.TbRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbRoleDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);
}