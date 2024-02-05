import { AiOutlineSearch } from "react-icons/ai";
import './Header.style.css'

export const Header = () => {
  return (
    <nav>
      <div id="itens">
        <span id="logoHeader">YOUR LOGO</span>
      </div>
      <div id="itens">
      <span id="menu1">MENU 1</span>
      <span id="menu2">MENU 2</span>
      <span id="menu3">MENU 3</span>
      <span id="menu4">MENU 4</span>
      <span id="menu5">MENU 5</span>
      </div>
      <div id="itens">
      <span id="find"><AiOutlineSearch /></span>
      <span id="touch">GET IN TOUCH</span>
      </div>
    </nav>
  );
};
