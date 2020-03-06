let index = {
    init : function() {
        let _this = this;

        //날짜
        let today = new Date();
        $("#today").text(today.toLocaleDateString());

        $("#save").on('click', function() {
            _this.post();   //글 등록
        });
    },

    post : function() {
        var data = {
            date: $("#today").text(),
            title: $("#title").val(),
            progress: $("#progress").prop("checked"),
            content : $("#content").val()
            //image
        };

        if(data.title == "" || data.content == "") {
//        <div class="alert alert-dismissible alert-info">
//            <button type="button" class="close" data-dismiss="alert">&times;</button>
//            <strong>Heads up!</strong> This but it's not super important.
//        </div>
            return;
        }

        //ajax 등록
        console.log(data);

        //text clear
        $("#title").val("");
        $("#progress").prop("checked", false);
        $("#content").val("");
    }
};

index.init();