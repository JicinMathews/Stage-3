$(document).ready(function () {
  $("#par")
    .find("span")
    .hover(
      function () {
        $(this).css("background-color", "bisque");
      },
      function () {
        $(this).css("background-color", "white");
      }
    );

  $('#par').find("span").each(function(){
    if($(this).text().includes("th")){
      $(this).css({
     "font-style": "italic",
     "text-shadow": "2px 2px pink",
     "font-weight": "bold"
   })
    }
  });


});


