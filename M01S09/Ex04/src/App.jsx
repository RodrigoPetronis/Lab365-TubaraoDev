import Header from "./components/Header";
import Body from "./components/Body";
import Button from "./components/Button";
import { ThemeProvider } from "./contexts/ThemeContext";

function App() {
  return (
    <>
      <ThemeProvider>
        <Header />
        <Body />
        <Button />
      </ThemeProvider>
    </>
  );
}

export default App;
