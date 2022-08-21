package com.devmuyiwa.chatapp.presentation.main.fragment.viewPager.pagerItem.calls

import android.view.*
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.devmuyiwa.chatapp.R
import com.devmuyiwa.chatapp.domain.model.pager.calls.Call
import de.hdodenhof.circleimageview.CircleImageView

class CallsAdapter : RecyclerView.Adapter<CallsAdapter.MyViewHolder>() {
    private var callList: List<Call>? = null

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: CircleImageView = itemView.findViewById(R.id.user_image)
        val name: TextView = itemView.findViewById(R.id.user_name)
        val type: ImageView = itemView.findViewById(R.id.call_type)
        val date: TextView = itemView.findViewById(R.id.last_call_date)
        val call: ImageButton = itemView.findViewById(R.id.call_contact)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_calls_item, parent,
            false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val callItem = callList?.get(position)
        holder.image.load(callItem?.contactImage)
        holder.name.text = callItem?.contactName
        holder.date.text = callItem?.callDate
        if (callItem?.callType.equals("in")) {
            holder.type.setImageDrawable(ContextCompat.getDrawable(holder.type.context, R
                .drawable.ic_call_received))
            holder.type.drawable.setTint(holder.type.resources.getColor(android.R.color
                .holo_red_dark))
        } else if (callItem?.callType.equals("out")) {
            holder.type.setImageDrawable(ContextCompat.getDrawable(holder.type.context, R
                .drawable.ic_call_made))
            holder.type.drawable.setTint(holder.type.resources.getColor(android.R.color
                .holo_green_dark))
        }
    }
    override fun getItemCount(): Int = callList!!.size

    fun setData(list: List<Call>) {
        this.callList = list
        notifyDataSetChanged()
    }
}