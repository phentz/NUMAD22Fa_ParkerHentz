package edu.northeastern.numad22fa_parkerhentz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * This is a recyclerview adapter class, the purpose of this class is to act as a bridge between the
 * collection (arraylist) and the view (recyclerview). This class provides 3 methods that are
 * utilised for binding the data to the view. The explanation of each method is provided in comments
 * within the methods.
 */
public class siteAdapter extends RecyclerView.Adapter<SiteViewHolder> {

    private final List<Person> people;
    private final Context context;

    /**
     * Creates a PersonAdapter with the provided arraylist of Person objects.
     *
     * @param people    arraylist of person object.
     * @param context   context of the activity used for inflating layout of the viewholder.
     */
    public siteAdapter(List<Person> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @NonNull
    @Override
    public SiteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create an instance of the viewholder by passing it the layout inflated as view and no root.
        return new SiteViewHolder(LayoutInflater.from(context).inflate(R.layout.item_person, null));
    }

    @Override
    public void onBindViewHolder(@NonNull SiteViewHolder holder, int position) {
        // sets the name of the person to the name textview of the viewholder.
        holder.name.setText(people.get(position).getName());
        // sets the age of the person to the age textview of the viewholder.
        holder.age.setText(String.valueOf(people.get(position).getAge()));

        // set a click event on the whole itemView (every element of the recyclerview).
        holder.itemView.setOnClickListener(view -> {
            Toast.makeText(context, people.get(position).getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        // Returns the size of the recyclerview that is the list of the arraylist.
        return people.size();
    }
}
