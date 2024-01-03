import Header from "./Header"
import Body from "./Body"
import Button from "./Button"
import { useTheme } from "../contexts/ThemeContext";

export function Page() {
    const { theme } = useTheme();
  return (
    <div
    style={{height:"100vh", 
        backgroundColor: theme === "light" ? "white" : "black",
                   color: theme === "light"? "black" : "white"}}>
      <Header />
      <Body />
      <Button />
    </div>
  );
}
