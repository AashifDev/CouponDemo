package com.example.coupondemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.DiffUtil.DiffResult
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class CouponAdapter: ListAdapter<Coupon, CouponAdapter.ViewHolder>(DiffUtils()) {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val code:TextView = itemView.findViewById(R.id.couponCode)
        val off:TextView = itemView.findViewById(R.id.percentOff)
        val date:TextView = itemView.findViewById(R.id.couponCodeDate)
        val mainLayout:ConstraintLayout = itemView.findViewById(R.id.mainLayout)
        val text:TextView = itemView.findViewById(R.id.couponCodeRedeem)
        val couponStatus:ConstraintLayout = itemView.findViewById(R.id.couponStatus)

        fun bind(item: Coupon){
            code.text = item.couponCode
            date.text = item.couponDate
            off.text = item.percentageOff
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)

        isRedeemed(holder, item)
    }

    private fun isRedeemed(holder: ViewHolder, item: Coupon) {
        if (item.isRedeemed == true){
            holder.mainLayout.alpha = .5f
        }else{
            holder.couponStatus.visibility = View.GONE
            holder.text.text = "Coupon is available to redeem. You can use to purchase required things. Offer for limited time period only."
        }
    }
    
    class DiffUtils: DiffUtil.ItemCallback<Coupon>(){
        override fun areItemsTheSame(oldItem: Coupon, newItem: Coupon): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Coupon, newItem: Coupon): Boolean {
            return oldItem == newItem
        }
    }
}