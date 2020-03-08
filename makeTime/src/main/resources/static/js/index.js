let index = {
    init : function() {
        let _this = this;

        //날짜
        $("#today").text(formatDate(new Date()));
        //화면 갱신
        _this.show();

         $(document).on('click', ":checkbox", function() {
            if($(this).prop('id') == "progress")
                return;

            if($(this).prop("checked") == true)
                $(this).parents(".custom-control").prev().prev().prop("class", "green-effect");
            else
                $(this).parents(".custom-control").prev().prev().prop("class", "red-effect");
         });

        $("#save").on('click', function() {
            _this.insert();   //글 등록
        });
    },
    insert : function() {
        let _this = this;
        var data = {
            date: $("#today").text(),
            title: $("#title").val(),
            progress: $("#progress").prop("checked"),
            content : $("#content").val()
            //image
        };

        console.log(data);
        //예외처리
        if(data.title == "" || data.content == "") {
            $("#modal-title").text("알림");
            $("#modal-content").text("하이라이트 또는 내용을 입력해 주세요");
            $("#exampleModal").modal();
            return;
        }

        //ajax 등록
        $.ajax({
            url: '/insert',
                type: 'POST',
                data: JSON.stringify(data),
                contentType: "application/json",
            }).done(function(){
                _this.show();    //등록 후 화면갱신
            }).fail(function(e) {
                alert("등록 실패");
            });

        //text clear
        $("#title").val("");
        $("#progress").prop("checked", false);
        $("#content").val("");
    },

    show : function() {
        $.ajax({
            url: '/request',
                type: 'GET',
                contentType: "application/json",
                dataType: 'json'
            }).done(function(json){
                //화면 Clear
                $("#accordion").empty();

                for(let obj of json) {
                $("#accordion").append(
                    `<div class="card">
                        <div class="card-header" role="tab" id="${obj.id}">
                            <div class="mb-0">
                                <div class="d-flex justify-content-between">
                                    <div id="effect-${obj.id}" class="red-effect">${obj.date}</div>
                                    <a data-toggle="collapse" href="#collapse-${obj.id}" aria-expanded="true" aria-controls="collapse-${obj.id}">
                                        ${obj.title}
                                    </a>
                                    <div class="custom-control custom-switch">
                                        <input type="checkbox" class="custom-control-input" id="check-${obj.id}">
                                        <label class="custom-control-label" for="check-${obj.id}">체크</label>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div id="collapse-${obj.id}" class="collapse" role="tabpanel" aria-labelledby="${obj.id}">
                            <div class="card-body">
                                ${obj.content}
                            </div>
                        </div>
                    </div>`
                    );
                    //체크박스 상태 update
                    $("#check-" + obj.id).prop("checked", obj.progress);
                    if(obj.progress == true)
                        $("#effect-" + obj.id).prop("class", "green-effect");
                    else
                        $("#effect-" + obj.id).prop("class", "red-effect");
                }
            }).fail(function(e) {
        });
    }
};

function formatDate(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 2)
        month = '0' + month;

    if (day.length < 2)
        day = '0' + day;

    return [year, month, day].join('-');
}

index.init();