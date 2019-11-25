console.log('By using array method');
const cources = ['javaScript','html','css','java','j2ee','angular']
cources.forEach(function(value,index){
    console.log('cources=',value);
});
console.log('====isArray=====');
const isArrayOrNot = Array.isArray(cources);
console.log('is array or not=',isArrayOrNot)

console.log('=====include======');
const hasHtml = cources.includes('html',2);
console.log('has a html=',hasHtml)

console.log('=====push======')
cources.push('C++','C#')
console.log('after puch method=',cources)
 
console.log('=====pop======')
cources.pop();
console.log('after pop method=',cources)

console.log('=====unshift======')
cources.unshift('sql','testing');
console.log('after unshift method=',cources);

console.log('====shift====')
cources.shift()
console.log('after shift method=',cources)

console.log('=====splice=====')
cources.splice(1,2,'bostStack','Adv java')
console.log('after splice method',cources)

console.log('====slice=====')
const afterSlice = cources.splice(2,4)
cources.slice(2,4)
console.log('after AfterSlice method=',afterSlice)
console.log('after slice method',cources)

console.log('=====join=====')
const stringJoin = cources.join('-');
console.log('after join method=',stringJoin)

console.log('====indexOf=====');
const indexOfCoding = cources.indexOf('css',2);
console.log('after indexOf method=',indexOfCoding)

console.log('=========')
const colors = ['red','blue','green','black']
const isArrayOrNot1 = Array.isArray(colors);
console.log('is array or not=',isArrayOrNot1)

const hasGreen = colors.includes('green',2)
console.log('has green=',hasGreen)

colors.push('white','yellow')
console.log('after push=',colors)

colors.pop()
console.log('after pop=',colors)

colors.unshift('pink','golden')
console.log(colors)

colors.shift()
console.log('after shift=',colors)

colors.splice(1,2,'pinkRed','orange')
console.log('after splice=',colors)

colors.slice(2,3)
const afterSlice1 = colors.slice(2,4)
console.log('after slice=',colors)
console.log('after afterSlice=',afterSlice1)

const indexOfPink = colors.indexOf('pink',2)
console.log('after indexOf method=',indexOfPink)

const stringJoin1 = colors.join('-')
console.log('after join=',stringJoin1)

console.log('=========')
const company = ['ust globel','tcs','capgemini']
const isArrayOrNot2 = Array.isArray(company)
console.log('after isArray method=',isArrayOrNot)

const hasTcs = company.includes('tcs',1)
console.log('after includes method=',hasTcs)

company.push('Accenture','Infosys')
console.log('after push=',company)

company.pop()
console.log('after pop=',company)


company.unshift('wipro','fidelity')
console.log('after unshift=',company)

company.splice(1,2,'jasmin infotech','hcl')
console.log('after splice=',company)

company.slice(1,2)
const afterSlice2 =company.slice(1,2)
console.log('after slice=',company)
console.log('afterSlice method=',afterSlice2)

const indexOf2 = company.indexOf('ust globel',0)
console.log('after indexOf=',indexOf2)

const stringJoin2 = company.join('-')
console.log('after string join=',stringJoin2)
console.log('-----------------------------')

const Hero = ['Ram Charan','Allu Arjun','mahesh Babu','Prabash']
const isArrayOrNot3 = Array.isArray(Hero)
console.log('after isArray method=',isArrayOrNot3)
const hasInclude = Hero.includes('Ram charan',0)
console.log('after include method=',hasInclude)
Hero.push('SharukKhan','Salman Khan')
console.log('after push=',Hero)
Hero.pop()
console.log('after pop=',Hero)
Hero.unshift('Shahid Kapoor','Ranbir Kapoor')
 console.log('after unshift=',Hero)
Hero.shift()
console.log('after shift=',Hero);
Hero.splice(2,3,'Surya','Arjit kumar')
console.log('after splice=',Hero)
Hero.slice(2,3)
const afterSlice4 = Hero.slice(2,3)
console.log('after slice=',Hero)
console.log('afterSlice method=',afterSlice4)
const indexOf4 =Hero.indexOf('Allu Arjun',1)
console.log('after infexOf',indexOf4)
const string4 = Hero.join('-')
console.log('After join=',string4)
console.log('-----------------------------------')

const subject = ['english','maths','science']
const isArrayOrNot5 = Array.isArray(subject)
console.log('after is array or not=',isArrayOrNot5)
const hasInclude1 = subject.includes('maths',1)
console.log('after includes=',hasInclude1)
subject.push('Biology','physics')
console.log('after push=',subject)
subject.pop()
console.log('after pop=',subject)
subject.unshift('m1','m2')
console.log('after unshift=',subject)
subject.shift()
console.log('after shift=',subject)
subject.splice(1,2,'m3','m4')
console.log('after splice',subject)
subject.slice(1,2)
const afterSlice5 =subject.slice(1,2)
console.log('after slice=',subject)
console.log('afterSlice=',afterSlice5)
const indexOf5 =subject.indexOf('m3',1)
console.log('after indexOf=',indexOf5)
const string5 =subject.join('-')
console.log('after join=',string5)
console.log('=============================')

const courses=['javascript','html','css','j2ee','java']
       const e1=Array.isArray(courses);
       console.log(e1);
       const e2=courses.includes('sc',4);
       console.log(e2);
       const e3=courses.push('gd','cd');
       console.log(e3);
       const e4=courses.unshift('math','td');
       console.log(e4);
       const e5=courses.shift();
       console.log(e5);
       courses.splice(1,2,'be','bee');
       console.log(courses);
       const e6=courses.slice(2,4);
       console.log(e6);
       const e7=courses.indexOf('java',3);
       console.log(e7);
       const e8=courses.join('-');
       console.log(e8);

       const singers=['arijit','arman','tulsi','amaal','sonu']
       const f1=Array.isArray(singers);
       console.log(f1);
       const f2=singers.includes('sunidhi',4);
       console.log(f2);
       singers.push('sherya','monali');
       console.log(singers);
       singers.unshift('anu','arrman');
       console.log(singers);
       singers.shift();
       console.log(singers);
       singers.splice(1,2,'bbbb','cccc');
       console.log(singers);
       const f6=singers.slice(2,4);
       console.log(f6);
       const f7=singers.indexOf('dddd',3);
       console.log(f7);
       const f8=singers.join('-');
       console.log(f8);

       const crushs=['aaaa','bbbb','cccc','dddd','eeee']
       const g1=Array.isArray(crushs);
       console.log(g1);
       const g2=crushs.includes('ffff',4);
       console.log(g2);
       crushs.push('hhhh','gggg');
       console.log(crushs);
       crushs.unshift('jjjj','iiii');
       console.log(crushs);
       const g5=crushs.shift();
       console.log(g5);
       crushs.splice(1,2,'llll','kkkk');
       console.log(crushs);
       const g6=crushs.slice(2,4);
       console.log(g6);
       const g7=crushs.indexOf('dddd',3);
       console.log(g7);
       const g8=courses.join('-');
       console.log(g8);

       const songs=['saa','ree','gaa','maa','paa']
       const h1=Array.isArray(songs);
       console.log(h1);
       const h2=songs.includes('naa',4);
       console.log(h2);
       songs.push('dhii','saaaa');
       console.log(songs);
       songs.unshift('siiii','niii');
       console.log(songs);
       songs.shift();
       console.log(songs);
       songs.splice(1,2,'liii','miii');
       console.log(songs);
       const h6=songs.slice(2,4);
       console.log(h6);
       const h7=songs.indexOf('miii',3);
       console.log(h7);
       const h8=songs.join('-');
       console.log(h8);


      
       const cities=['bangalore','mumbai','bokaro','balasore','bhubaneswar']
       const i1=Array.isArray(cities);
       console.log(i1);
       const i2=cities.includes('rajadhani',4);
       console.log(i2);
       cities.push('vanivihar','saheednagar');
       console.log(cities);
       cities.unshift('kalingavihar','dumduma');
       console.log(cities);
       cities.shift();
       console.log(cities);
       cities.splice(1,2,'acaryanagar','patia');
       console.log(cities);
       const i6=cities.slice(2,4);
       console.log(i6);
       const i7=cities.indexOf('miii',3);
       console.log(i7);
       const i8=cities.join('-');
       console.log(i8);





