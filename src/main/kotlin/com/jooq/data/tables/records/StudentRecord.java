/*
 * This file is generated by jOOQ.
 */
package com.jooq.data.tables.records;


import com.jooq.data.tables.Student;
import com.jooq.data.tables.interfaces.IStudent;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements IStudent {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>school.student.id</code>. 学生id
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>school.student.id</code>. 学生id
     */
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>school.student.name</code>. 学生姓名
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>school.student.name</code>. 学生姓名
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStudent from) {
        setId(from.getId());
        setName(from.getName());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IStudent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(String id, String name) {
        super(Student.STUDENT);

        setId(id);
        setName(name);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(com.jooq.data.tables.pojos.Student value) {
        super(Student.STUDENT);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            resetChangedOnNotNull();
        }
    }
}
