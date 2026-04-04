// This selects the image element using a specific ID we will add to the HTML
const cenaImage = document.getElementById("cena-pic");

// This attaches the click behavior entirely outside of the HTML file
cenaImage.addEventListener("click", () => {
    // Use window.location.href = "..." if you want it to open in the same tab.
    window.open("https://www.youtube.com/shorts/yZBDQsHOTNQ", "_blank");
});

cenaImage.style.cursor = "pointer";