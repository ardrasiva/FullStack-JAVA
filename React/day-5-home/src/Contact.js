function Contact() {

  function showEnthusiasm() {
    const message = document.getElementById("message");
    const heading = document.getElementById("heading");

    const headingColor = "lightblue";

    message.innerHTML = "Hello from React! I love this page!";
    heading.style.backgroundColor = headingColor;
  }

  return (
    <div className="container mt-5">
      <div className="card p-4 mb-4">
        <h1 id="heading">This is the Contact Page</h1>

        <p id="message">
          Click the button to see my enthusiasm!
        </p>
        <button className="btn btn-primary" onClick={showEnthusiasm}>
          Show Enthusiasm
        </button>
      </div>
    </div>
  );
}

export default Contact;