const textToType = "Welcome To\n Our #######\n Website";

function startTypingAnimation() {
  const typingContainer = document.getElementById('typing-text');
  let index = 0;
  
  function type() {
    if (index < textToType.length) {
      typingContainer.textContent += textToType.charAt(index);
      index++;
      setTimeout(type, Math.random() * 200); // Adjust typing speed here
    }
  }
  
  type();
}

startTypingAnimation();
