package nathan.maven.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name="T_PHONE")
public class Phone {
	private Long id;
	private String number;
	private Person person;
	public Phone(){
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,
	generator="TABLE_GENERATOR")
	@TableGenerator(name="TABLE_GENERATOR",table="T_SEQUENCES",
	pkColumnName="SEQ_NAME")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="number")
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PERSON_ID")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
