$(() => {
    $("#logout-btn").on('click', (event) => {
        event.preventDefault()
        $.ajax({
            url: "/api/user/logout",
            method: "GET",
            contentType: 'application/x-www-form-urlencoded'
        })
            .done(() => {
                alert("로그아웃 성공")
                location.replace("index")
            })
            .fail((xhr, status, error) => {
                alert("로그인 실패")
                console.log(error)
            })
    })
})