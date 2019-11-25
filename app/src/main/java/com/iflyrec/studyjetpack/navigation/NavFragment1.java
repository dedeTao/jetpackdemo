package com.iflyrec.studyjetpack.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/25
 * desc :
 */
public class NavFragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_nav1, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView txtClick = view.findViewById(R.id.txtClick);
        txtClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(NavFragment1.this)
                        .navigate(R.id.action_navFragment1_to_navFragment2);
            }
        });
    }
}
