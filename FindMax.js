function findMax(arr) {
    if (arr.length === 0) return undefined;

    let max = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

// Test cases
console.log(findMax([3, 1, 4, 1, 5, 9, 2, 6, 5])); 
console.log(findMax([-10, -20, -30, -5, -15]));    
console.log(findMax([7]));                       
console.log(findMax([]));                        
