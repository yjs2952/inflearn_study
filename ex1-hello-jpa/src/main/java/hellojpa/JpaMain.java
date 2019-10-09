package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {

            Team team = new Team();
            team.setName("TeamA");
//
            em.persist(team);

            Member member = new Member();
            member.setUsername("member2");
//            member.changeTeam(team);
            em.persist(member);

            team.addMember(member);

            em.flush();
            em.clear();

            Team findTema = em.find(Team.class, team.getId());  // 1차 캐시
            List<Member> members = findTema.getMembers();

            for (Member m : members) {
                System.out.println("m = " + m.getUsername());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
