# news_server
뉴스 데이터를 조회할 수 있는 Webflux server 입니다.
 - pagination
 - 제목 검색
<br><br>
## REST API Document

URI : <code>GET</code> 
<code><b>/news</b></code> 
<code>(뉴스 조회)</code>
<p>페이징 기능과 키워드 검색 기능이 있는 조회 API 입니다.</p>

##### Parameters
> | name   |  type      | Description      | Required | Default |
> |--------|------------|----------------|---|---|
> | `page` |  int  | 현재 페이지     |  | 0 |
> | `size` |  int  | 페이지당 뉴스 갯수     |  | 20 |  
> | `keyword` |  String  | 제목으로 필터링 할 검색어     |  |  |

##### Responses
<pre><code>200 OK
{
    "status": "ok",
    "message": {
        "totalElements": 2,
        "totalPages": 1,
        "data": [
            {
                "id": "627b030e4be3a1635b6bbf83",
                "createdAt": "2022-05-09 16:30",
                "editor": "정인선",
                "imgUrl": "https://www.coindeskkorea.com/news/thumbnail/202205/79241_21267_1514_v150.jpg",
                "summary": "웹소설·웹툰 '재혼황후'로 유명한 디지털 콘텐츠 제작사 엠스토리허브가 대체불가능토큰(NFT) 산업에 진출한다.",
                "title": "\"중앙화 플랫폼이 가져간 창작물 권리, NFT로 돌려줄 것\"",
                "url": "https://www.coindeskkorea.com/news/articleView.html?idxno=79241"
            },
            {
                "id": "627b030e4be3a1635b6bbf9e",
                "createdAt": "2022-05-06 16:57",
                "editor": "바이비트",
                "imgUrl": "https://www.coindeskkorea.com/news/thumbnail/202205/79225_21244_5451_v150.jpg",
                "summary": "세계에서 가장 빠르게 성장 중인 바이비트(Bybit)가 암호화폐 옵션 거래 분야에 진출했다고 발표했다.",
                "title": "유명 암호화폐 거래 플랫폼 바이비트, 옵션 거래 개시",
                "url": "https://www.coindeskkorea.com/news/articleView.html?idxno=79225"
            }
        ]
    }
}</code></pre>
<br><br>


