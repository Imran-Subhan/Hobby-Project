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

            //String2 is the button to open update form
           let string2="<button type='button' class='btn btn-block btn-info' onclick=openForm("+data[i].playerno+",'"+data[i].playername+"',"+data[i].attack+","+data[i].defence+")> Update </button>"  
           //adding string2 to string. string is data inserted into the tbody.
          let string = '<tr id="player"><td>'+data[i].playername+'</td><td id="playerno">'+data[i].playerno+'</td><td>'+data[i].attack+'</td><td>' 
          + data[i].defence+'</td><td align="right">' 
          + string2
          + '<button type="button" onclick = "DeletePlayer('+ data[i].playerno+')"class="btn btn-block btn-danger">Delete</button></td></tr>';
         
          document.getElementById("tbody").innerHTML+=string;
        
          }
          });
          })
        }
        function openForm(playerno,pname,attack,defence) {
          //alert(playerno+".."+playername)
          document.getElementById("myForm").style.display = "block";

          document.getElementById("updplayerno").value = playerno;
          document.getElementById("updplayername").value = pname;
          document.getElementById("updAttack").value = attack;
          document.getElementById("updDefence").value = defence;
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

        function Update() {
            
            let playername = document.getElementById("updplayername").value;
            let playerno = document.getElementById("updplayerno").value;
            let Attack = document.getElementById("updAttack").value;
            let Defence = document.getElementById("updDefence").value;

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
                console.log("Player updated")
            if (response.status !== 200) {
            console.log('Looks like there was a problem. Status Code: ' +
            response.status);
            return;
            }
            
            
                })
            
            }

          
          function closeForm() {
            document.getElementById("myForm").style.display = "none";
          }
        