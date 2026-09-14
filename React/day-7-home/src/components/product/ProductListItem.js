import React from "react";
import { Link } from "react-router-dom";
import axios from "axios";

function ProductListItem(props) {

    function deleteProduct() {
        axios.delete(
            "https://worksheet-catalogue.mashupstack.com/products/" + props.product.id
        )
        .then(response => {
            alert("Product Deleted");
            props.refresh();
        });
    }

    return (
        <div className="card mb-3">
            <div className="card-body">
                <h4>{props.product.name}</h4>
                <p>Price: {props.product.price}</p>
                <p>Category: {props.product.category}</p>
                <p>Available Quantity: {props.product.quantity}</p>

                <Link
                    to={"/products/" + props.product.id + "/edit"}
                    className="btn btn-primary me-2">
                    Edit
                </Link>

                <button className="btn btn-danger" onClick={deleteProduct}>
                    Delete
                </button>

            </div>
        </div>
    );
}

export default ProductListItem;