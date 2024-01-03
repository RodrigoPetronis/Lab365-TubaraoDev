import { useTheme } from "../contexts/ThemeContext";

export default function Body() {
  const {theme} = useTheme();
  return (
    <>
      <p
      style={{backgroundColor: theme === "light"? "white":"black",
              color: theme === "light"? "black": "white"}}>
        Mussum Ipsum, cacilds vidis litro abertis. A ordem dos tratores não
        altera o pão duris. Praesent vel viverra nisi. Mauris aliquet nunc non
        turpis scelerisque, eget. Sapien in monti palavris qui num significa
        nadis i pareci latim. Casamentiss faiz malandris se pirulitá.
      </p>
      <br />
    </>
  );
}
