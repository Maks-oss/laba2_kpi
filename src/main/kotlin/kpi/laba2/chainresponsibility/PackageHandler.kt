package kpi.laba2.chainresponsibility

import kpi.laba2.CustomerRowMapper
import kpi.laba2.builder.PostPackage
import kpi.laba2.singleton.DbConnection
import kpi.laba2.utils.getPostPackageParams
import kpi.laba2.utils.postPackageTypes

class PackageHandler:Handler{
    override fun collectPackages(): List<PostPackage> {
        DbConnection.connect("post")
        return DbConnection.jdbcTemplate!!.query("SELECT * FROM package", CustomerRowMapper()) as List<PostPackage>
    }

    override fun insertPackage(postPackage: PostPackage) {
        DbConnection.connect("post")
        DbConnection.jdbcTemplate!!.update("INSERT INTO package VALUES (?,?,?,?,?,?,?,?)", getPostPackageParams(postPackage), postPackageTypes)
    }

    override fun deletePackageById(id: Int) {
        DbConnection.connect("post")
        DbConnection.jdbcTemplate!!.update("DELETE FROM package WHERE packageid=?", id)
    }

}