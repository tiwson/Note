package com.tiwson.chainresponsibility;

public interface Filter {
    void doFilter(Request request , Response response , FilterChain filterChain);
}
