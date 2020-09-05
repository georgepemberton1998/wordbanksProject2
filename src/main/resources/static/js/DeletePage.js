
function deleteUser() {
    console.log("hello")
    let elements = document.getElementById("deleteForm").elements;
    console.log(elements);
    let obj = {};
    for (let i = 0; i < elements.length; i++) {
        let item = elements.item(i);
        obj[item.name] = item.value;
    }
    console.log(obj)
    const req = new XMLHttpRequest();
    req.open("DELETE", "http://localhost:8080/deleteUser" + Number(obj.id));
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
            console.log("Server Responded with: " + req.responseText);
        } else {
            console.log("Oops...");
        }
    };
    req.send();
}