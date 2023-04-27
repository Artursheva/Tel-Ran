// 1.
for (let i = 0; i <= 10; i += 2) {
    console.log(i);
}
// 2.
for (let i = 55; i >= 20; i--) {
    console.log(i);
}
// 3.
const numbers = [3, 5, 11, 2, 8, 1, 6];
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}
// 4.
const numbers = [3, 5, 11, 2, 8, 1, 6];
const numbers_squared = [];
for (let i = 0; i < numbers.length; i++) {
    numbers_squared.push(numbers[i] ** 2);
}
console.log(numbers_squared);
// 5.
const numbers = [3, 5, 11, 2, 8, 1, 6];
const numbers_squared = [];
for (let i = 0; i < numbers.length; i++) {
    numbers_squared.push(numbers[i] ** 2);
}
const last_elem = numbers_squared[numbers_squared.length - 1];
console.log(last_elem);
// 6.
const user = {
    first_name: 'Ivan', 
    last_name: 'Ivanov', 
    age: 20, 
    salary: 500
}
const message = `User's name is ${user.first_name} ${user.last_name}. He is ${user.age} years old.`;
console.log(message);

