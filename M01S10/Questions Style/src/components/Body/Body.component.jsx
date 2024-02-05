import "./Body.style.css";
import { GiCagedBall } from "react-icons/gi";
import { IoChevronBack } from "react-icons/io5";

const cards = [
  {
    name: "Beginner",
  },
  {
    name: "Experiences",
  },
  {
    name: "Advanced",
  },
];

export const Body = () => {
  return (
    <div className="containerBody">
      <div id="containerBodyUp">
        <div className="container2Body">
          <span id="title1Body">Question 2</span>
          <span id="title2Body">What's your estimate skill level?</span>
        </div>
      </div>
      <div id="containerCards">
        {cards.map((e, index) => (
          <div id="card" className="cardContainerClass">
            <span id="iconBall" className="cardContainerClass">
              <GiCagedBall />
            </span>
            <span id="titleCard" className="cardContainerClass">
              {e.name}
            </span>
          </div>
        ))}
        
      </div>
      <div id="containerPagination">
        <IoChevronBack/>
        <button id="buttonPagination">Next</button>
      </div>
    </div>
  );
};
