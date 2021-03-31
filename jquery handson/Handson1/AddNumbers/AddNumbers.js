

$(document).ready(function() {
    $("#SubmitButton").click(function(){
        var fn=Number($("#num1").val());
        var sn=Number($("#num2").val());
        
        if(fn=="" || sn==""){
            $("#message").css('color','red');
             $("#message").text("Pls.Enter the Values");
        }
        else{
            var sum=fn+sn;
            $("#answer").val(sum);
            $("#answer").css('color','green');
            $("#message").text(sum);
            $("#message").css('color','green');
        }
                
    })
    
})