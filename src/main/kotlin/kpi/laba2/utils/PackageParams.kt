package kpi.laba2.utils

import kpi.laba2.builder.PostPackage
import java.sql.Types

fun getPostPackageParams(postPackage: PostPackage) = arrayOf<Any>(
        postPackage.packageid,
        postPackage.workerid,
        postPackage.senderaddress,
        postPackage.receiveraddress,
        postPackage.sendtype,
        postPackage.packageweight,
        postPackage.packagesize,
        postPackage.price
)

val postPackageTypes = intArrayOf(
        Types.SMALLINT,
        Types.SMALLINT,
        Types.VARCHAR,
        Types.VARCHAR,
        Types.VARCHAR,
        Types.INTEGER,
        Types.INTEGER,
        Types.INTEGER
)