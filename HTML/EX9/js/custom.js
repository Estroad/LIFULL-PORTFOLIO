$(document).ready(function(){
	
	//페이지 로딩 시 제일 상단으로 스크롤 이동
	$("body,html").stop().animate({"scrollTop":0},1500,"swing");	

	$(window).scroll(function(){
		
		//변수 scroll에 현재 화면을 스크롤한 거리의 수치를 저장
		var scroll = $(this).scrollTop();		
					
		for(var i=0; i<5; i++){
			//스크롤값과 박스의 z축 연동	
			$("section>article").eq(i).css({"transform":"translateZ("   + parseInt((-5000*i)+scroll)   +  "px)"});	
			//특정 스크롤 구간에서 스크롤 네비게이션과 박스 활성화
			if(scroll>=i*5000&&scroll<(i+1)*5000){
				$(".scrollNavi li").removeClass();
				$(".scrollNavi li").eq(i).addClass("on");
				$("article").removeClass();				
				$("article").eq(i).addClass("on");
			};
		};	
		
	});
	
	
	//스크롤 네비게이션 클릭 시 스크롤 이동
	$(".scrollNavi li").on("click",function(){
		var a = $(this).index();	
		$("body,html").stop().animate({"scrollTop":5000*a},1500,"swing");		
	});		
	
	//화면에서 마우스 무브 시 박스안의 콘텐츠 움직이기
	$("body").on("mousemove",function(e){
		var posX = e.pageX/100;
		var posY = e.pageY/150;		
		
		$(".obj11").css({"left":-270-posX , "bottom":-100-posY });
		$(".obj12").css({"right":-593+posX , "top":-85+posY });
		$(".obj13").css({"left":-100+posX , "bottom":-300+posY });
		
		$(".obj21").css({"right":-710-posX , "bottom":-420-posY });
		$(".obj22").css({"right":-50+posX , "bottom":-100+posY });
		
		$(".obj31").css({"right":110-posX , "bottom":70-posY });
		$(".obj32").css({"left":100-posX , "bottom":-160+posY });
		
		$(".obj41").css({"left":350+posX , "bottom":-150-posY });
		$(".obj42").css({"right":167+posX , "top":-255-posY });
		$(".obj43").css({"right":-100+posX , "bottom":-180+posY });
		
			
	});
});
	

$(document).ready(function(){  			

	/* 1초 마다 현재 시간값 재설정 */
	var timer = setInterval(function(){  // 변수 timer에 setInterval 구문을 실행
		
		var now = new Date();
		var hr = now.getHours();
		var min = now.getMinutes();
		var sec = now.getSeconds();	
		
		// 시간이 한자리 숫자일때 앞에 0 붙이기
		if(hr >=10){	
			hNum = hr;			
		}else{
			hNum = "0"+hr;
		};
		
		// 분이 한자리 숫자일때 앞에 0 붙이기
		if(min >=10){
			mNum = min;
		}else{
			mNum = "0"+min;
		};
		
		// 초가 한자리 숫자일때 앞에 0 붙이기
		if(sec >=10){
			sNum = sec;
		}else{
			sNum = "0"+sec;
		};
				
		// p 태그 안에 시간 출력		
		$("p strong").eq(0).text(hNum);
		$("p strong").eq(1).text(mNum);
		$("p strong").eq(2).text(sNum);		
		
	},1000)  //1초의 시간마다 안쪽의 구문을 반복 실행


	
	
	  var now = new Date();
	var sec = now.getSeconds();	
	
	/* 시간에 따라 화면 테마 변경 */
	if(sec>=1 && sec<31){   //현재 초가 1초 보다는 같거나 크고, 31초 보다는 작을때
		$("#wrap").removeClass();
		$("#wrap").addClass("morning");
		$("nav li").removeClass();
		$("nav li").eq(0).addClass("on");
	}else if(sec>=31 && sec<40){   //현재 초가 31초 보다는 같거나  크고, 40초 보다는 작을때
		$("#wrap").removeClass();
		$("#wrap").addClass("afternoon");
		$("nav li").removeClass();
		$("nav li").eq(1).addClass("on");
	}else if(sec>=40 && sec<60){   //현재 초가 40초 보다는 같거나 크고, 60초 보다는 작을때
		$("#wrap").removeClass();
		$("#wrap").addClass("evening");
		$("nav li").removeClass();
		$("nav li").eq(2).addClass("on");
	};
	

});















