package dao.system;

import java.util.HashMap;
import java.util.List;

import entity.system.Position;

public interface PositionMapper {
	//增加职位信息	
	int insert(Position position);
	
	//删除职位信息  
	int deleteById(int id);
	
	//修改职位信息 
	int update(Position position);
	
	//按部门id查询职位信息集合	
	List<Position> selectByDepartmentId(int departmentId);
	
	//按id查询职位信息
	Position selectById(int id);
	
	//按部门id和职位名称获取职位信息
	Position selectByDepartmentIdAndName(int DepartmentId,String name);
	
	//按分页信息获取职位信息 
	List<Position> selectByPageHelper(HashMap<String,Object> map);	
	
	//缺少总数
}
