let number = prompt("Введите число:");
let result = number * 0.1;
console.log(`10% от ${number} равно ${result}`);


// 2.

let number1 = prompt("Введите первое число:");
let number2 = prompt("Введите второе число:");
if (number1 < number2) {
    console.log(`Наименьшее число: ${number1}`);
} else {
    console.log(`Наименьшее число: ${number2}`);
}
// 3.
let number = prompt("Введите число:");
if (number < 100) {
    console.log("Число меньше 100");
} else if (number > 100) {
    console.log("Число больше 100");
} else {
    console.log("Число равно 100");
}
// 4.
let name = prompt("Введите ваше имя:");
let age = prompt("Введите ваш возраст:");
if (age >= 18) {
    console.log(`Hello, ${name}`);
} else {
    console.log(`Hi, ${name}`);
}

