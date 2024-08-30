package io.codeforall.bootcamp.harrypotter.persistence.model;

import javax.persistence.*;

/**
 * A generic model entity to be used as a base for concrete types of models
 */

@MappedSuperclass
public abstract class AbstractModel implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;
    /**
     * @see Model#getId()
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * @see Model#setId(Integer)
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the model version
     *
     * @return the model version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the model version
     *
     * @param version the model version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                '}';
    }
}
