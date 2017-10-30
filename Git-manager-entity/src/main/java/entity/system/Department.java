package entity.system;

public class Department {
    private Integer id;

    private String name;

    private String phone;

    private String fax;
    
	private String description;
	
	//关联加载
    private DepRelation depRelation;
	
    public DepRelation getDepRelation() {
		return depRelation;
	}

	public void setDepRelation(DepRelation depRelation) {
		this.depRelation = depRelation;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}