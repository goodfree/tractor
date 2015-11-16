package com.andbase.tractor.http;

import com.andbase.tractor.listener.LoadListener;

import java.util.HashMap;

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
	 * @param header
	 *            设置http header
	 * @param json
	 * @param listener
	 */
	public CallWrap post(String url, HashMap<String, String> header, String json,
						 LoadListener listener, Object... tag);

	/**
	 * POST提交键值对
	 * 
	 * @param url
	 * @param hashMap
	 * @param listener
	 * @param tag
	 */
	public CallWrap post(String url, HashMap<String, String> hashMap,
						 LoadListener listener, Object... tag);

	/**
	 * 取消请求
	 * 
	 * @param tag
	 */
	public void cancel(Object... tag);
}
