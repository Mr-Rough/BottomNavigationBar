package com.example.bottomnavigationbar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
*@packageName:com.lidong.demo.navigation_view
*@className:FavoritesFragment
*@desc:
*@author:lidong
*@datetime:16/6/14 下午9:55
*@company:chni
*@qq:1561281670
*/
public class FavoritesFragment extends Fragment {


    public static FavoritesFragment newInstance(String param1) {
        FavoritesFragment fragment = new FavoritesFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    public FavoritesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
//        ButterKnife.bind(this, view);
        return view;
    }


}
