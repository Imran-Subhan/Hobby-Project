// window.onload(showProfile());

let userid = sessionStorage.getItem("userid");

function showProfile(userid) {
}
    fetch('http://localhost:9001/showProfile/' + userid,)
      .then(
      function(response) {
      if (response.status !== 200) {
      console.log('Looks like there was a problem. Status Code: ' +
      response.status);
      return;
      }
      response.json().then(function(data) {
            console.log(data);
            // for (let i =0; i<data.length; i++) {
            console.log("userid: " + data.userid);
            console.log("username: " +data.username);
            console.log("password: " +data.password);
            
            

            //String2 is the button to open update form
           let string2="<button type='button' class='btn btn-block btn-info' onclick=openForm("+userid+",'"+data.username+"',"+data.password+")> Update </button>"  
           //adding string2 to string. string is data inserted into the tbody.
           let string = '<tr id="userid"><td>'+userid+'</td><td id="playerno">'+data.username+'</td><td>'+data.password+'</td><td>' 
          + '<button type="button" onclick = "DeleteUser('+ userid+')"class="btn btn-block btn-danger">Logout & Delete Account</button></td><td>'
          + string2;
         
          document.getElementById("tbody").innerHTML+=string;
        
          
          });
          })

        
        // show/hide function

          function ShowHide() {
            var x = document.getElementById("UserTable");
            if (x.style.visibility === "hidden") {
              x.style.visibility = "visible";
              showProfile(userid);
            } else {
              x.style.visibility = "hidden";
            }
          }

          function updateform() {
            var frm = document.getElementById("userform");
            // if (frm.style.visibility === "hidden") {

            }
          // }

          function Logout(){
            window.location.replace("login.html")
            sessionStorage.clear()
          }


          function DeleteUser(id){
            fetch('http://localhost:9001/DeleteUser/'+id, {
              method: 'Delete',
              headers: {
                "Content-type": "application/x-www-form-urlencoded; charset=UTF-8"
              },
              body: 'foo=bar&lorem=ipsum'
            })
            .then(id)
            .then(function (data) {
              console.log('Request succeeded with JSON response', data);
              Logout();
            })
            .catch(function (error) {
              console.log('Request failed', error);
            });
        }