package org.westos.ph.bean.cleaningbean.pzybean;

public class Clean_Time {
    private Integer id;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Clean_Time{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
