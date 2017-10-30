package entity.system;

public class RoleResource {
    private Integer id;

    private Integer roleId;

    private Integer resurceId;

    private Integer resourcetableId;
    
    //url是增加的字段，用于储存两个表的url
    private String url;

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResurceId() {
        return resurceId;
    }

    public void setResurceId(Integer resurceId) {
        this.resurceId = resurceId;
    }

    public Integer getResourcetableId() {
        return resourcetableId;
    }

    public void setResourcetableId(Integer resourcetableId) {
        this.resourcetableId = resourcetableId;
    }
}