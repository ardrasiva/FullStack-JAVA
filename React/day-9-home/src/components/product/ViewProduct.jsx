import { useSelector } from "react-redux";
import { useParams } from "react-router-dom";

function ViewProduct() {

    const { id } = useParams();

    const products = useSelector(
        store => store.product.products
    );

    const product = products.find(
        item => item.id.toString() === id
    );

    if (!product) {
        return (
            <div className="container mt-5">
                <h1>Product not found</h1>
            </div>
        );
    }

    return (
        <div className="container mt-5">

            <h1>{product.name}</h1>

            <p>
                <strong>Description:</strong> {product.description}
            </p>

            <p>
                <strong>Price:</strong> {product.price}
            </p>

            <p>
                <strong>Quantity:</strong> {product.quantity}
            </p>

        </div>
    );
}

export default ViewProduct;