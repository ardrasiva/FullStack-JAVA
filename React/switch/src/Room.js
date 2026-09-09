import { useState } from "react"
import LightSwitch from './lightswitch' 

function Room(){
    const [isOn, setIsOn] = useState(false);
    function toggleLight(){
        setIsOn(!isOn);
    }
    return(
        <div style={{backgroundColor : isOn? "white" : "black",
            color : isOn? "black" : "white",
            padding : "30px",
            minHeight: "100vh"
        }}>
            <h1>
                {isOn? "Room is bright" : "Room is dark."}
            </h1>

            <LightSwitch isOn = {isOn} toggleLight = {toggleLight}/>
        </div>
        
    );
}
export default Room;