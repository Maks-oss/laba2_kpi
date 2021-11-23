package kpi.laba2

import kpi.laba2.builder.PostPackage
import kpi.laba2.services.PackageService2Impl
import kpi.laba2.services.PackageService3Impl
import kpi.laba2.services.PackageServiceImpl
import kpi.laba2.specification.*
import kpi.laba2.utils.PackagePriceOnly
import kpi.laba2.utils.getSpecification
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Laba2Application

fun main(args: Array<String>) {
    runApplication<Laba2Application>(*args)
}

@RestController
class PostController(val service: PackageServiceImpl, val service2: PackageService2Impl, val service3: PackageService3Impl) {
    @GetMapping("/")
    fun getAllPostPackages(
    ): List<PostPackage> {
        return getAllPackages()
    }

    @GetMapping("/search")
    fun getPackagesByQuery(
            @RequestParam(required = false) packageWeight: String?,
            @RequestParam(required = false) packageSize: String?,
            @RequestParam(required = false) packagePrice: String?
    ): List<PostPackage> {
        val specification = getSpecification(packageWeight, packageSize, packagePrice)
        return getAllPackages().filter { specification.isSatisfiedBy(it)}
    }

    @GetMapping("/price-list")
    fun getPackagesPrices(): List<PackagePriceOnly> {
        return getAllPackages().map { PackagePriceOnly(it.packageid, it.price) }
    }

    @GetMapping("/details/{id}")
    fun getDetailedPackage(@PathVariable("id") id: String): PostPackage? {
        return getAllPackages().find { IdSpecification(id).isSatisfiedBy(it) }
    }

    private fun getAllPackages() = mutableListOf<PostPackage>().apply {
        addAll(service.getPackages())
        addAll(service2.getPackages())
        addAll(service3.getPackages())
    }


}