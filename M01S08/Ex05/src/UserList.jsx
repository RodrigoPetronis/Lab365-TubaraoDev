import { useState } from "react";

const UserList = ()=>{
    const [inputValue, setInputValue] = useState("")
    const [userList, setUserList] = useState([]);

  return (
    <>
    <h2>Lista de Usuários</h2>
      <ul>
        {userList.map((item) => (
          <li key={item}>
            {item}
          </li>
        ))}
      </ul><br/>
      <input
      placeholder="Digite o nome"
      type="text"
      value={inputValue}
      onChange={(e)=>{
      setInputValue(e.target.value)
      }} />
      <button
      type="button"
      onClick={() => {
        setUserList([...userList,inputValue]);
        setInputValue("");
      }}
      >
        Adicionar na Lista
      </button>
    </>
    )
}

export default UserList