package com.example.coupondemo

data class Coupon(
    val id:Int,
    val couponCode: String,
    val percentageOff:String,
    val couponDate: String,
    val isRedeemed:Boolean
)

fun getCouponDetail(): ArrayList<Coupon>{
    val coupon = ArrayList<Coupon>()
    coupon.add(Coupon(1,"Code: SDFDF21D5F", "65% OFF","25-JUNE", true))
    coupon.add(Coupon(2,"Code: DFGFGFG656", "25% OFF","13-MAY", false))
    coupon.add(Coupon(3,"Code: GVBEHD4@#F", "60% OFF","17-APR", false))
    coupon.add(Coupon(4,"Code: KMHFFJ526&", "50% OFF","28-JAN", true))
    coupon.add(Coupon(5,"Code: SDFDF21D5F", "16% OFF","20-JUNE",false))
    coupon.add(Coupon(6,"Code: NHFG&%$#JD", "45% OFF","19-DEC",true))
    return coupon
}