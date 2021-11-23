package kpi.laba2.builder

class PackageBuilder : Builder {
    val postPackage: PostPackage = PostPackage()
    override fun setPackageId(id: Int) {
        postPackage.packageid = id
    }

    override fun setWorkerId(id: Int) {
        postPackage.workerid = id
    }

    override fun setSenderAddress(addres: String) {
        postPackage.senderaddress = addres
    }

    override fun setReceiverAddress(addres: String) {
        postPackage.receiveraddress = addres
    }

    override fun setSendType(addres: String) {
        postPackage.sendtype = addres
    }

    override fun setPackageWeight(weight: Int) {
        postPackage.packageweight = weight
    }

    override fun setPackageSize(size: Int) {
        postPackage.packagesize = size
    }

    override fun setPackagePrice(price: Int) {
        postPackage.price = price
    }
}