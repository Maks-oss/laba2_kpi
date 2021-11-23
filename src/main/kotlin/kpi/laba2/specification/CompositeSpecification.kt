package kpi.laba2.specification

abstract class CompositeSpecification<T> : Specification<T> {
    abstract override fun isSatisfiedBy(value: T): Boolean
    override fun And(specification: Specification<T>): Specification<T> {
        return AndSpecification(this, specification)
    }

    override fun Or(specification: Specification<T>): Specification<T> {
        return OrSpecification(this, specification)
    }
}

class AndSpecification<T>(private val right: Specification<T>,
                          private val left: Specification<T>) : CompositeSpecification<T>() {
    override fun isSatisfiedBy(value: T): Boolean {
        return left.isSatisfiedBy(value) && right.isSatisfiedBy(value)
    }
}

class OrSpecification<T>(private val right: Specification<T>,
                         private val left: Specification<T>) : CompositeSpecification<T>() {
    override fun isSatisfiedBy(value: T): Boolean {
        return left.isSatisfiedBy(value) || right.isSatisfiedBy(value)
    }

}
