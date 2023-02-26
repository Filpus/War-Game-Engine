package wg_datas.components;

public class Resource {

    private String name;
    private int number;

    public int getNumber() {
        return number;
    }

    public void changeNumber(int number){
        this.number += number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
