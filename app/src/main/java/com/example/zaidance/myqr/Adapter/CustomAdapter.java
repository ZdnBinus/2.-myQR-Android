package com.example.zaidance.myqr.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zaidance.myqr.Activity.ProfilleOccActivity;
import com.example.zaidance.myqr.R;
import com.example.zaidance.myqr.fragment.HomeFragment;

import java.util.ArrayList;


/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet,mDataSet2;
    private int[] mDataSet3;
    private Context mContext;

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mJudul = new ArrayList<>();



    public interface onOccListiner {
        void onOccClick(int position);
    }

//    public CustomAdapter(HomeFragment dataSet, String[] dataSet2, String[] dataSet3, int[] context) {
//        this.mDataSet = dataSet;
//        this.mDataSet2 = dataSet2;
//        this.mDataSet3 = dataSet3;
//        this.mContext = context;
//    }

    public CustomAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> judul, ArrayList<String> desc ) {
        mImageNames = imageNames;
        mJudul = judul;
        mDesc = desc;
        mContext = context;
    }



    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
//    public  class ViewHolder extends RecyclerView.ViewHolder {
//        TextView textView,textView2;
//        ImageView icon;
//        RelativeLayout parentLayout;
//
//        public ViewHolder(View v) {
//
//            textView = (TextView) v.findViewById(R.id.name);
//            textView2 = (TextView) v.findViewById(R.id.desc);
//            icon = (ImageView) v.findViewById(R.id.thumbnail);
//            parentLayout = v.findViewById(R.id.parent_layout);
//
//
//        }
//
//
//    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        TextView textView, textView2;
        ImageView icon;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.name);
            textView2 =(TextView) itemView.findViewById(R.id.desc);
            icon = (ImageView) itemView.findViewById(R.id.thumbnail);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder) [public static class ViewHolder extends RecyclerView.ViewHolder]




    /**
     * Initialize the dataset of the Adapter.
     *
     //* @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     //* @param dataSet3
     //* @param context
     */






    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.menu.list_view, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)



    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

//        super(v);
//        viewHolder.getTextView().setText(mDataSet[position]);
//        viewHolder.getTextView2().setText(mDataSet2[position]);
//        viewHolder.getImageView().setImageResource(mDataSet3[position]);
        // Define click listener for the ViewHolder's View.

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, ProfilleOccActivity.class);
                intent.putExtra("image_url", mImageNames.get(position));
                intent.putExtra("judul", mJudul.get(position));
                intent.putExtra("desc", mDesc.get(position));
                mContext.startActivity(intent);

            }
        });


        // Get element from your dataset at this position and replace the contents of the view
        // with that element
//
//
//

        //https://www.youtube.com/wa2tch?v=ZXoGG2XTjzU







    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)



    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mImageNames.size();
    }




}
