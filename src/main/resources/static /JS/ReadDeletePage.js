function displayWords(){
    const req = new XMLHttpRequest();
    req.onreadystatechange = () => {
        // Example handle logic
        if (req.status === 200 && req.readyState === 4) {
            if (req.getResponseHeader("Content-Type") === "application/json") {
                console.log("oh look its some JSON: " + req.responseText);
                let stuff = JSON.parse(req.response);
                stuff.forEach(el => {
                    let elem = document.createElement('div');
                    let header = document.createElement('h1');
                    header.textContent = "Username: " + el.name;
                    elem.appendChild(header);
                    el.notes.forEach(words => {
                        console.log(words)
                        let word = document.createElement('p');
                        let definition = document.createElement('p');
                        word.textContent = "Title: " + words.title;
                        definition.textContent = "Description: " + words.description;
                        elem.appendChild(word);
                        elem.appendChild(definition);
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
    req.open("GET", "http://localhost:8080/getAllWords");
    req.send();
}