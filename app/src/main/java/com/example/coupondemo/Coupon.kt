package com.example.coupondemo

data class Coupon(
    val couponCode: String,
    val percentageOff:String,
    val couponDate: String,
    val isRedeemed:Boolean
)

fun getCouponDetail(): ArrayList<Coupon>{
    val coupon = ArrayList<Coupon>()
    coupon.add(Coupon("SDFDF21D5F", "65%","25-JUNE", true))
    coupon.add(Coupon("DFGFGFG656", "25%","13-MAY", false))
    coupon.add(Coupon("GVBEHD4@#F", "60%","17-APR", false))
    coupon.add(Coupon("KMHFFJ526&", "50%","28-JAN", true))
    coupon.add(Coupon("SDFDF21D5F", "16%","20-JUNE",false))
    coupon.add(Coupon("NHFG&%$#JD", "45%","19-DEC",true))
    return coupon
}