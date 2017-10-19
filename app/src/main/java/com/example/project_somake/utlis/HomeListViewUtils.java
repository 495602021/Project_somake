package com.example.project_somake.utlis;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.project_somake.R;
import com.example.project_somake.entity.HomeBean;
import com.example.project_somake.ui.adapter.RecyclerViewAdapter;
import com.recker.flybanner.FlyBanner;

import java.util.ArrayList;
import java.util.List;


public class HomeListViewUtils {

    public static final int ITEM_TYPE_COUNT = 11;
    //FuncAreaFiveImg  5个图片
    public static final int ITEM_TYPE_FUNCAREAFIVEIMG = 0;
    //爆款专区-楼层头6 FloorHead
    public static final int ITEM_TYPE_FLOORHEAD = 1;
    //    爆款间距 FloorSpace
    public static final int ITEM_TYPE_FLOORSPACE = 2;
    //ProductSingleRow 爆款专区0925
    public static final int ITEM_TYPE_PRODUCTSINGLEROW = 3;
    //爆款专区楼层尾  FloorFoot
    public static final int ITEM_TYPE_FLOORFOOT = 4;
    //TwoImgAverage  本周推荐0922下
    public static final int ITEM_TYPE_TWOIMGAVERAGE = 5;
    //OneImg 通栏-婴童花开月正圆
    public static final int ITEM_TYPE_ONEIMG = 6;
    //ThreeImgLeftOne
    public static final int ITEM_TYPE_THREEIMGLEFTONE = 7;
    //ThreeImgLeftTwo
    public static final int ITEM_TYPE_THREEIMGLEFTTWO = 8;
    // ThreeImgAbreast
    public static final int ITEM_TYPE_THREEIMGABREAST = 9;
    // CarouselFigure
    public static final int ITEM_TYPE_CAROUSELFIGURE = 10;

    public static int getItemType(String itemtype) {
        if ("FuncAreaFiveImg".equals(itemtype)) {
            return ITEM_TYPE_FUNCAREAFIVEIMG;
        }
        if ("FloorHead".equals(itemtype)) {
            return ITEM_TYPE_FLOORHEAD;
        }

        if ("FloorSpace".equals(itemtype)) {
            return ITEM_TYPE_FLOORSPACE;
        }
        if ("ProductSingleRow".equals(itemtype)) {
            return ITEM_TYPE_PRODUCTSINGLEROW;
        }
        if ("FloorFoot".equals(itemtype)) {
            return ITEM_TYPE_FLOORFOOT;
        }
        if ("TwoImgAverage".equals(itemtype)) {
            return ITEM_TYPE_TWOIMGAVERAGE;
        }
        if ("OneImg".equals(itemtype)) {
            return ITEM_TYPE_ONEIMG;
        }
        if ("ThreeImgLeftOne".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGLEFTONE;
        }
        if ("ThreeImgLeftTwo".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGLEFTTWO;
        }
        if ("ThreeImgAbreast".equals(itemtype)) {
            return ITEM_TYPE_THREEIMGABREAST;
        }
        if ("CarouselFigure".equals(itemtype)) {
            return ITEM_TYPE_CAROUSELFIGURE;
        }
        return 0;
    }

    public static View getView(Context context, View convertView, int itemType, HomeBean.DataBean.TemplatelistBean bean) {
        FuncareafiveimgViewHolder funcareafiveimgViewHolder = null;
        FloorheadViewHolder floorheadViewHolder = null;
        FloorspaceViewHolder floorspaceViewHolder = null;
        ProductsinglerowViewHolder productsinglerowViewHolder = null;
        FloorfootViewHolder floorfootViewHolder = null;
        TwoimgaverageViewHolder twoimgaverageViewHolder = null;
        OneimgViewHolder oneimgViewHolder = null;
        ThreeimgleftoneViewHolder threeimgleftoneViewHolder = null;
        ThreeimglefttwoViewHolder threeimglefttwoViewHolder = null;
        ThreeimgabreastViewHolder threeimgabreastViewHolder = null;
        CarouselfigureViewHolder carouselfigureViewHolder = null;

        if (convertView == null) {
            switch (itemType) {
                case ITEM_TYPE_FUNCAREAFIVEIMG:
                    convertView = LayoutInflater.from(context).inflate(R.layout.funcareafiveimg_item, null);
                    funcareafiveimgViewHolder = new FuncareafiveimgViewHolder(convertView);
                    convertView.setTag(funcareafiveimgViewHolder);
                    break;
                case ITEM_TYPE_FLOORHEAD:
                    convertView = LayoutInflater.from(context).inflate(R.layout.floorhead_item, null);
                    floorheadViewHolder = new FloorheadViewHolder(convertView);
                    convertView.setTag(floorheadViewHolder);
                    break;
                case ITEM_TYPE_FLOORSPACE:
                    convertView = LayoutInflater.from(context).inflate(R.layout.floorspace_item, null);
                    floorspaceViewHolder = new FloorspaceViewHolder(convertView);
                    convertView.setTag(floorspaceViewHolder);
                    break;
                //横向瀑布流
                case ITEM_TYPE_PRODUCTSINGLEROW:
                    convertView = LayoutInflater.from(context).inflate(R.layout.productsinglerow_item, null);
                    productsinglerowViewHolder = new ProductsinglerowViewHolder(convertView);
                    convertView.setTag(productsinglerowViewHolder);
                    break;
                case ITEM_TYPE_FLOORFOOT:
                    convertView = LayoutInflater.from(context).inflate(R.layout.floorfoot_item, null);
                    floorfootViewHolder = new FloorfootViewHolder(convertView);
                    convertView.setTag(floorfootViewHolder);
                    break;
                case ITEM_TYPE_TWOIMGAVERAGE:
                    convertView = LayoutInflater.from(context).inflate(R.layout.twoimgaverage_item, null);
                    twoimgaverageViewHolder = new TwoimgaverageViewHolder(convertView);
                    convertView.setTag(twoimgaverageViewHolder);
                    break;
                case ITEM_TYPE_ONEIMG:
                    convertView = LayoutInflater.from(context).inflate(R.layout.oneimg_item, null);
                    oneimgViewHolder = new OneimgViewHolder(convertView);
                    convertView.setTag(oneimgViewHolder);
                    break;
                case ITEM_TYPE_THREEIMGLEFTONE:
                    convertView = LayoutInflater.from(context).inflate(R.layout.threeimgleftone_item, null);
                    threeimgleftoneViewHolder = new ThreeimgleftoneViewHolder(convertView);
                    convertView.setTag(threeimgleftoneViewHolder);
                    break;
                case ITEM_TYPE_THREEIMGLEFTTWO:
                    convertView = LayoutInflater.from(context).inflate(R.layout.threeimglefttwo, null);
                    threeimglefttwoViewHolder = new ThreeimglefttwoViewHolder(convertView);
                    convertView.setTag(threeimglefttwoViewHolder);
                    break;
                case ITEM_TYPE_THREEIMGABREAST:
                    convertView = LayoutInflater.from(context).inflate(R.layout.threeimgabreast_item, null);
                    threeimgabreastViewHolder = new ThreeimgabreastViewHolder(convertView);
                    convertView.setTag(threeimgabreastViewHolder);
                    break;
                case ITEM_TYPE_CAROUSELFIGURE:
                    convertView = LayoutInflater.from(context).inflate(R.layout.carouselfigure_item, null);
                    carouselfigureViewHolder = new CarouselfigureViewHolder(convertView);
                    convertView.setTag(carouselfigureViewHolder);
                    break;
            }
        } else {
            switch (itemType) {
                case ITEM_TYPE_FUNCAREAFIVEIMG:
                    funcareafiveimgViewHolder = (FuncareafiveimgViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_FLOORHEAD:
                    floorheadViewHolder = (FloorheadViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_FLOORSPACE:
                    floorspaceViewHolder = (FloorspaceViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_PRODUCTSINGLEROW:
                    productsinglerowViewHolder = (ProductsinglerowViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_FLOORFOOT:
                    floorfootViewHolder = (FloorfootViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_TWOIMGAVERAGE:
                    twoimgaverageViewHolder = (TwoimgaverageViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_ONEIMG:
                    oneimgViewHolder = (OneimgViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_THREEIMGLEFTONE:
                    threeimgleftoneViewHolder = (ThreeimgleftoneViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_THREEIMGLEFTTWO:
                    threeimglefttwoViewHolder = (ThreeimglefttwoViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_THREEIMGABREAST:
                    threeimgabreastViewHolder = (ThreeimgabreastViewHolder) convertView.getTag();
                    break;
                case ITEM_TYPE_CAROUSELFIGURE:
                    carouselfigureViewHolder = (CarouselfigureViewHolder) convertView.getTag();
                    break;
            }
        }
        switch (itemType) {
            case ITEM_TYPE_FUNCAREAFIVEIMG:
                List<HomeBean.DataBean.TemplatelistBean.ItemsBean> items = bean.getItems();
                funcareafiveimgViewHolder.mTextViwe_fun_a.setText(items.get(0).getImgname());
                funcareafiveimgViewHolder.mTextViwe_fun_b.setText(items.get(1).getImgname());
                funcareafiveimgViewHolder.mTextViwe_fun_c.setText(items.get(2).getImgname());
                funcareafiveimgViewHolder.mTextViwe_fun_d.setText(items.get(3).getImgname());
                funcareafiveimgViewHolder.mTextViwe_fun_e.setText(items.get(4).getImgname());
                Glide.with(context).load(items.get(0).getImgurl()).into(funcareafiveimgViewHolder.mImage_fun_a);
                Glide.with(context).load(items.get(1).getImgurl()).into(funcareafiveimgViewHolder.mImage_fun_b);
                Glide.with(context).load(items.get(2).getImgurl()).into(funcareafiveimgViewHolder.mImage_fun_c);
                Glide.with(context).load(items.get(3).getImgurl()).into(funcareafiveimgViewHolder.mImage_fun_d);
                Glide.with(context).load(items.get(3).getImgurl()).into(funcareafiveimgViewHolder.mImage_fun_e);
                break;
            case ITEM_TYPE_FLOORHEAD:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(floorheadViewHolder.mFloorHead);
                break;
            case ITEM_TYPE_FLOORSPACE:
                break;
            //瀑布流
            case ITEM_TYPE_PRODUCTSINGLEROW:
                RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(context, bean.getItems());
                productsinglerowViewHolder.mRecyclerView.setAdapter(recyclerViewAdapter);
                break;
            case ITEM_TYPE_FLOORFOOT:
                break;
            case ITEM_TYPE_TWOIMGAVERAGE:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(twoimgaverageViewHolder.mImage_Left);
                Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(twoimgaverageViewHolder.mImage_Right);
                break;
            case ITEM_TYPE_ONEIMG:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(oneimgViewHolder.mOneImg_a);
                break;
            case ITEM_TYPE_THREEIMGLEFTONE:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(threeimgleftoneViewHolder.mThreeimgLeftone_left);
                Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(threeimgleftoneViewHolder.mThreeimgLeftone_left);
                Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(threeimgleftoneViewHolder.mThreeimgLeftone_left);
                break;
            case ITEM_TYPE_THREEIMGLEFTTWO:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(threeimglefttwoViewHolder.mThreeimglefttwo_left_top);
                Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(threeimglefttwoViewHolder.mThreeimglefttwo_left_btm);
                Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(threeimglefttwoViewHolder.mThreeimglefttwo_right);
                break;
            case ITEM_TYPE_THREEIMGABREAST:
                Glide.with(context).load(bean.getItems().get(0).getImgurl()).into(threeimgabreastViewHolder.mImage_ThreeImgAbreast_a);
                Glide.with(context).load(bean.getItems().get(1).getImgurl()).into(threeimgabreastViewHolder.mImage_ThreeImgAbreast_b);
                Glide.with(context).load(bean.getItems().get(2).getImgurl()).into(threeimgabreastViewHolder.mImage_ThreeImgAbreast_c);
                break;
            case ITEM_TYPE_CAROUSELFIGURE:
                ArrayList<String> flybanner = new ArrayList<>();
                for (int i = 0; i < bean.getItems().size(); i++) {
                    flybanner.add(bean.getItems().get(i).getImgurl());
                }

                carouselfigureViewHolder.mCarouselFigure.setImagesUrl(flybanner);
                break;
        }

        return convertView;
    }


    public static class FuncareafiveimgViewHolder {
        public View rootView;
        public ImageView mImage_fun_a;
        public TextView mTextViwe_fun_a;
        public ImageView mImage_fun_b;
        public TextView mTextViwe_fun_b;
        public ImageView mImage_fun_c;
        public TextView mTextViwe_fun_c;
        public ImageView mImage_fun_d;
        public TextView mTextViwe_fun_d;
        public ImageView mImage_fun_e;
        public TextView mTextViwe_fun_e;

        public FuncareafiveimgViewHolder(View rootView) {
            this.rootView = rootView;
            this.mImage_fun_a = (ImageView) rootView.findViewById(R.id.mImage_fun_a);
            this.mTextViwe_fun_a = (TextView) rootView.findViewById(R.id.mTextViwe_fun_a);
            this.mImage_fun_b = (ImageView) rootView.findViewById(R.id.mImage_fun_b);
            this.mTextViwe_fun_b = (TextView) rootView.findViewById(R.id.mTextViwe_fun_b);
            this.mImage_fun_c = (ImageView) rootView.findViewById(R.id.mImage_fun_c);
            this.mTextViwe_fun_c = (TextView) rootView.findViewById(R.id.mTextViwe_fun_c);
            this.mImage_fun_d = (ImageView) rootView.findViewById(R.id.mImage_fun_d);
            this.mTextViwe_fun_d = (TextView) rootView.findViewById(R.id.mTextViwe_fun_d);
            this.mImage_fun_e = (ImageView) rootView.findViewById(R.id.mImage_fun_e);
            this.mTextViwe_fun_e = (TextView) rootView.findViewById(R.id.mTextViwe_fun_e);
        }


    }

    public static class FloorheadViewHolder {
        public View rootView;
        public ImageView mFloorHead;

        public FloorheadViewHolder(View rootView) {
            this.rootView = rootView;
            this.mFloorHead = (ImageView) rootView.findViewById(R.id.mFloorHead);
        }

    }

    public static class FloorspaceViewHolder {
        public View rootView;

        public FloorspaceViewHolder(View rootView) {
            this.rootView = rootView;
        }

    }

    public static class ProductsinglerowViewHolder {
        public View rootView;
        public RecyclerView mRecyclerView;

        public ProductsinglerowViewHolder(View rootView) {
            this.rootView = rootView;
            this.mRecyclerView = (RecyclerView) rootView.findViewById(R.id.mRecyclerView);
            mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));
        }

    }

    public static class FloorfootViewHolder {
        public View rootView;

        public FloorfootViewHolder(View rootView) {
            this.rootView = rootView;
        }

    }

    public static class TwoimgaverageViewHolder {
        public View rootView;
        public ImageView mImage_Left;
        public ImageView mImage_Right;

        public TwoimgaverageViewHolder(View rootView) {
            this.rootView = rootView;
            this.mImage_Left = (ImageView) rootView.findViewById(R.id.mImage_Left);
            this.mImage_Right = (ImageView) rootView.findViewById(R.id.mImage_Right);
        }


    }

    public static class OneimgViewHolder {
        public View rootView;
        public ImageView mOneImg_a;

        public OneimgViewHolder(View rootView) {
            this.rootView = rootView;
            this.mOneImg_a = (ImageView) rootView.findViewById(R.id.mOneImg_a);
        }

    }

    public static class ThreeimgleftoneViewHolder {
        public View rootView;
        public ImageView mThreeimgLeftone_left;
        public ImageView mThreeimgLeftone_right_top;
        public ImageView mThreeimgLeftone_right_btm;

        public ThreeimgleftoneViewHolder(View rootView) {
            this.rootView = rootView;
            this.mThreeimgLeftone_left = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_left);
            this.mThreeimgLeftone_right_top = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_right_top);
            this.mThreeimgLeftone_right_btm = (ImageView) rootView.findViewById(R.id.mThreeimgLeftone_right_btm);
        }
    }

    public static class ThreeimglefttwoViewHolder {
        public View rootView;
        public ImageView mThreeimglefttwo_left_top;
        public ImageView mThreeimglefttwo_left_btm;
        public ImageView mThreeimglefttwo_right;

        public ThreeimglefttwoViewHolder(View rootView) {
            this.rootView = rootView;
            this.mThreeimglefttwo_left_top = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_left_top);
            this.mThreeimglefttwo_left_btm = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_left_btm);
            this.mThreeimglefttwo_right = (ImageView) rootView.findViewById(R.id.mThreeimglefttwo_right);
        }

    }

    public static class ThreeimgabreastViewHolder {
        public View rootView;
        public ImageView mImage_ThreeImgAbreast_a;
        public ImageView mImage_ThreeImgAbreast_b;
        public ImageView mImage_ThreeImgAbreast_c;

        public ThreeimgabreastViewHolder(View rootView) {
            this.rootView = rootView;
            this.mImage_ThreeImgAbreast_a = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_a);
            this.mImage_ThreeImgAbreast_b = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_b);
            this.mImage_ThreeImgAbreast_c = (ImageView) rootView.findViewById(R.id.mImage_ThreeImgAbreast_c);
        }

    }

    public static class CarouselfigureViewHolder {
        public View rootView;
        public FlyBanner mCarouselFigure;

        public CarouselfigureViewHolder(View rootView) {
            this.rootView = rootView;
            this.mCarouselFigure = (FlyBanner) rootView.findViewById(R.id.mCarouselFigure);
        }


    }

}
