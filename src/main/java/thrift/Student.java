package thrift; /**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-23")
public class Student implements org.apache.thrift.TBase<Student, Student._Fields>, java.io.Serializable, Cloneable, Comparable<Student> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("thriftservice.StudentThrift");

  private static final org.apache.thrift.protocol.TField STUDENTID_FIELD_DESC = new org.apache.thrift.protocol.TField("studentid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SURNAMENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("surnamename", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField GROUP_FIELD_DESC = new org.apache.thrift.protocol.TField("group", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField SCORE_FIELD_DESC = new org.apache.thrift.protocol.TField("score", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StudentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StudentTupleSchemeFactory());
  }

  public int studentid; // required
  public String name; // required
  public String surnamename; // required
  public int group; // required
  public int score; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STUDENTID((short)1, "studentid"),
    NAME((short)2, "name"),
    SURNAMENAME((short)3, "surnamename"),
    GROUP((short)4, "group"),
    SCORE((short)5, "score");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STUDENTID
          return STUDENTID;
        case 2: // NAME
          return NAME;
        case 3: // SURNAMENAME
          return SURNAMENAME;
        case 4: // GROUP
          return GROUP;
        case 5: // SCORE
          return SCORE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STUDENTID_ISSET_ID = 0;
  private static final int __GROUP_ISSET_ID = 1;
  private static final int __SCORE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STUDENTID, new org.apache.thrift.meta_data.FieldMetaData("studentid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SURNAMENAME, new org.apache.thrift.meta_data.FieldMetaData("surnamename", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUP, new org.apache.thrift.meta_data.FieldMetaData("group", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCORE, new org.apache.thrift.meta_data.FieldMetaData("score", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Student.class, metaDataMap);
  }

  public Student() {
  }

  public Student(
    int studentid,
    String name,
    String surnamename,
    int group,
    int score)
  {
    this();
    this.studentid = studentid;
    setStudentidIsSet(true);
    this.name = name;
    this.surnamename = surnamename;
    this.group = group;
    setGroupIsSet(true);
    this.score = score;
    setScoreIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Student(Student other) {
    __isset_bitfield = other.__isset_bitfield;
    this.studentid = other.studentid;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetSurnamename()) {
      this.surnamename = other.surnamename;
    }
    this.group = other.group;
    this.score = other.score;
  }

  public Student deepCopy() {
    return new Student(this);
  }

  public void clear() {
    setStudentidIsSet(false);
    this.studentid = 0;
    this.name = null;
    this.surnamename = null;
    setGroupIsSet(false);
    this.group = 0;
    setScoreIsSet(false);
    this.score = 0;
  }

  public int getStudentid() {
    return this.studentid;
  }

  public Student setStudentid(int studentid) {
    this.studentid = studentid;
    setStudentidIsSet(true);
    return this;
  }

  public void unsetStudentid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STUDENTID_ISSET_ID);
  }

  /** Returns true if field studentid is set (has been assigned a value) and false otherwise */
  public boolean isSetStudentid() {
    return EncodingUtils.testBit(__isset_bitfield, __STUDENTID_ISSET_ID);
  }

  public void setStudentidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STUDENTID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getSurnamename() {
    return this.surnamename;
  }

  public Student setSurnamename(String surnamename) {
    this.surnamename = surnamename;
    return this;
  }

  public void unsetSurnamename() {
    this.surnamename = null;
  }

  /** Returns true if field surnamename is set (has been assigned a value) and false otherwise */
  public boolean isSetSurnamename() {
    return this.surnamename != null;
  }

  public void setSurnamenameIsSet(boolean value) {
    if (!value) {
      this.surnamename = null;
    }
  }

  public int getGroup() {
    return this.group;
  }

  public Student setGroup(int group) {
    this.group = group;
    setGroupIsSet(true);
    return this;
  }

  public void unsetGroup() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GROUP_ISSET_ID);
  }

  /** Returns true if field group is set (has been assigned a value) and false otherwise */
  public boolean isSetGroup() {
    return EncodingUtils.testBit(__isset_bitfield, __GROUP_ISSET_ID);
  }

  public void setGroupIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GROUP_ISSET_ID, value);
  }

  public int getScore() {
    return this.score;
  }

  public Student setScore(int score) {
    this.score = score;
    setScoreIsSet(true);
    return this;
  }

  public void unsetScore() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  /** Returns true if field score is set (has been assigned a value) and false otherwise */
  public boolean isSetScore() {
    return EncodingUtils.testBit(__isset_bitfield, __SCORE_ISSET_ID);
  }

  public void setScoreIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SCORE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STUDENTID:
      if (value == null) {
        unsetStudentid();
      } else {
        setStudentid((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SURNAMENAME:
      if (value == null) {
        unsetSurnamename();
      } else {
        setSurnamename((String)value);
      }
      break;

    case GROUP:
      if (value == null) {
        unsetGroup();
      } else {
        setGroup((Integer)value);
      }
      break;

    case SCORE:
      if (value == null) {
        unsetScore();
      } else {
        setScore((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STUDENTID:
      return getStudentid();

    case NAME:
      return getName();

    case SURNAMENAME:
      return getSurnamename();

    case GROUP:
      return getGroup();

    case SCORE:
      return getScore();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STUDENTID:
      return isSetStudentid();
    case NAME:
      return isSetName();
    case SURNAMENAME:
      return isSetSurnamename();
    case GROUP:
      return isSetGroup();
    case SCORE:
      return isSetScore();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Student)
      return this.equals((Student)that);
    return false;
  }

  public boolean equals(Student that) {
    if (that == null)
      return false;

    boolean this_present_studentid = true;
    boolean that_present_studentid = true;
    if (this_present_studentid || that_present_studentid) {
      if (!(this_present_studentid && that_present_studentid))
        return false;
      if (this.studentid != that.studentid)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_surnamename = true && this.isSetSurnamename();
    boolean that_present_surnamename = true && that.isSetSurnamename();
    if (this_present_surnamename || that_present_surnamename) {
      if (!(this_present_surnamename && that_present_surnamename))
        return false;
      if (!this.surnamename.equals(that.surnamename))
        return false;
    }

    boolean this_present_group = true;
    boolean that_present_group = true;
    if (this_present_group || that_present_group) {
      if (!(this_present_group && that_present_group))
        return false;
      if (this.group != that.group)
        return false;
    }

    boolean this_present_score = true;
    boolean that_present_score = true;
    if (this_present_score || that_present_score) {
      if (!(this_present_score && that_present_score))
        return false;
      if (this.score != that.score)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_studentid = true;
    list.add(present_studentid);
    if (present_studentid)
      list.add(studentid);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_surnamename = true && (isSetSurnamename());
    list.add(present_surnamename);
    if (present_surnamename)
      list.add(surnamename);

    boolean present_group = true;
    list.add(present_group);
    if (present_group)
      list.add(group);

    boolean present_score = true;
    list.add(present_score);
    if (present_score)
      list.add(score);

    return list.hashCode();
  }

  public int compareTo(Student other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStudentid()).compareTo(other.isSetStudentid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStudentid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.studentid, other.studentid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSurnamename()).compareTo(other.isSetSurnamename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSurnamename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.surnamename, other.surnamename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroup()).compareTo(other.isSetGroup());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroup()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.group, other.group);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScore()).compareTo(other.isSetScore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.score, other.score);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("thriftservice.StudentThrift(");
    boolean first = true;

    sb.append("studentid:");
    sb.append(this.studentid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("surnamename:");
    if (this.surnamename == null) {
      sb.append("null");
    } else {
      sb.append(this.surnamename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("group:");
    sb.append(this.group);
    first = false;
    if (!first) sb.append(", ");
    sb.append("score:");
    sb.append(this.score);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StudentStandardSchemeFactory implements SchemeFactory {
    public StudentStandardScheme getScheme() {
      return new StudentStandardScheme();
    }
  }

  private static class StudentStandardScheme extends StandardScheme<Student> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Student struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STUDENTID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.studentid = iprot.readI32();
              struct.setStudentidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SURNAMENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.surnamename = iprot.readString();
              struct.setSurnamenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // GROUP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.group = iprot.readI32();
              struct.setGroupIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SCORE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.score = iprot.readI32();
              struct.setScoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Student struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STUDENTID_FIELD_DESC);
      oprot.writeI32(struct.studentid);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.surnamename != null) {
        oprot.writeFieldBegin(SURNAMENAME_FIELD_DESC);
        oprot.writeString(struct.surnamename);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GROUP_FIELD_DESC);
      oprot.writeI32(struct.group);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SCORE_FIELD_DESC);
      oprot.writeI32(struct.score);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StudentTupleSchemeFactory implements SchemeFactory {
    public StudentTupleScheme getScheme() {
      return new StudentTupleScheme();
    }
  }

  private static class StudentTupleScheme extends TupleScheme<Student> {

    public void write(org.apache.thrift.protocol.TProtocol prot, Student struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStudentid()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetSurnamename()) {
        optionals.set(2);
      }
      if (struct.isSetGroup()) {
        optionals.set(3);
      }
      if (struct.isSetScore()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStudentid()) {
        oprot.writeI32(struct.studentid);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetSurnamename()) {
        oprot.writeString(struct.surnamename);
      }
      if (struct.isSetGroup()) {
        oprot.writeI32(struct.group);
      }
      if (struct.isSetScore()) {
        oprot.writeI32(struct.score);
      }
    }

    public void read(org.apache.thrift.protocol.TProtocol prot, Student struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.studentid = iprot.readI32();
        struct.setStudentidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.surnamename = iprot.readString();
        struct.setSurnamenameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.group = iprot.readI32();
        struct.setGroupIsSet(true);
      }
      if (incoming.get(4)) {
        struct.score = iprot.readI32();
        struct.setScoreIsSet(true);
      }
    }
  }

}

