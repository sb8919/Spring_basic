package hello.core.member;

public interface MemberService {
    void join(Member meber);

    Member findMember(Long memberId);
}
