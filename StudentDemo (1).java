package task;

final class FailedStudent {
 private final int rollNumber;
 private final String subjectCode;
 private final String subjectName;

 public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 @Override
 public String toString() {
     return "FailedStudent [RollNumber=" + rollNumber + ", SubjectCode=" + subjectCode + ", SubjectName=" + subjectName + "]";
 }
}

class PromotedStudent {
 private int rollNumber;
 private String subjectCode;
 private String subjectName;

 public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 public void setSubjectCode(String subjectCode) {
     this.subjectCode = subjectCode;
 }

 public void setSubjectName(String subjectName) {
     this.subjectName = subjectName;
 }

 @Override
 public String toString() {
     return "PromotedStudent [RollNumber=" + rollNumber + ", SubjectCode=" + subjectCode + ", SubjectName=" + subjectName + "]";
 }
}

public class StudentDemo {
 public static void main(String[] args) {
  
     FailedStudent failedStudent = new FailedStudent(101, "CS101", "Data Structures & Algorithms");
     System.out.println("Immutable Failed Student Details:");
     System.out.println(failedStudent);

     PromotedStudent promotedStudent = new PromotedStudent(102, "CS102", "Operating Systems");
     System.out.println("\nMutable Promoted Student Details:");
     System.out.println(promotedStudent);

     promotedStudent.setRollNumber(103);
     promotedStudent.setSubjectCode("CS103");
     promotedStudent.setSubjectName("Artificial Intelligence");
     System.out.println("\nUpdated Mutable Promoted Student Details:");
     System.out.println(promotedStudent);
 }
}
