//factorial
    //Named Function
    function fact(num){
        var fact=1;
        for(var i=1;i<=num;i++){
        fact*=i;
        }
        console.log(fact);
    }
    fact(5);

    //function Expression
    var fact=function(num){
        var fact=1;
        for(var i=1;i<=num;i++){
            fact*=i
        }
        console.log(fact);
    }
    fact(3);

    //self Invoked function
    (function(num){
        var fact=1;
        for(var i=1;i<=num;i++){
            fact*=i;
        }
        console.log(fact)
    }) (4)

    // fat arrow function
    var fact=(num)=>{
        var fact=1;
        for(var i=1;i<=num;i++){
            fact*=i;
        }
        console.log(fact);
    }
    fact(5);
    