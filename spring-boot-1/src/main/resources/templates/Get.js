fetch('/course')
    .then(response => response.json())
    .then(data => {
        // Process received data
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
