$("ul").on("click","li", function(){
    $(this).toggleClass("done");
});

$("ul").on("click","span", function(event){
    $(this).parent().fadeOut(300, function(){
        $(this).remove();
    });
    event.stopPropagation();
});

$("input").on("keypress",function(event){
    if(event.which === 13){
        var content = $(this).val();
        $("ul").append("<li><span><i class='fa fa-trash'></i></span> "+content+"</li>");
        $(this).val("");
    }
});

$(".fa-plus").click(function(){
    $("input").fadeToggle();
});
