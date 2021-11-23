package kpi.laba2.specification

interface Specification<T> {
    fun isSatisfiedBy(value:T):Boolean
    fun And(specification: Specification<T>):Specification<T>
    fun Or(specification: Specification<T>):Specification<T>
}