package entity.system;

public class MenuRelation {
    private Integer id;

    private Integer parentId;

    private Integer selfId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSelfId() {
        return selfId;
    }

    public void setSelfId(Integer selfId) {
        this.selfId = selfId;
    }
}