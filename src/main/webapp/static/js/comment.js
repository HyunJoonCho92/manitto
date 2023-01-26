$(() => {
    $("#comment-btn").on('click', (event) => {
        event.preventDefault()
        $.ajax({
            url: "/api/comment/create",
            method: "POST",
            data: $("commnet-form").serialize(),
            dataType: "text",
            contentType: 'application/x-www-form-urlencoded'
        })
            .done(() => {
                alert("등록 완료")
                location.replace("")
            })
            .fail((xhr, status, error) => {
                alert("등록 실패")
                console.log(error)
            })
    })
})