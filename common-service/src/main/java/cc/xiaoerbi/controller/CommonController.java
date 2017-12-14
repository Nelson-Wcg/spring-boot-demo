package cc.xiaoerbi.controller;

import cc.xiaoerbi.model.User;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cc.xiaoerbi.service.CommonService;

import javax.annotation.Resource;

@RestController
public class CommonController {
    @Resource
    private CommonService commonService;

    @RequestMapping(value = "/ss", method = RequestMethod.GET)
    public String ss() {
        User user=new User();
        user.setName("yjh");
        user.setSex("FEMALE");
        int a=commonService.addUser(user);
        System.out.println(a);
        return JSONObject.fromObject(user).toString();
    }
}
