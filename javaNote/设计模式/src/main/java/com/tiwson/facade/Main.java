package com.tiwson.facade;

public class Main {

    public static void main(String[] args) {
        //传统实现接口模式
//        Model model = new ModelImplements();
//        model.a();
        //门面Facade模式，用一个类直接管理内部模型，对外提供接口服务
        FacadeModel facade = new FacadeModel(new ModelImplements());
        facade.a();
    }

}
