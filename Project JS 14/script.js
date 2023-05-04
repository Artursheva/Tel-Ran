// 1.
function printEvenNumbersDescending(num1, num2) {
    let max = num1 > num2 ? num1 : num2;
    let min = num1 < num2 ? num1 : num2;
    
    for (let i = max; i >= min; i--) {
      if (i % 2 === 0) {
        console.log(i);
      }
    }
  }
//   2.
function power(base, exponent = 2) {
    return Math.pow(base, exponent);
  }
// 3.
function sumFrom1ToN(n) {
    let sum = 0;
    
    for (let i = 1; i <= n; i++) {
      sum += i;
    }
    
    return sum;
  }
// 4.
function sumOfEvenAndOddNumbers(n, m) {
    let evenSum = 0;
    let oddSum = 0;
    
    for (let i = n; i <= m; i++) {
      if (i % 2 === 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    
    console.log(`Sum of even numbers: ${evenSum}`);
    console.log(`Sum of odd numbers: ${oddSum}`);
  }
// 5.
function findLongestString(arr) {
    if (arr.length === 0) {
      return null;
    }
    
    let longestString = arr[0];
    
    for (let i = 1; i < arr.length; i++) {
      if (arr[i].length > longestString.length) {
        longestString = arr[i];
      }
    }
    
    return longestString;
  }
  