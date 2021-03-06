/*
Copyright 2021 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class IntStr {
  private IntStr() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface IntOrStringOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.util.intstr.IntOrString)
      com.google.protobuf.MessageOrBuilder {

    /** <code>optional int64 type = 1;</code> */
    boolean hasType();
    /** <code>optional int64 type = 1;</code> */
    long getType();

    /** <code>optional int32 intVal = 2;</code> */
    boolean hasIntVal();
    /** <code>optional int32 intVal = 2;</code> */
    int getIntVal();

    /** <code>optional string strVal = 3;</code> */
    boolean hasStrVal();
    /** <code>optional string strVal = 3;</code> */
    java.lang.String getStrVal();
    /** <code>optional string strVal = 3;</code> */
    com.google.protobuf.ByteString getStrValBytes();
  }
  /**
   *
   *
   * <pre>
   * IntOrString is a type that can hold an int32 or a string.  When used in
   * JSON or YAML marshalling and unmarshalling, it produces or consumes the
   * inner type.  This allows you to have, for example, a JSON field that can
   * accept a name or number.
   * TODO: Rename to Int32OrString
   * +protobuf=true
   * +protobuf.options.(gogoproto.goproto_stringer)=false
   * +k8s:openapi-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.util.intstr.IntOrString}
   */
  public static final class IntOrString extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.util.intstr.IntOrString)
      IntOrStringOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use IntOrString.newBuilder() to construct.
    private IntOrString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private IntOrString() {
      type_ = 0L;
      intVal_ = 0;
      strVal_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private IntOrString(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                bitField0_ |= 0x00000001;
                type_ = input.readInt64();
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                intVal_ = input.readInt32();
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                strVal_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.IntStr
          .internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.IntStr
          .internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.IntStr.IntOrString.class,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private long type_;
    /** <code>optional int64 type = 1;</code> */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /** <code>optional int64 type = 1;</code> */
    public long getType() {
      return type_;
    }

    public static final int INTVAL_FIELD_NUMBER = 2;
    private int intVal_;
    /** <code>optional int32 intVal = 2;</code> */
    public boolean hasIntVal() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /** <code>optional int32 intVal = 2;</code> */
    public int getIntVal() {
      return intVal_;
    }

    public static final int STRVAL_FIELD_NUMBER = 3;
    private volatile java.lang.Object strVal_;
    /** <code>optional string strVal = 3;</code> */
    public boolean hasStrVal() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /** <code>optional string strVal = 3;</code> */
    public java.lang.String getStrVal() {
      java.lang.Object ref = strVal_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          strVal_ = s;
        }
        return s;
      }
    }
    /** <code>optional string strVal = 3;</code> */
    public com.google.protobuf.ByteString getStrValBytes() {
      java.lang.Object ref = strVal_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        strVal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, intVal_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, strVal_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, intVal_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, strVal_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.IntStr.IntOrString)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.IntStr.IntOrString other =
          (io.kubernetes.client.proto.IntStr.IntOrString) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType() == other.getType());
      }
      result = result && (hasIntVal() == other.hasIntVal());
      if (hasIntVal()) {
        result = result && (getIntVal() == other.getIntVal());
      }
      result = result && (hasStrVal() == other.hasStrVal());
      if (hasStrVal()) {
        result = result && getStrVal().equals(other.getStrVal());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getType());
      }
      if (hasIntVal()) {
        hash = (37 * hash) + INTVAL_FIELD_NUMBER;
        hash = (53 * hash) + getIntVal();
      }
      if (hasStrVal()) {
        hash = (37 * hash) + STRVAL_FIELD_NUMBER;
        hash = (53 * hash) + getStrVal().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.IntStr.IntOrString prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * IntOrString is a type that can hold an int32 or a string.  When used in
     * JSON or YAML marshalling and unmarshalling, it produces or consumes the
     * inner type.  This allows you to have, for example, a JSON field that can
     * accept a name or number.
     * TODO: Rename to Int32OrString
     * +protobuf=true
     * +protobuf.options.(gogoproto.goproto_stringer)=false
     * +k8s:openapi-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.util.intstr.IntOrString}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.util.intstr.IntOrString)
        io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.IntStr
            .internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.IntStr
            .internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.IntStr.IntOrString.class,
                io.kubernetes.client.proto.IntStr.IntOrString.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.IntStr.IntOrString.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        intVal_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        strVal_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.IntStr
            .internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.IntStr.IntOrString getDefaultInstanceForType() {
        return io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.IntStr.IntOrString build() {
        io.kubernetes.client.proto.IntStr.IntOrString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.IntStr.IntOrString buildPartial() {
        io.kubernetes.client.proto.IntStr.IntOrString result =
            new io.kubernetes.client.proto.IntStr.IntOrString(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.intVal_ = intVal_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.strVal_ = strVal_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.IntStr.IntOrString) {
          return mergeFrom((io.kubernetes.client.proto.IntStr.IntOrString) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.IntStr.IntOrString other) {
        if (other == io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance())
          return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasIntVal()) {
          setIntVal(other.getIntVal());
        }
        if (other.hasStrVal()) {
          bitField0_ |= 0x00000004;
          strVal_ = other.strVal_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.IntStr.IntOrString parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.IntStr.IntOrString) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long type_;
      /** <code>optional int64 type = 1;</code> */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /** <code>optional int64 type = 1;</code> */
      public long getType() {
        return type_;
      }
      /** <code>optional int64 type = 1;</code> */
      public Builder setType(long value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /** <code>optional int64 type = 1;</code> */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0L;
        onChanged();
        return this;
      }

      private int intVal_;
      /** <code>optional int32 intVal = 2;</code> */
      public boolean hasIntVal() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /** <code>optional int32 intVal = 2;</code> */
      public int getIntVal() {
        return intVal_;
      }
      /** <code>optional int32 intVal = 2;</code> */
      public Builder setIntVal(int value) {
        bitField0_ |= 0x00000002;
        intVal_ = value;
        onChanged();
        return this;
      }
      /** <code>optional int32 intVal = 2;</code> */
      public Builder clearIntVal() {
        bitField0_ = (bitField0_ & ~0x00000002);
        intVal_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object strVal_ = "";
      /** <code>optional string strVal = 3;</code> */
      public boolean hasStrVal() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /** <code>optional string strVal = 3;</code> */
      public java.lang.String getStrVal() {
        java.lang.Object ref = strVal_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            strVal_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /** <code>optional string strVal = 3;</code> */
      public com.google.protobuf.ByteString getStrValBytes() {
        java.lang.Object ref = strVal_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          strVal_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /** <code>optional string strVal = 3;</code> */
      public Builder setStrVal(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        strVal_ = value;
        onChanged();
        return this;
      }
      /** <code>optional string strVal = 3;</code> */
      public Builder clearStrVal() {
        bitField0_ = (bitField0_ & ~0x00000004);
        strVal_ = getDefaultInstance().getStrVal();
        onChanged();
        return this;
      }
      /** <code>optional string strVal = 3;</code> */
      public Builder setStrValBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        strVal_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.util.intstr.IntOrString)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.util.intstr.IntOrString)
    private static final io.kubernetes.client.proto.IntStr.IntOrString DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.IntStr.IntOrString();
    }

    public static io.kubernetes.client.proto.IntStr.IntOrString getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<IntOrString> PARSER =
        new com.google.protobuf.AbstractParser<IntOrString>() {
          @java.lang.Override
          public IntOrString parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new IntOrString(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<IntOrString> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IntOrString> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.IntStr.IntOrString getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3k8s.io/apimachinery/pkg/util/intstr/ge"
          + "nerated.proto\022#k8s.io.apimachinery.pkg.u"
          + "til.intstr\";\n\013IntOrString\022\014\n\004type\030\001 \001(\003\022"
          + "\016\n\006intVal\030\002 \001(\005\022\016\n\006strVal\030\003 \001(\tB,\n\032io.ku"
          + "bernetes.client.protoB\006IntStrZ\006intstr"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_util_intstr_IntOrString_descriptor,
            new java.lang.String[] {
              "Type", "IntVal", "StrVal",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
