package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(// @Component를 찾아서 자동으로 스프링빈으로 모두 등록해줌
        // 해당 패키지 아래부터 찾음
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        // 스프링 빈에 등록하지 않을 것을 지정 => @Configuration 붙은 건 제외 (AppConfig를 이미 만들어놨으므로 제외 필요)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 충돌 테스트 (동일한 이름의 수동 빈 등록)
//    @Bean(name="memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
