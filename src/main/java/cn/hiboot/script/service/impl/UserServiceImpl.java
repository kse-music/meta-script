package cn.hiboot.script.service.impl;

import cn.hiboot.script.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(String kgName) {
        return kgName;
    }

}
