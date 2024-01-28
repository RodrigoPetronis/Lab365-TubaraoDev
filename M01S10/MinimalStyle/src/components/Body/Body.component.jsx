import "./Body.style.css";
import { IoIosPerson } from "react-icons/io";

export const Body = () => {
  const employers = [
    { name: "Kyle Edwards", title: "Managing Assistant" },
    { name: "Ann Warren", title: "Manager" },
    { name: "Tomothy Pena", title: "Agent" },
    { name: "Serenity Henry", title: "Designer" },
    { name: "Arlene Russel", title: "User Research" },
    { name: "Rodrigo Petronis", title: "Software Enginner"}
  ];

  return (
    <div className="containerBody">
      <div id="containerBodyUp">
        <div className="container2Body">
          <span id="title1Body">Team Members</span>
          <span id="title2Body">Select a team member to view profile</span>
        </div>
        <div id="containerSort">
          <span id="sortName">Sort By Name</span>
          <span id="sortDate">Sort By Date</span>
        </div>
      </div>
      <div id="containerCards">
        {employers.map((e,index) => (
          <div id="card" key={index}>
            <span id="iconPerson">
              <IoIosPerson />
            </span>
            <span id="titleCard">{e.title}</span>
            <span id="nameCard">{e.name}</span>
          </div>
        ))}

      </div>
    </div>
  );
};
