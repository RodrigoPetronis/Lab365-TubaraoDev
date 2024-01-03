import { useContext } from "react";
import {useTheme} from "../contexts/ThemeContext"

export default function Button() {
    const {theme, toogleTheme} = useTheme();

  return (
    <>
      <button
        style={{
          backgroundColor: theme === "light" ? "white" : "black",
          color: theme === "light" ? "black" : "white",
        }}
        onClick={() => toogleTheme()}
      >
        Mudar Tema
      </button>
    </>
  );
}
