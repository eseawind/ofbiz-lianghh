import javolution.util.FastMap

product = delegator.findOne("Product",[productId:productId],true)

context.productDetail = product
