/*
 * This file is generated by jOOQ.
 */
package com.jooq.data.tables.records;


import com.jooq.data.tables.TeacherDetails;
import com.jooq.data.tables.interfaces.ITeacherDetails;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeacherDetailsRecord extends UpdatableRecordImpl<TeacherDetailsRecord> implements ITeacherDetails {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>school.teacher_details.teacher_id</code>.
     */
    @Override
    public void setTeacherId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>school.teacher_details.teacher_id</code>.
     */
    @Override
    public Integer getTeacherId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>school.teacher_details.address</code>.
     */
    @Override
    public void setAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>school.teacher_details.address</code>.
     */
    @Override
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>school.teacher_details.salary</code>.
     */
    @Override
    public void setSalary(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>school.teacher_details.salary</code>.
     */
    @Override
    public Integer getSalary() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITeacherDetails from) {
        setTeacherId(from.getTeacherId());
        setAddress(from.getAddress());
        setSalary(from.getSalary());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITeacherDetails> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TeacherDetailsRecord
     */
    public TeacherDetailsRecord() {
        super(TeacherDetails.TEACHER_DETAILS);
    }

    /**
     * Create a detached, initialised TeacherDetailsRecord
     */
    public TeacherDetailsRecord(Integer teacherId, String address, Integer salary) {
        super(TeacherDetails.TEACHER_DETAILS);

        setTeacherId(teacherId);
        setAddress(address);
        setSalary(salary);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TeacherDetailsRecord
     */
    public TeacherDetailsRecord(com.jooq.data.tables.pojos.TeacherDetails value) {
        super(TeacherDetails.TEACHER_DETAILS);

        if (value != null) {
            setTeacherId(value.getTeacherId());
            setAddress(value.getAddress());
            setSalary(value.getSalary());
            resetChangedOnNotNull();
        }
    }
}