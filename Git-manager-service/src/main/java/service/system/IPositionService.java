package service.system;

import entity.common.PageHelper;
import entity.system.Position;

public interface IPositionService {
	/*增加职位信息,注意:需检查该部门是否有同名的职位
	 * 数据访问层接口支持	
	 * 1.增加职位信息	int insert(Position position)
	 * */
	public int deSave(Position position);
	
	/*删除职位，注意：调用该方法应检查是否有该职位的用户
	 * 数据访问层接口支持 
	 * 1.删除职位信息  int deleteById(int id)
	 * */
	public int doDelById(int id);
	
	/*修改职位信息,注意:需检查该部门是否有同名的职位
	 * 数据访问层接口支持
	 * 1.修改职位信息 int update(Position position)
	 * */
	public int doUp(Position position);
	
	/*按id查询职位信息
	 * 数据访问层接口支持
	 * 1.按部门id查询职位信息集合	Position selectById(int id)
	 * */
	public Position doGetById(int id);
	
	/*按部门id和职位名称获取职位信息
	 *  数据访问层接口支持
	 * 1.按部门id和职位名称获取职位信息Position selectByDepartmentIdAndName(int DepartmentId,String name)
	 * */
	public Position doGetByDepartmentIdAndName(int DepartmentId,String name);
	
	/*分页查询职位信息
	 * 数据访问层接口支持
	 * 1.按分页信息获取职位信息List<Position> selectByPageHelper(PageHelper<Position> pageHelper)
	 * 2.按分页信息获取职位信息集合数量 int selectSumByPageHelper(PageHelper<Position> pageHelper)
	 * */
	public PageHelper<Position> doGetByPageHelper(PageHelper<Position> pageHelper);
}
