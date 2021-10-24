package com.example.mywork;

import android.content.Context;
import android.os.Bundle;

import android.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link weixinfragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class weixinfragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
    private RecyclerView rvList;
    private Handler mHandler;
    private View view;
    private Context context;
    private LinearLayoutManager layoutManager;
    public weixinfragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment weixinfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static weixinfragment3 newInstance(String param1, String param2) {
        weixinfragment3 fragment = new weixinfragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weixinfragment3, container, false);
    }}
        // Inflate the layout for this fragment
       /* view = inflater.inflate(R.layout.fragment_weixinfragment3, container, false);
        context=this.getActivity();
        initView();
        layoutManager = new LinearLayoutManager(context);
        mHandler=new Handler();
        initData();
        recycleAdapter=new RecycleAdapter(data,context);
        rvList.setLayoutManager(layoutManager);//实现布局效果
        rvList.setAdapter(recycleAdapter);//实现数值的对应
        aboutAapter();
        rvList.setLayoutManager(layoutManager);//实现布局效果
        rvList.setAdapter(recycleAdapter);//实现数值的对应
        return view;
    }

    private void aboutAapter() {
        //设置布局管理器

        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        //设置Adapter
        rvList.setAdapter(recycleAdapter);
        //设置 Header 为 贝塞尔雷达 样式
        srfresh.setRefreshHeader(new BezierRadarHeader(context).setEnableHorizontalDrag(true));
        //设置 Footer 为 球脉冲 样式
        srfresh.setRefreshFooter(new BallPulseFooter(context).setSpinnerStyle(SpinnerStyle.Scale));
        srfresh.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(final RefreshLayout refreshlayout) {
                //延时展示，延时2秒
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initData();
                        refreshlayout.finishRefresh();
                    }
                },2000);

            }
        });
        srfresh.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(final RefreshLayout refreshlayout) {
                mHandler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        initData();
                        recycleAdapter=new RecycleAdapter(data,context);
                        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                        rvList.setLayoutManager(layoutManager);//实现布局效果
                        rvList.setAdapter(recycleAdapter);//实现数值的对应
                        refreshlayout.finishLoadMore();
                    }
                },2000);

            }
        });
        srfresh.setEnableLoadMore(true);
        srfresh.autoRefresh();
    }

    private void initData() {
        String[] label={"华为","苹果","小米"};
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
        };
        }


    private void initView() {
        rvList = view.findViewById(R.id.recyclerView1);
        srfresh = view.findViewById(R.id.srl_fresh);
    }
    }*/




