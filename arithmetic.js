// Function to perform arithmetic operations
function performOperation(num1, num2, operation) {
    let result;

    switch (operation) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            if (num2 !== 0) {
                result = num1 / num2;
            } else {
                result = 'Cannot divide by zero';
            }
            break;
        default:
            result = 'Invalid operation';
    }

    return result;
}

// Example usage:
const num1 = 10;
const num2 = 5;

console.log('Addition:', performOperation(num1, num2, '+'));
console.log('Subtraction:', performOperation(num1, num2, '-'));
console.log('Multiplication:', performOperation(num1, num2, '*'));
console.log('Division:', performOperation(num1, num2, '/'));
