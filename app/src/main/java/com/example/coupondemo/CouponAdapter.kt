package com.example.coupondemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CouponAdapter(val coupon: ArrayList<Coupon>): RecyclerView.Adapter<CouponAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val code:TextView = itemView.findViewById(R.id.couponCode)
        val off:TextView = itemView.findViewById(R.id.percentOff)
        val date:TextView = itemView.findViewById(R.id.couponCodeDate)
        val mainLayout:ConstraintLayout = itemView.findViewById(R.id.mainLayout)
        val text:TextView = itemView.findViewById(R.id.couponCodeRedeem)
        val couponStatus:ConstraintLayout = itemView.findViewById(R.id.couponStatus)
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
}