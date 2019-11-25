
var states = ['Andhra Pradesh','Tamil Nadhu','Kernataka','Kerala','Odisa'];
for(var i = 0;i<states.length;i++)
{
    console.log('for loop for states',states[i]);
}
console.log('===============');

var cities = ['Hydarabad','Chennai','Bangalore','Thiruvandha Puram','Bhumeshver']
for(var i = 0;i<cities.length;i++)
{
    console.log('for loop cities',cities[i])
}
console.log('============')

var bikes = ['Royal Enfield','Honda','Activa','Yamaha']
for(var i = 0;i<bikes.length;i++)
{
    console.log('for loops bikes',bikes[i])
}
console.log('===========')
 var cars = ['aadi','Ford GT','Toyata','Honda']
 for(var i =0;i<cars.length;i++)
 {
     console.log('for loop cars',cars[i])
 }
 console.log('============')

 var fruits = ['Apple','Orange','Banana','Grapes']
 for(var i=0;i<fruits.length;i++)
 {
     console.log('for loop fruits',fruits[i])
 }
 console.log('==========')
 var vegitable = ['carrot','tamato','Onion','Chille']
 for(var i=0;i<vegitable.length;i++)
 {
     console.log('for loop vegitable',vegitable[i])
 }
 console.log('==========')
  var names = ['Sumiya','Bushra','UmaPriya','Lahari','Afzal','Nagarjuna']
  for(var i=0;i<names.length;i++){
      console.log('for loop names',names[i])
  }
  console.log('=========')
   var MyFamilyMembers = ['Akbar Basha','Badroonnisa','Sumiya','Sabiha','Rahman','Raheem']
   for(var i=0;i<MyFamilyMembers;i++){
       console.log('for loop myFamilyMembers',MyFamilyMembers[i])
   }
   console.log('==========')
   var colors = ['Blue','Yellow','Red','Black','White']
   for(var i=0;i<colors.length;i++){
       console.log('for loop colors',colors[i])
   }
   console.log('==========')
   var laptop = ['HP','Lenova','Dull']
   for(var i=0;i<laptop.length;i++)
   {
       console.log('for loop laptop',laptop[i])
   }
   console.log('==========')
   var phone = ['Redmi','Samsung','Horon','Vivo']
   for(var i=0;i<phone.length;i++){
       console.log('for loop phone',phone[i])
   }
   console.log('forEach loop')
   var movies = ['sholay','mayabazar','jurassic park','Titanic']
   movies.forEach(function(value)
   {
       console.log('forEach loop of movies',value)
   });
   console.log('==========')
   var phone = ['Redmi','samsung','Horon','Vivo']
   phone.forEach(function(value){
       console.log('forEach loop of phone',value)
   });
   console.log('=========')
   var laptop = ['HP','Lenova','Dell']
    laptop.forEach(function(value)
    {
        console.log('forEach loop of laptop',value)
    });
    console.log('============')
    var colors = ['Blue','Green','Red','Black']
    colors.forEach(function(value,index){
        console.log('forEach loop of colors',value)
    });
    console.log('=========')
    var names = ['sumi','bushi','uuo','lahu']
    names.forEach(function(value){
        console.log('forEach of names',value)
    })
    console.log('==========')
    var vegitable = ['Tamato','Onion','Chilly']
    vegitable.forEach(function(value){
        console.log('forEach of vegitable',value)
    })
    console.log('==========')
    var fruits = ['Mango','Orange','Banana']
    fruits.forEach(function(value){
        console.log('forEach loop of fruits',value)
    })
    console.log('=========')
    var organ = ['eye','ear','mouth','hands']
    organ.forEach(function(value,index){
        console.log('forEach of organ',value)
    })
    console.log('==========')
    var states = ['andhra pradesh','tamil nadhu','odisa','karnataka']
    states.forEach(function(value){
        console.log('forEach of states',value)
    })
    console.log('==========')
    var city = ['hydarabad','chennai','bangalore']
    city.forEach(function(value){
        console.log('forEach of city',value)
    })
    console.log('==========')
    console.log('for of loop')
    var brands = ['kingfisher','bisleri','aqua','kinley']
    for(var elements of brands){
        console.log('value',elements)
    }
    console.log('=======')
    var colors = ['orange','green','red']
    for(var sumi of colors){
        console.log('value',sumi)
    }
    console.log('========')
    var states = ['andhra pradesh','tamil nadhu','odisa']
    for(var bushi of states){
        console.log('value',bushi)
    }
    console.log('=======')
    var city = ['hydarabad','chennai','bangalore']
    for(var uuo of city){
        console.log('value',uuo)
    }
    console.log('=======')
    var cars = ['aadhi','honda','toyata']
    for(var nag of cars){
        console.log('value',nag)
    }
    console.log('========')
    var bikes = ['activa','royal enfield','hero honda']
    for(var element of bikes){
        console.log('value',element)
    }
    console.log('======')
    var fruits = ['apple','orangr','grapes']
    for(var element of fruits){
        console.log('value',element)
    }
    console.log('=======')
    var vegitable = ['tamota','onion','bringal']
    for(var element of vegitable){
        console.log('value',element)
    }
    console.log('=======')
    var organ = ['eye','ear','leg','nose']
    for(var element of organ){
        console.log('value',element)
    }
    console.log('==========')
    var names = ['abdul','raheem','sumi','sabi','rahman']
    for(var element of names){
        console.log('value',element)
    }
    console.log('=========')
    console.log('for in loop in arrays')
     var brands = ['kingfisher','aqya','bisleri']
     for(var element in brands){
         console.log('brands',brands[element])
     }
     console.log('=======')
     var bikes = ['hero honda','activa','pulser','karizma']
     for(var index in bikes){
         console.log('bikes',bikes[index])
     }
     console.log('========')
     var cars = ['aadhi','safari','toyota']
     for(var index in cars){
         console.log('cars',cars[index])
     }
     console.log('=======')
     var color = ['blue','red','green']
     for(var index in color){
         console.log('color',color[index])
     }
     console.log('=======')
     var fruits = ['apple','orange','banana']
     for(var index in fruits){
         console.log('fruits',fruits[index])
     }
     console.log('======')
     var states = ['andhra pradesh','tamil nadhu','karnataka']
     for(var index in states){
         console.log('states',states[index])
     }
     console.log('=======')
    var city = ['hydarabad','chennai','bamgalore']
    for(var index in city){
        console.log('city',city[index])
    }
    console.log('=======')
    var company = ['ust global','accenture','capgemini']
    for(var index in company){
        console.log('comapny',company[index])
    }
    console.log('=======')
    var organ = ['eye','ear','nose']
    for(var index in organ){
        console.log('organ',organ[index])
    }
    console.log('========')
    var branches = ['ece','eee','cse','mech','civil']
    for(var index in branches){
        console.log('branches',branches[index])
    }
    console.log('=======')
    console.log('object using in loop')
    var person = {
        name : 'sumiya',
        age : 21,
        gender : 'female',
    }
    for(var key in person){
        console.log('value',person[key])
    }
    console.log('======')
    var bike ={
        name : 'Activa',
        price : 95000,
        color : 'black',
    }
    for(var key in bike){
        console.log('value',bike[key])
    }
    console.log('=====')
    var car ={
        name : 'aadhi',
        price :6500000,
        color :'white',
    }
    for(var key in car){
        console.log('value',car[key])
    }
    console.log('======')
    var company ={
        Cname :'UST Global',
        CEO : 'sajan pillai',
        headquater :'california',
    }
    for(var key in company){
        console.log('value',company[key])
    }
    console.log('=======')
    var fruit ={
        name :'apple',
        color :'red',
        cost : 55,
    }
    for(var key in fruit){
        console.log('value.log',fruit[key])
    }
    console.log('========')
    var pg={
        pgName :'shine',
        price : 5000,
        shareing :4,
    }
    for(var key in pg){
        console.log('value',pg[key])
    }
    console.log('======')
    var friends ={
        fName :'bushi uuo lahu',
        NoOfFrnd :4,
    }
    for(var key in friends){
        console.log('value',friends[key])
    }
    console.log('=======')
    var laptop ={
        name :'HP',
        cost : 45000,
        color :'black',
    }
    for(var key in laptop){
        console.log('value',laptop[key])
    }
    console.log('========')
    var phone ={
        name : 'Redmi',
        cost : 16000,
        color :'blue',
    }
    for(var key in phone){
        console.log('value',phone[key])
    }
    console.log('========')
    var book ={
        name :'english',
        cost : 250,
        NoOfPages :300,
    }
    for(var key in book){
        console.log('value',book[key])
    }