package service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.system.IOperateService;
import dao.system.OperateMapper;
import entity.common.PageHelper;
import entity.system.Operate;

@Service("operateService")
public class OperateServiceImpl implements IOperateService {

	@Autowired
	private OperateMapper operateMapper;

	@Override
	public int doSave(Operate operate) {
		
		return operateMapper.insert(operate);
	}

	@Override
	public int doDelById(int id) {
		// 需要查询某个模块下是否还有该操作，如果还有该操作不能删除
		return operateMapper.deleteById(id);
	}

	@Override
	public int doUp(Operate operate) {
		// 需要先判断更新的操作名是否存在
		return operateMapper.update(operate);
	}

	@Override
	public Operate doGetByName(String name) {
		return operateMapper.selectByName(name);
	}

	@Override
	public Operate doGetById(int id) {
		return operateMapper.selectById(id);
	}

	@Override
	public PageHelper<Operate> doGetByPageHelper(PageHelper<Operate> pageHelper) {
		pageHelper.setResults(operateMapper.selectByPageHelper(pageHelper));
		pageHelper.setSum(operateMapper.selectSumByPageHelper(pageHelper));
		return pageHelper;
	}

	@Override
	public List<Operate> doGet() {
		return operateMapper.select();
	}
}
