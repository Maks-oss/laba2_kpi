package kpi.laba2.chainresponsibility

import kpi.laba2.builder.PostPackage

interface Handler {
    fun collectPackages():List<PostPackage>
    fun insertPackage(postPackage: PostPackage)
    fun deletePackageById(id: Int)
}