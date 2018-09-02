package org.westos.ph.bean.cleaningbean.pzybean;
//用户记录
public class User_Record {
    private Integer id;
    private String phone;
    private Integer information;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getInformation() {
        return information;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "User_Record{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", information=" + information +
                '}';
    }
}
