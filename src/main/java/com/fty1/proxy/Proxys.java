package com.fty1.proxy;

import com.fty1.proxy.module.ProxyInfo;

/**
 * for fetch proxy IP
 */
public class Proxys {

    /**
     * fetch one proxy ip
     * @return ProxyInfo
     */
    public static ProxyInfo get() {
        return new ProxyInfo();
    }
}
