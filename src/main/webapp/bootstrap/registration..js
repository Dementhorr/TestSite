function registr() {
    var login, text;

    // Get the value of the input field with id="numb"
    login = document.getElementById("login").value;

    // If x is Not a Number or less than one or greater than 10
    if (isNaN(login) || login.length < 4 || login.length > 30) {
        text = "Input not valid";
    } else {
        text = "Input OK";
    }
    document.getElementById("error_login").innerHTML = text;
}