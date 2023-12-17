import { useState } from "react";

function TaskList() {
  const [task, setTask] = useState([]);
  const [inputValue, setInputValue] = useState("");

  return (
    <div>
      <h1>Lista de Tarefas</h1>
      <ul>
        {task.map((item) => (
          <li key={item} style={{ fontSize: 25 }}>{item}
          <input type="checkbox" value={false} />
          </li>
        ))}                  
      </ul>
      <label htmlFor="">Digite uma tarefa</label>
      <br />
      <input
        type="text"
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
      />
      <button onClick={() => {
        setTask([...task, inputValue])
        setInputValue("")
        }}>
        Adicionar Tarefa
      </button><br/>
      <button onClick={()=>{
        setTask([])
      }}>
        Limpar
      </button>

      </div>
  );
}

export default TaskList;
