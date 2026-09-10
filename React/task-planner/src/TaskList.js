import React from "react";
function taskList(props){
    return(
        <div>
            
            <ul>
                {props.tasks.map((items) => {return <li>{items}</li>})}
            </ul>
            <h3 align="center">{props.message}</h3>
        </div>
    )
}
export default taskList;