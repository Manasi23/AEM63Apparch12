(function (document, $) {
    "use strict";

    // when dialog gets injected
    $(document).on("foundation-contentloaded", function (e) {
	// if there is already an inital value make sure the according target element becomes visible
        showHide($(".cq-dialog-checkbox-showhide", e.target));

    });
    $(document).on("selected", ".cq-dialog-checkbox-showhide", function(e) {
        showHide($(this));
    });

    $(document).on("change", ".cq-dialog-checkbox-showhide", function(e) {
        showHide($(this));
    });

   function showHide(el){
       el.each(function(i, element) {
         /* get the selector to find the target elements. its stored as data-.. attribute */
         var target = $(element).data("cqDialogCheckboxShowhideTarget");

           if($(element).is('input:checkbox')){
              // toggle the target element that contains the selected value as data-showhidetargetvalue attribute
              if($(element).is(':checked')){
                $(target).removeClass( "hide" );
              }else{
                $(target).addClass( "hide" );
              }
		}
       })
   }

})(document,Granite.$);
