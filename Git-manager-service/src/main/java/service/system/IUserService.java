package service.system;

import java.util.List;

import entity.common.PageHelper;
import entity.system.User;

public interface IUserService {
	/*增加用户，注意，需检查是否有状态启用的同身份证的用户
	 * 数据访问层接口支持
	 * 1.增加用户	int insert(User user);
	 */
	public int doSave(User user);
	
	/*删除用户，只是改变用户的状态，所有和修改共用方法
	 * */
	
	/*修改用户
	 * 数据访问层接口支持,注意，需检查是否有状态启用的同身份证的用户
	 * 1.修改用户信息 int update(User user)
	 * */
	public int doUp(User user);
	
	/*按职位获取用户集合
	 * 数据访问层接口支持
	 * 1.按职位获取用户集合 List<User> selectByPositionId(int positionId)
	 * */
	public List<User> doGetByPositionId(int positionId);
	
	/*按角色获取用户信息集合
	 * 数据访问层接口支持
	 * 1.按角色获取用户集合 List<User> selectByRoleId(int roleId)
	 * */
	public List<User> doGetByRoleId(int roleId);
	
	/*按分页获取用户信息集合   
	 *  数据访问层接口支持
	 * 1.按分页获取用户集合 List<User> selectByPageHelper(PageHelper<User> pageHelper)
	 * 2.按分页获取用户集合数量int selectSumByPageHelper(PageHelper<User> pageHelper)
	 * */
	PageHelper<User> doGetByPageHelper(PageHelper<User> pageHelper);
	
	/*按身份证查启用的用户
	 * 数据访问层接口支持
	 * 1.按身份证查启用的用户 User selectByIdentityCard(String identityCard)
	 * */
	public User doGetByIdentityCard(String identityCard);
	
	/*根据id查询用户信息
	 * 数据访问层接口支持
	 * 1.根据id查询用户信息 User selectById(int id)
	 * */
	public User doGetById(int id);
	
	/*通过部门id获取用户集合
	 * 数据访问层接口支持
	 * 1.通过部门id获取用户集合 List<User> selectByDepartmentId(int departmentId)
	 * */
	//public List<User> doGetByDepartmentId(int departmentId);
}
