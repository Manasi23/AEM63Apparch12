(function(document, $, ns) {
    "use strict";


    $(document).on("click", ".cq-dialog-submit", function(e) {

        var $form = $(this).closest("form.foundation-form"),
            pageuse = $form.find("[name='./pageuse']").val(),
            heading = $form.find("[name='./heading']").val(),
            subHeading = $form.find("[name='./subHeading']").val(),
            buttonLabel = $form.find("[name='./buttonLabel']").val(),
            imageLink = $form.find("[name='./imageLink']").val(),
            imgAltTxt = $form.find("[name='./imgAltTxt']").val(),
            buttonLink = $form.find("[name='./buttonLink']").val(),
            message, clazz = "coral-Button ",
            patterns = {};

        var homeheadstring = "Heading should be 30 characters."
        var homesubheadstring = "subHeading should be 65 characters.";
        var homebuttonstring = "Button Label should be 25 characters.";


        var clpheadstring = "Heading should be 40 characters."
        var clpsubheadstring = "subHeading should be 100 characters.";
        var clpbuttonstring = "Button Label should be 25 characters.";

        var plpheadstring = "Heading should be 35 characters."
        var plpsubheadstring = "subHeading should be 150 characters.";


        /*HOME VALIDATIONS  */
        if (pageuse == 'home') {
        e.stopPropagation();
        e.preventDefault();

            if (heading.length <= 30) {
                var homeheadstring = "";
            };
            if (subHeading.length <= 65) {
                var homesubheadstring = "";
            };
            if (buttonLabel.length <= 25) {
                var homebuttonstring = "";
            };




            if (heading.length > 30 || subHeading.length > 65 || buttonLabel.length > 25) {
                ns.ui.helpers.prompt({
                    title: Granite.I18n.get("Invalid Input"),
                    message: homeheadstring + "<pre>" + homesubheadstring + "<pre>" + homebuttonstring,
                    actions: [{
                        id: "CANCEL",
                        text: "CANCEL",
                        className: "coral-Button"
                    }],
                    callback: function(actionId) {
                        if (actionId === "CANCEL") {}
                    }
                });


            } else if ((heading == 0) || (buttonLabel == 0) || (imageLink == 0) || (imgAltTxt == 0) || (buttonLink == 0)) {
                window.stop();
            } else {
                $form.submit();
            }

        }


        /*  CLP VALIDATIONS*/
        if (pageuse == 'clp') {
        e.stopPropagation();
        e.preventDefault();

            if (heading.length <= 40) {
                var clpheadstring = "";
            };
            if (subHeading.length <= 100) {
                var clpsubheadstring = "";
            };
            if (buttonLabel.length <= 25) {
                var clpbuttonstring = "";
            };

            if (heading.length > 40 || subHeading.length > 100 || buttonLabel.length > 25) {
                ns.ui.helpers.prompt({
                    title: Granite.I18n.get("Invalid Input"),
                    message: clpheadstring + "<pre>" + clpsubheadstring + "<pre>" + clpbuttonstring,
                    actions: [{
                        id: "CANCEL",
                        text: "CANCEL",
                        className: "coral-Button"
                    }],
                    callback: function(actionId) {
                        if (actionId === "CANCEL") {}
                    }
                });
            } else if ((heading == 0) || (buttonLabel == 0) || (imageLink == 0) || (imgAltTxt == 0) || (buttonLink == 0)) {
                window.stop();
            } else {
                $form.submit();
            }

        }


        /*PLP VALIDATIONS*/
        if (pageuse == 'plp') {
        e.stopPropagation();
        e.preventDefault();

            if (heading.length <= 35) {
                var plpheadstring = "";
            };
            if (subHeading.length <= 150) {
                var plpsubheadstring = "";
            };


            if (heading.length > 35 || subHeading.length > 150) {
                ns.ui.helpers.prompt({
                    title: Granite.I18n.get("Invalid Input"),
                    message: plpheadstring + "<pre>" + plpsubheadstring,
                    actions: [{
                        id: "CANCEL",
                        text: "CANCEL",
                        className: "coral-Button"
                    }],
                    callback: function(actionId) {
                        if (actionId === "CANCEL") {}
                    }
                });
            } else if ((heading == 0) || (imageLink == 0) || (imgAltTxt == 0)) {
                window.stop();
            } else {
                $form.submit();
            }

        }



    });
})(document, Granite.$, Granite.author);