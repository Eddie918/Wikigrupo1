document.addEventListener('DOMContentLoaded', function() {
    var textarea = document.getElementById('message');
    if (!textarea) {
      console.error('Textarea not found');
      return;
    }
    var text = 'Escribe tu duda, problema o sugerencia por favor... '; // The text you want to simulate typing
    var index = 0;
    var typingSpeed = 100; // Milliseconds
    var userHasTyped = false; // Flag to track if user has typed
  
    // Function to simulate typing character by character
    function typeCharacter() {
      if (index < text.length) {
        textarea.value += text.charAt(index);
        index++;
        setTimeout(typeCharacter, typingSpeed);
      }
    }
  
    // Start typing simulation
    typeCharacter();
  
    // Event listener for textarea click
    textarea.addEventListener('click', function() {
      this.value = ''; // Clears the textarea when clicked
      if (!userHasTyped) {
        // Focus the textarea to allow immediate typing
        textarea.focus();
      }
    });
  
    // Event listener to detect user typing
    textarea.addEventListener('input', function() {
      userHasTyped = true; // Sets the flag when user types
    });
  });
  