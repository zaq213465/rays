$(function(){Metronic.init();Layout.init();QuickSidebar.init();Demo.init();$(".date-picker").datepicker({rtl:Metronic.isRTL(),orientation:"left",autoclose:true});$("#cancle").click(function(){$(".form-horizontal input").val("");$(".form-horizontal select").val("")});$("#save").click(function(){var j=0;var n=$(".form-horizontal input");for(var k=0;k<n.size()-1;k++){var l=$(n[k]);if(l.is(":visible")==true){var m=l.val();if(m==null||m==""){j++}}}n=$(".form-horizontal select");for(var k=0;k<n.size();k++){var l=$(n[k]);var m=l.val();if(m==null||m==""){j++}}if(j==0){$("#form").submit()}else{bootbox.alert("请检查内容再次填写！",function(){})}});var g=$("select.form-control");for(var b=0;b<g.size();b++){var d=$(g[b]);var h=d.attr("id");var f=$("."+h).val();var c=d.find("option");for(var a=0;a<c.size();a++){var e=$(c[a]).val();if(e==f){$(c[a]).attr("selected","selected")}else{$(c[a]).removeClass("selected")}}}});