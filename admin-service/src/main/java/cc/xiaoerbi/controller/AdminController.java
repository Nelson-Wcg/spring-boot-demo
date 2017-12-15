package cc.xiaoerbi.controller;

import cc.xiaoerbi.model.User;
import cc.xiaoerbi.service.AdminService;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping(value = "/ss/{id}", method = RequestMethod.GET)
    public String ss(@PathVariable("id") int id) {
        User user = new User();
        user.setName("wcg");
        user.setSex("MALE");
        int a = adminService.addUser(user);
        System.out.println(a);

        User user1 = adminService.getUser(id);
        return JSONObject.fromObject(user).toString() + "----" + JSONObject.fromObject(user1).toString();
    }
}
