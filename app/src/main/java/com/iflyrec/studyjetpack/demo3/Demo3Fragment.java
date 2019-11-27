package com.iflyrec.studyjetpack.demo3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.iflyrec.studyjetpack.R;
import com.iflyrec.studyjetpack.demo2.UserInfo;

/**
 * author : twq
 * date : 2019/11/18
 * desc : 数据改变fragment
 */
public class Demo3Fragment extends Fragment {

    private ShareViewModel mViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getActivity(), R.layout.fragment_demo3, null);
        mViewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView button = view.findViewById(R.id.txt_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getUserInfoModel()
                        .setValue(new UserInfo("twq：" + System.currentTimeMillis(), "18", "13838389438"));
            }
        });
    }
}
