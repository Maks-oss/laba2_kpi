package kpi.laba2.utils

import kpi.laba2.builder.PostPackage
import kpi.laba2.specification.PriceSpecification
import kpi.laba2.specification.SizeSpecification
import kpi.laba2.specification.Specification
import kpi.laba2.specification.WeightSpecification

fun getSpecification(packageWeight: String?, packageSize: String?, packagePrice: String?): Specification<PostPackage> {
    return when {
        !packageWeight.isNullOrEmpty() && !packageSize.isNullOrEmpty() && !packagePrice.isNullOrEmpty() ->
            WeightSpecification(packageWeight)
                    .And(SizeSpecification(packageSize))
                    .And(PriceSpecification(packagePrice))
        !packageWeight.isNullOrEmpty() && !packageSize.isNullOrEmpty() -> WeightSpecification(packageWeight)
                .And(SizeSpecification(packageSize))
        !packageSize.isNullOrEmpty() && !packagePrice.isNullOrEmpty() -> SizeSpecification(packageSize).And(PriceSpecification(packagePrice))
        !packageWeight.isNullOrEmpty() && !packagePrice.isNullOrEmpty() -> WeightSpecification(packageWeight).And(PriceSpecification(packagePrice))
        !packageWeight.isNullOrEmpty() -> WeightSpecification(packageWeight)
        !packageSize.isNullOrEmpty() -> SizeSpecification(packageSize)
        !packagePrice.isNullOrEmpty() -> PriceSpecification(packagePrice)
        else -> throw UnsupportedOperationException("All queries are empty or null")
    }

}