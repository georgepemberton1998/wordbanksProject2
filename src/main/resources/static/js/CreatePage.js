function submitWord(){
    let elements = document.getElementById("wordForm").elements;
    console.log(elements);
    let obj ={};
    for(let i = 0 ; i < elements.length; i++){
        let item = elements.item(i);
        obj[item.name] = item.value;
    }
    console.log(obj)
    const req = new XMLHttpRequest();
    req.open("POST", "http://34.89.77.230:8080/createWord");
    req.onload = () => {
        if (req.status === 200 && req.readyState === 4) {
             console.log("Server Responded with: " + req.responseText);
         } else {
             console.log("Oops...");
         }
     };
    console.log(JSON.stringify({ word: obj.word, definition: obj.definition, userDetails:{ id: Number(obj.id)}}));
    req.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    req.send(JSON.stringify({ word: obj.word, definition: obj.definition, userDetails:{ id: Number(obj.id)} }));
}