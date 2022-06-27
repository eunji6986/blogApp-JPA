let index ={
    init:function(){
     $("#btn-save").click(function(){

         let data={username:$("#username").val(),
                   password:$("#pwd").val(),
                   email:$("#email").val()}
         $.ajax({
            type:"post",
            url:"/blog/api/user",
            contentType: 'application/json',
            data:JSON.stringify(data)
         }).done(function(resp){
            alert("ajax 통신성공");
            alert(data);
            location.href = "/blog/main";
         }).fail(function(error){
            alert(error);
         });
     });
    },
}

index.init();