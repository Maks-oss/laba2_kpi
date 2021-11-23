package kpi.laba2.services

import kpi.laba2.builder.PostPackage
import kpi.laba2.chainresponsibility.Package2Handler
import org.springframework.stereotype.Service

@Service
class PackageService2Impl : PackageService {
    private val post2Handler = Package2Handler()

    override fun getPackages(): List<PostPackage> {
        return post2Handler.collectPackages()
    }

    override fun insertPackage(postPackage: PostPackage) {
        post2Handler.insertPackage(postPackage)
    }


    override fun deletePackageById(id: Int) {
        post2Handler.deletePackageById(id)
    }

}