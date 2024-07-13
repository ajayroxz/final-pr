// Simple form validation (check for empty fields)
const form = document.querySelector('form');

form.addEventListener('submit', (event) => {
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  if (!username || !password) {
    event.preventDefault();
    alert('Please fill in both username and password');
  }
});
