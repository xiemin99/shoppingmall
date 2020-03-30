   function turnPage(nowPage) {
    	var urls = window.location.href;
    	var site = urls.indexOf("?"); 
    	if(site > 0){
    		urls = urls.substring(0,site);
    	}
	   var queryJson = document.getElementById("queryJsonStr").value;
	   if(queryJson!=null && queryJson!=''){
		   urls = urls + "?queryJsonVal=" + encodeURI(queryJson) + "&nowPage="+nowPage;
	   }else{
		   urls = urls+"?nowPage="+nowPage;
	   }



    	window.location.href = urls;
    }
