// window.onload(showProfile());

let userid = sessionStorage.getItem("userid");

console.log(userid);

// function showProfile() {
//     fetch('http://localhost:9001/showProfile' + usersid,)
//       .then(
//       function(response) {
//       if (response.status !== 200) {
//       console.log('Looks like there was a problem. Status Code: ' +
//       response.status);
//       return;
//       }
//       response.json().then(function(data) {
//             alert(usersid);
//             console.log(data);
//             for (let i =0; i<data.length; i++) {
//             console.log("userid: " + data[i].userid);
//             console.log("username: " +data[i].username);
//             console.log("password: " +data[i].password);
            
            

        //     //String2 is the button to open update form
        //    let string2="<button type='button' class='btn btn-block btn-info' onclick=openForm("+data[i].playerno+",'"+data[i].playername+"',"+data[i].attack+","+data[i].defence+")> Update </button>"  
        //    //adding string2 to string. string is data inserted into the tbody.
        //   let string = '<tr id="player"><td>'+data[i].playername+'</td><td id="playerno">'+data[i].playerno+'</td><td>'+data[i].attack+'</td><td>' 
        //   + data[i].defence+'</td><td align="right">' 
        //   + string2
        //   + '<button type="button" onclick = "DeletePlayer('+ data[i].playerno+')"class="btn btn-block btn-danger">Delete</button></td></tr>';
         
        //   document.getElementById("tbody").innerHTML+=string;
        
        //   }
        //   });
        //   })
        // }