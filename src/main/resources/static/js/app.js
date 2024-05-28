$(document).ready(function(){

 $(".navbar-toggle").click(function(e){

   e.preventDefault();
   $("body").toggleClass("sidebar-collapse");
   $(".content").css({left:0});
 });


});

document.querySelectorAll('.showInputButton').forEach(function(button, index) {
  button.addEventListener('click', function() {
      document.querySelectorAll('.inputContainer')[index].style.display = 'block';
  });
});

document.querySelectorAll('.cancelButton').forEach(function(button, index) {
  button.addEventListener('click', function() {
      document.querySelectorAll('.inputContainer')[index].style.display = 'none';
      document.querySelectorAll('.textInput')[index].value = ''; // Clear the input field
  });
});

document.querySelectorAll('.submitButton').forEach(function(button, index) {
  button.addEventListener('click', function() {
      const inputText = document.querySelectorAll('.textInput')[index].value;
      if (inputText) {
          alert('Telah diedit dengan: ' + inputText);
          document.querySelectorAll('.inputContainer')[index].style.display = 'none';
          document.querySelectorAll('.textInput')[index].value = ''; // Clear the input field
      } else {
          alert('Text tidak boleh kosong.');
      }
  });
});