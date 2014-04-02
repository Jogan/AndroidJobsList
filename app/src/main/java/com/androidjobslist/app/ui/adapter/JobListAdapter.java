package com.androidjobslist.app.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidjobslist.app.R;
import com.androidjobslist.app.model.Job;

import java.util.List;

/**
 * Created by w419306 on 3/27/2014.
 */
public class JobListAdapter extends ArrayAdapter<Job> {
    private final Context mContext;
    private List<Job> mJobsList;

    public JobListAdapter(Context context, int resource, List<Job> jobs) {
        super(context, resource, jobs);
        this.mContext = context;
        this.mJobsList = jobs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null){
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.row_job_layout, null);
            //configure View Holder
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.txtTitle = (TextView) rowView.findViewById(R.id.textTitle);
            viewHolder.txtCompany = (TextView) rowView.findViewById(R.id.textCompany);
            viewHolder.txtLocation = (TextView) rowView.findViewById(R.id.textLocation);
            rowView.setTag(viewHolder);
        }

        // fill data
        ViewHolder holder = (ViewHolder) rowView.getTag();

       if(mJobsList != null) {
           Job job = mJobsList.get(position);
           holder.txtTitle.setText(job.title);
           holder.txtCompany.setText(job.company);
           holder.txtLocation.setText(job.location);
       }
        return rowView;
    }

    public void setListJobData(List<Job> data) {
        mJobsList = data;
    }

    static class ViewHolder {
        public TextView txtTitle;
        public TextView txtLocation;
        public TextView txtCompany;
    }
}
