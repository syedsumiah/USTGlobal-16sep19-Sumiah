//objects using new keyword
        var course = new Object();
        course.name = 'Java';
        course.fee = 30000;
        course.timing ='2 hours';
        console.log('course name=',course.name);
        console.log('course fee=',course.fee)
        console.log('course timing=',course.timing);
        console.log('==================');

        var student = new Object();
        student.name ='Syed Sumiya';
        student.IdNo = 14088;
        student.age = 21;
        console.log('student name=',student.name);
        console.log('student ID=',student.IdNo);
        console.log('student age=',student.age)
        console.log('============');

        var employee = new Object();
        employee.name='Naveen';
        employee.Id = 495;
        employee.salary = 45000;
        console.log('employee name=',employee.name);
        console.log('employee id=',employee.Id);
        console.log('employee salary=',employee.salary);
        console.log('============');

        var book = new Object();
        book.name='English';
        book.cost= 400;
        console.log('book name=',book.name);
        console.log('book cost=',book.cost);
        console.log('============');

        var pen = new Object();
        pen.name='exclasBright';
        pen.cost= 10;
        pen.colour='blue';
        console.log('pen name=',pen.name);
        console.log('pen cost=',pen.cost);
        console.log('pen colour=',pen.colour);
        console.log('***************')
        //objects without using new keyword
        var company1={
            name:'UST Global',
            headquater:'California',
            CEO:'Sajan Pillai',
            }
            var Cname=company1.name
            console.log('company name=',Cname);
            var headquater=company1.headquater
            console.log('headquator of UST Global=',headquater);
            var ceo=company1.CEO
            console.log("CEO of UST Global=",ceo);
            console.log("===============");
            
            var company2={
                name:'wipro',
                headquater:'Bengalore',
                CEO:'Abidali Neemuchwala',
            }
            var Cname=company2.name
            console.log('Company name=',Cname);
            var headquater=company2.headquater
            console.log('headquater of wipro=',headquater);
            var ceo=company2.CEO
            console.log('ceo of wipro=',ceo);
            console.log('==========');

            var company3={
                name:'TCS',
                headquater:'Mumbai',
                CEO:'Rajesh Gopinathan',
            }
            var Cname=company3.name
            console.log('company name=',Cname);
            var headquater=company3.headquater
            console.log('headquater of TCS=',headquater);
            var ceo=company3.CEO;
            console.log('ceo of tcs=',ceo);
            console.log('=============');

            var company4={
                name:'Accenture',
                headquater:'IreLand',
                CEO:'Julie Sweet',
            }
            var Cname=company4.name
            console.log('company name=',Cname);
            var headquater=company4.headquater
            console.log('headquater of Accenture=',headquater);
            var ceo=company4.CEO
            console.log('ceo of accentute=',ceo);
            console.log('===========');

            var company5={
                name:'Capgemini',
                headquater:'Paris',
                CEO:'Paul Hermelin',
            }
            var Cname=company5.name
            console.log('company nname=',Cname);
            var headquater=company5.headquater
            console.log('headquater of Capgemini=',headquater);
            var ceo=company5.CEO
            console.log('ceo of Capgemini=',ceo);
            console.log('************');

            //Arrays using new keyword
            var CompanyNames = new Array('UST Global','Capgemini','Wipro','HCL');
            console.log('company names=',CompanyNames);
            console.log('name of the company=',CompanyNames[2]);
            console.log('company length=',CompanyNames.length);
            console.log('==========')
            
            var subjects = new Array('English','Science','Social','Maths','Teligu','Hindi');
            console.log('Subjects names = ',subjects);
            console.log('name of the subject = ',subjects[3]);
            console.log('length of subjects = ',subjects.length)
            console.log('==================');
             
            var hero = new Array('RamCharan','Mahesh Babu','Allu Arjun','Nagarjuna','NTR')
            console.log('heros names = ',hero)
            console.log('name of the hero = ',hero[0]);
            console.log('length of hero = ',hero.length)
            console.log('===========');

            var persons = new Array('sumiya','Bushra','UmaPriya','Lahari','Asma')
            console.log('persons names = ',persons);
            console.log('name of the 2nd person = ',persons[1])
            console.log('length of persons = ',persons.length)
            console.log('==================')

            var electronicThings = new Array('Fan','Tube light','TV','Washing Machine','laptop')
            console.log('electronic things names = ',electronicThings);
            console.log('name of the 3rd electronic things = ',electronicThings[2]);
            console.log('length of the electronic things = ',electronicThings.length)

            //Arrays without using new keyword
            var cars=['Aadi','Benze','Toyota','suzuki']
            console.log('car=',cars);
            console.log('car name=',cars[2]);
            console.log('car length=',cars.length);
            console.log('================')

            var vehicals = ['cars','Bus','train','aeroplane','bicycle']
            console.log('vehicals = ',vehicals);
            console.log('vehicals names = ',vehicals[4]);
            console.log('vehicals length = ',vehicals.length)
            console.log('===============')

            var familyMembers = ['Father','Mother','Brother','Sister','Myself']
            console.log('family members = ',familyMembers);
            console.log('family members name = ',familyMembers[3])
            console.log('length of the family members = ',familyMembers.length)
            console.log('======================')

            var Mobile = ['Redmi','samsung','lenova','honor','huawei']
            console.log('mobile = ',Mobile);
            console.log('name of the mobile = ',Mobile[4]);
            console.log('length of the mobile = ',Mobile.length)
            console.log('==============')

            var colors = ['blue','red','green','black','white']
            console.log('colors = ',colors)
            console.log('name of the color = ',colors[2]);
            console.log('length of the colors = ',colors.length)
            console.log('=============')
            //Array using loop
            var colors=['Blue','Black','Green','Yellow','Red']
            for(var i=0;i<colors.length;i++)
            {
                console.log(colors[i]);
            }

         
