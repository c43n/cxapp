package com.example.mywork;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
//import java.util.logging.Handler;
import android.content.Intent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link weixinfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class weixinfragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private View view;
    private ListView listView;
    private RecyclerView recyclerView;
    List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
    private Context context;
    private Myadapter myadapter;
    private SwipeRefreshLayout swipeRefreshView;
    private LinearLayoutManager layoutManager;



    public weixinfragment() {
        // Required empty public constructor
    }

    public static weixinfragment newInstance(String param1, String param2) {
        weixinfragment fragment = new weixinfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_weixinfragment, container, false);
        context=this.getActivity();
        swipeRefreshView = view.findViewById(R.id.srl);
        recyclerView=view.findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(context);
        // Inflate the layout for this fragment
        String[] label={"??????","??????","??????"};
        String[] price={"6888","5999","3999"};
        String[] config={"128G","256G","512G"};
        int[] png={R.drawable.b1,R.drawable.b2,R.drawable.b3};
        
        for(int i=0;i< label.length;i++) {
            Map<String, Object> listitem = new HashMap<String, Object>();
            listitem.put("name", label[i]);
            listitem.put("price", price[i]);
            listitem.put("configure", config[i]);
            listitem.put("photo",png[i]);
            data.add(listitem);
        }
        myadapter=new Myadapter(data,context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        initData();
        recyclerView.setLayoutManager(layoutManager);//??????????????????
        recyclerView.setAdapter(myadapter);//?????????????????????
        return view;
    }
    private void initData() {
//        System.out.println("-----refresh----");
        // ????????????
        swipeRefreshView.setOnRefreshListener(this); // ??????????????????
        swipeRefreshView.setColorSchemeResources(R.color.purple_200 ,R.color.purple_500, R.color.purple_700,R.color.white); // ??????????????????
//        refreshLayout.setProgressBackgroundColorSchemeResource(R.color.swipefefresh_bg); // ??????????????????
        // ?????????????????????????????????????????? ???????????????1
        GridLayoutManager layoutManager = new GridLayoutManager(view.getContext(), 1);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

//        recycler.setAdapter(new GridPicAdapter(this,lists, StrUtil.PIC));
    }
   @Override
    public void onRefresh() {
        swipeRefreshView.postDelayed(new Runnable() { // ?????????????????????????????????
            @Override
            public void run() {

                // ????????????
                data.clear();
                String[] label={"??????p40","??????12","??????10"};
                String[] price={"3888","4999","2999"};
                String[] config={"128G","256G","512G"};
                int[] png={R.drawable.b1,R.drawable.b2,R.drawable.b3};
                for(int i=0;i< label.length;i++) {
                    Map<String, Object> listitem = new HashMap<String, Object>();
                    listitem.put("name", label[i]);
                    listitem.put("price", price[i]);
                    listitem.put("configure", config[i]);
                    listitem.put("photo",png[i]);
                    data.add(listitem);
                }
                myadapter=new Myadapter(data,context);
                layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                initData();
                Toast.makeText(context, "?????????" + 3 + "?????????", Toast.LENGTH_SHORT).show();
                recyclerView.setLayoutManager(layoutManager);//??????????????????
                recyclerView.setAdapter(myadapter);//?????????????????????
                // ??????????????????????????????????????????????????????????????????
                swipeRefreshView.setRefreshing(false);
            }

                ; // ????????????????????????;false:?????????

        },3000);
    }

}


