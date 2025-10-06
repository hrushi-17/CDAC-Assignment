import { useEffect, useState } from "react"
import axios from "axios";

const GetData = () => {

    const [data, setData] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {

        axios
            .get("https://jsonplaceholder.typicode.com/posts")
            .then((response) => {
                setData(response.data);
            })
            .catch((err) => {
                setError(err.message)
            });

    }, [])

    if (error) return <div>Error: {error}</div>

    return (
        <>
            <h1>Post1</h1>
            <ul>
                {data.map((post) => {
                    return <li key={post.id}>{post.title}</li>
                })}
            </ul>

            <ul>
                {data.map((post) => (
                    <li key={post.id}>
                        {Object.entries(post).map(([key, value]) => (
                            <div key={key}>
                                <strong>{key}:</strong> {value.toString()}
                            </div>
                        ))}
                        <hr />
                    </li>
                ))}
            </ul>

        </>

    )
}

export default GetData;