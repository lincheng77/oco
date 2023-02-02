package cn.edkso.oco.service.impl;

import cn.edkso.oco.controller.form.RegisterForm;
import cn.edkso.oco.db.dao.TbUserDao;
import cn.edkso.oco.db.pojo.TbUser;
import cn.edkso.oco.exception.OcoException;
import cn.edkso.oco.service.UserService;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Set;

@Service
@Slf4j
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserDao tbUserDao;

    @Value("${wx.app-id}")
    private String appId;

    @Value("${wx.app-secret}")
    private String appSecret;


    private String getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        HashMap map = new HashMap();
        map.put("appid", appId);
        map.put("secret", appSecret);
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");
        String response = HttpUtil.post(url, map);
        JSONObject json = JSONUtil.parseObj(response);
        String openId = json.getStr("openid");
        if (openId == null || openId.length() == 0) {
            throw new RuntimeException("临时登陆凭证错误");
        }
        return openId;
    }

    @Override
    public int registerUser(RegisterForm form) {
        if (form.getRegisterCode().equals("000000")) {
            boolean isHaveRootUser = tbUserDao.isHaveRootUser();
            if (!isHaveRootUser) {

            } else {
                throw new OcoException("无法绑定超级管理员账号");
            }
        } else {
            String openId = getOpenId(form.getCode());

        }
        return 0;
    }

    @Override
    public Set<String> searchUserPermissions(int id) {
        return null;
    }
}
