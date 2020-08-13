function login() {
    fetch('http://localhost:9001/showUsers')
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
            // console.log("userid: " + data[i].userid);
            // console.log("username: " +data[i].username);
            // console.log("password: " +data[i].password);
            console.log("sadasd "+ data[i].userid)
            sessionStorage.setItem("userid", data[i].userid);
            if(document.getElementById("UsernameInp").value.includes(data[i].username) 
            && document.getElementById("PasswordInp").value.includes(data[i].password)) {
              
            
            

            console.log("correct username & password");
            window.location.href='editProfile.html';
            
           
                break;
            
            }
            else {
              alert("Invalid username or password");
            }
        
        
          }
          });
          })
        }