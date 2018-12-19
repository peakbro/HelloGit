/*
package com.yi.feng.helloswagger.controller;

import com.yi.feng.helloswagger.user.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
@RestController
@Api(value = "用户", tags = "用户")
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, UserDTO> users = Collections.synchronizedMap(new HashMap<Long, UserDTO>());

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method= RequestMethod.GET)
    public List<UserDTO> getUserList() {
        List<UserDTO> r = new ArrayList<UserDTO>(users.values());
        return r;
    }
}
*/
