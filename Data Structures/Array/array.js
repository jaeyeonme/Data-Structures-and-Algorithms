const a = ['a', 'b', 'c', 'd'];

// push
a.push('e')               // O(1)

// pop
a.pop();
a.pop();                  // O(1)

// unshift
a.unshift('x');           // O(n)


// splice
a.splice(2, 0, 'alien');  // O(n)

console.log(a);