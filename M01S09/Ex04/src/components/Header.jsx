import { useTheme } from "../contexts/ThemeContext";

export default function Header() {
  const { theme } = useTheme();

  return (
    <>
      <h1 style={{ backgroundColor: theme === "light" ? "white" : "black",
                   color: theme === "light"? "black" : "white"}}>
        Exercício sobre useContext --Tema Claro e Escuro--
      </h1>
    </>
  );
}
