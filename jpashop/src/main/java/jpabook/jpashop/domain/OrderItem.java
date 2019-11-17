package jpabook.jpashop.domain;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class OrderItem {

    @Id @Generated
    @Column(name = "order_item_id")
    private Long id;

    private Item item;

    private Order order;
}
