
import { ThemeProvider } from "./contexts/ThemeContext";
import { Page } from "./components/Page";

function App() {
  return (
    <>
      <ThemeProvider>
        <Page/>
      </ThemeProvider>
    </>
  );
}

export default App;
