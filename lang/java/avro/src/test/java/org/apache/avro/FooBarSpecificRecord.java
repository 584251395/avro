/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class FooBarSpecificRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1031933828916876443L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FooBarSpecificRecord\",\"namespace\":\"org.apache.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"nicknames\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"relatedids\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"typeEnum\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TypeEnum\",\"symbols\":[\"a\",\"b\",\"c\"]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.String name;
  @Deprecated public java.util.List<java.lang.String> nicknames;
  @Deprecated public java.util.List<java.lang.Integer> relatedids;
  @Deprecated public org.apache.avro.TypeEnum typeEnum;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public FooBarSpecificRecord() {}

  /**
   * All-args constructor.
   */
  public FooBarSpecificRecord(java.lang.Integer id, java.lang.String name, java.util.List<java.lang.String> nicknames, java.util.List<java.lang.Integer> relatedids, org.apache.avro.TypeEnum typeEnum) {
    this.id = id;
    this.name = name;
    this.nicknames = nicknames;
    this.relatedids = relatedids;
    this.typeEnum = typeEnum;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return nicknames;
    case 3: return relatedids;
    case 4: return typeEnum;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.String)value$; break;
    case 2: nicknames = (java.util.List<java.lang.String>)value$; break;
    case 3: relatedids = (java.util.List<java.lang.Integer>)value$; break;
    case 4: typeEnum = (org.apache.avro.TypeEnum)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'nicknames' field.
   */
  public java.util.List<java.lang.String> getNicknames() {
    return nicknames;
  }

  /**
   * Sets the value of the 'nicknames' field.
   * @param value the value to set.
   */
  public void setNicknames(java.util.List<java.lang.String> value) {
    this.nicknames = value;
  }

  /**
   * Gets the value of the 'relatedids' field.
   */
  public java.util.List<java.lang.Integer> getRelatedids() {
    return relatedids;
  }

  /**
   * Sets the value of the 'relatedids' field.
   * @param value the value to set.
   */
  public void setRelatedids(java.util.List<java.lang.Integer> value) {
    this.relatedids = value;
  }

  /**
   * Gets the value of the 'typeEnum' field.
   */
  public org.apache.avro.TypeEnum getTypeEnum() {
    return typeEnum;
  }

  /**
   * Sets the value of the 'typeEnum' field.
   * @param value the value to set.
   */
  public void setTypeEnum(org.apache.avro.TypeEnum value) {
    this.typeEnum = value;
  }

  /** Creates a new FooBarSpecificRecord RecordBuilder */
  public static org.apache.avro.FooBarSpecificRecord.Builder newBuilder() {
    return new org.apache.avro.FooBarSpecificRecord.Builder();
  }
  
  /** Creates a new FooBarSpecificRecord RecordBuilder by copying an existing Builder */
  public static org.apache.avro.FooBarSpecificRecord.Builder newBuilder(org.apache.avro.FooBarSpecificRecord.Builder other) {
    return new org.apache.avro.FooBarSpecificRecord.Builder(other);
  }
  
  /** Creates a new FooBarSpecificRecord RecordBuilder by copying an existing FooBarSpecificRecord instance */
  public static org.apache.avro.FooBarSpecificRecord.Builder newBuilder(org.apache.avro.FooBarSpecificRecord other) {
    return new org.apache.avro.FooBarSpecificRecord.Builder(other);
  }
  
  /**
   * RecordBuilder for FooBarSpecificRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FooBarSpecificRecord>
    implements org.apache.avro.data.RecordBuilder<FooBarSpecificRecord> {

    private int id;
    private java.lang.String name;
    private java.util.List<java.lang.String> nicknames;
    private java.util.List<java.lang.Integer> relatedids;
    private org.apache.avro.TypeEnum typeEnum;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.avro.FooBarSpecificRecord.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.avro.FooBarSpecificRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nicknames)) {
        this.nicknames = data().deepCopy(fields()[2].schema(), other.nicknames);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.relatedids)) {
        this.relatedids = data().deepCopy(fields()[3].schema(), other.relatedids);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.typeEnum)) {
        this.typeEnum = data().deepCopy(fields()[4].schema(), other.typeEnum);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FooBarSpecificRecord instance */
    private Builder(org.apache.avro.FooBarSpecificRecord other) {
            super(org.apache.avro.FooBarSpecificRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nicknames)) {
        this.nicknames = data().deepCopy(fields()[2].schema(), other.nicknames);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.relatedids)) {
        this.relatedids = data().deepCopy(fields()[3].schema(), other.relatedids);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.typeEnum)) {
        this.typeEnum = data().deepCopy(fields()[4].schema(), other.typeEnum);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.Integer getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.apache.avro.FooBarSpecificRecord.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.apache.avro.FooBarSpecificRecord.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.String getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.apache.avro.FooBarSpecificRecord.Builder setName(java.lang.String value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.apache.avro.FooBarSpecificRecord.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'nicknames' field */
    public java.util.List<java.lang.String> getNicknames() {
      return nicknames;
    }
    
    /** Sets the value of the 'nicknames' field */
    public org.apache.avro.FooBarSpecificRecord.Builder setNicknames(java.util.List<java.lang.String> value) {
      validate(fields()[2], value);
      this.nicknames = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'nicknames' field has been set */
    public boolean hasNicknames() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'nicknames' field */
    public org.apache.avro.FooBarSpecificRecord.Builder clearNicknames() {
      nicknames = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'relatedids' field */
    public java.util.List<java.lang.Integer> getRelatedids() {
      return relatedids;
    }
    
    /** Sets the value of the 'relatedids' field */
    public org.apache.avro.FooBarSpecificRecord.Builder setRelatedids(java.util.List<java.lang.Integer> value) {
      validate(fields()[3], value);
      this.relatedids = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'relatedids' field has been set */
    public boolean hasRelatedids() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'relatedids' field */
    public org.apache.avro.FooBarSpecificRecord.Builder clearRelatedids() {
      relatedids = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'typeEnum' field */
    public org.apache.avro.TypeEnum getTypeEnum() {
      return typeEnum;
    }
    
    /** Sets the value of the 'typeEnum' field */
    public org.apache.avro.FooBarSpecificRecord.Builder setTypeEnum(org.apache.avro.TypeEnum value) {
      validate(fields()[4], value);
      this.typeEnum = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'typeEnum' field has been set */
    public boolean hasTypeEnum() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'typeEnum' field */
    public org.apache.avro.FooBarSpecificRecord.Builder clearTypeEnum() {
      typeEnum = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public FooBarSpecificRecord build() {
      try {
        FooBarSpecificRecord record = new FooBarSpecificRecord();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.String) defaultValue(fields()[1]);
        record.nicknames = fieldSetFlags()[2] ? this.nicknames : (java.util.List<java.lang.String>) defaultValue(fields()[2]);
        record.relatedids = fieldSetFlags()[3] ? this.relatedids : (java.util.List<java.lang.Integer>) defaultValue(fields()[3]);
        record.typeEnum = fieldSetFlags()[4] ? this.typeEnum : (org.apache.avro.TypeEnum) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
