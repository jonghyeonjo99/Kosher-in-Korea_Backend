package com.kusher.kusher_in_korea.tabling.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
public class UpdateRestaurantDto {
    private Long Id; // 식당번호
    private Long userId; // 유저번호 (식당 주인임을 확인하기 위함)
    private String location; // 식당주소
    private String restaurantName; // 식당이름
    private String restaurantPhone; // 식당전화번호
    private int capacity; // 최대수용인원
    private LocalTime openTime; // 오픈시간
    private LocalTime closeTime; // 마감시간
    private String description; // 식당설명
}
