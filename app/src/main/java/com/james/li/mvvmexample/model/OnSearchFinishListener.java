package com.james.li.mvvmexample.model;

import com.james.li.mvvmexample.model.entity.IpAddress;

/**
 * Created by jyj-lsy on 9/8/16 in zsl-tech.
 */
public interface OnSearchFinishListener {
    /**
     * 成功时的调用
     * @param ipAddress
     */
    void onSuccessed(IpAddress ipAddress);

    /**
     * 失败时的回调
     */
    void onError();
}
