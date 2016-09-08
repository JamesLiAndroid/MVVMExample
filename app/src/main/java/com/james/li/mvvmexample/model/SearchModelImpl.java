package com.james.li.mvvmexample.model;

import android.util.Log;

import com.james.li.mvvmexample.model.entity.IpAddress;
import com.james.li.mvvmexample.model.network.IpAddressGet;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jyj-lsy on 9/8/16 in zsl-tech.
 */
public class SearchModelImpl implements SearchModelInterface{
    private OnSearchFinishListener listener;

    public void setOnSearchFinishListener(OnSearchFinishListener listener) {
        this.listener = listener;
    }

    @Override
    public void getIpAddress(String ip) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://int.dpool.sina.com.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final IpAddressGet ipAddress = retrofit.create(IpAddressGet.class);

        Call<IpAddress> callIpAddress = ipAddress.getIpAddress("json", ip);

        callIpAddress.enqueue(new Callback<IpAddress>() {
            @Override
            public void onResponse(Call<IpAddress> call, Response<IpAddress> response) {
                IpAddress ipAddr = response.body();
                Log.d("TAG", ipAddr.toString());
                if (ipAddr.getRet() == 1) {
                    listener.onSuccessed(ipAddr);
                } else {
                    listener.onError();
                }
            }

            @Override
            public void onFailure(Call<IpAddress> call, Throwable t) {
                listener.onError();
            }
        });
    }
}
