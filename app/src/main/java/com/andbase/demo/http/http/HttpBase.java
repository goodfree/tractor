package com.andbase.demo.http.http;

import com.andbase.tractor.listener.LoadListener;

import java.util.LinkedHashMap;

/**
 * http请求的基类
 */
public interface HttpBase {
    /**
     * GET请求数据
     *
     * @param url
     * @param listener
     * @param tag
     * @return callWrap可以用来取消这次请求
     */
    public CallWrap get(String url, LoadListener listener, Object... tag);

    public CallWrap get(String url, LinkedHashMap<String, String> header,
                                                 LoadListener listener, Object... tag);

    /**
     * POST提交String数据
     *
     * @param url
     * @param string
     * @param listener
     * @param tag
     */
    public CallWrap post(String url, String string, LoadListener listener,
                                                  Object... tag);

    /**
     * POST提交String数据，可设置header
     *
     * @param url
     * @param header   设置http header
     * @param json
     * @param listener
     */
    public CallWrap post(String url, LinkedHashMap<String, String> header, String json,
                                                  LoadListener listener, Object... tag);

    /**
     * POST提交键值对
     *
     * @param url
     * @param hashMap
     * @param listener
     * @param tag
     */
    public CallWrap post(String url, LinkedHashMap<String, String> hashMap,
                                                  LoadListener listener, Object... tag);

    /**
     * header请求
     *
     * @param url
     * @param listener
     * @param tag
     * @return
     */
    public CallWrap header(String url, LoadListener listener, Object... tag);

    /**
     * 取消请求
     *
     * @param tag
     */
    public void cancel(Object... tag);

    public CallWrap download(String url, String filepath, LinkedHashMap<String, String> header, final long startposition, final LoadListener listener, Object tag);
}