// Function to get cookie by name
function getCookie(name) {
    const value = `; ${document.cookie}`;
    const parts = value.split(`; ${name}=`);
    if (parts.length === 2) return parts.pop().split(';').shift();
}

async function fetchData(url, method, requestBody, callback) {
    try {
        const response = await fetch(`https://volunteer-hub-exnzolcstq-uc.a.run.app${url}`, {
            method: method,
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(requestBody)
        });

        const data = await response.json();

        if (callback) {
            callback(data);
        }

        return data;
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred while processing your request.');
    }
}
