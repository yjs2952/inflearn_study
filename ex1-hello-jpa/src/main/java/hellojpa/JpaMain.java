package hellojpa;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {

            Member member1 = new Member();
            member1.setUsername("member1");
            em.persist(member1);

            Team team = new Team();
            team.setName("team1");
            em.persist(team);

            member1.setTeam(team);

            em.flush();
            em.clear();

            //Member m1 = em.getReference(Member.class, member1.getId());
            //System.out.println("m1 = " + m1.getClass());

            Member m = em.find(Member.class, member1.getId());
            System.out.println("m = " + m.getClass());

            System.out.println("team : " + m.getTeam().getClass());
            System.out.println("====================");

            m.getTeam().getName();

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }
}
