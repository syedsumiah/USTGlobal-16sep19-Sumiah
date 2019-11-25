 //circumference of circle
        //named function
    function circum(radius,pi){
        console.log('circumference of circle=',pi*radius*radius);
    }
    circum(2,3.14)
    // function expression
    var circum = function(radius,pi){
        console.log('circumference of circle=',pi*radius*radius)
        return pi*radius*radius;
    }
    circum(3,3.14)
    //self invoked function
    console.log('circum');
    (function(radius,pi){
        console.log('circumference of circle=',pi*radius*radius);
    }) (2,3.14)
    //fat arrow function
    var circum = (radius,pi)=>{
        console.log('cirnumference of circle=',pi*radius*radius);
    }

circum(3,3.14)
console.log('===============');

