editor.firstForSR=0;editor.currentRangeForSR=null;function clickHandler(g,l,e){for(var c=0,h=g.length;c<h;c++){g[c].className=""}e.className="focus";var i=e.getAttribute("tabSrc");for(var d=0,b=l.length;d<b;d++){var f=l[d],a=f.getAttribute("id");if(a!=i){f.style.zIndex=1}else{f.style.zIndex=200}}}function switchTab(d){var b=$G(d).children,c=b[0].children,a=b[1].children;for(var f=0,g=c.length;f<g;f++){var e=c[f];if(e.className==="focus"){clickHandler(c,a,e)}e.onclick=function(){clickHandler(c,a,this)}}}$G("searchtab").onmousedown=function(){$G("search-msg").innerHTML="";$G("replace-msg").innerHTML=""};function getMatchCase(a){return $G(a).checked?true:false}$G("nextFindBtn").onclick=function(b,c,f){var d=$G("findtxt").value,e;if(!d){return false}e={searchStr:d,dir:1,casesensitive:getMatchCase("matchCase")};if(!frCommond(e)){var a=editor.selection.getRange().createBookmark();$G("search-msg").innerHTML=lang.getEnd;editor.selection.getRange().moveToBookmark(a).select()}};$G("nextReplaceBtn").onclick=function(a,b,e){var c=$G("findtxt1").value,d;if(!c){return false}d={searchStr:c,dir:1,casesensitive:getMatchCase("matchCase1")};frCommond(d)};$G("preFindBtn").onclick=function(a,b,e){var c=$G("findtxt").value,d;if(!c){return false}d={searchStr:c,dir:-1,casesensitive:getMatchCase("matchCase")};if(!frCommond(d)){$G("search-msg").innerHTML=lang.getStart}};$G("preReplaceBtn").onclick=function(a,b,e){var c=$G("findtxt1").value,d;if(!c){return false}d={searchStr:c,dir:-1,casesensitive:getMatchCase("matchCase1")};frCommond(d)};$G("repalceBtn").onclick=function(){var a=$G("findtxt1").value.replace(/^\s|\s$/g,""),b,c=$G("replacetxt").value.replace(/^\s|\s$/g,"");if(!a){return false}if(a==c||(!getMatchCase("matchCase1")&&a.toLowerCase()==c.toLowerCase())){return false}b={searchStr:a,dir:1,casesensitive:getMatchCase("matchCase1"),replaceStr:c};frCommond(b)};$G("repalceAllBtn").onclick=function(){var b=$G("findtxt1").value.replace(/^\s|\s$/g,""),c,d=$G("replacetxt").value.replace(/^\s|\s$/g,"");if(!b){return false}if(b==d||(!getMatchCase("matchCase1")&&b.toLowerCase()==d.toLowerCase())){return false}c={searchStr:b,casesensitive:getMatchCase("matchCase1"),replaceStr:d,all:true};var a=frCommond(c);if(a){$G("replace-msg").innerHTML=lang.countMsg.replace("{#count}",a)}};var frCommond=function(a){return editor.execCommand("searchreplace",a)};switchTab("searchtab");