package kpi.laba2.services

import kpi.laba2.builder.PostPackage
import org.springframework.web.bind.annotation.RequestParam

interface PackageService {
    fun getPackages(): List<PostPackage>
    fun insertPackage(postPackage: PostPackage)
    fun deletePackageById(id: Int)
}