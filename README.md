OUMS

OTT USER MATCHING SERVICE

<h2>패키지 구조</h2>
1. oumsback.common.* : 공통
2. oumsback.config.* : 설정관련 파일 패키지
    - oumsback.config.security : Spring Security 설정 패키지
3. oumsback.core.* : 핵심 모듈에 대응하는 비즈니스 로직 작성
   - oumsback.core.common : 공통 서비스 관련 패키지
   - oumsback.core.demo : 데모 서비스 관련 패키지
   - oumsback.core.member : 회원 서비스 관련 패키지
4. oumsback.front.* : API 서비스 컨트롤러 / aggregator 작성
   - oumsback.front.common : 공통 API 관련 패키지
   - oumsback.front.demo : 데모 API 관련 패키지
   - oumsback.front.member : 회원 API 관련 패키지
