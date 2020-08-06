function AddUser() {
    let username = document.getElementById("UsernameInp").value;
    let password = document.getElementById("PasswordInp").value;

    console.log("sommin "+username +" " + password);
  
  let response = await fetch('localhost:9001/AddUser', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(user)({
    username: UseenameInp,
    password: PasswordInp,
    }
  });

}
  
  let result = await response.json();
  alert(result.message);