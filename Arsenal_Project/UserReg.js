function AddUser() {
    let UseenameInp = document.getElementById("UsernameInp").value;
    let PasswordInp = document.getElementById("PasswordInp").value;




    fetch(`http://localhost:9001/AddUser`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            username: UseenameInp,
            password: PasswordInp,
        })
      })
    .then(
    function(response) {
    if (response.status !== 200) {
    console.log('Looks like there was a problem. Status Code: ' +
    response.status);
    return;
    }

  
        })
  
//   let response = await fetch('localhost:9001/AddUser', {
//     method: 'POST',
//     headers: {
//       'Content-Type': 'application/json;charset=utf-8'
//     },
//     body: JSON.stringify(user)({
//     username: UseenameInp,
//     password: PasswordInp,
//     }
//   });

}
  
//   let result = await response.json();
//   alert(result.message);