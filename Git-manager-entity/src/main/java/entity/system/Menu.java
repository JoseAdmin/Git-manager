package entity.system;

import java.util.List;

public class Menu {
    private Integer id;

    private String url;

    private String name;

    private String icon;

    private String description;
    
    //关联加载
    private MenuRelation menuRelation;
    
    //联集加载
    private List<OperateScope> operateScopes;

	public List<OperateScope> getOperateScopes() {
		return operateScopes;
	}

	public void setOperateScopes(List<OperateScope> operateScopes) {
		this.operateScopes = operateScopes;
	}

	public MenuRelation getMenuRelation() {
		return menuRelation;
	}

	public void setMenuRelation(MenuRelation menuRelation) {
		this.menuRelation = menuRelation;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}