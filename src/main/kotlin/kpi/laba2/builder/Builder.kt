package kpi.laba2.builder

interface Builder {

    fun setPackageId(id:Int)
    fun setWorkerId(id:Int)
    fun setSenderAddress(addres:String)
    fun setReceiverAddress(addres:String)
    fun setSendType(addres:String)
    fun setPackageWeight(weight:Int)
    fun setPackageSize(size:Int)
    fun setPackagePrice(price:Int)
}