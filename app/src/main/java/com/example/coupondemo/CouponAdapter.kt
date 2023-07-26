package com.example.coupondemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CouponAdapter(val coupon: ArrayList<Coupon>): RecyclerView.Adapter<CouponAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val code:TextView = itemView.findViewById(R.id.couponCode)
        val off:TextView = itemView.findViewById(R.id.percentOff)
        val date:TextView = itemView.findViewById(R.id.couponCodeDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coupon.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = coupon[position]
        holder.code.text = item.couponCode
        holder.date.text = item.couponDate
        holder.off.text = item.percentageOff
    }
}