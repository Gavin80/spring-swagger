package com.gavin.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gavin.po.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(value="UserController",  description="员工", position=1)
public class UserController {
	
	
	
	@RequestMapping("/user/{id}")
	@ApiOperation(notes = "user", httpMethod = "GET", value = "获取人员信息")
	@ResponseBody
	public User getUser(@ApiParam(name="id", required=true) @PathVariable("id") String id){
		User u = new User();
		u.setId("root");
		u.setName("管理员");
		return u;
	}
}
