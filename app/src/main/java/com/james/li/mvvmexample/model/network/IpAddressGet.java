package com.james.li.mvvmexample.model.network;

import com.james.li.mvvmexample.model.entity.IpAddress;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jyj-lsy on 9/8/16 in zsl-tech.
 */
public interface IpAddressGet {
    @GET("iplookup/iplookup.php")
    Call<IpAddress> getIpAddress(@Query("format") String format, @Query("ip") String ip);
}
