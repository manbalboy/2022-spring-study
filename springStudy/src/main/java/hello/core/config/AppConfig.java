package hello.core.config;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    public OrderService orderService () {
        return new OrderServiceImpl(new MemoryMemberRepository(),new RateDiscountPolicy());
    }

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
}
