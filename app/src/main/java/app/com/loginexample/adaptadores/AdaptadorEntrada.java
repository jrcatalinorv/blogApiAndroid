package app.com.loginexample.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import app.com.loginexample.R;
import app.com.loginexample.entidades.Entradas;

public class AdaptadorEntrada extends RecyclerView.Adapter<AdaptadorEntrada.ViewHolder>
        {

    public List<Entradas> dataPost;


    public AdaptadorEntrada(List<Entradas> dataPost){
        this.dataPost = dataPost;
    }

    @NonNull
    @Override
    public AdaptadorEntrada.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorEntrada.ViewHolder holder, int position) {

        Entradas entradas = dataPost.get(position);

        holder.title.setText(entradas.getTitle());
       holder.body.setText(entradas.getBody());
       holder.user.setText("By: "+ entradas.getUserName());
       holder.date.setText("");
       holder.tags.setText("Tags: ");
       holder.comments.setText(String.valueOf(entradas.getComments()));
       holder.likes.setText(String.valueOf(entradas.getLikes()));
       holder.viewsCty.setText(String.valueOf(entradas.getViews()));
    }

    @Override
    public int getItemCount() { return dataPost.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, body, user, date, tags, comments, likes, viewsCty;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvTitle);
            body = itemView.findViewById(R.id.tvTextBody);
            user = itemView.findViewById(R.id.tvUser);
            date = itemView.findViewById(R.id.tvDate);
            tags = itemView.findViewById(R.id.tvTags);
            comments = itemView.findViewById(R.id.tvComments);
            comments.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_comment, 0, 0, 0);
            likes = itemView.findViewById(R.id.tvLikes);
            likes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_like, 0, 0, 0);
            viewsCty = itemView.findViewById(R.id.tvViews);
            viewsCty.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_views, 0, 0, 0);
        }

    }

}







