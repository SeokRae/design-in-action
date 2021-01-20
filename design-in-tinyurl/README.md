# TinyURL

## 1. Why do we need URL shortening?

- 단축 url은 실제 url의 1/3 크기로 링크를 최적화
- 개별 링크를 추적하여 잠재 고객을 분석
- 광고 캠페인의 실적을 측정
- 연결된 원래 url을 숨기는데 사용

## 2. Requirements and Goals of the System

### 기능 요구사항
1. url 이 주어지면 서비스는 더 짧고 고유한 별칭을 생성
   - 짧기에 대한 기준은 응용 프로그램에 쉽게 복사하여 붙여 넣을 수 있을 만큼
2. 단축 링크에 access하면 당사 서비스는 사용자를 원래 링크로 리다이렉션
3. 사용자는 선택적으로 url에 대한 custom 링크를 선택할 수 있어야 한다.
4. 링크는 표준 기본 기간이 지나면 만료된다. 사용자는 만료시간을 지정할 수 있어야한다.

### 비기능적 요구사항
1. 시스템은 고가용성이어야한다.
   - 서비스가 중단되면 모든 url 리다이렉션이 실패하기 때문
2. url 리다이렉션은 최소한의 지연 시간으로 실시간으로 발생해야 한다.
3. 단축링크는 추축할 수 없어야 한다.

### 확장된 요구사항
1. 분석
    - 리다이렉션이 몇 번 발생했는지 이력 확인 가능
2. 다른 서비스에서 REST API를 통해 서비스 접근 가능

## 3. Capacity Estimation and Constraints

## 4. System APIs

## 5. Database Design

## 6. Basic System Design and Algorithm

## 7. Data Partitioning and Replication

## 8. Cache

## 9. Load Balancer (LB)

## 10. Purging or DB cleanup

## 11. Telemetry

## 12. Security and Permissions
