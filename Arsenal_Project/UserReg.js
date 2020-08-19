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

function AddUser() {
    let UsernameInp = document.getElementById("UsernameInp").value;
    let PasswordInp = document.getElementById("PasswordInp").value;

console.log(UsernameInp)
console.log(PasswordInp)

if(document.getElementById("UsernameInp").value.length < 4 
|| document.getElementById("PasswordInp").value.length < 4) {

  alert("Username or Password is too short must be above 4 characters");
}
else{


    fetch(`http://localhost:9001/AddUser`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            username: UsernameInp,
            password: PasswordInp,
        })
       
      })
    .then(
    function(response) {
    if (response.status !== 200 && response.status !==500) {
    console.log('Looks like there was a problem. Status Code: ' +
    response.status);
    return;
    }
    else if(response.status == 500) {
    alert("Error 500: This username is already assigned to a member");
    return;
    }

    window.location.href='login.html'
  
        })

}
  
}