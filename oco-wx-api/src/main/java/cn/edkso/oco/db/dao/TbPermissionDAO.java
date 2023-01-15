package cn.edkso.oco.db.dao;

import cn.edkso.oco.db.pojo.TbPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbPermissionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
}