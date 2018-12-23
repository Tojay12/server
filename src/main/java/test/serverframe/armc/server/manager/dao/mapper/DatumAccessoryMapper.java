package test.serverframe.armc.server.manager.dao.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import test.serverframe.armc.server.manager.domain.DatumAccessory;

import java.util.List;

public interface DatumAccessoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @Delete({
        "delete from QB_GYWB_ZLFJ",
        "where FJID = #{fjid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String fjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @Insert({
        "insert into QB_GYWB_ZLFJ (FJID, ZLBH, ",
        "WJM, FJLX, MTGS, ",
        "ZS, WJDX, CCLJ, ",
        "FJWB)",
        "values (#{fjid,jdbcType=VARCHAR}, #{zlbh,jdbcType=VARCHAR}, ",
        "#{wjm,jdbcType=VARCHAR}, #{fjlx,jdbcType=VARCHAR}, #{mtgs,jdbcType=VARCHAR}, ",
        "#{zs,jdbcType=DECIMAL}, #{wjdx,jdbcType=DECIMAL}, #{cclj,jdbcType=CLOB}, ",
        "#{fjwb,jdbcType=CLOB})"
    })
    int insert(DatumAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @InsertProvider(type=DatumAccessorySqlProvider.class, method="insertSelective")
    int insertSelective(DatumAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "FJID, ZLBH, WJM, FJLX, MTGS, ZS, WJDX, CCLJ, FJWB",
        "from QB_GYWB_ZLFJ",
        "where FJID = #{fjid,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="FJID", property="fjid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ZLBH", property="zlbh", jdbcType=JdbcType.VARCHAR),
        @Result(column="WJM", property="wjm", jdbcType=JdbcType.VARCHAR),
        @Result(column="FJLX", property="fjlx", jdbcType=JdbcType.VARCHAR),
        @Result(column="MTGS", property="mtgs", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZS", property="zs", jdbcType=JdbcType.DECIMAL),
        @Result(column="WJDX", property="wjdx", jdbcType=JdbcType.DECIMAL),
        @Result(column="CCLJ", property="cclj", jdbcType=JdbcType.CLOB),
        @Result(column="FJWB", property="fjwb", jdbcType=JdbcType.CLOB)
    })
    DatumAccessory selectByPrimaryKey(String fjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @UpdateProvider(type=DatumAccessorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DatumAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @Update({
        "update QB_GYWB_ZLFJ",
        "set ZLBH = #{zlbh,jdbcType=VARCHAR},",
          "WJM = #{wjm,jdbcType=VARCHAR},",
          "FJLX = #{fjlx,jdbcType=VARCHAR},",
          "MTGS = #{mtgs,jdbcType=VARCHAR},",
          "ZS = #{zs,jdbcType=DECIMAL},",
          "WJDX = #{wjdx,jdbcType=DECIMAL},",
          "CCLJ = #{cclj,jdbcType=CLOB},",
          "FJWB = #{fjwb,jdbcType=CLOB}",
        "where FJID = #{fjid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(DatumAccessory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QB_GYWB_ZLFJ
     *
     * @mbg.generated
     */
    @Update({
        "update QB_GYWB_ZLFJ",
        "set ZLBH = #{zlbh,jdbcType=VARCHAR},",
          "WJM = #{wjm,jdbcType=VARCHAR},",
          "FJLX = #{fjlx,jdbcType=VARCHAR},",
          "MTGS = #{mtgs,jdbcType=VARCHAR},",
          "ZS = #{zs,jdbcType=DECIMAL},",
          "WJDX = #{wjdx,jdbcType=DECIMAL}",
        "where FJID = #{fjid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DatumAccessory record);


    /**
     * @Descripttion  根据资料编号查询附件
     * @Author jiangyuanwei
     * @Date 2018/10/17 16:34
     * @Param [zlbh]
     * @Return
     **/
    @Select({
            "select",
            "FJID, ZLBH, WJM, FJLX, MTGS, ZS, WJDX, CCLJ, FJWB",
            "from QB_GYWB_ZLFJ",
            "where ZLBH = #{zlbh,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="FJID", property="fjid", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="ZLBH", property="zlbh", jdbcType=JdbcType.VARCHAR),
            @Result(column="WJM", property="wjm", jdbcType=JdbcType.VARCHAR),
            @Result(column="FJLX", property="fjlx", jdbcType=JdbcType.VARCHAR),
            @Result(column="MTGS", property="mtgs", jdbcType=JdbcType.VARCHAR),
            @Result(column="ZS", property="zs", jdbcType=JdbcType.DECIMAL),
            @Result(column="WJDX", property="wjdx", jdbcType=JdbcType.DECIMAL),
            @Result(column="CCLJ", property="cclj", jdbcType=JdbcType.CLOB),
            @Result(column="FJWB", property="fjwb", jdbcType=JdbcType.CLOB)
    })
    List<DatumAccessory> getAllDatumAccessory(String zlbh);

}