import { useEffect } from "react";
import axios from "axios";

import { useDispatch, useSelector } from "react-redux";
import { setProducts } from "../../store/productSlice";

import { Link, useNavigate } from "react-router-dom";

function ProductList() {

    const dispatch = useDispatch();
    const navigate = useNavigate();

    const user = useSelector(store => store.auth.user);
    const products = useSelector(store => store.product.products);

    useEffect(() => {

        if (!user) {
            navigate("/login");
            return;
        }

        axios.get(
            "https://worksheet-product.mashupstack.com/product",
            {
                headers: {
                    Authorization: "Bearer " + user.token
                }
            }
        )
        .then(response => {

            console.log(response.data);

            dispatch(setProducts(response.data));

        })
        .catch(error => {

            console.log(error.response);

        });

    }, [user, dispatch, navigate]);

    return (
        <div className="container mt-5">

            <h1>Product List</h1>

            <ul>

                {products.map(product => (

                    <li key={product.id} className="mb-3">

                        <strong>{product.name}</strong>

                        <Link
                            to={"/product/" + product.id}
                            className="btn btn-primary btn-sm ms-3"
                        >
                            View
                        </Link>

                    </li>

                ))}

            </ul>

        </div>
    );
}

export default ProductList;