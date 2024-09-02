function reverseString(str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str[i];
    }
    return reversed;
}

// Test cases
console.log(reverseString("hello"));      
console.log(reverseString("JavaScript")); 
console.log(reverseString("12345"));      
console.log(reverseString(""));           
/**
 * 
 */