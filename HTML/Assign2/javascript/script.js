
function roomBooking() {
    // console.log("Room Booking Sucessfull...");
    var fromdate = document.getElementById("formdate").value;
    var todate = document.getElementById("todate").value;
    var purpose = document.getElementById("purpose").value;
    var numberOfPeoples=document.getElementById("people").value;
    var id=document.getElementById("empid").value;

    if(!formdate || !todate || !purpose)
    {
        alert("Booking Sucessful...");
        return;
    }
   

    var show=document.getElementById("show");
    var newRow=show.insertRow(show.length);
    var c1=newRow.insertCell(0);
    var c2=newRow.insertCell(1);
    var c3=newRow.insertCell(2);

    c1.innerHTML=formdate;
    c2.innerHTML=todate;
    c3.innerHTML=purpose;
    row++;

}