package com.test.app.pojo;

import java.util.ArrayList;
import java.util.List;


public class Update {
    Boolean status;
    List<Integer> list;
    public Update(){
        list=new ArrayList<>();
    }

    public Boolean getStatus() {
        return status;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
