import java.util.Date

/**
  * Created by seranti on 10/28/2016.
  */
class Work_Log__c {

  var appointmentItem: AppointmentItem
  var approvedBy: String
  var approvedOn: Date
  var CalendarDisplay: String
  var CTSCdepartment: String
  var date: Date
  var department: String

  def timeFiles(){
    println("time files like an arrow....")
  }

}
