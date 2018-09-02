package org.westos.ph.bean.cleaningbean.pzybean;

public class Clean_Option {
    private Integer id;
    private String clean_option;
    private String option_money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClean_option() {
        return clean_option;
    }

    public void setClean_option(String clean_option) {
        this.clean_option = clean_option;
    }

    public String getOption_money() {
        return option_money;
    }

    public void setOption_money(String option_money) {
        this.option_money = option_money;
    }

    @Override
    public String toString() {
        return "Clean_Option{" +
                "id=" + id +
                ", clean_option='" + clean_option + '\'' +
                ", option_money='" + option_money + '\'' +
                '}';
    }
}
