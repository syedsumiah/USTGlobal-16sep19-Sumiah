//fibonacci series
    //named function
    function fibonnaci(num){
        var a=0;
        var b=1;
        
        console.log(a+ " "+b)
        for(var i=2;i<=num;i++)
        {
           var c=a+b;
            a=b;
            b=c;
    
        console.log(c)
        }   
    }
    fibonnaci(5); 
    console.log('===========')

    // function expression
    var fib=function(num){
        var a=0;
        var b=1;
    console.log(a+ " "+b);
        for(var i=2;i<=num;i++)
        {
           var c=a+b;
            a=b;
            b=c;
            console.log(c);
        }
        
    }
    fib(7)
    console.log('==============');
    (function(num){
        var a=0,b=1;
        console.log(a+" "+b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(c);
        }
    }) (8)
    console.log('============');
    var fib = (num)=>{
        var a=0,b=1;
        console.log(a+ " "+b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(c);
        }
    }
fib(9)
