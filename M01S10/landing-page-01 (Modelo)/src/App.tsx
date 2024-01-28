import { useContext } from "react";
import { Header } from "./components/Header";
import "./styles/global.css";
import { UserContext } from "./contexts/UserContext";
export default function App() {

  const { isLogged, handleLogin, handleLogout, name } = useContext(UserContext);

  return (
    <div>
      <Header />
      {
        isLogged ? (
          <div className="loginCard">
            <span>Olá, {name}</span>
            <h1>Seja muito bem-vindo ao nosso site!</h1>
            <button onClick={() => handleLogout()}>Sair</button>
        </div>
        ) : (
          <div className="loginCard">
        <span>Logue-se na nossa aplicação</span>
        <input type="password" placeholder="senha" />
        {!isLogged ? (
          <button onClick={() => handleLogin()}>Entrar</button>
        ) : (
          <button onClick={() => handleLogout()}>Sair</button>
        )}
      </div>
        )
      }
    </div>
  );
}