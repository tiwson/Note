package com.tiwson.facade;

public class FacadeModel {
    private Model model;

    //管理内部模型
    public FacadeModel(Model model) {
        this.model = model;
    }

    //对外提供接口
    public void a() {
        model.a();
    }

}
