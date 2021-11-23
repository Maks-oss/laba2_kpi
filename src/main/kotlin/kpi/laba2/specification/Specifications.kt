package kpi.laba2.specification

import kpi.laba2.builder.PostPackage

class SizeSpecification(private val size: String?) : CompositeSpecification<PostPackage>() {
    override fun isSatisfiedBy(value: PostPackage): Boolean {
        return size == value.packagesize.toString()
    }
}
class IdSpecification(private val id: String?) : CompositeSpecification<PostPackage>() {
    override fun isSatisfiedBy(value: PostPackage): Boolean {
        return id == value.packageid.toString()
    }
}
class PriceSpecification(private val price: String?) : CompositeSpecification<PostPackage>() {
    override fun isSatisfiedBy(value: PostPackage): Boolean {
        return price == value.price.toString()
    }
}



class WeightSpecification(private val weight: String?) : CompositeSpecification<PostPackage>() {
    override fun isSatisfiedBy(value: PostPackage): Boolean {
        return weight == value.packageweight.toString()
    }
}