package com.iflyrec.studyjetpack.demo3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.iflyrec.studyjetpack.R;
import com.iflyrec.studyjetpack.demo2.UserInfo;

/**
 * author : twq
 * date : 2019/11/18
 * desc : 数据监听fragment
 */
public class Demo3ObserverFragment extends Fragment {

    private ShareViewModel mViewModel;
    private TextView mTxtButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragment_demo3_observer, null);
        mViewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mTxtButton = view.findViewById(R.id.txt_button);
        mViewModel.getUserInfoModel().observe(this, new Observer<UserInfo>() {
            @Override
            public void onChanged(@Nullable UserInfo accountBean) {
                mTxtButton.setText(accountBean.getUserName());
            }
        });
    }
}
