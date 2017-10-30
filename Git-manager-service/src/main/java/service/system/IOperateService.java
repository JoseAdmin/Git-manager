package service.system;

import java.util.List;

import entity.common.PageHelper;
import entity.system.Operate;

public interface IOperateService {
	/*增加操作，注意:需判断是否同名
	 * 数据访问层接口支持
	 * 1.增加操作 int insert(Operate operate)
	 * */
	public int doSave(Operate operate);
	
	/*删除操作，注意，应考虑模块是否还有该操作
	 * 数据访问层接口支持
	 * 1.删除操作 int deleteById(int id);
	 * */
	public int doDelById(int id);
	
	/*修改操作，注意:需判断是否同名
	 * 数据访问层接口支持
	 * 1.修改操作信息int update(Operate operate)
	 * */
	public int doUp(Operate operate);
	
	/*按名字查
	 * 数据访问层接口支持
	 * 1.按名字查询操作信息 Operate selectByName(String name)
	 * */
	public Operate doGetByName(String name);
	
	/*按id查
	 * 数据访问层接口支持
	 * 1.按id查询操作信息 Operate selectById(int id)
	 * */
	public Operate doGetById(int id);
	
	/*查询全部操作
	 * 数据访问层接口支持
	 * 1.查询全部操作 List<Operate> select()
	 * */
	public List<Operate> doGet();
	
	/*按分页查
	 * 数据访问层接口支持
	 * 1.按PageHelper查询操作信息 List<Operate> selectByPageHelper(PageHelper<Operate> pageHelper)
	 * 2.通过PageHelper获取操作集合数量	int selectSumByPageHelper(PageHelper<Operate> pageHelper);
	 * */
	public PageHelper<Operate> doGetByPageHelper(PageHelper<Operate> pageHelper);
}
