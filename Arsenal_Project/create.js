function getValue(selection) {
    console.log(selection.value);
    return selection.value;
  }

//Slider attack Value
var slider1 = document.getElementById("inputAttack");
var output1 = document.getElementById("stat1");
output1.innerHTML = slider1.value;

slider1.oninput = function() {
  output1.innerHTML = this.value;
}

//Slider defence Value
var slider2 = document.getElementById("inputDefence");
var output2 = document.getElementById("stat2");
output2.innerHTML = slider2.value;

slider2.oninput = function() {
  output2.innerHTML = slider2.value;
}

function SaveStats() {
let Playerno = document.getElementById("inputPlayerno").value;
let Attack = document.getElementById("inputAttack").value;
let Defence = document.getElementById("inputDefence").value;
var e = document.getElementById("choice");
var playername = e.options[e.selectedIndex].value;
console.log("player name = " + playername)
console.log("player number = " + Playerno)
console.log("player attack stat = " + Attack)
console.log("player defence stat = " + Defence)

fetch(`http://localhost:9001/AddPlayer`, {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        playername: playername,
        playerno: Playerno,
        attack: Attack,
        defence: Defence
    
    })
  })
.then(
function(response) {
if (response.status !== 200) {
console.log('Looks like there was a problem. Status Code: ' +
response.status);
return;
}


    })

}