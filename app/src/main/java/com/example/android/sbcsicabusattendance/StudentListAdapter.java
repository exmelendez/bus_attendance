package com.example.android.sbcsicabusattendance;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentListAdapter extends ArrayAdapter<Student> {

    private static final String TAG = "StudentListAdapter";
    private Context mContext;
    private int mResource;
//    private int lastPosition = -1;


    static class ViewHolder {
        TextView lastName;
        TextView firstName;
        TextView grade;
        TextView legalClass;
        TextView parentName;
        TextView parentPhone;

    }

    public StudentListAdapter(Context context, int resource, ArrayList<Student> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //get the student's information
        String lastName = getItem(position).getLastName();
        String firstName = getItem(position).getFirstName();
        String grade = getItem(position).getGrade();
        String legalClass = getItem(position).getLegalClass();
        String parentName = getItem(position).getParentName();
        String parentPhone = getItem(position).getParentPhone();

        //create the student object with the information
        Student student = new Student(lastName, firstName, grade, legalClass, parentName, parentPhone);

        //create the view result for showing the animation
//        final View result;

        //Viewholder object
        ViewHolder holder;

        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

            holder = new ViewHolder();
            holder.lastName = (TextView) convertView.findViewById(R.id.lname_tv);
            holder.firstName = (TextView) convertView.findViewById(R.id.fname_tv);
            holder.grade = (TextView) convertView.findViewById(R.id.grade_tv);
            holder.legalClass = (TextView) convertView.findViewById(R.id.legal_class_tv);
            holder.parentName = (TextView) convertView.findViewById(R.id.parent_name_tv);
            holder.parentPhone = (TextView) convertView.findViewById(R.id.parent_phone_tv);

//            result = convertView;
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
//            result = convertView;
        }

        //Where the animation is initilalized & created
//        Animation animation = AnimationUtils.loadAnimation(mContext,
//                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
//        result.startAnimation(animation);
//        lastPosition = position;

        holder.lastName.setText(lastName);
        holder.firstName.setText(firstName);
        holder.grade.setText(grade);
        holder.legalClass.setText(legalClass);
        holder.parentName.setText(parentName);
        holder.parentPhone.setText(parentPhone);

        return convertView;

    }

}
