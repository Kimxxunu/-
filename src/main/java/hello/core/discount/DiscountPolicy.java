package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    //리턴이 할인금액
    int discount(Member member, int price);



}
