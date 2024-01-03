import {useTheme} from "../contexts/ThemeContext"

export default function Button() {
    const {toogleTheme} = useTheme();

  return (
    <>
      <button
        onClick={() => toogleTheme()}
      >
        Mudar Tema
      </button>
    </>
  );
}
