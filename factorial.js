function calculateFactorial(number) {
    if (number < 0) return 'Please enter a non-negative integer.';
    let factorial = 1;
    for (let i = 1; i <= number; i++) {
        factorial *= i;
    }
    return factorial;
}

const userInput = prompt("Enter a non-negative integer:");
const number = parseInt(userInput);
if (isNaN(number) || number < 0) {
    alert('Please enter a valid non-negative integer.');
} else {
    const result = calculateFactorial(number);
    alert('Factorial of ' + number + ' is ' + result + '.');
}
