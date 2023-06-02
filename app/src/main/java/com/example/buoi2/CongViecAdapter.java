package com.example.buoi2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CongViecAdapter extends BaseAdapter {
    private  GhiChuApp context;
    private int layout;
    private List<CongViec> congViecList;

    public CongViecAdapter(GhiChuApp context, int layout, List<CongViec> congViecList) {
        this.context = context;
        this.layout = layout;
        this.congViecList = congViecList;
    }

    @Override
    public int getCount() {
        return congViecList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView tv_ten;
        ImageView imgv_delete, imgv_edit;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.tv_ten = view.findViewById(R.id.tv_ten);
            holder.imgv_delete = view.findViewById(R.id.imgv_delete);
            holder.imgv_edit = view.findViewById(R.id.imgv_edit);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        final CongViec congViec = congViecList.get(i);
        holder.tv_ten.setText(congViec.getTenCV());

//         bắt sự kiện sửa và xóa
        holder.imgv_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DialogCapNhatCongViec(congViec.getTenCV(), congViec.getIdCV());
            }
        });

        // bắt sự kiện xóa
        holder.imgv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.DialogXoaCV(congViec.getTenCV(), congViec.getIdCV());

            }
        });
        return view;
    }
}
