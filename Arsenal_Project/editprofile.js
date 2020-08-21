// window.onload(showProfile(userid));

let userid = sessionStorage.getItem("userid");

showProfile(userid);

// Get: ShowProfile function

function showProfile(userid) {

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
            
            let username = data.username;
            let password = data.password;
            console.log("userid: " + data.userid);
            console.log("username: " +data.username);
            console.log("password: " +data.password);
            
            

            //String2 is the button to open update form
           let string2="<button type='button' class='btn btn-block btn-info' onclick=openForm("+userid+",'"+data.username+"','"+data.password+"')> Update </button>"  
           //adding string2 to string. string is data inserted into the tbody.
           let string = '<tr id="userid"><td>'+userid+'</td><td id="playerno">'+data.username+'</td><td><input class = "bg-dark text-light" id = "pass" type = "password" disabled value = "'+data.password+'"></input></td><td>' 
          + '<button type="button" onclick = "DeleteUser('+ userid+')"class="btn btn-block btn-danger">Logout & Delete Account</button></td><td>'
          + string2;
         
          document.getElementById("tbody").innerHTML+=string;
        
          
          });
          })
        }
        //Put: Update Function

          function updateUser() {

            console.log("sdasd " + document.getElementById("Updpassword").value)
            fetch('http://localhost:9001/UpdateUser/'+document.getElementById("Upduserid").value, {
                method: 'Put',
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    userid:document.getElementById("Upduserid").value,
                    username: document.getElementById("Updusername").value,
                    password: document.getElementById("pass").value
                
                })
              })
            .then(
            function(response) {
                location.reload();
                console.log("Password updated")
            if (response.status !== 200) {
            console.log('Looks like there was a problem. Status Code: ' +
            response.status);
            return;
            }
          })
        }

            //Delete: DeleteUser Function

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
          
          

          function Logout(){
            window.location.replace("login.html")
            sessionStorage.clear()
          }



        function openForm(id, uname, pword) {
          //alert(playerno+".."+playername)
          document.getElementById("myForm").style.display = "block";
          console.log(id);
          console.log(uname);

          document.getElementById("Upduserid").value = id;
          document.getElementById("Updusername").value = uname;
          document.getElementById("Updpassword").value = pword;
          
        }
        function closeForm() {
          document.getElementById("myForm").style.display = "none";
        }