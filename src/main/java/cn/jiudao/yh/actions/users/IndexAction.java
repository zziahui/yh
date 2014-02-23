package cn.jiudao.yh.actions.users;

import org.springframework.beans.factory.annotation.Autowired;

import cn.jiudao.yh.model.User;
import cn.jiudao.yh.service.UserService;

import com.opensymphony.xwork2.ModelDriven;

public class IndexAction implements ModelDriven<UserModel>{

	private UserModel model = new UserModel();

	@Autowired
	private UserService userService;

	public String index(){
		User user = userService.getUser(9);
		model.setUser(user);
		model.setSuccess(true);
		return "success";
	}

	@Override
	public UserModel getModel() {
		return model;
	}

}
