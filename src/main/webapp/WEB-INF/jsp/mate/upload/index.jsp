<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>文件上传</title>
	<jsp:include page="/resources/inc/head.jsp" flush="true"/>
</head>
<body>
<div id="main">
    <p>批量导入线缆信息：只能导入xlsx后缀的excel文件，第一列为线缆型号，第二列为线缆规格，第三列为线缆描述。</p>
    <p style="color:red">如果导入已存在的线缆信息则自动过滤。</p>
    <p style="color:red">导入成功后，点击刷新才可以再上传。</p>
	<div id="uploader" class="wu-example">
		<!--用来存放文件信息-->
		<div id="thelist" class="uploader-list"></div>
		<div class="btns">
			<div id="picker">选择文件</div>
			<button id="ctlBtn" class="btn btn-default">开始上传</button>
		</div>
	</div>
    <button id="refresh" class="btn btn-default" onclick="location.reload();">刷新</button>
</div>
<jsp:include page="/resources/inc/footer.jsp" flush="true"/>
<script src="${basePath}/plugins/jquery-fileupload/jquery.ui.widget.js"></script>
<script src="${basePath}/plugins/jquery-fileupload/jquery.fileupload.js"></script>
<script src="${basePath}/plugins/jquery-fileupload/jquery.iframe-transport.js"></script>
<script src="${basePath}/plugins/jquery-fileupload/jquery-ui.js"></script>
<script>

var $list = $("#thelist");

var uploader = WebUploader.create({

    // swf文件路径
    swf: '/plugins/webuploader-0.1.5/Uploader.swf',

    // 文件接收服务端。
    server: '/mate/uploadCable',

    // 选择文件的按钮。可选。
    // 内部根据当前运行是创建，可能是input元素，也可能是flash.
    pick: '#picker',

    // 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
    resize: false,
    accept:{
        title:'excel',
        extensions:'xlsx'
    }
});
// 当有文件被添加进队列的时候
uploader.on( 'fileQueued', function( file ) {
    $list.append( '<div id="' + file.id + '" class="item">' +
        '<h4 class="info">' + file.name + '</h4>' +
        '<p class="state">等待上传...</p>' +
        '</div>' );
});

// 文件上传过程中创建进度条实时显示。
uploader.on( 'uploadProgress', function( file, percentage ) {
    var $li = $( '#'+file.id ),
        $percent = $li.find('.progress .progress-bar');

    // 避免重复创建
    if ( !$percent.length ) {
        $percent = $('<div class="progress progress-striped active">' +
            '<div class="progress-bar" role="progressbar" style="width: 0%">' +
            '</div>' +
            '</div>').appendTo( $li ).find('.progress-bar');
    }

    $li.find('p.state').text('上传中');

    $percent.css( 'width', percentage * 100 + '%' );
});

uploader.on( 'uploadSuccess', function( file ) {
    $( '#'+file.id ).find('p.state').text('已上传');
});

uploader.on( 'uploadError', function( file ) {
    $( '#'+file.id ).find('p.state').text('上传出错');
});

uploader.on( 'uploadComplete', function( file ) {
    $( '#'+file.id ).find('.progress').fadeOut();
});

var $upload = $("#ctlBtn");
$upload.on('click', function() {
    uploader.upload();

//    if ( state === 'ready' ) {
//        uploader.upload();
//    } else if ( state === 'paused' ) {
//        uploader.upload();
//    } else if ( state === 'uploading' ) {
//        uploader.stop();
//    }
});
</script>
</body>
</html>