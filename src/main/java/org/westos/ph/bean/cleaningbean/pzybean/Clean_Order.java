package org.westos.ph.bean.cleaningbean.pzybean;

public class Clean_Order {
    private Integer id;
    private Integer clean_order_id;
    private Integer clean_id;
    private String clean_time;
    private String adress;
    private Integer phone_number;
    private Integer phone_number1;
    private String clean_option;
    private String money;

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

    public Integer getClean_id() {
        return clean_id;
    }

    public void setClean_id(Integer clean_id) {
        this.clean_id = clean_id;
    }

    public String getClean_time() {
        return clean_time;
    }

    public void setClean_time(String clean_time) {
        this.clean_time = clean_time;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getPhone_number1() {
        return phone_number1;
    }

    public void setPhone_number1(Integer phone_number1) {
        this.phone_number1 = phone_number1;
    }

    public String getClean_option() {
        return clean_option;
    }

    public void setClean_option(String clean_option) {
        this.clean_option = clean_option;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Clean_Order{" +
                "id=" + id +
                ", clean_order_id=" + clean_order_id +
                ", clean_id=" + clean_id +
                ", clean_time='" + clean_time + '\'' +
                ", adress='" + adress + '\'' +
                ", phone_number=" + phone_number +
                ", phone_number1=" + phone_number1 +
                ", clean_option='" + clean_option + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
