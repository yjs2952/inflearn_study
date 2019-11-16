package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {

            Team team = new Team();
            team.setName("team1");
            em.persist(team);

            Member member1 = new Member();
            member1.setUsername("teamA");
            member1.setAge(10);
            member1.setTeam(team);
            member1.setType(MemberType.ADMIN);
            em.persist(member1);

            em.flush();
            em.clear();

           /* List<Member> resultList = em.createQuery("select m from Member m where m.username = :username", Member.class)
                    .setParameter("username", "member1")
                    .getResultList();   // 얘네도 엔티티 매니저가 관리해준다.

            List<Team> result = em.createQuery("select t from Member m join m.team t", Team.class)
                    .getResultList();   // join 은 명시적으로 표기하는 것이 좋다.
*/
            /*List resultList1 = em.createQuery("select m.username, m.age from Member m")
                    .getResultList();

            Object o = resultList1.get(0);
            Object[] result1 = (Object[]) o;
            System.out.println("username : " + result1[0]);
            System.out.println("age : " + result1[1]);*/

            /*List<Object[]> resultList2 = em.createQuery("select m.username, m.age from Member m")
                    .getResultList();

            Object[] result2 = resultList2.get(0);
            System.out.println("username : " + result2[0]);
            System.out.println("age : " + result2[1]);*/

            /*List<MemberDTO> resultList1 = em.createQuery("select new hellojpa.MemberDTO(m.username, m.age) from Member m", MemberDTO.class)
                    .getResultList();

            MemberDTO memberDTO = resultList1.get(0);
            System.out.println("memberDTO = " + memberDTO.getUsername());
            System.out.println("memberDTO = " + memberDTO.getAge());*/

            String query = "select m.username, 'Hello', true  from Member m " +
                    "where m.type = :userType";

            List<Object[]> resultList1 = em.createQuery(query)
                    .setParameter("userType", MemberType.ADMIN)
                    .getResultList();

            for (Object[] objects : resultList1) {
                System.out.println("objects = " + objects[0]);
                System.out.println("objects = " + objects[1]);
                System.out.println("objects = " + objects[2]);
            }

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
