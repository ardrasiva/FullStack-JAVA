import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
import ProductListItem from "./ProductListItem";

function ListProducts() {
    var [allProducts, setAllProducts] = useState([]);
    var [filteredProducts, setFilteredProducts] = useState([]);
    var [searchTerm, setSearchTerm] = useState("");

    function fetchProducts() {
        axios.get("https://worksheet-catalogue.mashupstack.com/products")
        .then(response => {
            setAllProducts(response.data);
            setFilteredProducts(response.data);
        });
    }

    useEffect(() => {
        fetchProducts();
    }, []);

    function handleSearchInputChange(event) {
        var value = event.target.value;

        setSearchTerm(value);

        var filtered = allProducts.filter(product =>
            product.name.toLowerCase().includes(value.toLowerCase())
        );

        setFilteredProducts(filtered);
    }

    return (
        <div className="container mt-4">

            <h1 className="text-center">Product Catalog</h1>

            <div className="row mb-3">
                <div className="col-8">
                    <input
                        type="text"
                        className="form-control"
                        placeholder="Search product"
                        value={searchTerm}
                        onChange={handleSearchInputChange}/>
                </div>

                <div className="col-4">
                    <Link
                        to="/products/create"
                        className="btn btn-primary">
                        Add Product
                    </Link>
                </div>
            </div>

            {filteredProducts.length === 0 ? (<h3>No products found</h3>) : (filteredProducts.map(product =>
                    <ProductListItem
                        key={product.id}
                        product={product}
                        refresh={fetchProducts}/>
                )
            )}
        </div>
    );
}

export default ListProducts;