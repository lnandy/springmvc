package com.cn.eagle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cn.base.PlatformBaseClass;
import com.cn.constant.enums.ENUM_THIRD_TYPE;
import com.cn.eagle.service.UserService;
import com.cn.entity.User;

@RestController
@RequestMapping("/user")
public class UserController extends PlatformBaseClass{
	{
		thirdType = ENUM_THIRD_TYPE.EAGLE;
	}
	@Autowired
	private UserService userService;
	
    @RequestMapping("/showUser")  
    public ModelAndView toIndex(HttpServletRequest request){  
    	ModelAndView model = new ModelAndView();
    	logger.info("哈哈哈");
    	System.out.println(thirdType.getCode());
    	String label = ENUM_THIRD_TYPE.getValueByIdType("0");
    	System.out.println(label);
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.selectByPrimaryKey(userId);  
        model.addObject("user", user);
        model.setViewName("eagle/showUser");
        return model;  
    }  
//    @RequestMapping("/showUser")  
//    public Map<String, Object> toIndex(HttpServletRequest request){  
//    	Map<String, Object> map = new HashMap<String, Object>();
//    	int userId = Integer.parseInt(request.getParameter("id"));  
//    	User user = this.userService.getUserById(userId);  
//    	map.put("v", user);
//    	return map;  
//    }  
}
