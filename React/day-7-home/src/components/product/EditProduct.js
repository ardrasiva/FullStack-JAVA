import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function EditProduct() {

    var { productId } = useParams();

    var [name, setName] = useState("");
    var [price, setPrice] = useState("");
    var [category, setCategory] = useState("");
    var [quantity, setQuantity] = useState("");

    var navigate = useNavigate();

    function fetchProduct() {

        axios.get(
            "https://worksheet-catalogue.mashupstack.com/products/" + productId
        )
        .then(response => {

            setName(response.data.name);
            setPrice(response.data.price);
            setCategory(response.data.category);
            setQuantity(response.data.quantity);

        });
    }

    useEffect(() => {
        fetchProduct();
    }, []);

    function updateProduct() {

        var product = {
            name: name,
            price: price,
            category: category,
            quantity: quantity
        };

        axios.put(
            "https://worksheet-catalogue.mashupstack.com/products/" + productId,
            product
        )
        .then(response => {
            alert("Product Updated");
            navigate("/");
        });
    }

    return (
        <div className="container mt-4">

            <div className="row">
                <div className="col-8 offset-2">

                    <h1 className="text-center">
                        Edit Product
                    </h1>

                    <div className="mb-3">
                        <label>Product Name:</label>

                        <input
                            type="text"
                            className="form-control"
                            value={name}
                            onChange={(event) => {
                                setName(event.target.value);
                            }}
                        />
                    </div>

                    <div className="mb-3">
                        <label>Price:</label>

                        <input
                            type="number"
                            className="form-control"
                            value={price}
                            onChange={(event) => {
                                setPrice(event.target.value);
                            }}
                        />
                    </div>

                    <div className="mb-3">
                        <label>Category:</label>

                        <input
                            type="text"
                            className="form-control"
                            value={category}
                            onChange={(event) => {
                                setCategory(event.target.value);
                            }}
                        />
                    </div>

                    <div className="mb-3">
                        <label>Quantity:</label>

                        <input
                            type="number"
                            className="form-control"
                            value={quantity}
                            onChange={(event) => {
                                setQuantity(event.target.value);
                            }}
                        />
                    </div>

                    <button
                        className="btn btn-success"
                        onClick={updateProduct}
                    >
                        Update Product
                    </button>

                </div>
            </div>

        </div>
    );
}

export default EditProduct;