// File: src/main/resources/static/js/main.js
document.addEventListener('DOMContentLoaded', function() {
    const logout = document.getElementById('logout-btn');
    if (logout) {
        logout.addEventListener('click', () => alert('You are logging out.'));
    }
});
