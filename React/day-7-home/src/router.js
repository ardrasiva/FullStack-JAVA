import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import CreateProduct from "./components/product/CreateProduct";
import EditProduct from "./components/product/EditProduct";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App />
    },
    {
        path: "/products/create",
        element: <CreateProduct />
    },
    {
        path: "/products/:productId/edit",
        element: <EditProduct />
    }
]);

export default router;