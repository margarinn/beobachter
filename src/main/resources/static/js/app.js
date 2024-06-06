$(document).ready(function(){

 $(".navbar-toggle").click(function(e){

   e.preventDefault();
   $("body").toggleClass("sidebar-collapse");
   $(".content").css({left:0});
 });


});

document.addEventListener('DOMContentLoaded', function() {
  const showInputButtons = document.querySelectorAll('.showInputButton');
  const inputContainers = document.querySelectorAll('.inputContainer');
  const submitButtons = document.querySelectorAll('.submitButton');
  const cancelButtons = document.querySelectorAll('.cancelButton');
  const menuName = document.getElementById('menuName');

  showInputButtons.forEach((button, index) => {
    button.addEventListener('click', function() {
      inputContainers[index].style.display = 'block';
    });
  });

  submitButtons.forEach((button, index) => {
    button.addEventListener('click', function() {
      const textInput = inputContainers[index].querySelector('.textInput');
      if (textInput.value.trim() !== '') {
        menuName.textContent = textInput.value;
      }
      inputContainers[index].style.display = 'none';
    });
  });

  cancelButtons.forEach((button, index) => {
    button.addEventListener('click', function() {
      inputContainers[index].style.display = 'none';
    });
  });
});