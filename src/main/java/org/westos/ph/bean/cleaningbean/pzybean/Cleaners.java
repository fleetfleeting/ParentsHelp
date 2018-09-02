package org.westos.ph.bean.cleaningbean.pzybean;

public class Cleaners {
    private Integer id;
    private String name;
    private Integer phone;
    private String evaluation;

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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }
}
