function getValue(selection) {
    console.log(selection.value);
    return selection.value;
  }

function SaveStats() {
let inputPlayerno = document.getElementById("inputPlayerno").value;
let inputAttack = document.getElementById("inputAttack").value;
let inputDefence = document.getElementById("inputDefence").value;
var e = document.getElementById("choice");
var struser = e.options[e.selectedIndex].value
console.log(struser)
console.log(inputPlayerno)
console.log(inputAttack)
console.log(inputDefence)
}
fetch(`http://localhost:9001/AddPlayer`, {
metod:"POST",
headers: {
    "content-Type": "application/json"
},
body: JSON.stringify({
    playername: inputplayername,
    playerno: inputPlayerno,
    attack: inputAttack,
    defence: inputDefence


})

}
.then(
function(response) {
    if (response.status !== 200)
    console.log('looks like there was a problem Status Code: ' + response.status)
    return;
}))
console.log("player added")
