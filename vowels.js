function countVowels(str) {
    const vowels = "aeiouAEIOU";
    let count = 0;

    for (let i = 0; i < str.length; i++) {
        if (vowels.includes(str[i])) {
            count++;
        }
    }
    return count;
}

// Test cases
console.log(countVowels("hello"));      
console.log(countVowels("JavaScript"));
console.log(countVowels("AEIOU"));      
console.log(countVowels("bcdfgh"));     
