function ShowTeam() {
    document.getElementById("tbody").innerHTML="";
    fetch()
    .then(
    function(response) {
    if (response.status !== 200) {
    console.log('Looks like there was a problem. Status Code: ' +
    response.status);
    return;
    }
    response.json().then(function(data) {
        console.log(data);
        for (let i = 0; i < 5; i++) {
        console.log(data.results[i].playername);
        console.log(data.results[i].playerno);
        console.log(data.results[i].Attack);
        console.log(data.results[i].Defence);

        let para = document.createElement("P");
        let tbody = document.getElementById("tbody") // Create a <p> element
        para;
        tbody;
        console.log(tbody);
        let string = '<tr><td>'+data.results[i].name+'</td><td>'+data.results[i].url+'</tr>';
       
        document.getElementById("tbody").innerHTML+=string;
        // para.className = "alert alert-success col-md-8";
        // para.innerText = `The name is : ${(data.results[i].name)} \n
        // The url is : ${data.results[i].url}`; // Insert text

      
        }
        });
        })



    .catch(function(err) {
    console.log('Fetch Error :-S', err);
    });
}
