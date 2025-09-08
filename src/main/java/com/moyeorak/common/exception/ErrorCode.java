package com.moyeorak.common.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "예기치 못한 서버 에러가 발생했습니다."),
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    REQUIRED_FIELD_MISSING(HttpStatus.BAD_REQUEST, "필수 입력 항목이 누락되었습니다."),
    INVALID_FIELD_FORMAT(HttpStatus.BAD_REQUEST, "입력 형식이 잘못되었습니다."),
    UNSUPPORTED_OPERATION(HttpStatus.BAD_REQUEST, "지원하지 않는 요청입니다."),
    OPERATION_NOT_ALLOWED(HttpStatus.BAD_REQUEST, "해당 작업은 허용되지 않습니다."),
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "요청이 너무 많습니다."),
    TEMPORARILY_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE, "일시적으로 사용이 불가능합니다."),

    // 파일 업로드
    FILE_UPLOAD_FAILED(HttpStatus.INTERNAL_SERVER_ERROR, "파일 업로드에 실패했습니다."),
    INVALID_FILE_TYPE(HttpStatus.BAD_REQUEST, "지원하지 않는 파일 형식입니다."),
    FILE_TOO_LARGE(HttpStatus.BAD_REQUEST, "파일 크기가 너무 큽니다."),

    // USER 관련
    NULL_EMAIL(HttpStatus.BAD_REQUEST, "이메일은 null일 수 없습니다."),
    INVALID_GENDER(HttpStatus.BAD_REQUEST, "성별은 '남' 또는 '여'여야 합니다."),
    INVALID_BIRTH_FORMAT(HttpStatus.BAD_REQUEST, "생년월일 형식이 잘못되었습니다. yyyy-mm-dd"),
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "해당 유저가 존재하지 않습니다."),
    UNAUTHORIZED_REGION_ACCESS(HttpStatus.FORBIDDEN, "관리자 담당 지역 유저가 아닙니다."),
    PASSWORD_CONFIRM_MISMATCH(HttpStatus.BAD_REQUEST, "비밀번호 확인이 일치하지 않습니다."),
    NULL_GENDER(HttpStatus.BAD_REQUEST, "성별 정보가 null입니다."),
    PASSWORD_MISMATCH(HttpStatus.BAD_REQUEST, "새 비밀번호와 확인 비밀번호가 일치하지 않습니다."),
    INVALID_ENROLLMENT_STATUS(HttpStatus.BAD_REQUEST, "이미 취소되었거나 수강중 상태가 아닙니다."),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "비밀번호가 일치하지 않습니다."),
    EMAIL_DUPLICATED(HttpStatus.BAD_REQUEST, "이미 존재하는 이메일입니다."),
    PHONE_DUPLICATED(HttpStatus.BAD_REQUEST, "이미 존재하는 전화번호입니다."),
    UNAUTHORIZED_ACCESS(HttpStatus.FORBIDDEN, "해당 작업을 수행할 권한이 없습니다."),
    SAME_PASSWORD(HttpStatus.BAD_REQUEST, "기존 비밀번호와 동일한 비밀번호는 사용할 수 없습니다."),

    // 인증
    AUTHORIZATION_REQUIRED(HttpStatus.UNAUTHORIZED, "인증이 필요합니다."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "해당 리소스에 접근할 수 없습니다."),
    INVALID_ROLE(HttpStatus.FORBIDDEN, "요청을 수행할 권한이 없습니다."),

    // REGION
    NOT_FOUND_REGION(HttpStatus.NOT_FOUND, "해당 지역이 존재하지 않습니다."),
    REGION_NAME_DUPLICATE(HttpStatus.CONFLICT, "이미 존재하는 지역명입니다."),

    //FACILITY
    FACILITY_REGION_MISMATCH(HttpStatus.BAD_REQUEST, "선택한 시설이 해당 지역에 속하지 않습니다."),
    NOT_FOUND_FACILITY(HttpStatus.NOT_FOUND, "해당 시설이 존재하지 않습니다."),
    UNAUTHORIZED_FACILITY_ACCESS(HttpStatus.FORBIDDEN, "해당 시설에 접근할 권한이 없습니다."),
    FACILITY_NAME_DUPLICATE(HttpStatus.CONFLICT, "이미 등록된 시설명입니다."),
    INVALID_TIME_FORMAT(HttpStatus.BAD_REQUEST, "운영 시간 형식이 올바르지 않습니다. 예: 09:00"),

    //PROGRAM
    NOT_FOUND_PROGRAM(HttpStatus.NOT_FOUND, "해당 프로그램이 존재하지 않습니다."),
    DUPLICATE_PROGRAM_TITLE_IN_REGION(HttpStatus.CONFLICT, "해당 지역에 이미 동일한 이름의 프로그램이 존재합니다."),
    PROGRAM_FULL(HttpStatus.BAD_REQUEST, "정원이 가득 찼습니다."),
    //NOTICE
    NOT_FOUND_NOTICE(HttpStatus.NOT_FOUND, "공지사항이 존재하지 않습니다."),

    //MAINIMAGE
    NOT_FOUND_MAIN_IMAGE(HttpStatus.NOT_FOUND, "해당 홍보물이 존재하지 않습니다."),
    NOT_FOUND_MAIN_IMAGE_ID(HttpStatus.NOT_FOUND, "해당 ID의 홍보물이 존재하지 않습니다."),

    // ENROLLMENT
    ENROLLMENT_ALREADY_CANCELLED(HttpStatus.BAD_REQUEST, "이미 취소되었거나 수강중 상태가 아닙니다."),
    PROGRAM_CLOSED(HttpStatus.BAD_REQUEST, "종료된 프로그램은 취소할 수 없습니다."),
    NO_ADMIN_REGION(HttpStatus.INTERNAL_SERVER_ERROR, "관리자에게 지역 정보가 설정되어 있지 않습니다."),
    ALREADY_ENROLLED(HttpStatus.BAD_REQUEST, "이미 신청한 프로그램입니다."),
    NOT_FOUND_ENROLLMENT(HttpStatus.NOT_FOUND, "수강 신청 내역을 찾을 수 없습니다."),
    UNAUTHORIZED_ENROLLMENT_CANCEL(HttpStatus.FORBIDDEN, "본인만 수강 신청을 취소할 수 있습니다."),
    CANCEL_PERIOD_EXPIRED(HttpStatus.BAD_REQUEST, "취소 마감일이 지나 취소할 수 없습니다."),
    ALREADY_CANCELLED(HttpStatus.BAD_REQUEST, "이미 취소된 수강 신청입니다."),

    // JWT
    EXPIRED_JWT(HttpStatus.UNAUTHORIZED, "AccessToken이 만료되었습니다."),
    INVALID_JWT(HttpStatus.UNAUTHORIZED, "유효하지 않은 JWT 토큰입니다."),
    JWT_AUTH_FAIL(HttpStatus.UNAUTHORIZED, "JWT 인증에 실패했습니다."),
    INVALID_REFRESH_TOKEN(HttpStatus.UNAUTHORIZED, "리프레시 토큰이 유효하지 않습니다."),

    UNSUPPORTED_JWT(HttpStatus.UNAUTHORIZED, "지원하지 않는 JWT 서명 방식입니다."),
    MALFORMED_JWT(HttpStatus.UNAUTHORIZED, "JWT 토큰 형식이 올바르지 않습니다."),
    MISSING_ACCESS_TOKEN(HttpStatus.UNAUTHORIZED, "AccessToken이 필요합니다."),
    MISSING_REFRESH_TOKEN(HttpStatus.UNAUTHORIZED, "RefreshToken이 필요합니다.");

    private final HttpStatus status;
    private final String message;
}
