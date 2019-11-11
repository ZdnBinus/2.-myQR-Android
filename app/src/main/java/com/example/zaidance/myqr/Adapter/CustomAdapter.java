package com.example.zaidance.myqr.Adapter;

import android.content.Context;
import android.content.Intent;
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


/**
 * Provide views to RecyclerView with data from mDataSet.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private static final String TAG = "CustomAdapter";

    private String[] mDataSet,mDataSet2;
    private int[] mDataSet3;
    private Context mContext;


    public interface onOccListiner {
        void onOccClick(int position);
    }




    // BEGIN_INCLUDE(recyclerViewSampleViewHolder)
    /**
     * Provide a reference to the type of views that you are using (custom ViewHolder)
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView,textView2;
        private final ImageView icon;
        RelativeLayout parentLayout;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getPosition() + " clicked.");

                }
            });
            textView = (TextView) v.findViewById(R.id.name);
            textView2 = (TextView) v.findViewById(R.id.desc);
            icon = (ImageView) v.findViewById(R.id.thumbnail);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

        public TextView getTextView() {
            return textView;
        }
        public TextView getTextView2() {
            return textView2;
        }
        public ImageView getImageView() {
            return icon;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder) [public static class ViewHolder extends RecyclerView.ViewHolder]




    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public CustomAdapter(String[] dataSet,String[] dataSet2, int[] dataSet3, Context context) {
        this.mDataSet = dataSet;
        this.mDataSet2 = dataSet2;
        this.mDataSet3 = dataSet3;
        mContext = context;

    }





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


        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTextView().setText(mDataSet[position]);
        viewHolder.getTextView2().setText(mDataSet2[position]);
        viewHolder.getImageView().setImageResource(mDataSet3[position]);

        //https://www.youtube.com/watch?v=ZXoGG2XTjzU

        viewHolder.parentLayout.OnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, ProfilleOccActivity.class);
                intent.putExtra("name", mDataSet.getClass(position));
                intent.putExtra("desc", mDataSet2.getClass(position));
                intent.putExtra("img", mDataSet3.getClass(position));

                mContext.startActivity(intent);
            }
        });


    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)



    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
