package dao.system;

import java.util.List;

import entity.common.PageHelper;
import entity.system.Operate;

public interface OperateMapper {
	//增加操作
	int insert(Operate operate);
	
	//删除操作 
	int deleteById(int id);
	
	//修改操作信息
	int update(Operate operate);
	
	//按名字查询操作信息 
	Operate selectByName(String name);
	
	//按id查询操作信息 
	Operate selectById(int id);
	
	//按模块获取其操作集合
	List<Operate> selectByMenuId(int menuId);
	
	//按PageHelper查询操作信息
	List<Operate> selectByPageHelper(PageHelper<Operate> pageHelper);
	
	//查询全部操作
	List<Operate> select();
	
	//通过PageHelper获取操作集合数量
	int selectSumByPageHelper(PageHelper<Operate> pageHelper);
}