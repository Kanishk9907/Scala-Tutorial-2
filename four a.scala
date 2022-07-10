object four extends App{
  var NormalHR_rate:Double=250.00;
  var OThr_rate:Double=85.00;
  var NormalHR:Double=40;
  var OThr:Double=30;
  var full_sallary:Double=(NormalHR_rate*NormalHR + OThr_rate*OThr)*4;
  var tax:Double=full_sallary*0.12;

  var take_home_salary:Double=full_sallary-tax;

  println("Take home salary =Rs. " +take_home_salary);
}

