//add number in an array
console.log('====named function=====')
function add(array){
    var total = 0
    for(var i=0;i<array.length;i++){
    total+=array[i];
}
return total;
}
var sum=add([10,20,30,40]);
console.log(sum);
 console.log('====expression function=====')
 var add = function(array){
     var total = 0;
     for(var i=0;i<array.length;i++){
         total+=array[i];
     }
     return total
 }  
 var sum1=add([10,20,30,40]);
 console.log(sum1)
 console.log('====self invoked function=====')
        console.log('array');
        (function(array){
            var total =0;
            for(var i=0;i<array.length;i++){
                total+=array[i]
            }
            return total
        
        })
        var sum2 = add([10,20,30,40])
        console.log(sum2)
        console.log('=====fat arrow function=====')

        var add = (array)=>{
            var total =0;
            for(var i=0;i<array.length;i++){
                total+=array[i]
            }
            return total
        }
        var sum3 =add([10,20,30,40])
        console.log(sum3)
    

