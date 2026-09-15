import axios from "axios";
import { useEffect, useState } from "react";
import { useSelector } from "react-redux";
import checkAuth from "../auth/checkAuth";

function ProductList() {

    var [products, setProducts] = useState([]);

    var user = useSelector(
        store => store.auth.user
    );

    function fetchProducts() {

        axios.get(
            "https://worksheet-product.mashupstack.com/product",
            {
                headers: {
                    Authorization: "Bearer " + user.token
                }
            }
        )
        .then(response => {

            setProducts(response.data);

        });

    }

    useEffect(() => {

        if (user) {
            fetchProducts();
        }

    }, [user]);

    return (
        <div className="container mt-5">

            <h1 className="text-center mb-4">
                Product List
            </h1>

            <table className="table table-bordered">

                <thead>

                    <tr>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Quantity</th>
                    </tr>

                </thead>

                <tbody>

                    {products.map(product => (

                        <tr key={product.id}>

                            <td>
                                {product.name}
                            </td>

                            <td>
                                {product.description}
                            </td>

                            <td>
                                {product.price}
                            </td>

                            <td>
                                {product.quantity}
                            </td>

                        </tr>

                    ))}

                </tbody>

            </table>

        </div>
    );
}

export default checkAuth(ProductList);