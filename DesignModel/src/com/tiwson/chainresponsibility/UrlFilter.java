package com.tiwson.chainresponsibility;

public class UrlFilter implements Filter {
    @Override
    public void doFilter(Request request , Response response ,FilterChain filterChain) {
        request.reqstr = request.reqstr.replace("www.tiwson.com","tiwson.com");
        filterChain.doFilter(request,response);
        response.respstr += "--url ";
    }
}
