function sumArray(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}

// Test cases
console.log(sumArray([1, 2, 3, 4, 5])); 
console.log(sumArray([10, -10, 20, -20])); 
console.log(sumArray([7, 7, 7]));
console.log(sumArray([])); 
