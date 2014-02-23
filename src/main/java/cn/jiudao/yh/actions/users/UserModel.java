package cn.jiudao.yh.actions.users;

import cn.jiudao.yh.model.User;

public class UserModel {

	private User user;

	private boolean success = false;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
