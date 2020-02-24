package com.tiwson.chainresponsibility;

public class KeywordFilter implements Filter {

    @Override
    public void doFilter(Request request , Response response ,FilterChain filterChain) {
        request.reqstr = request.reqstr.replace("Java","python");
        filterChain.doFilter(request,response);
        response.respstr += "--keyword ";
    }
}
