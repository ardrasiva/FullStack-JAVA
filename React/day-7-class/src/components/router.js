import { createBrowserRouter } from "react-router-dom";
import App from "../App";
import ListBooks from "./book/ListBooks";
import CreateBook from "./book/CreateBook";
import EditBook from "./book/EditBook";

const router = createBrowserRouter([
    {
        path: "/",
        element: <App />
    },
    {
        path: "/books",
        element: <ListBooks />
    },
    {
        path: "/books/create",
        element: <CreateBook />
    },
    {
        path: "/books/:bookId/edit",
        element: <EditBook />
    }
]);

export default router;