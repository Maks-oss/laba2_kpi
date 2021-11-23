package kpi.laba2.services

import kpi.laba2.builder.PostPackage
import kpi.laba2.chainresponsibility.Package3Handler
import kpi.laba2.specification.IdSpecification
import org.springframework.stereotype.Service

@Service
class PackageService3Impl:PackageService {
    private val post3Handler = Package3Handler()

    override fun getPackages(): List<PostPackage> {
        return post3Handler.collectPackages()
    }

    override fun insertPackage(postPackage: PostPackage) {
        post3Handler.insertPackage(postPackage)
    }


    override fun deletePackageById(id: Int) {
        post3Handler.deletePackageById(id)
    }
}