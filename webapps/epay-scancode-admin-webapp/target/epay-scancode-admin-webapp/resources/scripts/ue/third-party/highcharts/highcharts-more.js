(function(ai,ab){function E(j,h,m){this.init.call(this,j,h,m)}function n(j,h,m){j.call(this,h,m);if(this.chart.polar){this.closeSegment=function(o){var p=this.xAxis.center;o.push("L",p[0],p[1])},this.closedStacks=!0}}function k(t,s){var r=this.chart,q=this.options.animation,m=this.group,o=this.markerGroup,p=this.xAxis.center,j=r.plotLeft,h=r.plotTop;if(r.polar){if(r.renderer.isSVG){if(q===!0&&(q={}),s){if(r={translateX:p[0]+j,translateY:p[1]+h,scaleX:0.001,scaleY:0.001},m.attr(r),o){o.attrSetters=m.attrSetters,o.attr(r)}}else{r={translateX:j,translateY:h,scaleX:1,scaleY:1},m.animate(r,q),o&&o.animate(r,q),this.animate=null}}}else{t.call(this,s)}}var e=ai.arrayMin,d=ai.arrayMax,aa=ai.each,X=ai.extend,af=ai.merge,c=ai.map,ac=ai.pick,V=ai.pInt,ah=ai.getOptions().plotOptions,aj=ai.seriesTypes,H=ai.extendClass,i=ai.splat,ag=ai.wrap,g=ai.Axis,W=ai.Tick,l=ai.Series,ad=aj.column.prototype,Y=Math,Z=Y.round,ae=Y.floor,b=Y.max,I=function(){};X(E.prototype,{init:function(j,h,p){var o=this,m=o.defaultOptions;o.chart=h;if(h.angular){m.background={}}o.options=j=af(m,j);(j=j.background)&&aa([].concat(i(j)).reverse(),function(r){var q=r.backgroundColor,r=af(o.defaultBackgroundOptions,r);if(q){r.backgroundColor=q}r.color=r.backgroundColor;p.options.plotBands.unshift(r)})},defaultOptions:{center:["50%","50%"],size:"85%",startAngle:0},defaultBackgroundOptions:{shape:"circle",borderWidth:1,borderColor:"silver",backgroundColor:{linearGradient:{x1:0,y1:0,x2:0,y2:1},stops:[[0,"#FFF"],[1,"#DDD"]]},from:Number.MIN_VALUE,innerRadius:0,to:Number.MAX_VALUE,outerRadius:"105%"}});var U=g.prototype,W=W.prototype,a={getOffset:I,redraw:function(){this.isDirty=!1},render:function(){this.isDirty=!1},setScale:I,setCategories:I,setTitle:I},f={isRadial:!0,defaultRadialGaugeOptions:{labels:{align:"center",x:0,y:null},minorGridLineWidth:0,minorTickInterval:"auto",minorTickLength:10,minorTickPosition:"inside",minorTickWidth:1,plotBands:[],tickLength:10,tickPosition:"inside",tickWidth:2,title:{rotation:0},zIndex:2},defaultRadialXOptions:{gridLineWidth:1,labels:{align:null,distance:15,x:0,y:null},maxPadding:0,minPadding:0,plotBands:[],showLastLabel:!1,tickLength:0},defaultRadialYOptions:{gridLineInterpolation:"circle",labels:{align:"right",x:-3,y:-2},plotBands:[],showLastLabel:!1,title:{x:4,text:null,rotation:90}},setOptions:function(h){this.options=af(this.defaultOptions,this.defaultRadialOptions,h)},getOffset:function(){U.getOffset.call(this);this.chart.axisOffset[this.side]=0},getLinePath:function(j,h){var m=this.center,h=ac(h,m[2]/2-this.offset);return this.chart.renderer.symbols.arc(this.left+m[0],this.top+m[1],h,h,{start:this.startAngleRad,end:this.endAngleRad,open:!0,innerR:0})},setAxisTranslation:function(){U.setAxisTranslation.call(this);if(this.center&&(this.transA=this.isCircular?(this.endAngleRad-this.startAngleRad)/(this.max-this.min||1):this.center[2]/2/(this.max-this.min||1),this.isXAxis)){this.minPixelPadding=this.transA*this.minPointOffset+(this.reversed?(this.endAngleRad-this.startAngleRad)/4:0)}},beforeSetTickPositions:function(){this.autoConnect&&(this.max+=this.categories&&1||this.pointRange||this.closestPointRange||0)},setAxisSize:function(){U.setAxisSize.call(this);if(this.isRadial){this.center=this.pane.center=aj.pie.prototype.getCenter.call(this.pane),this.len=this.width=this.height=this.isCircular?this.center[2]*(this.endAngleRad-this.startAngleRad)/2:this.center[2]/2}},getPosition:function(j,h){if(!this.isCircular){h=this.translate(j),j=this.min}return this.postTranslate(this.translate(j),ac(h,this.center[2]/2)-this.offset)},postTranslate:function(j,h){var o=this.chart,m=this.center,j=this.startAngleRad+j;return{x:o.plotLeft+m[0]+Math.cos(j)*h,y:o.plotTop+m[1]+Math.sin(j)*h}},getPlotBandPath:function(u,t,s){var r=this.center,o=this.startAngleRad,p=r[2]/2,q=[ac(s.outerRadius,"100%"),s.innerRadius,ac(s.thickness,10)],m=/%$/,h,j=this.isCircular;this.options.gridLineInterpolation==="polygon"?r=this.getPlotLinePath(u).concat(this.getPlotLinePath(t,!0)):(j||(q[0]=this.translate(u),q[1]=this.translate(t)),q=c(q,function(v){m.test(v)&&(v=V(v,10)*p/100);return v}),s.shape==="circle"||!j?(u=-Math.PI/2,t=Math.PI*1.5,h=!0):(u=o+this.translate(u),t=o+this.translate(t)),r=this.chart.renderer.symbols.arc(this.left+r[0],this.top+r[1],q[0],q[0],{start:u,end:t,innerR:ac(q[1],q[0]-q[2]),open:h}));return r},getPlotLinePath:function(j,h){var s=this.center,r=this.chart,o=this.getPosition(j),p,q,m;this.isCircular?m=["M",s[0]+r.plotLeft,s[1]+r.plotTop,"L",o.x,o.y]:this.options.gridLineInterpolation==="circle"?(j=this.translate(j))&&(m=this.getLinePath(0,j)):(p=r.xAxis[0],m=[],j=this.translate(j),s=p.tickPositions,p.autoConnect&&(s=s.concat([s[0]])),h&&(s=[].concat(s).reverse()),aa(s,function(u,t){q=p.getPosition(u,j);m.push(t?"L":"M",q.x,q.y)}));return m},getTitlePosition:function(){var j=this.center,h=this.chart,m=this.options.title;return{x:h.plotLeft+j[0]+(m.x||0),y:h.plotTop+j[1]-{high:0.5,middle:0.25,low:0}[m.align]*j[2]+(m.y||0)}}};ag(U,"init",function(v,u,t){var m;var s=u.angular,p=u.polar,q=t.isX,r=s&&q,o,h;h=u.options;var j=t.pane||0;if(s){if(X(this,r?a:f),o=!q){this.defaultRadialOptions=this.defaultRadialGaugeOptions}}else{if(p){X(this,f),this.defaultRadialOptions=(o=q)?this.defaultRadialXOptions:af(this.defaultYAxisOptions,this.defaultRadialYOptions)}}v.call(this,u,t);if(!r&&(s||p)){v=this.options;if(!u.panes){u.panes=[]}this.pane=(m=u.panes[j]=u.panes[j]||new E(i(h.pane)[j],u,this),j=m);j=j.options;u.inverted=!1;h.chart.zoomType=null;this.startAngleRad=u=(j.startAngle-90)*Math.PI/180;this.endAngleRad=h=(ac(j.endAngle,j.startAngle+360)-90)*Math.PI/180;this.offset=v.offset||0;if((this.isCircular=o)&&t.max===ab&&h-u===2*Math.PI){this.autoConnect=!0}}});ag(W,"getPosition",function(j,h,q,p,m){var o=this.axis;return o.getPosition?o.getPosition(q):j.call(this,h,q,p,m)});ag(W,"getLabelPosition",function(z,y,x,w,t,u,v,r,m){var o=this.axis,p=u.y,s=u.align,q=(o.translate(this.pos)+o.startAngleRad+Math.PI/2)/Math.PI*180%360;o.isRadial?(z=o.getPosition(this.pos,o.center[2]/2+ac(u.distance,-25)),u.rotation==="auto"?w.attr({rotation:q}):p===null&&(p=V(w.styles.lineHeight)*0.9-w.getBBox().height/2),s===null&&(s=o.isCircular?q>20&&q<160?"left":q>200&&q<340?"right":"center":"center",w.attr({align:s})),z.x+=u.x,z.y+=p):z=z.call(this,y,x,w,t,u,v,r,m);return z});ag(W,"getMarkPath",function(j,h,s,r,o,p,q){var m=this.axis;m.isRadial?(j=m.getPosition(this.pos,m.center[2]/2+r),h=["M",h,s,"L",j.x,j.y]):h=j.call(this,h,s,r,o,p,q);return h});ah.arearange=af(ah.area,{lineWidth:1,marker:null,threshold:null,tooltip:{pointFormat:'<span style="color:{series.color}">{series.name}</span>: <b>{point.low}</b> - <b>{point.high}</b><br/>'},trackByArea:!0,dataLabels:{verticalAlign:null,xLow:0,xHigh:0,yLow:0,yHigh:0}});aj.arearange=ai.extendClass(aj.area,{type:"arearange",pointArrayMap:["low","high"],toYData:function(h){return[h.low,h.high]},pointValKey:"low",getSegments:function(){var h=this;aa(h.points,function(j){if(!h.options.connectNulls&&(j.low===null||j.high===null)){j.y=null}else{if(j.low===null&&j.high!==null){j.y=j.high}}});l.prototype.getSegments.call(this)},translate:function(){var h=this.yAxis;aj.area.prototype.translate.apply(this);aa(this.points,function(j){var p=j.low,o=j.high,m=j.plotY;o===null&&p===null?j.y=null:p===null?(j.plotLow=j.plotY=null,j.plotHigh=h.translate(o,0,1,0,1)):o===null?(j.plotLow=m,j.plotHigh=null):(j.plotLow=m,j.plotHigh=h.translate(o,0,1,0,1))})},getSegmentPath:function(j){var h,s=[],r=j.length,o=l.prototype.getSegmentPath,p,q;q=this.options;var m=q.step;for(h=HighchartsAdapter.grep(j,function(t){return t.plotLow!==null});r--;){p=j[r],p.plotHigh!==null&&s.push({plotX:p.plotX,plotY:p.plotHigh})}j=o.call(this,h);if(m){m===!0&&(m="left"),q.step={left:"right",center:"center",right:"left"}[m]}s=o.call(this,s);q.step=m;q=[].concat(j,s);s[0]="L";this.areaPath=this.areaPath.concat(j,s);return q},drawDataLabels:function(){var j=this.data,h=j.length,s,r=[],o=l.prototype,p=this.options.dataLabels,q,m=this.chart.inverted;if(p.enabled||this._hasPointLabels){for(s=h;s--;){q=j[s],q.y=q.high,q.plotY=q.plotHigh,r[s]=q.dataLabel,q.dataLabel=q.dataLabelUpper,q.below=!1,m?(p.align="left",p.x=p.xHigh):p.y=p.yHigh}o.drawDataLabels.apply(this,arguments);for(s=h;s--;){q=j[s],q.dataLabelUpper=q.dataLabel,q.dataLabel=r[s],q.y=q.low,q.plotY=q.plotLow,q.below=!0,m?(p.align="right",p.x=p.xLow):p.y=p.yLow}o.drawDataLabels.apply(this,arguments)}},alignDataLabel:aj.column.prototype.alignDataLabel,getSymbol:aj.column.prototype.getSymbol,drawPoints:I});ah.areasplinerange=af(ah.arearange);aj.areasplinerange=H(aj.arearange,{type:"areasplinerange",getPointSpline:aj.spline.prototype.getPointSpline});ah.columnrange=af(ah.column,ah.arearange,{lineWidth:1,pointRange:null});aj.columnrange=H(aj.arearange,{type:"columnrange",translate:function(){var j=this,h=j.yAxis,m;ad.translate.apply(j);aa(j.points,function(r){var o=r.shapeArgs,p=j.options.minPointLength,q;r.plotHigh=m=h.translate(r.high,0,1,0,1);r.plotLow=r.plotY;q=m;r=r.plotY-m;r<p&&(p-=r,r+=p,q-=p/2);o.height=r;o.y=q})},trackerGroups:["group","dataLabels"],drawGraph:I,pointAttrToOptions:ad.pointAttrToOptions,drawPoints:ad.drawPoints,drawTracker:ad.drawTracker,animate:ad.animate,getColumnMetrics:ad.getColumnMetrics});ah.gauge=af(ah.line,{dataLabels:{enabled:!0,y:15,borderWidth:1,borderColor:"silver",borderRadius:3,style:{fontWeight:"bold"},verticalAlign:"top",zIndex:2},dial:{},pivot:{},tooltip:{headerFormat:""},showInLegend:!1});W={type:"gauge",pointClass:ai.extendClass(ai.Point,{setState:function(h){this.state=h}}),angular:!0,drawGraph:I,fixedBox:!0,trackerGroups:["group","dataLabels"],translate:function(){var j=this.yAxis,h=this.options,m=j.center;this.generatePoints();aa(this.points,function(u){var r=af(h.dial,u.dial),s=V(ac(r.radius,80))*m[2]/200,t=V(ac(r.baseLength,70))*s/100,q=V(ac(r.rearLength,10))*s/100,v=r.baseWidth||3,o=r.topWidth||1,p=j.startAngleRad+j.translate(u.y,null,null,null,!0);h.wrap===!1&&(p=Math.max(j.startAngleRad,Math.min(j.endAngleRad,p)));p=p*180/Math.PI;u.shapeType="path";u.shapeArgs={d:r.path||["M",-q,-v/2,"L",t,-v/2,s,-o/2,s,o/2,t,v/2,-q,v/2,"z"],translateX:m[0],translateY:m[1],rotation:p};u.plotX=m[0];u.plotY=m[1]})},drawPoints:function(){var j=this,h=j.yAxis.center,q=j.pivot,p=j.options,m=p.pivot,o=j.chart.renderer;aa(j.points,function(v){var r=v.graphic,u=v.shapeArgs,s=u.d,t=af(p.dial,v.dial);r?(r.animate(u),u.d=s):v.graphic=o[v.shapeType](u).attr({stroke:t.borderColor||"none","stroke-width":t.borderWidth||0,fill:t.backgroundColor||"black",rotation:u.rotation}).add(j.group)});q?q.animate({translateX:h[0],translateY:h[1]}):j.pivot=o.circle(0,0,ac(m.radius,5)).attr({"stroke-width":m.borderWidth||0,stroke:m.borderColor||"silver",fill:m.backgroundColor||"black"}).translate(h[0],h[1]).add(j.group)},animate:function(j){var h=this;if(!j){aa(h.points,function(m){var o=m.graphic;o&&(o.attr({rotation:h.yAxis.startAngleRad*180/Math.PI}),o.animate({rotation:m.shapeArgs.rotation},h.options.animation))}),h.animate=null}},render:function(){this.group=this.plotGroup("group","series",this.visible?"visible":"hidden",this.options.zIndex,this.chart.seriesGroup);aj.pie.prototype.render.call(this);this.group.clip(this.chart.clipRect)},setData:aj.pie.prototype.setData,drawTracker:aj.column.prototype.drawTracker};aj.gauge=ai.extendClass(aj.line,W);ah.boxplot=af(ah.column,{fillColor:"#FFFFFF",lineWidth:1,medianWidth:2,states:{hover:{brightness:-0.3}},threshold:null,tooltip:{pointFormat:'<span style="color:{series.color};font-weight:bold">{series.name}</span><br/>Maximum: {point.high}<br/>Upper quartile: {point.q3}<br/>Median: {point.median}<br/>Lower quartile: {point.q1}<br/>Minimum: {point.low}<br/>'},whiskerLength:"50%",whiskerWidth:2});aj.boxplot=H(aj.column,{type:"boxplot",pointArrayMap:["low","q1","median","q3","high"],toYData:function(h){return[h.low,h.q1,h.median,h.q3,h.high]},pointValKey:"high",pointAttrToOptions:{fill:"fillColor",stroke:"color","stroke-width":"lineWidth"},drawDataLabels:I,translate:function(){var j=this.yAxis,h=this.pointArrayMap;aj.column.prototype.translate.apply(this);aa(this.points,function(m){aa(h,function(o){m[o]!==null&&(m[o+"Plot"]=j.translate(m[o],0,1,0,1))})})},drawPoints:function(){var au=this,at=au.points,ar=au.options,aq=au.chart.renderer,an,ao,ap,al,Q,S,T,am,ak,R,P,F,O,L,C,N,D,K,G,J,r,s,A=au.doQuartiles!==!1,M=parseInt(au.options.whiskerLength,10)/100;aa(at,function(h){ak=h.graphic;r=h.shapeArgs;P={};L={};N={};s=h.color||au.color;if(h.plotY!==ab){if(an=h.pointAttr[h.selected?"selected":""],D=r.width,K=ae(r.x),G=K+D,J=Z(D/2),ao=ae(A?h.q1Plot:h.lowPlot),ap=ae(A?h.q3Plot:h.lowPlot),al=ae(h.highPlot),Q=ae(h.lowPlot),P.stroke=h.stemColor||ar.stemColor||s,P["stroke-width"]=ac(h.stemWidth,ar.stemWidth,ar.lineWidth),P.dashstyle=h.stemDashStyle||ar.stemDashStyle,L.stroke=h.whiskerColor||ar.whiskerColor||s,L["stroke-width"]=ac(h.whiskerWidth,ar.whiskerWidth,ar.lineWidth),N.stroke=h.medianColor||ar.medianColor||s,N["stroke-width"]=ac(h.medianWidth,ar.medianWidth,ar.lineWidth),T=P["stroke-width"]%2/2,am=K+J+T,R=["M",am,ap,"L",am,al,"M",am,ao,"L",am,Q,"z"],A&&(T=an["stroke-width"]%2/2,am=ae(am)+T,ao=ae(ao)+T,ap=ae(ap)+T,K+=T,G+=T,F=["M",K,ap,"L",K,ao,"L",G,ao,"L",G,ap,"L",K,ap,"z"]),M&&(T=L["stroke-width"]%2/2,al+=T,Q+=T,O=["M",am-J*M,al,"L",am+J*M,al,"M",am-J*M,Q,"L",am+J*M,Q]),T=N["stroke-width"]%2/2,S=Z(h.medianPlot)+T,C=["M",K,S,"L",G,S,"z"],ak){h.stem.animate({d:R}),M&&h.whiskers.animate({d:O}),A&&h.box.animate({d:F}),h.medianShape.animate({d:C})}else{h.graphic=ak=aq.g().add(au.group);h.stem=aq.path(R).attr(P).add(ak);if(M){h.whiskers=aq.path(O).attr(L).add(ak)}if(A){h.box=aq.path(F).attr(an).add(ak)}h.medianShape=aq.path(C).attr(N).add(ak)}}})}});ah.errorbar=af(ah.boxplot,{color:"#000000",grouping:!1,linkedTo:":previous",tooltip:{pointFormat:ah.arearange.tooltip.pointFormat},whiskerWidth:null});aj.errorbar=H(aj.boxplot,{type:"errorbar",pointArrayMap:["low","high"],toYData:function(h){return[h.low,h.high]},pointValKey:"high",doQuartiles:!1,getColumnMetrics:function(){return this.linkedParent&&this.linkedParent.columnMetrics||aj.column.prototype.getColumnMetrics.call(this)}});ah.waterfall=af(ah.column,{lineWidth:1,lineColor:"#333",dashStyle:"dot",borderColor:"#333"});aj.waterfall=H(aj.column,{type:"waterfall",upColorProp:"fill",pointArrayMap:["low","y"],pointValKey:"y",init:function(j,h){h.stacking=!0;aj.column.prototype.init.call(this,j,h)},translate:function(){var v=this.options,u=this.yAxis,t,s,p,q,r,o,h,j,m;t=v.threshold;v=v.borderWidth%2/2;aj.column.prototype.translate.apply(this);j=t;p=this.points;for(s=0,t=p.length;s<t;s++){q=p[s];r=q.shapeArgs;o=this.getStack(s);m=o.points[this.index];if(isNaN(q.y)){q.y=this.yData[s]}h=b(j,j+q.y)+m[0];r.y=u.translate(h,0,1);q.isSum||q.isIntermediateSum?(r.y=u.translate(m[1],0,1),r.height=u.translate(m[0],0,1)-r.y):j+=o.total;r.height<0&&(r.y+=r.height,r.height*=-1);q.plotY=r.y=Z(r.y)-v;r.height=Z(r.height);q.yBottom=r.y+r.height}},processData:function(y){var x=this.yData,w=this.points,v,s=x.length,t=this.options.threshold||0,u,q,r,m,o,p;q=u=r=m=t;for(p=0;p<s;p++){o=x[p],v=w&&w[p]?w[p]:{},o==="sum"||v.isSum?x[p]=q:o==="intermediateSum"||v.isIntermediateSum?(x[p]=u,u=t):(q+=o,u+=o),r=Math.min(q,r),m=Math.max(q,m)}l.prototype.processData.call(this,y);this.dataMin=r;this.dataMax=m},toYData:function(h){if(h.isSum){return"sum"}else{if(h.isIntermediateSum){return"intermediateSum"}}return h.y},getAttribs:function(){aj.column.prototype.getAttribs.apply(this,arguments);var j=this.options,h=j.states,p=j.upColor||this.color,j=ai.Color(p).brighten(0.1).get(),o=af(this.pointAttr),m=this.upColorProp;o[""][m]=p;o.hover[m]=h.hover.upColor||j;o.select[m]=h.select.upColor||p;aa(this.points,function(q){if(q.y>0&&!q.color){q.pointAttr=o,q.color=p}})},getGraphPath:function(){var j=this.data,h=j.length,r=Z(this.options.lineWidth+this.options.borderWidth)%2/2,q=[],m,o,p;for(p=1;p<h;p++){o=j[p].shapeArgs,m=j[p-1].shapeArgs,o=["M",m.x+m.width,m.y+r,"L",o.x,m.y+r],j[p-1].y<0&&(o[2]+=m.height,o[5]+=m.height),q=q.concat(o)}return q},getExtremes:I,getStack:function(j){var h=this.yAxis.stacks,m=this.stackKey;this.processedYData[j]<this.options.threshold&&(m="-"+m);return h[m][j]},drawGraph:l.prototype.drawGraph});ah.bubble=af(ah.scatter,{dataLabels:{inside:!0,style:{color:"white",textShadow:"0px 0px 3px black"},verticalAlign:"middle"},marker:{lineColor:null,lineWidth:1},minSize:8,maxSize:"20%",tooltip:{pointFormat:"({point.x}, {point.y}), Size: {point.z}"},turboThreshold:0,zThreshold:0});aj.bubble=H(aj.scatter,{type:"bubble",pointArrayMap:["y","z"],trackerGroups:["group","dataLabelsGroup"],pointAttrToOptions:{stroke:"lineColor","stroke-width":"lineWidth",fill:"fillColor"},applyOpacity:function(j){var h=this.options.marker,m=ac(h.fillOpacity,0.5),j=j||h.fillColor||this.color;m!==1&&(j=ai.Color(j).setOpacity(m).get("rgba"));return j},convertAttribs:function(){var h=l.prototype.convertAttribs.apply(this,arguments);h.fill=this.applyOpacity(h.fill);return h},getRadii:function(u,t,s,r){var o,p,q,j=this.zData,m=[];for(p=0,o=j.length;p<o;p++){q=t-u,q=q>0?(j[p]-u)/(t-u):0.5,m.push(Y.ceil(s+q*(r-s))/2)}this.radii=m},animate:function(j){var h=this.options.animation;if(!j){aa(this.points,function(m){var o=m.graphic,m=m.shapeArgs;o&&m&&(o.attr("r",1),o.animate({r:m.r},h))}),this.animate=null}},translate:function(){var j,h=this.data,p,o,m=this.radii;aj.scatter.prototype.translate.call(this);for(j=h.length;j--;){p=h[j],o=m?m[j]:0,p.negative=p.z<(this.options.zThreshold||0),o>=this.minPxSize/2?(p.shapeType="circle",p.shapeArgs={x:p.plotX,y:p.plotY,r:o},p.dlBox={x:p.plotX-o,y:p.plotY-o,width:2*o,height:2*o}):p.shapeArgs=p.plotY=p.dlBox=ab}},drawLegendSymbol:function(j,h){var m=V(j.itemStyle.fontSize)/2;h.legendSymbol=this.chart.renderer.circle(m,j.baseline-m,m).attr({zIndex:3}).add(h.legendGroup);h.legendSymbol.isMarker=!0},drawPoints:aj.column.prototype.drawPoints,alignDataLabel:aj.column.prototype.alignDataLabel});g.prototype.beforePadding=function(){var J=this,G=this.len,F=this.chart,D=0,z=G,A=this.isXAxis,C=A?"xData":"yData",x=this.min,y={},w=Y.min(F.plotWidth,F.plotHeight),v=Number.MAX_VALUE,u=-Number.MAX_VALUE,t=this.max-x,s=G/t,r=[];this.tickPositions&&(aa(this.series,function(h){var j=h.options;if(h.type==="bubble"&&h.visible&&(J.allowZoomOutside=!0,r.push(h),A)){aa(["minSize","maxSize"],function(o){var m=j[o],p=/%$/.test(m),m=V(m);y[o]=p?w*m/100:m}),h.minPxSize=y.minSize,h=h.zData,h.length&&(v=Y.min(v,Y.max(e(h),j.displayNegative===!1?j.zThreshold:-Number.MAX_VALUE)),u=Y.max(u,d(h)))}}),aa(r,function(m){var h=m[C],p=h.length,o;A&&m.getRadii(v,u,y.minSize,y.maxSize);if(t>0){for(;p--;){o=m.radii[p],D=Math.min((h[p]-x)*s-o,D),z=Math.max((h[p]-x)*s+o,z)}}}),r.length&&t>0&&ac(this.options.min,this.userMin)===ab&&ac(this.options.max,this.userMax)===ab&&(z-=G,s*=(G+D-z)/G,this.min+=D/s,this.max+=z/s))};var B=l.prototype,ah=ai.Pointer.prototype;B.toXY=function(j){var h,o=this.chart;h=j.plotX;var m=j.plotY;j.rectPlotX=h;j.rectPlotY=m;j.clientX=(h/Math.PI*180+this.xAxis.pane.options.startAngle)%360;h=this.xAxis.postTranslate(j.plotX,this.yAxis.len-m);j.plotX=j.polarPlotX=h.x-o.plotLeft;j.plotY=j.polarPlotY=h.y-o.plotTop};B.orderTooltipPoints=function(h){if(this.chart.polar&&(h.sort(function(j,m){return j.clientX-m.clientX}),h[0])){h[0].wrappedClientX=h[0].clientX+360,h.push(h[0])}};ag(aj.area.prototype,"init",n);ag(aj.areaspline.prototype,"init",n);ag(aj.spline.prototype,"getPointSpline",function(x,w,v,u){var r,s,t,p,q,o,m;if(this.chart.polar){r=v.plotX;s=v.plotY;x=w[u-1];t=w[u+1];this.connectEnds&&(x||(x=w[w.length-2]),t||(t=w[1]));if(x&&t){p=x.plotX,q=x.plotY,w=t.plotX,o=t.plotY,p=(1.5*r+p)/2.5,q=(1.5*s+q)/2.5,t=(1.5*r+w)/2.5,m=(1.5*s+o)/2.5,w=Math.sqrt(Math.pow(p-r,2)+Math.pow(q-s,2)),o=Math.sqrt(Math.pow(t-r,2)+Math.pow(m-s,2)),p=Math.atan2(q-s,p-r),q=Math.atan2(m-s,t-r),m=Math.PI/2+(p+q)/2,Math.abs(p-m)>Math.PI/2&&(m-=Math.PI),p=r+Math.cos(m)*w,q=s+Math.sin(m)*w,t=r+Math.cos(Math.PI+m)*o,m=s+Math.sin(Math.PI+m)*o,v.rightContX=t,v.rightContY=m}u?(v=["C",x.rightContX||x.plotX,x.rightContY||x.plotY,p||r,q||s,r,s],x.rightContX=x.rightContY=null):v=["M",r,s]}else{v=x.call(this,w,v,u)}return v});ag(B,"translate",function(j){j.call(this);if(this.chart.polar&&!this.preventPostTranslate){for(var j=this.points,h=j.length;h--;){this.toXY(j[h])}}});ag(B,"getSegmentPath",function(j,h){var m=this.points;if(this.chart.polar&&this.options.connectEnds!==!1&&h[h.length-1]===m[m.length-1]&&m[0].y!==null){this.connectEnds=!0,h=[].concat(h,[m[0]])}return j.call(this,h)});ag(B,"animate",k);ag(ad,"animate",k);ag(B,"setTooltipPoints",function(j,h){this.chart.polar&&X(this.xAxis,{tooltipLen:360});return j.call(this,h)});ag(ad,"translate",function(m){var j=this.xAxis,t=this.yAxis.len,s=j.center,p=j.startAngleRad,q=this.chart.renderer,r,o;this.preventPostTranslate=!0;m.call(this);if(j.isRadial){j=this.points;for(o=j.length;o--;){r=j[o],m=r.barX+p,r.shapeType="path",r.shapeArgs={d:q.symbols.arc(s[0],s[1],t-r.plotY,null,{start:m,end:m+r.pointWidth,innerR:t-ac(r.yBottom,t)})},this.toXY(r)}}});ag(ad,"alignDataLabel",function(j,h,q,p,m,o){if(this.chart.polar){j=h.rectPlotX/Math.PI*180;if(p.align===null){p.align=j>20&&j<160?"left":j>200&&j<340?"right":"center"}if(p.verticalAlign===null){p.verticalAlign=j<45||j>315?"bottom":j>135&&j<225?"top":"middle"}B.alignDataLabel.call(this,h,q,p,m,o)}else{j.call(this,h,q,p,m,o)}});ag(ah,"getIndex",function(j,h){var p,o=this.chart,m;o.polar?(m=o.xAxis[0].center,p=h.chartX-m[0]-o.plotLeft,o=h.chartY-m[1]-o.plotTop,p=180-Math.round(Math.atan2(p,o)/Math.PI*180)):p=j.call(this,h);return p});ag(ah,"getCoordinates",function(j,h){var o=this.chart,m={xAxis:[],yAxis:[]};o.polar?aa(o.axes,function(p){var r=p.isXAxis,s=p.center,q=h.chartX-s[0]-o.plotLeft,s=h.chartY-s[1]-o.plotTop;m[r?"xAxis":"yAxis"].push({axis:p,value:p.translate(r?Math.PI-Math.atan2(q,s):Math.sqrt(Math.pow(q,2)+Math.pow(s,2)),!0)})}):m=j.call(this,h);return m})})(Highcharts);