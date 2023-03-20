import java.util.Scanner; 

public class SchoolManagementSystem {

    // Details of school

    static void schooldetails(){

        System.out.println("\n--Details of School-- ");
        System.out.println("\n (1). Staff Details \n (2). Student Details ");
        
        System.out.print("\n -Choose the S.No of the details you want : ");

        Scanner sc = new Scanner (System.in);
        int det = sc.nextInt();

        switch(det){

            case 1 :{

                StaffDetails();
                break;
            
            }
            case 2:{

                StudentsDetails();
                break;
            
            }
            default : {

                System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                
            }
        }
    }

    // Details of Staff

    static void StaffDetails(){

        char ch = 0;

        while (true){

            System.out.println("\n (1). Teaching Staff \n (2). Non-Teaching Staff \n (3). Cleaning Staff ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();

            if (ch=='y'|| ch == 'Y'){

            System.out.print("\n -Enter the index no. of Staff Details : "); 
        
            int Staffdet = sc.nextInt();
            
            switch(Staffdet){
                
                case 1 : {
                    
                    System.out.println("Teaching Staff Details");
                    TeachingStaff();;
                    break;
                
                }
                case 2 : {
                    
                    System.out.println(" Non-Teaching Staff Details");
                    NonTeachStaff();
                    break;
                
                }
                case 3 : {
                    System.out.println("Cleaning staff");
                    CleaningStaff();
                    break;
                
                }
                default :{
                    
                    System.out.println(" Enter the correct index no. ");
                
                }
            }
        }else {
            schooldetails();
            break;
        
        }
        break;
    }
}

       //Details of teaching staff

       static void TeachingStaff(){

        char ch = 0;

        while(true){
            System.out.println("\n (1). Mr. Kaushal Pandey \n (2). Mr. Satyam Kumar \n (3). Mr. Ritesh Mishra \n (4). Mr. Sneha Sharma \n (5). Mr. Akshat Dhiman \n (6). Ms. Juhi Jha \n (7). Mr. Monarch Baweja ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
            
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    System.out.print("\n -Enter the index no. of Teacher  : ");
                    int teachingstaffdet = sc.nextInt();
                    
                    switch(teachingstaffdet){

                        case 1 : {
                            
                            System.out.println("\n Education : B.A. \n Experience : 3 Years \n Salary : RS. 28,500 p.m/- \n Behaviour : A Caring, Kind, engage students in class and have good subject knowledge. ");
                            break;

                        }
                        case 2 : {

                            System.out.println("\n Education : B.Ed \n Experience : 5 Years \n Salary : RS. 38,000 p.m/- \n Behaviour : A highly experienced and expert in his subject. Engage students in class. ");
                            break;

                        }
                        case 3 : {

                            System.out.println("\n Education : B.Com \n Experience : 2 Years \n Salary : RS. 20,500 p.m/- \n Behaviour : A Creative , Passionate and dedicated to his teaching.Students have a good review about him ");
                            break;
                        
                        }
                        case 4 : {
                            
                            System.out.println("\n Education : B.A. M.A. \n Experience : 5 Years \n Salary : RS. 38,500 p.m/- \n Behaviour : A Punctual, Strong knowledge of her subject and higly experienced teacher . ");
                            break;
                        }
                        case 5 : {
                            
                            System.out.println("\n Education : B.A. \n Experience : 2 Years \n Salary : RS. 21,500 p.m/- \n Behaviour : A highly motivated and dedicated teacher . Students have a good review about him ");
                            break;
                        
                        }
                        case 6 : {
                            
                            System.out.println("\n Education : B.A. B.Ed \n Experience : 2 Years \n Salary : RS. 26,500 p.m/- \n Behaviour : A highly motivated , humourous and engaging students in class. Students have a good review about her ");
                            break;
                        
                        }
                        case 7 : {
                            
                            System.out.println("\n Education : B.Sc \n Experience : 3 Years \n Salary : RS. 30,500 p.m/- \n Behaviour : A Punctual , Creative and Empathatic Teacher . Students have a good review about him ");
                            break;
                        }
                        default : {
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                            break;
                        }
                    }
                    System.out.print(" \nWant to know about other teacher detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                }while(ch == 'y'|| ch == 'Y');
            }
            else{
                
                StaffDetails();
            }
        }
    }

    // Details of Non - Teaching Staff 

       static void NonTeachStaff(){
        char ch = 0;

        while(true){

            System.out.println("\n (1). Mr. Ram Singh \n (2). Mr. Rakesh Negi \n (3). Mr. Sachin Bhoir \n (4). Mrs. Anjali Raina ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
    
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print("\n -Enter the index value- : ");
                    int nonteachstaffdet = sc.nextInt();
                    switch(nonteachstaffdet){
                        
                        case 1:{
                            
                            System.out.println("\n Education : 12th Pass \n Salary : Rs.9,500 p.m./- \n Behaviour : Punctual and have good nature ");
                            break;
                        
                        }
                        case 2:{
                            
                            System.out.println("\n Education : 10th Pass \n Salary : Rs.7,500 p.m./- \n Behaviour : Punctual, maintains discipline and order in a very good manner. ");
                            break;
                        }
                        case 3:{
                            System.out.println("\n Education : B.Com \n Salary : Rs.13,500 p.m./- \n Behaviour : Punctual,Completing work in time and have good nature ");
                            break;
                        }
                        case 4:{
                            
                            System.out.println("\n Education : 10th Pass \n Salary : Rs.8,500 p.m./- \n Behaviour : Punctual, engaging nature with students and have positive personality ");
                            break;
                        
                        }
                        
                        default : {
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                        
                        }
                    }
                    System.out.print(" \nWant to know about other non teaching staff detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                }while(ch == 'y'|| ch == 'Y');
            }else{
                
                StaffDetails();
            }
        }
    }


       // Details of Cleaning Staff 

       static void CleaningStaff(){

        char ch = 0;

        while(true){

            System.out.println("\n (1). Mr. Hemant Yadav \n (2). Mr. Nageshwar Rao \n (3). Mrs. Ekta Singh \n (4). Mrs. Renuka Patil ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
    
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print(" - Enter the index value - : ");
                    int Cleanstaffdet = sc.nextInt();
                    
                    switch(Cleanstaffdet){
                        
                        case 1:{
                            
                            System.out.println("\n Salary : Rs.7,500 p.m./- \n Behaviour : Punctual and doing good work ");
                            break;
                        
                        }
                        case 2:{
                            
                            System.out.println("\n Salary : Rs.7,500 p.m./- \n Behaviour : Punctual and have good nature ");
                            break;
                        
                        }
                        case 3:{
                            
                            System.out.println("\n Salary : Rs.8,500 p.m./- \n Behaviour : Punctual and maintain good cleaning environment ");
                            break;
                        
                        }
                        case 4:{
                            
                            System.out.println("\n Salary : Rs.9,500 p.m./- \n Behaviour : Punctual and maintain the cleaning staff ");
                            break;
                        
                        }
                        
                        default : {
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                        
                        }
                    }
                    System.out.print(" \nWant to know about other cleaning staff detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                }while(ch == 'y'|| ch == 'Y');
            }else{
                StaffDetails();
            }
        }
    }

       // Details of Students 

       static void StudentsDetails(){

        char ch = 0;

        while(true){

            System.out.println("\n (1). Standard I \n (2). Standard II \n (3). Standard III \n (4). Standard IV \n (5). Standard V ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();

            if (ch=='y'|| ch == 'Y'){
                
                System.out.print("\n --Enter the index value -- : ");
                int classdet = sc.nextInt();
                
                switch (classdet){
                    
                    case 1 : {
                        
                        System.out.println("\n --Details of Standard I students-- ");
                        StandardI();
                        break;
                    
                    }
                    case 2 : {
                        
                        System.out.println("\n --Details of Standard I students-- ");
                        StandardII();
                        break;
                    
                    }
                    case 3 : {
                        
                        System.out.println("\n --Details of Standard I students-- ");
                        StandardIII();
                        break;
                    
                    }
                    case 4 : {
                        
                        System.out.println("\n --Details of Standard I students-- ");
                        StandardIV();
                        break;
                    
                    }
                    case 5 : {
                        
                        System.out.println("\n --Details of Standard I students-- ");
                        StandardV();
                        break;
                    
                    }
                    
                    default:{
                        
                        System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                    }
                }
            }else{
                
                schooldetails();
            }
        }
    }

       //Details of marks of student from Standard I to Standard III

        static void marks1(){
            
            char ch = 0;
            Scanner sc = new Scanner (System.in);
            System.out.print("\n\nDo you want to know about the result (Y/N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
            
            if (ch=='y'|| ch == 'Y'){

                System.out.print("\n-Enter the marks obtained in Subject (from 100)- ");
                System.out.print("\n\nMaths : ");
                float mt = sc.nextFloat();
                System.out.print("\nEnglish : ");
                float eng = sc.nextFloat();
                System.out.print("\nHindi : ");
                float hd = sc.nextFloat();
                System.out.print("\nEVS : ");
                float evs = sc.nextFloat();
                System.out.print("\nGeneral Awareness : ");
                float ga = sc.nextFloat();
                float totalobtained = mt+eng+hd+evs+ga;
                float per = (totalobtained/500)*100;
                System.out.println("\nPercantage : "+per);
                
                if (per > 35){
                    
                    System.out.println(" --PASSED-- ");
                }
                else{
                    
                    System.out.println(" --FAIL-- ");
                }
            }
        }

    // Details of marks of student from Standard IV to Standard V

       static void marks2(){
        
        char ch = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("\n\nDo you want to know about the result (Y/N) : ");
        ch = sc.next().charAt(ch);
        sc.nextLine();

        if (ch=='y'|| ch == 'Y'){
            
            System.out.print("\n-Enter the marks obtained in Subject (from 100)- ");
            System.out.print("\n\nMaths : ");
            float mt = sc.nextFloat();
            System.out.print("\nEnglish : ");
            float eng = sc.nextFloat();
            System.out.print("\nHindi : ");
            float hd = sc.nextFloat();
            System.out.print("\nSanskrit : ");
            float st = sc.nextFloat();
            System.out.print("\nEVS : ");
            float evs = sc.nextFloat();
            System.out.print("\nGeneral Awareness : ");
            float ga = sc.nextFloat();
            System.out.print("\nComputer Education : ");
            float ce = sc.nextFloat();
            
            float totalobtained = mt+eng+hd+st+evs+ga+ce;
            float per = (totalobtained/500)*100;
            System.out.println("\nPercantage : "+per);
            
            if (per > 35){
                System.out.println(" --PASSED-- ");
            }
            else{
                System.out.println(" --FAIL-- ");
            
            }
        }
    }

       // Details of Standard I students 

       static void StandardI(){

        char ch = 0;
        
        while (true){
            
            System.out.println("\n (1). Aman Sinha \n (2). Rajvi Singh \n (3). Harsh Arora \n (4). Anchal Rai \n (5). Shruti Patil \n (6). Shreya Gupta ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
            
            if (ch=='y'|| ch == 'Y'){
                
                do {
                    
                    System.out.print("\n -- Enter the index value of student -- : ");
    
                    int studdet = sc.nextInt();
                    
                    switch(studdet){
                        
                        case 1 : {
                            
                            System.out.println("\n Name : Aman Sinha \n Father's Name : Mr. Jayraj Sinha \n Mother's Name : Mrs. Kiran Sinha \n Contact No. : +91-9586742314");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+16500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY THE STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;
                        }
                        case 2 : {
                            
                            System.out.println("\n Name : Rajvi Singh \n Father's Name : Mr. Ramesh Singh \n Mother's Name : Mrs. Kavita Singh \n Contact No. : +91-7586276514");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lfs12 = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float efs12 = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trfs12 = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tufs12 = sc.nextFloat();
                            float tfs12 = 300+1200+600+16500;
                            float dfs12 = tfs12-(lfs12+efs12+trfs12+tufs12);
                            System.out.println("\nDUE FEE (Rs) :- "+dfs12);
                            
                            if (dfs12==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY THE STUDENT");
                            
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;
                        }
                        case 3 : {

                            System.out.println("\n Name : Harsh Arora \n Father's Name : Mr. Nikesh Arora \n Mother's Name : Mrs. Mahima Arora \n Contact No. : +91-887542314");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lfs13 = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float efs13 = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trfs13 = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tufs13 = sc.nextFloat();
                            float tfs13 = lfs13+efs13+trfs13+tufs13;
                            float dfs13 = tfs13-(lfs13+efs13+trfs13+tufs13);
                            System.out.println("\nDUE FEE (Rs) :- "+dfs13);
                            
                            if (dfs13==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY THE STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;
                        
                        }
                        case 4 : {

                            System.out.println("\n Name : Anchal Rai \n Father's Name : Mr. Rajesh Rai \n Mother's Name : Mrs. Ramika Rai \n Contact No. : +91-8523469712");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lfs14 = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float efs14 = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trfs14 = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tufs14 = sc.nextFloat();
                            float tfs14 = 300+1200+600+16500;
                            float dfs14 = tfs14-(lfs14+efs14+trfs14+tufs14);
                            System.out.println("\nDUE FEE (Rs) :- "+dfs14);
                            
                            if (dfs14==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 5 : {

                            System.out.println("\n Name : Shruti Patil \n Father's Name : Mr. Shivraj Patil \n Mother's Name : Mrs. Kamlesh Patil \n Contact No. : +91-7468197350");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lfs15 = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float efs15 = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trfs15 = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tufs15 = sc.nextFloat();
                            float tfs15 = 300+1200+600+16500;
                            float dfs15 = tfs15-(lfs15+efs15+trfs15+tufs15);
                            System.out.println("\nDUE FEE (Rs) :- "+dfs15);
                            
                            if (dfs15==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 6 : {

                            System.out.println("\n Name : Shreya GUpta \n Father's Name : Mr. Rakesh Gupta \n Mother's Name : Mrs. Bimla Gupta \n Contact No. : +91-9937418260");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lfs16 = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float efs16 = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trfs16 = sc.nextFloat();
                            System.out.print("\n Tuition Fee (16500/-) : ");
                            float tufs16 = sc.nextFloat();
                            float tfs16 = 300+1200+600+16500;
                            float dfs16 = tfs16-(lfs16+efs16+trfs16+tufs16);
                            System.out.println("\nDUE FEE (Rs) :- "+dfs16);
                            
                            if (dfs16==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{

                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");

                            }
                            marks1();
                            break;
                        
                        }
                        default :{
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                        
                        }
                    }
                    
                    System.out.print(" \nWant to know about other student detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                }while(ch == 'y'|| ch == 'Y');
            }
            else{
                
                StudentsDetails();
            }
        }
    }
 

       // Details of Standard II students 

       static void StandardII(){

        char ch = 0;
        while(true){
            
            System.out.println("\n (1). Rahul Sharma \n (2). Akash Verma \n (3). Harshita Patel \n (4). Sneha Gupta \n (5). Adik Mehta \n (6). Richa Khera ");
    
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
            
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print("\n -- Enter the index value of student -- : ");
                    
                    int studdet = sc.nextInt();
                    
                    switch(studdet){
                        
                        case 1 : {
                            
                            System.out.println("\n Name : Rahul Sharma \n Father's Name : Mr. Hemant Sharma \n Mother's Name : Mrs. Ranika Sharma \n Contact No. : +91-6879452138");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 2 : {
                            
                            System.out.println("\n Name : Akash Verma \n Father's Name : Mr. Rahul Verma \n Mother's Name : Mrs. Kavita Verma \n Contact No. : +91-7456891825");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf =300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 3 : {
                            
                            System.out.println("\n Name : Harshita Patel \n Father's Name : Mr. Nikesh Patel \n Mother's Name : Mrs. Mahima Patel \n Contact No. : +91-9513574658");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 4 : {

                            System.out.println("\n Name : Sneha Gupta \n Father's Name : Mr. Akash Gupta \n Mother's Name : Mrs. Richa Gupta \n Contact No. : +91-8426872913");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 5 : {
                            
                            System.out.println("\n Name : Adik Mehta \n Father's Name : Mr. Shivraj Mehta \n Mother's Name : Mrs. Kamlesh Mehta \n Contact No. : +91-7468197350");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 6 : {
                            
                            System.out.println("\n Name : Richa Khare \n Father's Name : Mr. Rakesh Khare \n Mother's Name : Mrs. Bimla Khare \n Contact No. : +91-9937418260");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1200/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (20000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1200+600+20000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        
                        default :{
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");
                        
                        }
                    }
                    
                    System.out.print(" \nWant to know about other student detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                    }while(ch == 'y'|| ch == 'Y');
                }
                else{
                    
                    StudentsDetails();
                }
            }
        }
   

    // Details of Standard III students 

       static void StandardIII(){

        char ch = 0 ;
        while(true){
            
            System.out.println("\n (1). Mamta Soma \n (2). Pravin Waghmare \n (3). Priya Lenka \n (4). Sandip Patil \n (5). Prathmesh Mittal \n (6). Janvi Gurme ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
    
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print("\n -- Enter the index value of student -- : ");
                    int studdet = sc.nextInt();
                    
                    switch(studdet){
                        
                        case 1 : {
                            
                            System.out.println("\n Name : Mamta Soma \n Father's Name : Mr. Rahul Soma \n Mother's Name : Mrs. Mahima Soma \n Contact No. : +91-6872582138");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 2 : {
                            
                            System.out.println("\n Name : Pravin Waghmare \n Father's Name : Mr. Anupam Waghmare \n Mother's Name : Mrs. Namita Waghmare \n Contact No. : +91-8546891825");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 3 : {

                            System.out.println("\n Name : Priya Lenka \n Father's Name : Mr. Nilesh Lenka \n Mother's Name : Mrs. Madhu Lenka \n Contact No. : +91-7458964658");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 4 : {

                            System.out.println("\n Name : Sandip Patil \n Father's Name : Mr. Amitabh Patil \n Mother's Name : Mrs. Richa Patil \n Contact No. : +91-8426872913");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 5 : {

                            System.out.println("\n Name : Prathmesh Mittal \n Father's Name : Mrs. Shivraj Mittal \n Mother's Name : Mrs. Kamlesh Mittal \n Contact No. : +91-7468197350");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        case 6 : {

                            System.out.println("\n Name : Janvi Gurme \n Father's Name : Mr. Rakesh Gurme \n Mother's Name : Mrs. Bimla Gurme \n Contact No. : +91-9937418260");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (23500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+23500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks1();
                            break;

                        }
                        default :{
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");

                        }
                    
                    }
                    
                    System.out.print(" \nWant to know about other student detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                    }while(ch == 'y'|| ch == 'Y');
                
                }else{
                    
                    StudentsDetails();
                }
            }
        }
    

       // Details of Standard IV students 

       static void StandardIV(){

        char ch = 0;

        while(true){
            
            System.out.println("\n (1). Omkar Dhumal \n (2). Yuvraj Chavan \n (3). Preeti Kamble \n (4). Aditi Thakre \n (5). Prem Kumar \n (6). Jayant Pawar ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
    
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print("\n -- Enter the index value of student -- : ");
        
                    int studdet = sc.nextInt();
                    
                    switch(studdet){
                        
                        case 1 : {
                            
                            System.out.println("\n Name : Omkar Dhumal \n Father's Name : Mr. Rakesh Dhumal \n Mother's Name : Mrs. Madhu Dhumal \n Contact No. : +91-6872582138");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        case 2 : {

                            System.out.println("\n Name : Yuvraj Chavan \n Father's Name : Mr. Anuket Chavan \n Mother's Name : Mrs. Namisha Chavan \n Contact No. : +91-8546891825");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        case 3 : {

                            System.out.println("\n Name : Preeti Kamble \n Father's Name : Mr. Nimesh Kamble \n Mother's Name : Mrs. Anita Kamble \n Contact No. : +91-7458964658");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                                
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        case 4 : {

                            System.out.println("\n Name : Aditi Thakre \n Father's Name : Mr. Amitesh Thakre \n Mother's Name : Mrs. Rina Kamble \n Contact No. : +91-8426872913");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{

                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        case 5 : {

                            System.out.println("\n Name : Prem Kumar \n Father's Name : Mr. Shivam Kumar \n Mother's Name : Mrs. Komal Kumar \n Contact No. : +91-7468197350");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{

                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        case 6 : {

                            System.out.println("\n Name : Jayant Pawar \n Father's Name : Mr. Ramesh Pawar \n Mother's Name : Mrs. Binita Pawar \n Contact No. : +91-9937418260");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1500/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (29500/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1500+600+29500;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{
                    
                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
                        
                        default :{
                            
                            System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");

                        }
                    }
                    System.out.print(" \nWant to know about other student detail(Y/N) : ");
                    ch = sc.next().charAt(ch);
                    sc.nextLine();
                    }while(ch == 'y'|| ch == 'Y');
                }else{
                    
                    StudentsDetails();
                }
            }
        }
 

       // Details of Standard V students 

       static void StandardV(){

        char ch = 0 ;
        while(true){
            
            System.out.println("\n (1). Nimesh Shinde \n (2). Yukta Chawla \n (3). Pranav Dhiman \n (4). Anika Lamba \n (5). Prashant Sharma \n (6). Shivam Roy ");
            Scanner sc = new Scanner (System.in);
            System.out.print("\nDo you want to continue(Y) or else want to go back in previous details (N) : ");
            ch = sc.next().charAt(ch);
            sc.nextLine();
    
            if (ch=='y'|| ch == 'Y'){
                
                do{
                    
                    System.out.print("\n -- Enter the index value of student -- : ");
        
                    int studdet = sc.nextInt();
                    
                    switch(studdet){
                        
                        case 1 : {
                            
                            System.out.println("\n Name : Nimesh Shinde \n Father's Name : Mr. Yuvraj Shinde \n Mother's Name : Mrs. Madhumita Shinde \n Contact No. : +91-6872582138");
                            System.out.println("\n--FEE DETAILS--");
                            System.out.print("Enter the fee paid by student in Rs :- ");
                            System.out.print("\nLibrary Fee (300/-) in Rs : ");
                            float lf = sc.nextFloat();
                            System.out.print("\nExamination Fee (1700/-) in Rs : ");
                            float ef = sc.nextFloat();
                            System.out.print("\nTransportation Fee (600/-) in Rs : ");
                            float trf = sc.nextFloat();
                            System.out.print("\n Tuition Fee (34000/-) : ");
                            float tuf = sc.nextFloat();
                            float tf = 300+1700+600+34000;
                            float df = tf-(lf+ef+trf+tuf);
                            System.out.println("\nDUE FEE (Rs) :- "+df);
                            
                            if (df==0){
                                
                                System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                            }
                            else{

                                System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                            }
                            marks2();
                            break;

                        }
            case 2 : {

                System.out.println("\n Name : Yukta Chawla \n Father's Name : Mr. Aniket Chawla \n Mother's Name : Mrs. Nikita Chawla \n Contact No. : +91-8546891825");
                System.out.println("\n--FEE DETAILS--");
                System.out.print("Enter the fee paid by student in Rs :- ");
                System.out.print("\nLibrary Fee (300/-) in Rs : ");
                float lf = sc.nextFloat();
                System.out.print("\nExamination Fee (1700/-) in Rs : ");
                float ef = sc.nextFloat();
                System.out.print("\nTransportation Fee (600/-) in Rs : ");
                float trf = sc.nextFloat();
                System.out.print("\n Tuition Fee (34000/-) : ");
                float tuf = sc.nextFloat();
                float tf = 300+1700+600+34000;
                float df = tf-(lf+ef+trf+tuf);
                System.out.println("\nDUE FEE (Rs) :- "+df);
                if (df==0){
                    System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                }
                else{
                    System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                }
                marks2();
                break;

            }
            case 3 : {

                System.out.println("\n Name : Pranav Dhiman \n Father's Name : Mr. Krunal Dhiman \n Mother's Name : Mrs. Garima Dhiman \n Contact No. : +91-7458964658");
                System.out.println("\n--FEE DETAILS--");
                System.out.print("Enter the fee paid by student in Rs :- ");
                System.out.print("\nLibrary Fee (300/-) in Rs : ");
                float lf = sc.nextFloat();
                System.out.print("\nExamination Fee (1700/-) in Rs : ");
                float ef = sc.nextFloat();
                System.out.print("\nTransportation Fee (600/-) in Rs : ");
                float trf = sc.nextFloat();
                System.out.print("\n Tuition Fee (34000/-) : ");
                float tuf = sc.nextFloat();
                float tf = 300+1700+600+34000;
                float df = tf-(lf+ef+trf+tuf);
                System.out.println("\nDUE FEE (Rs) :- "+df);
                if (df==0){
                    System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                }
                else{
                    System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                }
                marks2();
                break;

            }
            case 4 : {

                System.out.println("\n Name : Anika Lamba \n Father's Name : Mr. Pritam Lamba \n Mother's Name : Mrs. Seema Lamba \n Contact No. : +91-8426872913");
                
                System.out.println("\n--FEE DETAILS--");
                System.out.print("Enter the fee paid by student in Rs :- ");
                System.out.print("\nLibrary Fee (300/-) in Rs : ");
                float lf = sc.nextFloat();
                System.out.print("\nExamination Fee (1700/-) in Rs : ");
                float ef = sc.nextFloat();
                System.out.print("\nTransportation Fee (600/-) in Rs : ");
                float trf = sc.nextFloat();
                System.out.print("\n Tuition Fee (34000/-) : ");
                float tuf = sc.nextFloat();
                float tf = 300+1700+600+34000;
                float df = tf-(lf+ef+trf+tuf);
                System.out.println("\nDUE FEE (Rs) :- "+df);
                if (df==0){
                    System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                }
                else{
                    System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                }
                marks2();
                break;

            }
            case 5 : {

                System.out.println("\n Name : Prashant Sharma \n Father's Name : Mr. Brij Sharma \n Mother's Name : Mrs. Komal Sharma \n Contact No. : +91-7468197350");
                System.out.println("\n--FEE DETAILS--");
                System.out.print("Enter the fee paid by student in Rs :- ");
                System.out.print("\nLibrary Fee (300/-) in Rs : ");
                float lf = sc.nextFloat();
                System.out.print("\nExamination Fee (1700/-) in Rs : ");
                float ef = sc.nextFloat();
                System.out.print("\nTransportation Fee (600/-) in Rs : ");
                float trf = sc.nextFloat();
                System.out.print("\n Tuition Fee (34000/-) : ");
                float tuf = sc.nextFloat();
                float tf = 300+1700+600+34000;
                float df = tf-(lf+ef+trf+tuf);
                System.out.println("\nDUE FEE (Rs) :- "+df);
                if (df==0){
                    System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                }
                else{
                    System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                }
                marks2();
                break;

            }
            case 6 : {

                System.out.println("\n Name : Shivam Roy \n Father's Name : Mr. Rakesh Roy \n Mother's Name : Mrs. Mamta Roy \n Contact No. : +91-9937418260");
                System.out.println("\n--FEE DETAILS--");
                System.out.print("Enter the fee paid by student in Rs :- ");
                System.out.print("\nLibrary Fee (300/-) in Rs : ");
                float lf = sc.nextFloat();
                System.out.print("\nExamination Fee (1700/-) in Rs : ");
                float ef = sc.nextFloat();
                System.out.print("\nTransportation Fee (600/-) in Rs : ");
                float trf = sc.nextFloat();
                System.out.print("\n Tuition Fee (34000/-) : ");
                float tuf = sc.nextFloat();
                float tf = 300+1700+600+34000;
                float df = tf-(lf+ef+trf+tuf);
                System.out.println("\nDUE FEE (Rs) :- "+df);
                if (df==0){
                    System.out.print("\n NO OUTSTANDING FEE TO BE PAID BY STUDENT ");
                }
                else{
                    System.out.print("\n PLEASE PAY THE DUE FEE ON TIME");
                }
                marks2();
                break;

            }
            default :{

                System.out.println("\n OOPS! WRONG INDEX VALUE . PLEASE TRY AGAIN...!");

            }
        
        }
        System.out.print(" \nWant to know about other student detail(Y/N) : ");
        ch = sc.next().charAt(ch);
        sc.nextLine();
        }while(ch == 'y'|| ch == 'Y');
    }else{
        StudentsDetails();
    }
}

    }
 
    public static void main(String[] args) {

        System.out.println("\t\t     * * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.println("\t\t     * \t\t  DELHI PUBLIC SCHOOL \t\t   *\n\t\t     *\t    Vasant Vihar, New Delhi, 110057 \t   *\n\t\t     *\t Contact N0. :- 9898989898 , 0120-252525   *");
        
        System.out.println("\t\t     * * * * * * * * * * * * * * * * * * * * * * * * ");

        System.out.println("\n\t\t          --------------------------------");
        
        System.out.println("\t\t\t      SCHOOL MANAGEMENT SYSTEM ");
        
        System.out.println("\t\t          --------------------------------");

        schooldetails();
        
}
}
