import { createBrowserRouter } from "react-router-dom";

import App from "./App";

import Register from "./components/auth/Register";
import Login from "./components/auth/Login";

import ProductList from "./components/product/ProductList";
import ViewProduct from "./components/product/ViewProduct";

const router = createBrowserRouter([

    {
        path: "/",
        element: <App />
    },

    {
        path: "/register",
        element: <Register />
    },

    {
        path: "/login",
        element: <Login />
    },

    {
        path: "/products",
        element: <ProductList />
    },

    {
        path: "/product/:id",
        element: <ViewProduct />
    }

]);

export default router;