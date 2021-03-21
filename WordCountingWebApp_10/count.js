var content;
var p1;

$("#textarea").keypress(function(event){
    if(event.which === 13){
       content = $(this).val();
       $(this).val("");
       p1 = countWords(content);
       $("#letgo").css("display","none");
       $("#textareadiv").css("display","none");
       $("#appear").removeClass("ans");
       $("#answer").text(p1);
    }
});

$("#reenter").click(function(){
    $("#letgo").css("display","block");
    $("#textareadiv").css("display","block");
    $("#appear").addClass("ans");
});


function countWords(content){
    content = content.replace(/(^\s*)|(\s*$)/gi,"");
    content = content.replace(/[ ]{2,}/gi," ");
    content = content.replace(/\n /,"\n");
    return content.split(' ').length;
}
