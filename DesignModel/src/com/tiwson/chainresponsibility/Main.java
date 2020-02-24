package com.tiwson.chainresponsibility;

public class Main {
    public static void main(String[] args) {
        Request request = new Request("welcom to the Java world , please visit www.tiwson.com !");
        Response response = new Response("response:");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new KeywordFilter());
        filterChain.add(new UrlFilter());
        filterChain.add(new FaceFilter());

        filterChain.doFilter(request,response);

        System.out.println(request.reqstr);
        System.out.println(response.respstr);

//        Msg msg = new Msg();
//        msg.setMsg("welcom to the Java world , please visit www.tiwson.com !");
//        FilterChain fc = new FilterChain();
//        fc.add(new KeywordFilter()).add(new UrlFilter());
//
//       // fc.doFilter(msg);
//        System.out.println(msg.getMsg());
//        FilterChain fc2 = new FilterChain();
//        fc2.add(new FaceFilter());
//
//        fc.add(fc2);
//        fc.doFilter(msg);
//        System.out.println(msg.getMsg());
//        Filter f = new KeywordFilter();
//        f.doFilter(msg);
//        System.out.println(msg.getMsg());
//        Filter f1 = new UrlFilter();
//        f1.doFilter(msg);
//        System.out.println(msg.getMsg());
    }
}

class Request {
    public String reqstr;
    public Request(String reqstr) {
        this.reqstr = reqstr;
    }
}

class Response {
    public String respstr;
    public Response(String respstr) {
        this.respstr = respstr;
    }
}
