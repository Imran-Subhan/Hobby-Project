window.onload(getAll());


function getAll() {
    fetch('http://localhost:9001/ShowPlayers')
      .then(
      function(response) {
      if (response.status !== 200) {
      console.log('Looks like there was a problem. Status Code: ' +
      response.status);
      return;
      }
      response.json().then(function(data) {
          console.log(data);
          for (let i =0; i<data.length; i++) {
            console.log(data[i].playername);
            console.log(data[i].playerno);
            console.log(data[i].attack);
            console.log(data[i].defence);
          
          
          let string = '<tr id="player"><td>'+data[i].playername+'</td><td id="playerno">'+data[i].playerno+'</td><td>'+data[i].attack+'</td><td>' 
          + data[i].defence+'</td><td align="right">' 
          + '<button class="open-button" onclick="openForm()"" class= "btn btn-block">Update</button></td><td>'
            + '<button type="button" onclick = "DeletePlayer('+ data[i].playerno+')"class="btn btn-block btn-danger">Delete</button></td></tr>';
         
          document.getElementById("tbody").innerHTML+=string;
        
          }
          });
          })
        }

        function DeletePlayer(id){
            fetch('http://localhost:9001/DeletePlayer/'+id, {
              method: 'Delete',
              headers: {
                "Content-type": "application/x-www-form-urlencoded; charset=UTF-8"
              },
              body: 'foo=bar&lorem=ipsum'
            })
            .then(id)
            .then(function (data) {
              console.log('Request succeeded with JSON response', data);
              location.reload();
            })
            .catch(function (error) {
              console.log('Request failed', error);
            });
        }

        function Update(id) {
            console.log("upddddd");
            let playername = document.getElementById("updplayername").value;
            let playerno = document.getElementById("updplayerno").value;
            let Attack = document.getElementById("updAttack").value;
            let Defence = document.getElementById("updDefence").value;
            // var Row = document.getElementById("tbody");
            // var Cells = Row.getElementsByTagName("td");
            // alert(Cells[1].innerHTML);
            console.log(playername);
            console.log(playerno);
            console.log(Attack);
            console.log(Defence);
            fetch('http://localhost:9001/UpdatePlayer/'+playerno, {
                method: 'Put',
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    playername: playername,
                    playerno: playerno,
                    attack: Attack,
                    defence: Defence
                
                })
              })
            .then(
            function(response) {
                location.reload();
            if (response.status !== 200) {
            console.log('Looks like there was a problem. Status Code: ' +
            response.status);
            return;
            }
            
            
                })
            
            }
          function openForm() {
            document.getElementById("myForm").style.display = "block";
          }
          
          function closeForm() {
            document.getElementById("myForm").style.display = "none";
          }
        