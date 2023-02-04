package cn.edkso.oco.db.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.Set;

@Mapper
public interface TbUserDAO {

    boolean isHaveRootUser();

    void insert(HashMap map);

    int searchIdByOpenId(String openId);

    Set<String> searchUserPermissions(int userId);
}