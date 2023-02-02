package cn.edkso.oco.service;


import cn.edkso.oco.controller.form.RegisterForm;

import java.util.Set;

public interface UserService {

    int registerUser(RegisterForm form);

    Set<String> searchUserPermissions(int id);
}
