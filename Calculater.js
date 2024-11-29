
// Simple calculator functions in JavaScript

function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    if (b === 0) {
        return "Error: Division by zero is not allowed!";
    }
    return a / b;
}

// Calculator function to take inputs and operation
function calculator(a, b, operation) {
    switch (operation) {
        case 'add':
            return add(a, b);
        case 'subtract':
            return subtract(a, b);
        case 'multiply':
            return multiply(a, b);
        case 'divide':
            return divide(a, b);
        default:
            return "Error: Invalid operation!";
    }
}

// Example usage:
console.log("Addition: " + calculator(10, 5, 'add'));          // 15
console.log("Subtraction: " + calculator(10, 5, 'subtract'));  // 5
console.log("Multiplication: " + calculator(10, 5, 'multiply'));// 50
console.log("Division: " + calculator(10, 5, 'divide'));       // 2
console.log("Division by zero: " + calculator(10, 0, 'divide')); // Error
