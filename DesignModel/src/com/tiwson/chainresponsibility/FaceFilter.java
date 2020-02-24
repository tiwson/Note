package com.tiwson.chainresponsibility;

public class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request , Response response ,FilterChain filterChain) {
        request.reqstr = request.reqstr.replace("!","^v^");
        filterChain.doFilter(request,response);
        response.respstr += "--face ";
    }
}
