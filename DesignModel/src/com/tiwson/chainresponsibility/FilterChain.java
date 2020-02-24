package com.tiwson.chainresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> list = new ArrayList<Filter>();
    int index = 0;

    public FilterChain add(Filter f) {
        list.add(f);
        return this;
    }

//1,2,3顺序处理request，然后3,2,1顺序处理response
// 用递归方式，在每一个doFilter返回前处理response即可
    public void doFilter(Request request , Response response) {
        if(index == list.size()) return;
        Filter f= list.get(index);
        index++;
        f.doFilter(request,response,this);
    }
}
