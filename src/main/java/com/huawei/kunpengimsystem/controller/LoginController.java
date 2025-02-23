package com.huawei.kunpengimsystem.controller;

import com.huawei.kunpengimsystem.entity.User;
import com.huawei.kunpengimsystem.service.UserService;
import com.huawei.kunpengimsystem.utils.NativeUtil;
import com.huawei.kunpengimsystem.utils.Result;
import com.huawei.kunpengimsystem.utils.ResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/checkLogin")
    public Result checkLogin(String username, String password) {
        if (username.equals("") | password.equals("")) {
            return ResultUtil.fail("Incorrect Matric Number or password");
        }
        NativeUtil nativeUtil = new NativeUtil();
        //  
        nativeUtil.getCpuClocks();

        // Call the interface of Sha256
        // String encryptedPassword = nativeUtil.getSha256Digest(password);

        User user = userService.login(username, password);
        if (user == null) {
            return ResultUtil.fail("Incorrect Matric Number or password");
        } else {
            return ResultUtil.success(user);
        }
    }
}
