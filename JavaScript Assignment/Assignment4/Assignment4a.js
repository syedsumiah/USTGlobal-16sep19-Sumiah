const items = [{
    name : 'ear ring',
    id : 1,
    price : 5000,
},{
    name : 'kajal',
    id : 2,
    price : 1000,
},{
    name : 'trimmer',
    id : 3,
    price : 3000,
},{
    name : 'Beardo',
    id : 4,
    price : 170,
}]
const item1 = items.map(function(items,index){
    items.price = items.price+300;
    return items;
})
console.log('after new Price=',item1)

console.log('===fat arrow======')
const item2 = items.map(items=>items.price+300)
console.log('after map arrow method=',item2)

console.log('====fat arrow using filter()=====')
const item3 = items.filter(items=>items.price>2000);
console.log('after filter arrow method=',item3)

console.log('===using call back function======')
const item4 = items.filter(function(items,index){
    if(items>2000){
        return true;
    }else{
        return false;
    }
})
console.log('after call back function=',item4)