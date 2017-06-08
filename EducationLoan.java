package com.cognizant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="EDUCATION_LOAN_DETAILS")
public class EducationLoan {
               
              
                @Column(name="EDUCATION_LOAN_ID",length=16)
                private String Education_Loan_ID;
                
               // @Column(name="Account_number")
               // private int Account_Number;
                @Id
                
                @Column(name="Edu_Loan_Account_Number",length=16)
                @Min(1)
                private long Edu_Loan_Account_Number;
                
         
               	
                @Column(name="Edu_Loan_Amount",length=16)
                @Min(1)
                private double Edu_Loan_Amount;
                
                
                @Column(name="Loan_Apply_Date")
                
                private Date Loan_Apply_Date;
                
                
                @Column(name="Edu_Loan_Duration",length=2)
                
                private int Edu_Loan_Duration;
                
 
               

               
				@Column(name="Father_Annual_Income",length=16)
				@Min(1)
                private double Father_Annual_Income;
                
				
                @Column(name="Course_Fee",length=16)
                @Min(1)
                private double Course_Fee;
                
                
                @Column(name="Course_Name",length=20)
                @Size(max=16)
                private String Course_Name;
            	
                
                @Column(name="Father_Name",length=20)
                @Size(max=16)
                private String Father_Name;
            	
            	              
                @Column(name="ID_Card_Number",length=16)
                @Min(1)
                private long ID_Card_Number;
                
            	
            	@JsonBackReference
            	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
           	    @JoinColumn(name = "ACCOUNT_NUMBER")
                private UserDetails userDtails; 
                
              //  public List <educationLoanVO> list=new ArrayList<educationLoanVO>() ;
               // EducationLoan obj=new EducationLoan();
                
  

				public EducationLoan() {
                                super();
                                // TODO Auto-generated constructor stub
                }
                
              
                //Getters and Setters for EducationLoan


                public String getEducation_Loan_ID() {
                                return Education_Loan_ID;
                }
                public void setEducation_Loan_ID(String id) {
                                Education_Loan_ID = id;
                }
           /* public int getAccount_Number() {
                                return Account_Number;
                }
                public void setAccount_Number(int account_Number) {
                                Account_Number = account_Number;
                }*/
                public long getEdu_Loan_Account_Number() {
                                return Edu_Loan_Account_Number;
                }
                public void setEdu_Loan_Account_Number(long l) {
                                Edu_Loan_Account_Number = l;
                }
                public double getEdu_Loan_Amount() {
                                return Edu_Loan_Amount;
                }
                public void setEdu_Loan_Amount(double edu_Loan_Amount) {
                                Edu_Loan_Amount = edu_Loan_Amount;
                }
                public Date getLoan_Apply_Date() {
                                return Loan_Apply_Date;
                }
                public void setLoan_Apply_Date(Date loan_Apply_Date) {
                                Loan_Apply_Date = loan_Apply_Date;
                }
                public int getEdu_Loan_Duration() {
                                return Edu_Loan_Duration;
                }
                public void setEdu_Loan_Duration(int edu_Loan_Duration) {
                                Edu_Loan_Duration = edu_Loan_Duration;
                }
                public double getFather_Annual_Income() {
                                return Father_Annual_Income;
                }
                public void setFather_Annual_Income(double father_Annual_Income) {
                                Father_Annual_Income = father_Annual_Income;
                }
                public double getCourse_Fee() {
                                return Course_Fee;
                }
                public void setCourse_Fee(double course_Fee) {
                                Course_Fee = course_Fee;
                }
                public String getCourse_Name() {
                                return Course_Name;
                }
                public void setCourse_Name(String course_Name) {
                                Course_Name = course_Name;
                }
                public String getFather_Name() {
                                return Father_Name;
                }
                public void setFather_Name(String father_Name) {
                                Father_Name = father_Name;
                }
                public long getID_Card_Number() {
                                return ID_Card_Number;
                }
                public void setID_Card_Number(long iD_Card_Number) {
                                ID_Card_Number = iD_Card_Number;
                }
               

                public EducationLoan( long edu_Loan_Account_Number, double edu_Loan_Amount,
 						Date loan_Apply_Date, int edu_Loan_Duration, double father_Annual_Income, double course_Fee,
 						String course_Name, String father_Name, int iD_Card_Number) {
 					super();
 					//Education_Loan_ID = education_Loan_ID;
 					Edu_Loan_Account_Number = edu_Loan_Account_Number;
 					Edu_Loan_Amount = edu_Loan_Amount;
 					Loan_Apply_Date = loan_Apply_Date;
 					Edu_Loan_Duration = edu_Loan_Duration;
 					Father_Annual_Income = father_Annual_Income;
 					Course_Fee = course_Fee;
 					Course_Name = course_Name;
 					Father_Name = father_Name;
 					ID_Card_Number = iD_Card_Number;
 				}


				

				public EducationLoan(long edu_Loan_Account_Number, double edu_Loan_Amount,
						Date loan_Apply_Date, int edu_Loan_Duration, double father_Annual_Income, double course_Fee,
						String course_Name, String father_Name, long iD_Card_Number, UserDetails userDtails) {
					super();
					//Education_Loan_ID = education_Loan_ID;
					Edu_Loan_Account_Number = edu_Loan_Account_Number;
					Edu_Loan_Amount = edu_Loan_Amount;
					Loan_Apply_Date = loan_Apply_Date;
					Edu_Loan_Duration = edu_Loan_Duration;
					Father_Annual_Income = father_Annual_Income;
					Course_Fee = course_Fee;
					Course_Name = course_Name;
					Father_Name = father_Name;
					ID_Card_Number = iD_Card_Number;
					this.userDtails = userDtails;
				}


				public UserDetails getUserDtails() {
					return userDtails;
				}


				public void setUserDtails(UserDetails userDtails) {
					this.userDtails = userDtails;
				}


				@Override
				public String toString() {
					return "EducationLoan [Education_Loan_ID=" + Education_Loan_ID + ", Edu_Loan_Account_Number="
							+ Edu_Loan_Account_Number + ", Edu_Loan_Amount=" + Edu_Loan_Amount + ", Loan_Apply_Date="
							+ Loan_Apply_Date + ", Edu_Loan_Duration=" + Edu_Loan_Duration + ", Father_Annual_Income="
							+ Father_Annual_Income + ", Course_Fee=" + Course_Fee + ", Course_Name=" + Course_Name
							+ ", Father_Name=" + Father_Name + ", ID_Card_Number=" + ID_Card_Number + "]";
				}




			



                
              
                
                
}
