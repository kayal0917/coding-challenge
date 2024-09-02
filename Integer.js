
var num = Math.ceil(Math.random() * 10);

console.log(num);

var gnum = prompt('Guess the number between 1 and 10 inclusive');

if (gnum == num)
    console.log('Matched');
else
    console.log('Not matched, the number was ' + gnum); 
