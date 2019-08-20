$(document).ready(function(){


	var numAc = $("article").size();
	var widSec = 230*numAc;
	var widTotal = widSec+410;
	
	$("section").width(widTotal);
	$("body").height(widTotal);
	$("html,body").animate({"scrollTop":250*5},2000);
	
	
	$(window).on("scroll",function(){
		
		var scroll = $(this).scrollTop();
		$("section").stop().animate({"left":-scroll},1000);
		
	});

	$("article h2").on("click",function(e){
		e.preventDefault();
		
		var index = $(this).parent().index();
		var src = $(this).children("a").attr("href");	
		var posAc = 230*index;
		$("article").removeClass("on");
		$(this).parent().addClass("on");
		$("article p img").attr({"src":""});
		$(this).siblings("p").children("img").attr({"src":src});	
		$("html,body").stop().scrollTop(posAc);
	});
	
	
	$("span").on("click",function(){
		$("article").removeClass("on");
	});
	
	
	$("#navi li").on("click",function(){
		var i = $(this).index();
		var posNavi = 250*i;		
		$("#navi li, article").removeClass();
		$(this).addClass("on");		
		$("html,body").stop().scrollTop(posNavi);
	});
	
	
	$(".bottom_img").on("click",function(){
		//var i = $(this).index();
		//var posNavi = 1000*i;		
		$("article").removeClass();
		$("html,body").scrollTop(0);
	});
	
});















