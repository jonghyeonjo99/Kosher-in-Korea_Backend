package com.kusher.kusher_in_korea.tabling.dto.request;

import com.kusher.kusher_in_korea.tabling.domain.RestaurantMenu;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateRestaurantMenuDto { // 식당 메뉴 추가 요청
    private Long ownerId; // 유저번호 (식당 주인임을 확인하기 위함)
    private String menuName; // 메뉴이름
    private int price; // 메뉴가격
    private String menuDescription; // 메뉴설명
}
