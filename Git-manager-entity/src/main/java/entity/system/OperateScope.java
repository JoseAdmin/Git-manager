package entity.system;

public class OperateScope {
    private Integer id;

    private Integer operateId;

    private Integer menuId;

    private String url;

    private String description;
    
    //关联加载
    private Operate operate;

    public Operate getOperate() {
		return operate;
	}

	public void setOperate(Operate operate) {
		this.operate = operate;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperateId() {
        return operateId;
    }

    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

  
}