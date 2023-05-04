// 1.
const numbersContainer = document.querySelector('.numbers');

for (let i = 100; i >= 50; i -= 10) {
  const p = document.createElement('p');
  p.textContent = i;
  numbersContainer.appendChild(p);
}
// 2.
const stringsContainer = document.querySelector('.strings_container');
const strings = ['foo', 'bar', 'baz', 'qux'];

for (let str of strings) {
  const p = document.createElement('p');
  p.textContent = str;
  stringsContainer.appendChild(p);
}
// 3.
const usersContainer = document.querySelector('.users_container');
const users = [
  { first_name: 'John', last_name: 'Doe', age: 25 },
  { first_name: 'Jane', last_name: 'Smith', age: 18 },
  { first_name: 'Bob', last_name: 'Johnson', age: 16 }
];

for (let user of users) {
  if (user.age >= 18) {
    const card = document.createElement('div');
    card.classList.add('user_card');
    card.innerHTML = `
      <h2>${user.first_name} ${user.last_name}</h2>
      <p>Age: ${user.age}</p>
    `;
    usersContainer.appendChild(card);
  }
}
