function submitUser(){
    let elements = document.getElementById("userForm").elements;
    let obj ={};
    let item = elements.item(0);
    obj[item.name] = item.value;
    const req = new XMLHttpRequest();
    req.open("POST", "http://localhost:8080/createUser");
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server Responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };

    req.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({ userName: obj.userName}));
}