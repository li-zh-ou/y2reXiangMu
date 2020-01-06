<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<base href="${pageContext.request.contextPath}/">
<head>
<meta charset="utf-8">
<title>学生信息管理</title>
</head>
<body>
	<div id="school">
		<h2>学生信息管理</h2>
		
			<p>学员选择:</p>
			<p>
			<select name="stuid" onchange="selectChange()">
				
			</select>
			</p>
			<div>
				<p>专业:</p>
				<h3 id="zhuan"></h3>
			</div>
		
			<div id="score">
				<p>考试成绩：</p>
				<div v-for="item in exam">
					<p><span>{{item.kename}}</span><input type="hidden" name="keid" :value="item.keid"><input name="examscore" type="text" onblur="num(this)"></p>
				</div>
			</div>
			<p><input type="button" value="保存" onclick="btn()"></p>
	</div>
</body>
<script type="text/javascript" src="static/js/jquery.min.js"></script>
<script type="text/javascript" src="static/js/vue.js"></script>
<script type="text/javascript">
var vm = new Vue({
	el:"#school",
	data(){
		return {
			exam:[],
			score:[]
		}
	},
	methods:{

	}
	
})
$(function(){
	query();
})
function query(){
	$.ajax({
		"url":"load/queryAllStudent",
		"type":"post",
		"dataType":"json",
		"success":function(result){
			var option = document.createElement("option");
			option.text = "请选择";
			$("select").append(option);
			for (var i = 0;i<result.length;i++) {
				var option = document.createElement("option");
				option.text = result[i].name;
				option.value = result[i].id;
				$("select").append(option);
			}
		},
		error:function(){
			alert("出错了!");
		}
	})		
}
function selectChange(){
	if($("select").val() != "请选择"){
	$.ajax({
		"url":"load/queryStudentInfo",
		"data":"id="+$("select").val(),
		"type":"post",
		"success":function(result){
			$("#zhuan").text(result);
			
			$.ajax({
				"url":"load/queryStudentScore",
				"data":"id="+$("select").val(),
				"type":"post",
				"dataType":"json",
				"success":function(result){
					vm.exam = result;
					for (var i = 0;i<$("[name='examscore']").length;i++){
						$("[name='examscore']")[i].value=0;
					}
				},
				error:function(){
					alert("出错了!");
				}
			})	
		},
		error:function(){
			alert("出错了!");
		}
	})	

	}	
}
function btn(){
	for (var i = 0;i<$("[name='keid']").length;i++) {
		var score = parseInt($("[name='examscore']")[i].value);
		vm.score.push({"stuid":$("select").val(),"keid":$("[name='keid']")[i].value,"examscore":score});
	}
	for (var i = 0;i<vm.score.length;i++) {
		if(isNaN(parseInt(vm.score[i].examscore))){
			alert("成绩不为数字！");
			vm.score.push(0,3);
			return;
		}
	}
	$.ajax({
		"url":"load/insertscore",
		"data":JSON.stringify(vm.score),
		"type":"post",
		"contentType":"application/json;charset=UTF-8",
		"dataType":"json",
		"success":function(result){
			alert("成功!");
			for (var i = 0;i<$("[name='examscore']").length;i++){
				$("[name='examscore']")[i].value=0;
			}
		},
		error:function(){
			alert("出错了!");
		}
	})
}

function num(item){
	if(isNaN(parseInt($(item).val()))){
		alert("输入值必须为整数，请重新输入");
		$(item).val(0);
	}
}

</script>
</html>