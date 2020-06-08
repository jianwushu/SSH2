
window.onload=function () {
        var btn=document.getElementById("btn");
        var down=document.getElementById("down");
        var up=document.getElementById("up");
        var close=document.getElementById("close");
        btn.onclick=function () {
            down.style.display="block";
            up.style.display="block";
        }
        close.onclick=function () {
            down.style.display="none";
            up.style.display="none";
        }
}
