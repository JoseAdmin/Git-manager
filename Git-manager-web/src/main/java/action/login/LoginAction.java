package action.login;

import service.system.IUserService;

import com.opensymphony.xwork2.ActionSupport;

import entity.system.User;

public class LoginAction extends ActionSupport {
	//用户数据
	private User user;
	public User getUser() {return user;}
	public void setUser(User user) {this.user = user;}
	
	//业务逻辑层接口
	IUserService userService;
	public void setUserService(IUserService userService) {this.userService = userService;}
	

	public String login(){
		User _user=userService.doGetById(user.getId());
		if(_user!=null){
			if(_user.getPassword().equals(user.getPassword())){
				user=_user;
				return SUCCESS;
			}
			else
				return ERROR;
		}
		return ERROR;
	}
}
