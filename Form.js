function validateForm() {
    // Add your validation logic here

    // Get form data
    var formData = {
        "First Name": document.getElementById("fname").value,
        "Last Name": document.getElementById("lname").value,
        "Date of Birth": document.getElementById("dob").value,
        "Country": document.getElementById("country").value,
        "Gender": document.getElementById("male").checked ? "Male" : document.getElementById("female").checked ? "Female" : "",
        "Profession": document.getElementById("profession").value,
        "Email": document.getElementById("email").value,
        "Mobile Number": document.getElementById("mobile").value
    };

    // Display form data in the popup
    var popupContent = document.getElementById("form-data");
    popupContent.innerHTML = "";
    for (var key in formData) {
        var para = document.createElement("p");
        para.innerHTML = "<strong>" + key + ":</strong> " + formData[key];
        popupContent.appendChild(para);
    }

    // Show the popup
    var popup = document.getElementById("popup");
    popup.style.display = "block";
}

function closePopup() {
    // Close the popup and reset the form
    var popup = document.getElementById("popup");
    popup.style.display = "none";
    document.getElementById("fname").value = "";
    document.getElementById("lname").value = "";
    document.getElementById("dob").value = "";
    document.getElementById("country").value = "";
    document.getElementById("male").checked = false;
    document.getElementById("female").checked = false;
    document.getElementById("profession").value = "";
    document.getElementById("email").value = "";
    document.getElementById("mobile").value = "";
}

function resetForm() {
    // Reset the form
    document.getElementById("fname").value = "";
    document.getElementById("lname").value = "";
    document.getElementById("dob").value = "";
    document.getElementById("country").value = "";
    document.getElementById("male").checked = false;
    document.getElementById("female").checked = false;
    document.getElementById("profession").value = "";
    document.getElementById("email").value = "";
    document.getElementById("mobile").value = "";
}
