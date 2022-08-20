package com.devmuyiwa.chatapp.presentation.fragment.viewPager.pagerItem.chats

import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.domain.model.pager.chats.Chat
import de.hdodenhof.circleimageview.CircleImageView

class ChatsAdapter: RecyclerView.Adapter<ChatsAdapter.MyViewHolder>() {
    private var chatList: List<Chat>? = null
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: CircleImageView = itemView.findViewById(R.id.user_image)
        val name: TextView = itemView.findViewById(R.id.user_name)
        val message: TextView = itemView.findViewById(R.id.last_message)
        val date: TextView = itemView.findViewById(R.id.last_message_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_chats_item, parent,
            false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val chatItem = chatList?.get(position)
        holder.image.load(chatItem?.contactImage)
        holder.name.text = chatItem?.contactName
        holder.message.text = chatItem?.lastMessage
        holder.date.text = chatItem?.timeOfLastMessage
    }

    override fun getItemCount(): Int = chatList!!.size

    fun setData(list: List<Chat>){
        this.chatList = list
        notifyDataSetChanged()
    }
}