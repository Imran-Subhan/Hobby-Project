var user = document.querySelector('#UsernameInp');
user.addEventListener('keyup', function() {
  var cross = document.querySelector('.u_times');
  var tick = document.querySelector('.u_check');
  if(user.value.length < 4) {
    user.style.border = '2px solid red';
    cross.style.display = 'block';
    tick.style.display = 'none';
  }
  else {
    user.style.border = '2px solid green';
    tick.style.display = 'block';
    cross.style.display = 'none';
  }
})

var password = document.querySelector('#PasswordInp');
password.addEventListener('keyup', function() {
  var cross = document.querySelector('.p_times');
  var tick = document.querySelector('.p_check');
  if(password.value.length < 4) {
    password.style.border = '2px solid red';
    cross.style.display = 'block';
    tick.style.display = 'none';
  }
  else {
    password.style.border = '2px solid green';
    tick.style.display = 'block';
    cross.style.display = 'none';
  }
})


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

            sessionStorage.setItem("userid", data[i].userid);
            if(document.getElementById("UsernameInp").value.includes(data[i].username) 
            && document.getElementById("PasswordInp").value.includes(data[i].password)) {
              

            console.log("correct username & password");
            window.location.href='MemberHome.html';
            
           
                break;
            
            }

        
        
          }
          
          });
          })
        }