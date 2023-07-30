const Game = require("./Game");

let g1=Game.newGame('rahul',"ritik");
let g2=Game.newGame('vikas',"gaurav");

console.log(g1.play(0))
console.log(g1.play(3))
console.log(g1.play(1))
console.log(g1.play(4))
console.log(g1.play(2))

console.log(g2.play(0))
console.log(g2.play(3))
console.log(g2.play(1))
console.log(g2.play(4))
console.log(g2.play(2))