document.getElementById('inputPlayername').onchange = function() {
    alert(this.value);
  }

function SaveStats() {
let playername = document.getElementById("playername").value;
let Attack = document.getElementById(Attack).value;

fetch(`http://localhost:9001/ShowStat`, {
metod:"POST",
headers: {
    "content-Type": "application/json"
},
body: JSON.stringify({
    playername: playername,
    attack: Attack,


})

}
.then(
function(response) {
    if (response.status !== 200)
    console.log('looks like there was a problem Status Code: ' + response.status)
    return;
}

)

}