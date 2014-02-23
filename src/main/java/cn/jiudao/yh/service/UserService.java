package cn.jiudao.yh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jiudao.yh.mapper.UserMapper;
import cn.jiudao.yh.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUser(Integer id){
		if(null != id){
			return userMapper.selectByPrimaryKey(id);
		}else{
			User user = new User();
			user.setId(1);
			user.setUsername("yanghui");
			user.setFullname("yanghui is a goog boy");
			return user;
		}
	}

}
