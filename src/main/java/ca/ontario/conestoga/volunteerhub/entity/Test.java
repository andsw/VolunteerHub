package ca.ontario.conestoga.volunteerhub.entity;

public class Test {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Test.id
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Test.name
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Test.id
     *
     * @return the value of Test.id
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Test.id
     *
     * @param id the value for Test.id
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Test.name
     *
     * @return the value of Test.name
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Test.name
     *
     * @param name the value for Test.name
     *
     * @mbg.generated Fri Jun 14 10:31:00 EDT 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}