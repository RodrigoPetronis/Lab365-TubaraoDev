import { useState } from "react";

const PostWithComments = () => {
    const [inputValue, setInputValue] = useState("");
    const [comment, setComment] = useState([]);

    return ( 
        <div>
        <h1>Redes Sociais</h1>
        <img
          style={{ maxWidth: "500px" }}
          src="https://images.tech.co/wp-content/uploads/2022/10/14123538/socialmedia-1-1024x512.jpg"
          alt="post"
        />
        <br />
        <label 
        style={{fontSize:"30px", color:"black"}}
        htmlFor="">Deixe seu Comentário</label>
        <br />
        <input
        style={{margin:"10px",height:"25px"}}
          type="text"
          value={inputValue}
          onChange={(e) => setInputValue(e.target.value)}
        />
        <button
        style={{backgroundColor:"lightBlue"}}
          onClick={() => {
            setComment([...comment, inputValue]);
            setInputValue("");
          }}
        >
          Adicionar
        </button>
        <button
        style={{backgroundColor:"pink", margin:"5px"}}
          onClick={() => {
            setComment([]);
          }}
        >
          Limpar
        </button>
        <ul 
        style={{ listStyle: "none", fontSize:"25px", color:"black" }}>
          {comment.map((item) => (
            <li key={item}>{item}</li>
          ))}
        </ul>
        </div>
     );
}

export default PostWithComments;