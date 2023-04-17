package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable // 어딘가에 내장이 될 수도 있다는 뜻
@Getter @Setter
public class Address {
        private String city;
        private String street;
        private String zipcode;

        protected Address() {

        }

        public Address(String city, String street, String zipcode) {
                this.city = city;
                this.street = street;
                this.zipcode = zipcode;
        }
}
