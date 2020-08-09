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
          
          
          let string = '<tr><td>'+data[i].playername+'</td><td>'+data[i].playerno+'</td><td>'+data[i].attack+'</td><td>' 
          + data[i].defence+'</td><td>' + '</td><td><button onclick = "DeletePlayer('+ data[i].playerno+')"class="btn btn-block btn-danger">Delete</button></td></tr>';
         
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