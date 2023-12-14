import { useState } from "react";

function LikeButton () {
    const [likes, setLikes]=useState(0);

    return ( 
        <div>
        <button onClick={() => setLikes((likes) => likes + 1)}>
          👍 Likes 
        </button>
        <button onClick={() => setLikes((likes) => likes - 1)}>
        👎 Dislike
        </button>
        <h2>Likes = {likes}</h2>
      </div>
     );
}

export default LikeButton ;