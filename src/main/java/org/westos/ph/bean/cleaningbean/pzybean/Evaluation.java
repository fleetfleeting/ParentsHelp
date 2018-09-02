package org.westos.ph.bean.cleaningbean.pzybean;

public class Evaluation {
    private Integer id;
    private Integer clean_order_id;
    private String evaluation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClean_order_id() {
        return clean_order_id;
    }

    public void setClean_order_id(Integer clean_order_id) {
        this.clean_order_id = clean_order_id;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", clean_order_id=" + clean_order_id +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }
}
