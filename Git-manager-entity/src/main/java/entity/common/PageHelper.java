package entity.common;

import java.util.HashMap;
import java.util.List;

public class PageHelper<T> {
	//页大小
	private int pageSize;
	//当前页
	private int current;
	//业务条件
	private HashMap<String, Object> requires;
	//总数量
	private int sum;
	//结果
	private List<T> results;
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public HashMap<String, Object> getRequires() {
		return requires;
	}
	public void setRequires(HashMap<String,Object> requires) {
		this.requires = requires;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	
	
}
