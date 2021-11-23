package kpi.laba2.builder

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table



@Table("Package")
data class PostPackage(
        @Id
        var packageid:Int=0,
        var workerid:Int=0,
        var senderaddress: String="",
        var receiveraddress:String="",
        var sendtype:String="",
        var packageweight:Int=0,
        var packagesize:Int=0,
        var price:Int=0,

)