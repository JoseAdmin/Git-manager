import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.system.UserMapper;
import entity.common.PageHelper;
import entity.system.User;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader=null;
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//2.工厂构造类，SqlSessionFactoryBuilder 作用域，用过立即销毁
		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		//3.通过配置文件和工厂构造生成相应的工厂，作用域整个程序的周期，用于生产所需的数据库操作对象
		SqlSessionFactory factory=builder.build(reader);
		//4.由工厂调用openSession方法，返回一个打开的session
		SqlSession session=factory.openSession(true);	    //SqlSession拥有操作数据库的所有方法，对于增删改，默认不										自动提交，如需要自动提交：factory.openSession(ture);	
		//5.通过session获取接口对象
		UserMapper  userMapper=session.getMapper(UserMapper.class);	   //使用接口对象是官方推荐的
		
		System.out.println(userMapper.selectById(1).getName());
		
		//session.commit();
		//6.通过接口对象使用其方法，如是增删改，需session.commit();
	}

}
