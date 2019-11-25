package com.iflyrec.studyjetpack.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/25
 * desc :
 */
public class NavFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_nav3, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        Bundle bundle = getArguments();
        String value = bundle.getString("key");
        TextView textView = view.findViewById(R.id.txt_button);
        textView.setText(value);
    }
}
