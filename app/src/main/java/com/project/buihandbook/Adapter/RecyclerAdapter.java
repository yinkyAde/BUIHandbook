package com.project.buihandbook.Adapter;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.buihandbook.ItemAnimation;
import com.project.buihandbook.activities.MainActivity;
import com.project.buihandbook.activities.sub_activities.Catering_Services;
import com.project.buihandbook.activities.sub_activities.Code_of_Conduct;
import com.project.buihandbook.activities.sub_activities.Conclusion;
import com.project.buihandbook.activities.sub_activities.Counselling_Services;
import com.project.buihandbook.activities.sub_activities.Dress_Code;
import com.project.buihandbook.activities.sub_activities.Drug_Abuse;
import com.project.buihandbook.activities.sub_activities.Halls_of_Residence;
import com.project.buihandbook.activities.sub_activities.Identity_Cards;
import com.project.buihandbook.activities.sub_activities.Matriculation;
import com.project.buihandbook.activities.sub_activities.Payments_of_Fees;
import com.project.buihandbook.activities.sub_activities.Preamble;
import com.project.buihandbook.activities.sub_activities.Registration_of_Students;
import com.project.buihandbook.activities.sub_activities.Resumption_Orientation;
import com.project.buihandbook.activities.sub_activities.Rules_and_Regulations;
import com.project.buihandbook.activities.sub_activities.Sexual_Harassment;
import com.project.buihandbook.activities.sub_activities.Social_Life_On_Campus;
import com.project.buihandbook.activities.sub_activities.Spritual_Life_On_Campus;
import com.project.buihandbook.activities.sub_activities.Student_Discipline;
import com.project.buihandbook.activities.sub_activities.Student_Rep_Council;
import com.project.buihandbook.activities.sub_activities.University_Health_Services;
import com.project.buihandbook.activities.sub_activities.University_Library;
import com.project.buihandbook.activities.sub_activities.Uses_Of_Social_Media;
import com.project.buihandbook.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    // string array for chapters
    private String [] chaptersname ={
            "Preamble",
            "Resumption/Orientation",
            "Registration",
            "Matriculation",
            "Identity Cards",
            "Payments of Fees",
            "Hall of Residence",
            "Catering Services",
            "University Health Services",
            "The University Library",
            "Counselling Services",
            "Code of Conduct",
            "Sexual Harassment",
            "Spiritual Life On Campus",
            "Dress Code",
            "Rules and Regulations",
            "Student Discipline",
            "Social Life On Campus",
            "Drug Abuse",
            "Uses Of Social Media",
            "Student Representative",
            "Conclusion"
    };


    private int[] listimages ={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eights,
            R.drawable.nine,
            R.drawable.ten,
            R.drawable.eleven,
            R.drawable.twelve,
            R.drawable.thirteen,
            R.drawable.fourteen,
            R.drawable.fifteen,
            R.drawable.sixteen,
            R.drawable.seventeen,
            R.drawable.eighteen,
            R.drawable.nineteen,
            R.drawable.twenty,
            R.drawable.twentyone,
            R.drawable.twentytwo

    };

    

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView listimages;
        public TextView chaptersname;

        private final Context context;
                
          //constructor
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            context = itemView.getContext();
            listimages =(ImageView)itemView.findViewById(R.id.listimage);
            chaptersname=(TextView)itemView.findViewById(R.id.chaptersname);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   Intent intent = null;
                    switch(getAdapterPosition()){
                        case 0:
                            intent= new Intent(context, Preamble.class);
                            break;
                        case 1:
                            intent= new Intent(context, Resumption_Orientation.class);
                            break;
                        case 2:
                            intent= new Intent(context, Registration_of_Students.class);
                            break;
                        case 3:
                            intent= new Intent(context, Matriculation.class);
                            break;
                        case 4:
                            intent= new Intent(context, Identity_Cards.class);
                            break;
                        case 5:
                            intent= new Intent(context, Payments_of_Fees.class);
                            break;
                        case 6:
                            intent= new Intent(context, Halls_of_Residence.class);
                            break;
                        case 7:
                            intent= new Intent(context, Catering_Services.class);
                            break;
                        case 8:
                            intent= new Intent(context, University_Health_Services.class);
                            break;
                        case 9:
                            intent= new Intent(context, University_Library.class);
                            break;
                        case 10:
                            intent= new Intent(context, Counselling_Services.class);
                            break;
                        case 11:
                            intent= new Intent(context, Code_of_Conduct.class);
                            break;
                        case 12:
                            intent= new Intent(context, Sexual_Harassment.class);
                            break;
                        case 13:
                            intent= new Intent(context, Spritual_Life_On_Campus.class);
                            break;
                        case 14:
                            intent= new Intent(context, Dress_Code.class);
                            break;
                        case 15:
                            intent= new Intent(context, Rules_and_Regulations.class);
                            break;
                        case 16:
                            intent= new Intent(context, Student_Discipline.class);
                            break;
                        case 17:
                            intent= new Intent(context, Social_Life_On_Campus.class);
                            break;
                        case 18:
                            intent= new Intent(context, Drug_Abuse.class);
                            break;
                        case 19:
                            intent= new Intent(context, Uses_Of_Social_Media.class);
                            break;
                        case 20:
                            intent= new Intent(context, Student_Rep_Council.class);
                            break;
                        case 21:
                            intent= new Intent(context, Conclusion.class);
                            break;
                        case 22:
                            intent= new Intent(context, MainActivity.class);
                            break;
                            
                            
                    }
                    context.startActivity(intent);


                }
            });

        }


    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_chapters_order,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.chaptersname.setText(chaptersname[i]);
        viewHolder.listimages.setImageResource(listimages[i]);

    }

    @Override
    public int getItemCount() {
        return chaptersname.length;
    }


}
