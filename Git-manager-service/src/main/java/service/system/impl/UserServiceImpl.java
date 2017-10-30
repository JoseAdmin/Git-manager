package service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.system.IUserService;
import dao.system.UserMapper;
import entity.common.PageHelper;
import entity.system.User;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public int doSave(User user) {
			return 	userMapper.insert(user);
	}

	@Override
	public int doUp(User user) {
			return userMapper.update(user);
	}

	@Override
	public List<User> doGetByPositionId(int positionId) {
		return userMapper.selectByPositionId(positionId);
	}

	@Override
	public List<User> doGetByRoleId(int roleId) {
		return userMapper.selectByRoleId(roleId);
	}

	@Override
	public PageHelper<User> doGetByPageHelper(PageHelper<User> pageHelper) {
		pageHelper.setResults(userMapper.selectByPageHelper(pageHelper));
		pageHelper.setSum(userMapper.selectSumByPageHelper(pageHelper));
		return pageHelper;
	}

	@Override
	public User doGetByIdentityCard(String identityCard) {
		return userMapper.selectByIdentityCard(identityCard);
	}

	@Override
	public User doGetById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectById(id);
	}

}
