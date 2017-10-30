package entity.system;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String identityCard;

    private String password;

    private Short sex;

    private String email;

    private String phone;

    private Integer positionId;

    private Date createDate;

    private Short state;
    
    private Integer roleId;
    
    //关联加载
    private Position position;

	//用关联加载
	private Role role;
    
    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
    public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   
    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

  
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}