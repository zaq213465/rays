var HighchartsAdapter=function(){function f(k){function i(m,l,n){m.removeEventListener(l,n,!1)}function j(m,l,n){n=m.HCProxiedMethods[n.toString()];m.detachEvent("on"+l,n)}function h(l,r){var q=l.HCEvents,o,p,m,n;if(l.removeEventListener){o=i}else{if(l.attachEvent){o=j}else{return}}r?(p={},p[r]=!0):p=q;for(n in p){if(q[n]){for(m=q[n].length;m--;){o(l,n,q[n][m])}}}}k.HCExtended||Highcharts.extend(k,{HCExtended:!0,HCEvents:{},bind:function(l,m){var o=this,p=this.HCEvents,n;if(o.addEventListener){o.addEventListener(l,m,!1)}else{if(o.attachEvent){n=function(q){m.call(o,q)};if(!o.HCProxiedMethods){o.HCProxiedMethods={}}o.HCProxiedMethods[m.toString()]=n;o.attachEvent("on"+l,n)}}p[l]===c&&(p[l]=[]);p[l].push(m)},unbind:function(o,m){var n,l;o?(n=this.HCEvents[o]||[],m?(l=HighchartsAdapter.inArray(m,n),l>-1&&(n.splice(l,1),this.HCEvents[o]=n),this.removeEventListener?i(this,o,m):this.attachEvent&&j(this,o,m)):(h(this,o),this.HCEvents[o]=[])):(h(this),this.HCEvents={})},trigger:function(l,m){var q=this.HCEvents[l]||[],r=q.length,p,n,o;n=function(){m.defaultPrevented=!0};for(p=0;p<r;p++){o=q[p];if(m.stopped){break}m.preventDefault=n;m.target=this;m.type=l;o.call(this,m)===!1&&m.preventDefault()}}});return k}var c,b=document,e=[],a=[],d,g;Math.easeInOutSine=function(k,i,j,h){return -j/2*(Math.cos(Math.PI*k/h)-1)+i};return{init:function(h){if(!b.defaultView){this._getStyle=function(j,k){var i;return j.style[k]?j.style[k]:(k==="opacity"&&(k="filter"),i=j.currentStyle[k.replace(/\-(\w)/g,function(m,l){return l.toUpperCase()})],k==="filter"&&(i=i.replace(/alpha\(opacity=([0-9]+)\)/,function(l,m){return m/100})),i===""?1:i)},this.adapterRun=function(j,k){var i={width:"clientWidth",height:"clientHeight"}[k];if(i){return j.style.zoom=1,j[i]-2*parseInt(HighchartsAdapter._getStyle(j,"padding"),10)}}}if(!Array.prototype.forEach){this.each=function(j,k){for(var i=0,l=j.length;i<l;i++){if(k.call(j[i],j[i],i,j)===!1){return i}}}}if(!Array.prototype.indexOf){this.inArray=function(j,k){var i,l=0;if(k){for(i=k.length;l<i;l++){if(k[l]===j){return l}}}return -1}}if(!Array.prototype.filter){this.grep=function(j,l){for(var i=[],m=0,k=j.length;m<k;m++){l(j[m],m)&&i.push(j[m])}return i}}g=function(j,k,i){this.options=k;this.elem=j;this.prop=i};g.prototype={update:function(){var j;j=this.paths;var k=this.elem,i=k.element;j&&i?k.attr("d",h.step(j[0],j[1],this.now,this.toD)):k.attr?i&&k.attr(this.prop,this.now):(j={},j[k]=this.now+this.unit,Highcharts.css(k,j));this.options.step&&this.options.step.call(this.elem,this.now,this)},custom:function(j,n,i){var m=this,k=function(o){return m.step(o)},l;this.startTime=+new Date;this.start=j;this.end=n;this.unit=i;this.now=this.start;this.pos=this.state=0;k.elem=this.elem;k()&&a.push(k)===1&&(d=setInterval(function(){for(l=0;l<a.length;l++){a[l]()||a.splice(l--,1)}a.length||clearInterval(d)},13))},step:function(j){var l=+new Date,i;i=this.options;var k;if(this.elem.stopAnimation){i=!1}else{if(j||l>=i.duration+this.startTime){this.now=this.end;this.pos=this.state=1;this.update();j=this.options.curAnim[this.prop]=!0;for(k in i.curAnim){i.curAnim[k]!==!0&&(j=!1)}j&&i.complete&&i.complete.call(this.elem);i=!1}else{k=l-this.startTime,this.state=k/i.duration,this.pos=i.easing(k,0,1,i.duration),this.now=this.start+(this.end-this.start)*this.pos,this.update(),i=!0}}return i}};this.animate=function(k,q,j){var p,m="",o,l,n;k.stopAnimation=!1;if(typeof j!=="object"||j===null){p=arguments,j={duration:p[2],easing:p[3],complete:p[4]}}if(typeof j.duration!=="number"){j.duration=400}j.easing=Math[j.easing]||Math.easeInOutSine;j.curAnim=Highcharts.extend({},q);for(n in q){l=new g(k,j,n),o=null,n==="d"?(l.paths=h.init(k,k.d,q.d),l.toD=q.d,p=0,o=1):k.attr?p=k.attr(n):(p=parseFloat(HighchartsAdapter._getStyle(k,n))||0,n!=="opacity"&&(m="px")),o||(o=parseFloat(q[n])),l.custom(p,o,m)}}},_getStyle:function(i,h){return window.getComputedStyle(i).getPropertyValue(h)},getScript:function(k,i){var j=b.getElementsByTagName("head")[0],h=b.createElement("script");h.type="text/javascript";h.src=k;h.onload=i;j.appendChild(h)},inArray:function(i,h){return h.indexOf?h.indexOf(i):e.indexOf.call(h,i)},adapterRun:function(i,h){return parseInt(HighchartsAdapter._getStyle(i,h),10)},grep:function(i,h){return e.filter.call(i,h)},map:function(l,i){for(var k=[],h=0,j=l.length;h<j;h++){k[h]=i.call(l[h],l[h],h,l)}return k},offset:function(j){for(var h=0,i=0;j;){h+=j.offsetLeft,i+=j.offsetTop,j=j.offsetParent}return{left:h,top:i}},addEvent:function(j,h,i){f(j).bind(h,i)},removeEvent:function(j,h,i){f(j).unbind(h,i)},fireEvent:function(l,i,k,h){var j;b.createEvent&&(l.dispatchEvent||l.fireEvent)?(j=b.createEvent("Events"),j.initEvent(i,!0,!0),j.target=l,Highcharts.extend(j,k),l.dispatchEvent?l.dispatchEvent(j):l.fireEvent(i,j)):l.HCExtended===!0&&(k=k||{},l.trigger(i,k));k&&k.defaultPrevented&&(h=null);h&&h(k)},washMouseEvent:function(h){return h},stop:function(h){h.stopAnimation=!0},each:function(i,h){return Array.prototype.forEach.call(i,h)}}}();