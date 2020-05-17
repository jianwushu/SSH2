function btnOn(obj) {
    var tds = $(obj).parent().parent().find('td')
    $('#stuId').val(tds.eq(1).text())
    var down = document.getElementById("down");
    var up = document.getElementById("up");
    down.style.display="block";
    up.style.display="block";
}
function btnOff() {
    var down = document.getElementById("down");
    var up = document.getElementById("up");
    down.style.display="none";
    up.style.display="none";
}
function btnOn2(obj) {
    var tds = $(obj).parent().parent().find('td')
    $('#stuId2').val(tds.eq(1).text())
    $('#stuName').val(tds.eq(2).text())
    $('#stuNumber').val(tds.eq(3).text())
    $('#stuPassword').val(tds.eq(4).text())
    $('#dormitoryName').val(tds.eq(5).text())
    $('#roomNumber').val(tds.eq(6).text())
    $('#roomId').val(tds.eq(7).text())
    var down = document.getElementById("down");
    var up2 = document.getElementById("up2");
    down.style.display="block";
    up2.style.display="block";
}
function btnOff2() {
    var down = document.getElementById("down");
    var up2 = document.getElementById("up2");
    down.style.display="none";
    up2.style.display="none";
}
function btnOn3(obj) {
    var tds = $(obj).parent().parent().find('td')
    $('#roomId').val(tds.eq(1).text())
    var down = document.getElementById("down");
    var up = document.getElementById("up");
    down.style.display="block";
    up.style.display="block";
}
function btnOn4(obj) {
    var tds = $(obj).parent().parent().find('td')
    $('#roomId2').val(tds.eq(1).text())
    $('#dormitoryName').val(tds.eq(2).text())
    $('#roomNumber').val(tds.eq(3).text())
    var down = document.getElementById("down");
    var up2 = document.getElementById("up2");
    down.style.display="block";
    up2.style.display="block";
}
