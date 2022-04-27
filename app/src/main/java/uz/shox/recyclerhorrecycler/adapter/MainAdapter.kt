package uz.shox.recyclerhorrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.recyclerhorrecycler.R
import uz.shox.recyclerhorrecycler.model.User

class MainAdapter(private val context:Context):RecyclerView.Adapter<MainAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.recyclerView1.layoutManager = LinearLayoutManager(context,
            RecyclerView.HORIZONTAL,false)
        val users:ArrayList<User> = ArrayList()
        users.add(User(R.drawable.lambo,"Lambo"))
        users.add(User(R.drawable.ferra,"Ferra"))
        users.add(User(R.drawable.mers,"Mers"))
        users.add(User(R.drawable.bmw,"BMW"))
        users.add(User(R.drawable.lambo,"Lambo"))
        users.add(User(R.drawable.ferra,"Ferra"))
        users.add(User(R.drawable.mers,"Mers"))
        users.add(User(R.drawable.bmw,"BMW"))
        users.add(User(R.drawable.lambo,"Lambo"))
        users.add(User(R.drawable.ferra,"Ferra"))
        users.add(User(R.drawable.mers,"Mers"))
        users.add(User(R.drawable.bmw,"BMW"))
        val userAdapter = UserAdapter(context,users)
        holder.recyclerView1.adapter = userAdapter
    }

    override fun getItemCount(): Int {
        return 10
    }

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recyclerView1 = itemView.findViewById<RecyclerView>(R.id.recyclerView1)
    }
}