package kpi.laba2

import kpi.laba2.builder.PostPackage
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet
import java.sql.SQLException


class CustomerRowMapper : RowMapper<PostPackage> {
    @Throws(SQLException::class)
    override fun mapRow(rs: ResultSet, rowNum: Int): PostPackage {
        return PostPackage(
                packageid = rs.getInt("packageid"),
                senderaddress = rs.getString("senderaddress"),
                receiveraddress = rs.getString("receiveraddress"),
                workerid = rs.getInt("workerid"),
                sendtype = rs.getString("sendtype"),
                packagesize = rs.getInt("packagesize"),
                packageweight = rs.getInt("packageweight"),
                price = rs.getInt("packageprice")
        )
    }
}