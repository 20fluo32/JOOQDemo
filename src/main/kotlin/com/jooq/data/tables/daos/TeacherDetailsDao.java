/*
 * This file is generated by jOOQ.
 */
package com.jooq.data.tables.daos;


import com.jooq.data.tables.TeacherDetails;
import com.jooq.data.tables.records.TeacherDetailsRecord;

import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeacherDetailsDao extends DAOImpl<TeacherDetailsRecord, com.jooq.data.tables.pojos.TeacherDetails, Integer> {

    /**
     * Create a new TeacherDetailsDao without any configuration
     */
    public TeacherDetailsDao() {
        super(TeacherDetails.TEACHER_DETAILS, com.jooq.data.tables.pojos.TeacherDetails.class);
    }

    /**
     * Create a new TeacherDetailsDao with an attached configuration
     */
    public TeacherDetailsDao(Configuration configuration) {
        super(TeacherDetails.TEACHER_DETAILS, com.jooq.data.tables.pojos.TeacherDetails.class, configuration);
    }

    @Override
    public Integer getId(com.jooq.data.tables.pojos.TeacherDetails object) {
        return object.getTeacherId();
    }

    /**
     * Fetch records that have <code>teacher_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchRangeOfTeacherId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TeacherDetails.TEACHER_DETAILS.TEACHER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>teacher_id IN (values)</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchByTeacherId(Integer... values) {
        return fetch(TeacherDetails.TEACHER_DETAILS.TEACHER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>teacher_id = value</code>
     */
    public com.jooq.data.tables.pojos.TeacherDetails fetchOneByTeacherId(Integer value) {
        return fetchOne(TeacherDetails.TEACHER_DETAILS.TEACHER_ID, value);
    }

    /**
     * Fetch a unique record that has <code>teacher_id = value</code>
     */
    public Optional<com.jooq.data.tables.pojos.TeacherDetails> fetchOptionalByTeacherId(Integer value) {
        return fetchOptional(TeacherDetails.TEACHER_DETAILS.TEACHER_ID, value);
    }

    /**
     * Fetch records that have <code>address BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchRangeOfAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(TeacherDetails.TEACHER_DETAILS.ADDRESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchByAddress(String... values) {
        return fetch(TeacherDetails.TEACHER_DETAILS.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>salary BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchRangeOfSalary(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(TeacherDetails.TEACHER_DETAILS.SALARY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>salary IN (values)</code>
     */
    public List<com.jooq.data.tables.pojos.TeacherDetails> fetchBySalary(Integer... values) {
        return fetch(TeacherDetails.TEACHER_DETAILS.SALARY, values);
    }
}