package asynctest.model;

import java.util.ArrayList;
import java.util.List;

public class KabuAllModelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public KabuAllModelExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andStKabucdIsNull() {
            addCriterion("ST_KABUCD is null");
            return (Criteria) this;
        }

        public Criteria andStKabucdIsNotNull() {
            addCriterion("ST_KABUCD is not null");
            return (Criteria) this;
        }

        public Criteria andStKabucdEqualTo(String value) {
            addCriterion("ST_KABUCD =", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdNotEqualTo(String value) {
            addCriterion("ST_KABUCD <>", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdGreaterThan(String value) {
            addCriterion("ST_KABUCD >", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdGreaterThanOrEqualTo(String value) {
            addCriterion("ST_KABUCD >=", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdLessThan(String value) {
            addCriterion("ST_KABUCD <", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdLessThanOrEqualTo(String value) {
            addCriterion("ST_KABUCD <=", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdLike(String value) {
            addCriterion("ST_KABUCD like", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdNotLike(String value) {
            addCriterion("ST_KABUCD not like", value, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdIn(List<String> values) {
            addCriterion("ST_KABUCD in", values, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdNotIn(List<String> values) {
            addCriterion("ST_KABUCD not in", values, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdBetween(String value1, String value2) {
            addCriterion("ST_KABUCD between", value1, value2, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStKabucdNotBetween(String value1, String value2) {
            addCriterion("ST_KABUCD not between", value1, value2, "stKabucd");
            return (Criteria) this;
        }

        public Criteria andStDateIsNull() {
            addCriterion("ST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStDateIsNotNull() {
            addCriterion("ST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStDateEqualTo(String value) {
            addCriterion("ST_DATE =", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateNotEqualTo(String value) {
            addCriterion("ST_DATE <>", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateGreaterThan(String value) {
            addCriterion("ST_DATE >", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateGreaterThanOrEqualTo(String value) {
            addCriterion("ST_DATE >=", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateLessThan(String value) {
            addCriterion("ST_DATE <", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateLessThanOrEqualTo(String value) {
            addCriterion("ST_DATE <=", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateLike(String value) {
            addCriterion("ST_DATE like", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateNotLike(String value) {
            addCriterion("ST_DATE not like", value, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateIn(List<String> values) {
            addCriterion("ST_DATE in", values, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateNotIn(List<String> values) {
            addCriterion("ST_DATE not in", values, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateBetween(String value1, String value2) {
            addCriterion("ST_DATE between", value1, value2, "stDate");
            return (Criteria) this;
        }

        public Criteria andStDateNotBetween(String value1, String value2) {
            addCriterion("ST_DATE not between", value1, value2, "stDate");
            return (Criteria) this;
        }

        public Criteria andStTourokubiIsNull() {
            addCriterion("ST_TOUROKUBI is null");
            return (Criteria) this;
        }

        public Criteria andStTourokubiIsNotNull() {
            addCriterion("ST_TOUROKUBI is not null");
            return (Criteria) this;
        }

        public Criteria andStTourokubiEqualTo(String value) {
            addCriterion("ST_TOUROKUBI =", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiNotEqualTo(String value) {
            addCriterion("ST_TOUROKUBI <>", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiGreaterThan(String value) {
            addCriterion("ST_TOUROKUBI >", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiGreaterThanOrEqualTo(String value) {
            addCriterion("ST_TOUROKUBI >=", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiLessThan(String value) {
            addCriterion("ST_TOUROKUBI <", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiLessThanOrEqualTo(String value) {
            addCriterion("ST_TOUROKUBI <=", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiLike(String value) {
            addCriterion("ST_TOUROKUBI like", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiNotLike(String value) {
            addCriterion("ST_TOUROKUBI not like", value, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiIn(List<String> values) {
            addCriterion("ST_TOUROKUBI in", values, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiNotIn(List<String> values) {
            addCriterion("ST_TOUROKUBI not in", values, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiBetween(String value1, String value2) {
            addCriterion("ST_TOUROKUBI between", value1, value2, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStTourokubiNotBetween(String value1, String value2) {
            addCriterion("ST_TOUROKUBI not between", value1, value2, "stTourokubi");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdIsNull() {
            addCriterion("ST_RONRISAKU_CD is null");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdIsNotNull() {
            addCriterion("ST_RONRISAKU_CD is not null");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdEqualTo(String value) {
            addCriterion("ST_RONRISAKU_CD =", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdNotEqualTo(String value) {
            addCriterion("ST_RONRISAKU_CD <>", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdGreaterThan(String value) {
            addCriterion("ST_RONRISAKU_CD >", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdGreaterThanOrEqualTo(String value) {
            addCriterion("ST_RONRISAKU_CD >=", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdLessThan(String value) {
            addCriterion("ST_RONRISAKU_CD <", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdLessThanOrEqualTo(String value) {
            addCriterion("ST_RONRISAKU_CD <=", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdLike(String value) {
            addCriterion("ST_RONRISAKU_CD like", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdNotLike(String value) {
            addCriterion("ST_RONRISAKU_CD not like", value, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdIn(List<String> values) {
            addCriterion("ST_RONRISAKU_CD in", values, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdNotIn(List<String> values) {
            addCriterion("ST_RONRISAKU_CD not in", values, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdBetween(String value1, String value2) {
            addCriterion("ST_RONRISAKU_CD between", value1, value2, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andStRonrisakuCdNotBetween(String value1, String value2) {
            addCriterion("ST_RONRISAKU_CD not between", value1, value2, "stRonrisakuCd");
            return (Criteria) this;
        }

        public Criteria andNumOpenIsNull() {
            addCriterion("NUM_OPEN is null");
            return (Criteria) this;
        }

        public Criteria andNumOpenIsNotNull() {
            addCriterion("NUM_OPEN is not null");
            return (Criteria) this;
        }

        public Criteria andNumOpenEqualTo(Float value) {
            addCriterion("NUM_OPEN =", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenNotEqualTo(Float value) {
            addCriterion("NUM_OPEN <>", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenGreaterThan(Float value) {
            addCriterion("NUM_OPEN >", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_OPEN >=", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenLessThan(Float value) {
            addCriterion("NUM_OPEN <", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenLessThanOrEqualTo(Float value) {
            addCriterion("NUM_OPEN <=", value, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenIn(List<Float> values) {
            addCriterion("NUM_OPEN in", values, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenNotIn(List<Float> values) {
            addCriterion("NUM_OPEN not in", values, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenBetween(Float value1, Float value2) {
            addCriterion("NUM_OPEN between", value1, value2, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumOpenNotBetween(Float value1, Float value2) {
            addCriterion("NUM_OPEN not between", value1, value2, "numOpen");
            return (Criteria) this;
        }

        public Criteria andNumHighIsNull() {
            addCriterion("NUM_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andNumHighIsNotNull() {
            addCriterion("NUM_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andNumHighEqualTo(Float value) {
            addCriterion("NUM_HIGH =", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighNotEqualTo(Float value) {
            addCriterion("NUM_HIGH <>", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighGreaterThan(Float value) {
            addCriterion("NUM_HIGH >", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_HIGH >=", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighLessThan(Float value) {
            addCriterion("NUM_HIGH <", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighLessThanOrEqualTo(Float value) {
            addCriterion("NUM_HIGH <=", value, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighIn(List<Float> values) {
            addCriterion("NUM_HIGH in", values, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighNotIn(List<Float> values) {
            addCriterion("NUM_HIGH not in", values, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighBetween(Float value1, Float value2) {
            addCriterion("NUM_HIGH between", value1, value2, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumHighNotBetween(Float value1, Float value2) {
            addCriterion("NUM_HIGH not between", value1, value2, "numHigh");
            return (Criteria) this;
        }

        public Criteria andNumLowIsNull() {
            addCriterion("NUM_LOW is null");
            return (Criteria) this;
        }

        public Criteria andNumLowIsNotNull() {
            addCriterion("NUM_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andNumLowEqualTo(Float value) {
            addCriterion("NUM_LOW =", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowNotEqualTo(Float value) {
            addCriterion("NUM_LOW <>", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowGreaterThan(Float value) {
            addCriterion("NUM_LOW >", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_LOW >=", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowLessThan(Float value) {
            addCriterion("NUM_LOW <", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowLessThanOrEqualTo(Float value) {
            addCriterion("NUM_LOW <=", value, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowIn(List<Float> values) {
            addCriterion("NUM_LOW in", values, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowNotIn(List<Float> values) {
            addCriterion("NUM_LOW not in", values, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowBetween(Float value1, Float value2) {
            addCriterion("NUM_LOW between", value1, value2, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumLowNotBetween(Float value1, Float value2) {
            addCriterion("NUM_LOW not between", value1, value2, "numLow");
            return (Criteria) this;
        }

        public Criteria andNumCloseIsNull() {
            addCriterion("NUM_CLOSE is null");
            return (Criteria) this;
        }

        public Criteria andNumCloseIsNotNull() {
            addCriterion("NUM_CLOSE is not null");
            return (Criteria) this;
        }

        public Criteria andNumCloseEqualTo(Float value) {
            addCriterion("NUM_CLOSE =", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseNotEqualTo(Float value) {
            addCriterion("NUM_CLOSE <>", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseGreaterThan(Float value) {
            addCriterion("NUM_CLOSE >", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_CLOSE >=", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseLessThan(Float value) {
            addCriterion("NUM_CLOSE <", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseLessThanOrEqualTo(Float value) {
            addCriterion("NUM_CLOSE <=", value, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseIn(List<Float> values) {
            addCriterion("NUM_CLOSE in", values, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseNotIn(List<Float> values) {
            addCriterion("NUM_CLOSE not in", values, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseBetween(Float value1, Float value2) {
            addCriterion("NUM_CLOSE between", value1, value2, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumCloseNotBetween(Float value1, Float value2) {
            addCriterion("NUM_CLOSE not between", value1, value2, "numClose");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaIsNull() {
            addCriterion("NUM_DEKIDAKA is null");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaIsNotNull() {
            addCriterion("NUM_DEKIDAKA is not null");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaEqualTo(Float value) {
            addCriterion("NUM_DEKIDAKA =", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaNotEqualTo(Float value) {
            addCriterion("NUM_DEKIDAKA <>", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaGreaterThan(Float value) {
            addCriterion("NUM_DEKIDAKA >", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_DEKIDAKA >=", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaLessThan(Float value) {
            addCriterion("NUM_DEKIDAKA <", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaLessThanOrEqualTo(Float value) {
            addCriterion("NUM_DEKIDAKA <=", value, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaIn(List<Float> values) {
            addCriterion("NUM_DEKIDAKA in", values, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaNotIn(List<Float> values) {
            addCriterion("NUM_DEKIDAKA not in", values, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaBetween(Float value1, Float value2) {
            addCriterion("NUM_DEKIDAKA between", value1, value2, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumDekidakaNotBetween(Float value1, Float value2) {
            addCriterion("NUM_DEKIDAKA not between", value1, value2, "numDekidaka");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiIsNull() {
            addCriterion("NUM_SAICHOUSEI is null");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiIsNotNull() {
            addCriterion("NUM_SAICHOUSEI is not null");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiEqualTo(Float value) {
            addCriterion("NUM_SAICHOUSEI =", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiNotEqualTo(Float value) {
            addCriterion("NUM_SAICHOUSEI <>", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiGreaterThan(Float value) {
            addCriterion("NUM_SAICHOUSEI >", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_SAICHOUSEI >=", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiLessThan(Float value) {
            addCriterion("NUM_SAICHOUSEI <", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiLessThanOrEqualTo(Float value) {
            addCriterion("NUM_SAICHOUSEI <=", value, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiIn(List<Float> values) {
            addCriterion("NUM_SAICHOUSEI in", values, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiNotIn(List<Float> values) {
            addCriterion("NUM_SAICHOUSEI not in", values, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiBetween(Float value1, Float value2) {
            addCriterion("NUM_SAICHOUSEI between", value1, value2, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumSaichouseiNotBetween(Float value1, Float value2) {
            addCriterion("NUM_SAICHOUSEI not between", value1, value2, "numSaichousei");
            return (Criteria) this;
        }

        public Criteria andNumRsiIsNull() {
            addCriterion("NUM_RSI is null");
            return (Criteria) this;
        }

        public Criteria andNumRsiIsNotNull() {
            addCriterion("NUM_RSI is not null");
            return (Criteria) this;
        }

        public Criteria andNumRsiEqualTo(Float value) {
            addCriterion("NUM_RSI =", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiNotEqualTo(Float value) {
            addCriterion("NUM_RSI <>", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiGreaterThan(Float value) {
            addCriterion("NUM_RSI >", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_RSI >=", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiLessThan(Float value) {
            addCriterion("NUM_RSI <", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiLessThanOrEqualTo(Float value) {
            addCriterion("NUM_RSI <=", value, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiIn(List<Float> values) {
            addCriterion("NUM_RSI in", values, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiNotIn(List<Float> values) {
            addCriterion("NUM_RSI not in", values, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiBetween(Float value1, Float value2) {
            addCriterion("NUM_RSI between", value1, value2, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRsiNotBetween(Float value1, Float value2) {
            addCriterion("NUM_RSI not between", value1, value2, "numRsi");
            return (Criteria) this;
        }

        public Criteria andNumRciIsNull() {
            addCriterion("NUM_RCI is null");
            return (Criteria) this;
        }

        public Criteria andNumRciIsNotNull() {
            addCriterion("NUM_RCI is not null");
            return (Criteria) this;
        }

        public Criteria andNumRciEqualTo(Float value) {
            addCriterion("NUM_RCI =", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciNotEqualTo(Float value) {
            addCriterion("NUM_RCI <>", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciGreaterThan(Float value) {
            addCriterion("NUM_RCI >", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_RCI >=", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciLessThan(Float value) {
            addCriterion("NUM_RCI <", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciLessThanOrEqualTo(Float value) {
            addCriterion("NUM_RCI <=", value, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciIn(List<Float> values) {
            addCriterion("NUM_RCI in", values, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciNotIn(List<Float> values) {
            addCriterion("NUM_RCI not in", values, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciBetween(Float value1, Float value2) {
            addCriterion("NUM_RCI between", value1, value2, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRciNotBetween(Float value1, Float value2) {
            addCriterion("NUM_RCI not between", value1, value2, "numRci");
            return (Criteria) this;
        }

        public Criteria andNumRocIsNull() {
            addCriterion("NUM_ROC is null");
            return (Criteria) this;
        }

        public Criteria andNumRocIsNotNull() {
            addCriterion("NUM_ROC is not null");
            return (Criteria) this;
        }

        public Criteria andNumRocEqualTo(Float value) {
            addCriterion("NUM_ROC =", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocNotEqualTo(Float value) {
            addCriterion("NUM_ROC <>", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocGreaterThan(Float value) {
            addCriterion("NUM_ROC >", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocGreaterThanOrEqualTo(Float value) {
            addCriterion("NUM_ROC >=", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocLessThan(Float value) {
            addCriterion("NUM_ROC <", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocLessThanOrEqualTo(Float value) {
            addCriterion("NUM_ROC <=", value, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocIn(List<Float> values) {
            addCriterion("NUM_ROC in", values, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocNotIn(List<Float> values) {
            addCriterion("NUM_ROC not in", values, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocBetween(Float value1, Float value2) {
            addCriterion("NUM_ROC between", value1, value2, "numRoc");
            return (Criteria) this;
        }

        public Criteria andNumRocNotBetween(Float value1, Float value2) {
            addCriterion("NUM_ROC not between", value1, value2, "numRoc");
            return (Criteria) this;
        }

        public Criteria andStColflagIsNull() {
            addCriterion("ST_COLFLAG is null");
            return (Criteria) this;
        }

        public Criteria andStColflagIsNotNull() {
            addCriterion("ST_COLFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStColflagEqualTo(String value) {
            addCriterion("ST_COLFLAG =", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagNotEqualTo(String value) {
            addCriterion("ST_COLFLAG <>", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagGreaterThan(String value) {
            addCriterion("ST_COLFLAG >", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagGreaterThanOrEqualTo(String value) {
            addCriterion("ST_COLFLAG >=", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagLessThan(String value) {
            addCriterion("ST_COLFLAG <", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagLessThanOrEqualTo(String value) {
            addCriterion("ST_COLFLAG <=", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagLike(String value) {
            addCriterion("ST_COLFLAG like", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagNotLike(String value) {
            addCriterion("ST_COLFLAG not like", value, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagIn(List<String> values) {
            addCriterion("ST_COLFLAG in", values, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagNotIn(List<String> values) {
            addCriterion("ST_COLFLAG not in", values, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagBetween(String value1, String value2) {
            addCriterion("ST_COLFLAG between", value1, value2, "stColflag");
            return (Criteria) this;
        }

        public Criteria andStColflagNotBetween(String value1, String value2) {
            addCriterion("ST_COLFLAG not between", value1, value2, "stColflag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 13 02:33:35 JST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table KABU_ALL_T
     *
     * @mbg.generated Sun Jun 13 02:33:35 JST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}