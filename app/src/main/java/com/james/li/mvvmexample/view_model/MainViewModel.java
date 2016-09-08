package com.james.li.mvvmexample.view_model;

import android.view.View;

import com.james.li.mvvmexample.databinding.ActivityMainBinding;
import com.james.li.mvvmexample.model.OnSearchFinishListener;
import com.james.li.mvvmexample.model.SearchModel;
import com.james.li.mvvmexample.model.entity.IpAddress;

/**
 * Created by jyj-lsy on 9/8/16 in zsl-tech.
 */
public class MainViewModel extends SearchModel implements OnSearchFinishListener{

    private ActivityMainBinding binding;
    private SearchModel searchModel = new SearchModel();

    public MainViewModel(ActivityMainBinding binding) {
        this.binding = binding;
        searchModel.setOnSearchFinishListener(this);
    }

    public void search(View view) {
        binding.pbLoad.setVisibility(View.VISIBLE);
        String ip = binding.etIp.getText().toString().trim();
        searchModel.getIpAddress(ip);
    }

    @Override
    public void onSuccessed(IpAddress ipAddress) {
        binding.pbLoad.setVisibility(View.GONE);
        binding.tvMsg.setText(ipAddress.toString());

    }

    @Override
    public void onError() {
        binding.pbLoad.setVisibility(View.GONE);
        binding.tvMsg.setText("获取ip信息失败！");
    }
}
