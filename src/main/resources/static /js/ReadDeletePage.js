function displayNotebooks(){
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);
                let stuff = JSON.parse(req.response);
                console.log(stuff)
                stuff.forEach(el => {
                    let elem = document.createElement('div');
                    let header = document.createElement('h1');
                    header.textContent = el.userName + "'s Wordbank";
                    elem.appendChild(header);
                    el.userWords.forEach(note =>
                    {
                        let word = document.createElement('p');
                        let definition = document.createElement('p');
                        let id = document.createElement("p");
                        word.textContent = "Word: " + note.word;
                        definition.textContent = "Definition: " + note.definition;
                        id.textContent = "ID: " + note.id
                        elem.appendChild(word);
                        elem.appendChild(definition);
                        elem.appendChild(id);
                        let pbreak = document.createElement("br")
                        elem.appendChild(pbreak)
                    })
                    document.body.appendChild(elem);
                });
            } else {
                console.log(
                    "Looks like its not JSON but lets see what it is... " + req.responseText
                );
            }
        } else {
            console.log("Oh no... handle error");
        }
    };
    req.open("GET", "http://localhost:8080/");
    req.send();
}