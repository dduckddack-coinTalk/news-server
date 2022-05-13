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

> | name   |  type      | Description      | Required |
> |--------|------------|----------------|---|
> | `id` |  String  | 뉴스 ID     | O |
> | `title` |  String  | 뉴스 제목     | O |
> | `createdAt` |  String  | 뉴스 작성일     | O |
> | `editor` |  String  | 뉴스 작성자     | O |
> | `summary` |  String  | 뉴스 요약본     | O |
> | `imgUrl` |  String  | 뉴스 썸네일 이미지 URI     | O |
> | `url` |  String  | 뉴스 본문 URI     | O |


