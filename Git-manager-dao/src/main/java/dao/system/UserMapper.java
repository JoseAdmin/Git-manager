package dao.system;

import java.util.List;

import entity.common.PageHelper;
import entity.system.User;

public interface UserMapper {
	//增加用户	 ok
	int insert(User user);
	
	//修改用户信息  ok
	int update(User user);
	
	//按职位获取用户集合  ok
	List<User> selectByPositionId(int positionId);
	
	//按角色获取用户集合  ok
	List<User> selectByRoleId(int roleId);
	
	//按分页获取用户集合 
	List<User> selectByPageHelper(PageHelper<User> pageHelper);
	
	//按分页获取用户集合数量 ok
	int selectSumByPageHelper(PageHelper<User> pageHelper);
	
	//按身份证查启用的用户 ok
	User selectByIdentityCard(String identityCard);
	
	//根据id查询用户信息  ok
	User selectById(int id);
	
	//通过部门id获取用户集合，删除
	//List<User> selectByDepartmentId(int departmentId);
}