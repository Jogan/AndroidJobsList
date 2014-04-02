package com.androidjobslist.app.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidjobslist.app.R;
import com.androidjobslist.app.model.Job;
import com.squareup.picasso.Picasso;

/**
 * A fragment representing a single Job detail screen.
 * This fragment is either contained in a {@link com.androidjobslist.app.ui.JobListActivity}
 * in two-pane mode (on tablets) or a {@link com.androidjobslist.app.ui.JobDetailActivity}
 * on handsets.
 */
public class JobDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_JOB_ID = "job_id";
    public static final String ARG_JOB_COMPANY = "job_company";
    public static final String ARG_JOB_TITLE = "job_title";
    public static final String ARG_JOB_LOCATION = "job_location";
    public static final String ARG_JOB_DESCRIPTION = "job_description";
    public static final String ARG_JOB_COMPANY_LOGO_URL = "job_company_logo_url";
    public static final String ARG_JOB_SERIALIZABLE = "job_serializable";

    private Job mJob = null;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public JobDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_JOB_ID)) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_job_detail, container, false);

        ImageView imageViewCompanyLogo = (ImageView) rootView.findViewById(R.id.img_company_logo);
        TextView textCompany = (TextView) rootView.findViewById(R.id.textCompany);
        TextView textTitle = (TextView) rootView.findViewById(R.id.textTitle);
        TextView textLocation = (TextView) rootView.findViewById(R.id.textLocation);
        TextView textDescription = (TextView) rootView.findViewById(R.id.textDescription);
        Button btnViewMore = (Button) rootView.findViewById(R.id.btn_view_more);

        if (getArguments().containsKey(ARG_JOB_SERIALIZABLE)) {
            mJob = (Job)getArguments().getSerializable(ARG_JOB_SERIALIZABLE);
            Picasso.with(getActivity()).load(mJob.getCompany_logo()).into(imageViewCompanyLogo);
            textCompany.setText(mJob.getCompany());
            textTitle.setText(mJob.getTitle());
            textLocation.setText(mJob.getLocation());
            textDescription.setText(Html.fromHtml(mJob.getDescription()));

            btnViewMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(mJob.getUrl()));
                    getActivity().startActivity(i);
                }
            });
        }


        return rootView;
    }
}
