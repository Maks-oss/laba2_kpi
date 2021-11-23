package kpi.laba2.services

import kpi.laba2.builder.PostPackage
import kpi.laba2.chainresponsibility.PackageHandler
import org.springframework.stereotype.Service

@Service
class PackageServiceImpl : PackageService {
    private val postHandler = PackageHandler()

    override fun getPackages(): List<PostPackage> {
        return postHandler.collectPackages()
    }

    override fun insertPackage(postPackage: PostPackage) {
        postHandler.insertPackage(postPackage)
    }


    override fun deletePackageById(id: Int) {
        postHandler.deletePackageById(id)
    }

}