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

public final class Runtime {
  private Runtime() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface RawExtensionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.runtime.RawExtension)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Raw is the underlying serialization of this object.
     * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
     * </pre>
     *
     * <code>optional bytes raw = 1;</code>
     */
    boolean hasRaw();
    /**
     *
     *
     * <pre>
     * Raw is the underlying serialization of this object.
     * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
     * </pre>
     *
     * <code>optional bytes raw = 1;</code>
     */
    com.google.protobuf.ByteString getRaw();
  }
  /**
   *
   *
   * <pre>
   * RawExtension is used to hold extensions in external versions.
   * To use this, make a field which has RawExtension as its type in your external, versioned
   * struct, and Object in your internal struct. You also need to register your
   * various plugin types.
   * // Internal package:
   * type MyAPIObject struct {
   * 	runtime.TypeMeta `json:",inline"`
   * 	MyPlugin runtime.Object `json:"myPlugin"`
   * }
   * type PluginA struct {
   * 	AOption string `json:"aOption"`
   * }
   * // External package:
   * type MyAPIObject struct {
   * 	runtime.TypeMeta `json:",inline"`
   * 	MyPlugin runtime.RawExtension `json:"myPlugin"`
   * }
   * type PluginA struct {
   * 	AOption string `json:"aOption"`
   * }
   * // On the wire, the JSON will look something like this:
   * {
   * 	"kind":"MyAPIObject",
   * 	"apiVersion":"v1",
   * 	"myPlugin": {
   * 		"kind":"PluginA",
   * 		"aOption":"foo",
   * 	},
   * }
   * So what happens? Decode first uses json or yaml to unmarshal the serialized data into
   * your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked.
   * The next step is to copy (using pkg/conversion) into the internal struct. The runtime
   * package's DefaultScheme has conversion functions installed which will unpack the
   * JSON stored in RawExtension, turning it into the correct object type, and storing it
   * in the Object. (TODO: In the case where the object is of an unknown type, a
   * runtime.Unknown object will be created and stored.)
   * +k8s:deepcopy-gen=true
   * +protobuf=true
   * +k8s:openapi-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.RawExtension}
   */
  public static final class RawExtension extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.runtime.RawExtension)
      RawExtensionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RawExtension.newBuilder() to construct.
    private RawExtension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RawExtension() {
      raw_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RawExtension(
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
            case 10:
              {
                bitField0_ |= 0x00000001;
                raw_ = input.readBytes();
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
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.Runtime.RawExtension.class,
              io.kubernetes.client.proto.Runtime.RawExtension.Builder.class);
    }

    private int bitField0_;
    public static final int RAW_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString raw_;
    /**
     *
     *
     * <pre>
     * Raw is the underlying serialization of this object.
     * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
     * </pre>
     *
     * <code>optional bytes raw = 1;</code>
     */
    public boolean hasRaw() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Raw is the underlying serialization of this object.
     * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
     * </pre>
     *
     * <code>optional bytes raw = 1;</code>
     */
    public com.google.protobuf.ByteString getRaw() {
      return raw_;
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
        output.writeBytes(1, raw_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, raw_);
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
      if (!(obj instanceof io.kubernetes.client.proto.Runtime.RawExtension)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.Runtime.RawExtension other =
          (io.kubernetes.client.proto.Runtime.RawExtension) obj;

      boolean result = true;
      result = result && (hasRaw() == other.hasRaw());
      if (hasRaw()) {
        result = result && getRaw().equals(other.getRaw());
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
      if (hasRaw()) {
        hash = (37 * hash) + RAW_FIELD_NUMBER;
        hash = (53 * hash) + getRaw().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.Runtime.RawExtension prototype) {
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
     * RawExtension is used to hold extensions in external versions.
     * To use this, make a field which has RawExtension as its type in your external, versioned
     * struct, and Object in your internal struct. You also need to register your
     * various plugin types.
     * // Internal package:
     * type MyAPIObject struct {
     * 	runtime.TypeMeta `json:",inline"`
     * 	MyPlugin runtime.Object `json:"myPlugin"`
     * }
     * type PluginA struct {
     * 	AOption string `json:"aOption"`
     * }
     * // External package:
     * type MyAPIObject struct {
     * 	runtime.TypeMeta `json:",inline"`
     * 	MyPlugin runtime.RawExtension `json:"myPlugin"`
     * }
     * type PluginA struct {
     * 	AOption string `json:"aOption"`
     * }
     * // On the wire, the JSON will look something like this:
     * {
     * 	"kind":"MyAPIObject",
     * 	"apiVersion":"v1",
     * 	"myPlugin": {
     * 		"kind":"PluginA",
     * 		"aOption":"foo",
     * 	},
     * }
     * So what happens? Decode first uses json or yaml to unmarshal the serialized data into
     * your external MyAPIObject. That causes the raw JSON to be stored, but not unpacked.
     * The next step is to copy (using pkg/conversion) into the internal struct. The runtime
     * package's DefaultScheme has conversion functions installed which will unpack the
     * JSON stored in RawExtension, turning it into the correct object type, and storing it
     * in the Object. (TODO: In the case where the object is of an unknown type, a
     * runtime.Unknown object will be created and stored.)
     * +k8s:deepcopy-gen=true
     * +protobuf=true
     * +k8s:openapi-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.RawExtension}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.runtime.RawExtension)
        io.kubernetes.client.proto.Runtime.RawExtensionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.Runtime.RawExtension.class,
                io.kubernetes.client.proto.Runtime.RawExtension.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.Runtime.RawExtension.newBuilder()
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
        raw_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.RawExtension getDefaultInstanceForType() {
        return io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.RawExtension build() {
        io.kubernetes.client.proto.Runtime.RawExtension result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.RawExtension buildPartial() {
        io.kubernetes.client.proto.Runtime.RawExtension result =
            new io.kubernetes.client.proto.Runtime.RawExtension(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.raw_ = raw_;
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
        if (other instanceof io.kubernetes.client.proto.Runtime.RawExtension) {
          return mergeFrom((io.kubernetes.client.proto.Runtime.RawExtension) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.Runtime.RawExtension other) {
        if (other == io.kubernetes.client.proto.Runtime.RawExtension.getDefaultInstance())
          return this;
        if (other.hasRaw()) {
          setRaw(other.getRaw());
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
        io.kubernetes.client.proto.Runtime.RawExtension parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.Runtime.RawExtension) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.ByteString raw_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * Raw is the underlying serialization of this object.
       * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
       * </pre>
       *
       * <code>optional bytes raw = 1;</code>
       */
      public boolean hasRaw() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Raw is the underlying serialization of this object.
       * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
       * </pre>
       *
       * <code>optional bytes raw = 1;</code>
       */
      public com.google.protobuf.ByteString getRaw() {
        return raw_;
      }
      /**
       *
       *
       * <pre>
       * Raw is the underlying serialization of this object.
       * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
       * </pre>
       *
       * <code>optional bytes raw = 1;</code>
       */
      public Builder setRaw(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        raw_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Raw is the underlying serialization of this object.
       * TODO: Determine how to detect ContentType and ContentEncoding of 'Raw' data.
       * </pre>
       *
       * <code>optional bytes raw = 1;</code>
       */
      public Builder clearRaw() {
        bitField0_ = (bitField0_ & ~0x00000001);
        raw_ = getDefaultInstance().getRaw();
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

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.runtime.RawExtension)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.runtime.RawExtension)
    private static final io.kubernetes.client.proto.Runtime.RawExtension DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.Runtime.RawExtension();
    }

    public static io.kubernetes.client.proto.Runtime.RawExtension getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RawExtension> PARSER =
        new com.google.protobuf.AbstractParser<RawExtension>() {
          @java.lang.Override
          public RawExtension parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RawExtension(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RawExtension> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RawExtension> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.Runtime.RawExtension getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface TypeMetaOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.runtime.TypeMeta)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    boolean hasApiVersion();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    java.lang.String getApiVersion();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    com.google.protobuf.ByteString getApiVersionBytes();

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    java.lang.String getKind();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    com.google.protobuf.ByteString getKindBytes();
  }
  /**
   *
   *
   * <pre>
   * TypeMeta is shared by all top level objects. The proper way to use it is to inline it in your type,
   * like this:
   * type MyAwesomeAPIObject struct {
   *      runtime.TypeMeta    `json:",inline"`
   *      ... // other fields
   * }
   * func (obj *MyAwesomeAPIObject) SetGroupVersionKind(gvk *metav1.GroupVersionKind) { metav1.UpdateTypeMeta(obj,gvk) }; GroupVersionKind() *GroupVersionKind
   * TypeMeta is provided here for convenience. You may use it directly from this package or define
   * your own with the same fields.
   * +k8s:deepcopy-gen=false
   * +protobuf=true
   * +k8s:openapi-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.TypeMeta}
   */
  public static final class TypeMeta extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.runtime.TypeMeta)
      TypeMetaOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use TypeMeta.newBuilder() to construct.
    private TypeMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private TypeMeta() {
      apiVersion_ = "";
      kind_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TypeMeta(
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                apiVersion_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                kind_ = bs;
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
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.Runtime.TypeMeta.class,
              io.kubernetes.client.proto.Runtime.TypeMeta.Builder.class);
    }

    private int bitField0_;
    public static final int APIVERSION_FIELD_NUMBER = 1;
    private volatile java.lang.Object apiVersion_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    public boolean hasApiVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    public java.lang.String getApiVersion() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          apiVersion_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 1;</code>
     */
    public com.google.protobuf.ByteString getApiVersionBytes() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KIND_FIELD_NUMBER = 2;
    private volatile java.lang.Object kind_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kind_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apiVersion_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kind_);
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
      if (!(obj instanceof io.kubernetes.client.proto.Runtime.TypeMeta)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.Runtime.TypeMeta other =
          (io.kubernetes.client.proto.Runtime.TypeMeta) obj;

      boolean result = true;
      result = result && (hasApiVersion() == other.hasApiVersion());
      if (hasApiVersion()) {
        result = result && getApiVersion().equals(other.getApiVersion());
      }
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
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
      if (hasApiVersion()) {
        hash = (37 * hash) + APIVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getApiVersion().hashCode();
      }
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.Runtime.TypeMeta prototype) {
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
     * TypeMeta is shared by all top level objects. The proper way to use it is to inline it in your type,
     * like this:
     * type MyAwesomeAPIObject struct {
     *      runtime.TypeMeta    `json:",inline"`
     *      ... // other fields
     * }
     * func (obj *MyAwesomeAPIObject) SetGroupVersionKind(gvk *metav1.GroupVersionKind) { metav1.UpdateTypeMeta(obj,gvk) }; GroupVersionKind() *GroupVersionKind
     * TypeMeta is provided here for convenience. You may use it directly from this package or define
     * your own with the same fields.
     * +k8s:deepcopy-gen=false
     * +protobuf=true
     * +k8s:openapi-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.TypeMeta}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.runtime.TypeMeta)
        io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.Runtime.TypeMeta.class,
                io.kubernetes.client.proto.Runtime.TypeMeta.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.Runtime.TypeMeta.newBuilder()
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
        apiVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.TypeMeta getDefaultInstanceForType() {
        return io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.TypeMeta build() {
        io.kubernetes.client.proto.Runtime.TypeMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.TypeMeta buildPartial() {
        io.kubernetes.client.proto.Runtime.TypeMeta result =
            new io.kubernetes.client.proto.Runtime.TypeMeta(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.apiVersion_ = apiVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.kind_ = kind_;
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
        if (other instanceof io.kubernetes.client.proto.Runtime.TypeMeta) {
          return mergeFrom((io.kubernetes.client.proto.Runtime.TypeMeta) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.Runtime.TypeMeta other) {
        if (other == io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()) return this;
        if (other.hasApiVersion()) {
          bitField0_ |= 0x00000001;
          apiVersion_ = other.apiVersion_;
          onChanged();
        }
        if (other.hasKind()) {
          bitField0_ |= 0x00000002;
          kind_ = other.kind_;
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
        io.kubernetes.client.proto.Runtime.TypeMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.Runtime.TypeMeta) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object apiVersion_ = "";
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public boolean hasApiVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public java.lang.String getApiVersion() {
        java.lang.Object ref = apiVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            apiVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public com.google.protobuf.ByteString getApiVersionBytes() {
        java.lang.Object ref = apiVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          apiVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public Builder setApiVersion(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        apiVersion_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public Builder clearApiVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        apiVersion_ = getDefaultInstance().getApiVersion();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 1;</code>
       */
      public Builder setApiVersionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        apiVersion_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object kind_ = "";
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public com.google.protobuf.ByteString getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder setKind(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000002);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder setKindBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        kind_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.runtime.TypeMeta)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.runtime.TypeMeta)
    private static final io.kubernetes.client.proto.Runtime.TypeMeta DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.Runtime.TypeMeta();
    }

    public static io.kubernetes.client.proto.Runtime.TypeMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<TypeMeta> PARSER =
        new com.google.protobuf.AbstractParser<TypeMeta>() {
          @java.lang.Override
          public TypeMeta parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TypeMeta(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<TypeMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TypeMeta> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.Runtime.TypeMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface UnknownOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.apimachinery.pkg.runtime.Unknown)
      com.google.protobuf.MessageOrBuilder {

    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    boolean hasTypeMeta();
    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    io.kubernetes.client.proto.Runtime.TypeMeta getTypeMeta();
    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder getTypeMetaOrBuilder();

    /**
     *
     *
     * <pre>
     * Raw will hold the complete serialized object which couldn't be matched
     * with a registered type. Most likely, nothing should be done with this
     * except for passing it through the system.
     * </pre>
     *
     * <code>optional bytes raw = 2;</code>
     */
    boolean hasRaw();
    /**
     *
     *
     * <pre>
     * Raw will hold the complete serialized object which couldn't be matched
     * with a registered type. Most likely, nothing should be done with this
     * except for passing it through the system.
     * </pre>
     *
     * <code>optional bytes raw = 2;</code>
     */
    com.google.protobuf.ByteString getRaw();

    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    boolean hasContentEncoding();
    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    java.lang.String getContentEncoding();
    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    com.google.protobuf.ByteString getContentEncodingBytes();

    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    boolean hasContentType();
    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    java.lang.String getContentType();
    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    com.google.protobuf.ByteString getContentTypeBytes();
  }
  /**
   *
   *
   * <pre>
   * Unknown allows api objects with unknown types to be passed-through. This can be used
   * to deal with the API objects from a plug-in. Unknown objects still have functioning
   * TypeMeta features-- kind, version, etc.
   * TODO: Make this object have easy access to field based accessors and settors for
   * metadata and field mutatation.
   * +k8s:deepcopy-gen=true
   * +k8s:deepcopy-gen:interfaces=k8s.io/apimachinery/pkg/runtime.Object
   * +protobuf=true
   * +k8s:openapi-gen=true
   * </pre>
   *
   * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.Unknown}
   */
  public static final class Unknown extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.apimachinery.pkg.runtime.Unknown)
      UnknownOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Unknown.newBuilder() to construct.
    private Unknown(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Unknown() {
      raw_ = com.google.protobuf.ByteString.EMPTY;
      contentEncoding_ = "";
      contentType_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Unknown(
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
            case 10:
              {
                io.kubernetes.client.proto.Runtime.TypeMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = typeMeta_.toBuilder();
                }
                typeMeta_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Runtime.TypeMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(typeMeta_);
                  typeMeta_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                bitField0_ |= 0x00000002;
                raw_ = input.readBytes();
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                contentEncoding_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                contentType_ = bs;
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
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.Runtime
          .internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.Runtime.Unknown.class,
              io.kubernetes.client.proto.Runtime.Unknown.Builder.class);
    }

    private int bitField0_;
    public static final int TYPEMETA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Runtime.TypeMeta typeMeta_;
    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    public boolean hasTypeMeta() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    public io.kubernetes.client.proto.Runtime.TypeMeta getTypeMeta() {
      return typeMeta_ == null
          ? io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()
          : typeMeta_;
    }
    /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
    public io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder getTypeMetaOrBuilder() {
      return typeMeta_ == null
          ? io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()
          : typeMeta_;
    }

    public static final int RAW_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString raw_;
    /**
     *
     *
     * <pre>
     * Raw will hold the complete serialized object which couldn't be matched
     * with a registered type. Most likely, nothing should be done with this
     * except for passing it through the system.
     * </pre>
     *
     * <code>optional bytes raw = 2;</code>
     */
    public boolean hasRaw() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Raw will hold the complete serialized object which couldn't be matched
     * with a registered type. Most likely, nothing should be done with this
     * except for passing it through the system.
     * </pre>
     *
     * <code>optional bytes raw = 2;</code>
     */
    public com.google.protobuf.ByteString getRaw() {
      return raw_;
    }

    public static final int CONTENTENCODING_FIELD_NUMBER = 3;
    private volatile java.lang.Object contentEncoding_;
    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    public boolean hasContentEncoding() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    public java.lang.String getContentEncoding() {
      java.lang.Object ref = contentEncoding_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          contentEncoding_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * ContentEncoding is encoding used to encode 'Raw' data.
     * Unspecified means no encoding.
     * </pre>
     *
     * <code>optional string contentEncoding = 3;</code>
     */
    public com.google.protobuf.ByteString getContentEncodingBytes() {
      java.lang.Object ref = contentEncoding_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentEncoding_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENTTYPE_FIELD_NUMBER = 4;
    private volatile java.lang.Object contentType_;
    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    public boolean hasContentType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          contentType_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * ContentType  is serialization method used to serialize 'Raw'.
     * Unspecified means ContentTypeJSON.
     * </pre>
     *
     * <code>optional string contentType = 4;</code>
     */
    public com.google.protobuf.ByteString getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentType_ = b;
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
        output.writeMessage(1, getTypeMeta());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, raw_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, contentEncoding_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, contentType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTypeMeta());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, raw_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, contentEncoding_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, contentType_);
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
      if (!(obj instanceof io.kubernetes.client.proto.Runtime.Unknown)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.Runtime.Unknown other =
          (io.kubernetes.client.proto.Runtime.Unknown) obj;

      boolean result = true;
      result = result && (hasTypeMeta() == other.hasTypeMeta());
      if (hasTypeMeta()) {
        result = result && getTypeMeta().equals(other.getTypeMeta());
      }
      result = result && (hasRaw() == other.hasRaw());
      if (hasRaw()) {
        result = result && getRaw().equals(other.getRaw());
      }
      result = result && (hasContentEncoding() == other.hasContentEncoding());
      if (hasContentEncoding()) {
        result = result && getContentEncoding().equals(other.getContentEncoding());
      }
      result = result && (hasContentType() == other.hasContentType());
      if (hasContentType()) {
        result = result && getContentType().equals(other.getContentType());
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
      if (hasTypeMeta()) {
        hash = (37 * hash) + TYPEMETA_FIELD_NUMBER;
        hash = (53 * hash) + getTypeMeta().hashCode();
      }
      if (hasRaw()) {
        hash = (37 * hash) + RAW_FIELD_NUMBER;
        hash = (53 * hash) + getRaw().hashCode();
      }
      if (hasContentEncoding()) {
        hash = (37 * hash) + CONTENTENCODING_FIELD_NUMBER;
        hash = (53 * hash) + getContentEncoding().hashCode();
      }
      if (hasContentType()) {
        hash = (37 * hash) + CONTENTTYPE_FIELD_NUMBER;
        hash = (53 * hash) + getContentType().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.Runtime.Unknown parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.Runtime.Unknown prototype) {
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
     * Unknown allows api objects with unknown types to be passed-through. This can be used
     * to deal with the API objects from a plug-in. Unknown objects still have functioning
     * TypeMeta features-- kind, version, etc.
     * TODO: Make this object have easy access to field based accessors and settors for
     * metadata and field mutatation.
     * +k8s:deepcopy-gen=true
     * +k8s:deepcopy-gen:interfaces=k8s.io/apimachinery/pkg/runtime.Object
     * +protobuf=true
     * +k8s:openapi-gen=true
     * </pre>
     *
     * Protobuf type {@code k8s.io.apimachinery.pkg.runtime.Unknown}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.apimachinery.pkg.runtime.Unknown)
        io.kubernetes.client.proto.Runtime.UnknownOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.Runtime.Unknown.class,
                io.kubernetes.client.proto.Runtime.Unknown.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.Runtime.Unknown.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTypeMetaFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (typeMetaBuilder_ == null) {
          typeMeta_ = null;
        } else {
          typeMetaBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        raw_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        contentEncoding_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        contentType_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.Runtime
            .internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.Unknown getDefaultInstanceForType() {
        return io.kubernetes.client.proto.Runtime.Unknown.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.Unknown build() {
        io.kubernetes.client.proto.Runtime.Unknown result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.Runtime.Unknown buildPartial() {
        io.kubernetes.client.proto.Runtime.Unknown result =
            new io.kubernetes.client.proto.Runtime.Unknown(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (typeMetaBuilder_ == null) {
          result.typeMeta_ = typeMeta_;
        } else {
          result.typeMeta_ = typeMetaBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.raw_ = raw_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.contentEncoding_ = contentEncoding_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.contentType_ = contentType_;
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
        if (other instanceof io.kubernetes.client.proto.Runtime.Unknown) {
          return mergeFrom((io.kubernetes.client.proto.Runtime.Unknown) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.Runtime.Unknown other) {
        if (other == io.kubernetes.client.proto.Runtime.Unknown.getDefaultInstance()) return this;
        if (other.hasTypeMeta()) {
          mergeTypeMeta(other.getTypeMeta());
        }
        if (other.hasRaw()) {
          setRaw(other.getRaw());
        }
        if (other.hasContentEncoding()) {
          bitField0_ |= 0x00000004;
          contentEncoding_ = other.contentEncoding_;
          onChanged();
        }
        if (other.hasContentType()) {
          bitField0_ |= 0x00000008;
          contentType_ = other.contentType_;
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
        io.kubernetes.client.proto.Runtime.Unknown parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.Runtime.Unknown) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Runtime.TypeMeta typeMeta_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.TypeMeta,
              io.kubernetes.client.proto.Runtime.TypeMeta.Builder,
              io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder>
          typeMetaBuilder_;
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public boolean hasTypeMeta() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public io.kubernetes.client.proto.Runtime.TypeMeta getTypeMeta() {
        if (typeMetaBuilder_ == null) {
          return typeMeta_ == null
              ? io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()
              : typeMeta_;
        } else {
          return typeMetaBuilder_.getMessage();
        }
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public Builder setTypeMeta(io.kubernetes.client.proto.Runtime.TypeMeta value) {
        if (typeMetaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          typeMeta_ = value;
          onChanged();
        } else {
          typeMetaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public Builder setTypeMeta(
          io.kubernetes.client.proto.Runtime.TypeMeta.Builder builderForValue) {
        if (typeMetaBuilder_ == null) {
          typeMeta_ = builderForValue.build();
          onChanged();
        } else {
          typeMetaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public Builder mergeTypeMeta(io.kubernetes.client.proto.Runtime.TypeMeta value) {
        if (typeMetaBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && typeMeta_ != null
              && typeMeta_ != io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()) {
            typeMeta_ =
                io.kubernetes.client.proto.Runtime.TypeMeta.newBuilder(typeMeta_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            typeMeta_ = value;
          }
          onChanged();
        } else {
          typeMetaBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public Builder clearTypeMeta() {
        if (typeMetaBuilder_ == null) {
          typeMeta_ = null;
          onChanged();
        } else {
          typeMetaBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public io.kubernetes.client.proto.Runtime.TypeMeta.Builder getTypeMetaBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTypeMetaFieldBuilder().getBuilder();
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      public io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder getTypeMetaOrBuilder() {
        if (typeMetaBuilder_ != null) {
          return typeMetaBuilder_.getMessageOrBuilder();
        } else {
          return typeMeta_ == null
              ? io.kubernetes.client.proto.Runtime.TypeMeta.getDefaultInstance()
              : typeMeta_;
        }
      }
      /** <code>optional .k8s.io.apimachinery.pkg.runtime.TypeMeta typeMeta = 1;</code> */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Runtime.TypeMeta,
              io.kubernetes.client.proto.Runtime.TypeMeta.Builder,
              io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder>
          getTypeMetaFieldBuilder() {
        if (typeMetaBuilder_ == null) {
          typeMetaBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Runtime.TypeMeta,
                  io.kubernetes.client.proto.Runtime.TypeMeta.Builder,
                  io.kubernetes.client.proto.Runtime.TypeMetaOrBuilder>(
                  getTypeMeta(), getParentForChildren(), isClean());
          typeMeta_ = null;
        }
        return typeMetaBuilder_;
      }

      private com.google.protobuf.ByteString raw_ = com.google.protobuf.ByteString.EMPTY;
      /**
       *
       *
       * <pre>
       * Raw will hold the complete serialized object which couldn't be matched
       * with a registered type. Most likely, nothing should be done with this
       * except for passing it through the system.
       * </pre>
       *
       * <code>optional bytes raw = 2;</code>
       */
      public boolean hasRaw() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Raw will hold the complete serialized object which couldn't be matched
       * with a registered type. Most likely, nothing should be done with this
       * except for passing it through the system.
       * </pre>
       *
       * <code>optional bytes raw = 2;</code>
       */
      public com.google.protobuf.ByteString getRaw() {
        return raw_;
      }
      /**
       *
       *
       * <pre>
       * Raw will hold the complete serialized object which couldn't be matched
       * with a registered type. Most likely, nothing should be done with this
       * except for passing it through the system.
       * </pre>
       *
       * <code>optional bytes raw = 2;</code>
       */
      public Builder setRaw(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        raw_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Raw will hold the complete serialized object which couldn't be matched
       * with a registered type. Most likely, nothing should be done with this
       * except for passing it through the system.
       * </pre>
       *
       * <code>optional bytes raw = 2;</code>
       */
      public Builder clearRaw() {
        bitField0_ = (bitField0_ & ~0x00000002);
        raw_ = getDefaultInstance().getRaw();
        onChanged();
        return this;
      }

      private java.lang.Object contentEncoding_ = "";
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public boolean hasContentEncoding() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public java.lang.String getContentEncoding() {
        java.lang.Object ref = contentEncoding_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            contentEncoding_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public com.google.protobuf.ByteString getContentEncodingBytes() {
        java.lang.Object ref = contentEncoding_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          contentEncoding_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public Builder setContentEncoding(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        contentEncoding_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public Builder clearContentEncoding() {
        bitField0_ = (bitField0_ & ~0x00000004);
        contentEncoding_ = getDefaultInstance().getContentEncoding();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ContentEncoding is encoding used to encode 'Raw' data.
       * Unspecified means no encoding.
       * </pre>
       *
       * <code>optional string contentEncoding = 3;</code>
       */
      public Builder setContentEncodingBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        contentEncoding_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object contentType_ = "";
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public boolean hasContentType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public java.lang.String getContentType() {
        java.lang.Object ref = contentType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            contentType_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public com.google.protobuf.ByteString getContentTypeBytes() {
        java.lang.Object ref = contentType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          contentType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public Builder setContentType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        contentType_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public Builder clearContentType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        contentType_ = getDefaultInstance().getContentType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ContentType  is serialization method used to serialize 'Raw'.
       * Unspecified means ContentTypeJSON.
       * </pre>
       *
       * <code>optional string contentType = 4;</code>
       */
      public Builder setContentTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        contentType_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.apimachinery.pkg.runtime.Unknown)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.apimachinery.pkg.runtime.Unknown)
    private static final io.kubernetes.client.proto.Runtime.Unknown DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.Runtime.Unknown();
    }

    public static io.kubernetes.client.proto.Runtime.Unknown getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Unknown> PARSER =
        new com.google.protobuf.AbstractParser<Unknown>() {
          @java.lang.Override
          public Unknown parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Unknown(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Unknown> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unknown> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.Runtime.Unknown getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/k8s.io/apimachinery/pkg/runtime/genera"
          + "ted.proto\022\037k8s.io.apimachinery.pkg.runti"
          + "me\"\033\n\014RawExtension\022\013\n\003raw\030\001 \001(\014\",\n\010TypeM"
          + "eta\022\022\n\napiVersion\030\001 \001(\t\022\014\n\004kind\030\002 \001(\t\"\201\001"
          + "\n\007Unknown\022;\n\010typeMeta\030\001 \001(\0132).k8s.io.api"
          + "machinery.pkg.runtime.TypeMeta\022\013\n\003raw\030\002 "
          + "\001(\014\022\027\n\017contentEncoding\030\003 \001(\t\022\023\n\013contentT"
          + "ype\030\004 \001(\tB.\n\032io.kubernetes.client.protoB"
          + "\007RuntimeZ\007runtime"
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
    internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_runtime_RawExtension_descriptor,
            new java.lang.String[] {
              "Raw",
            });
    internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_runtime_TypeMeta_descriptor,
            new java.lang.String[] {
              "ApiVersion", "Kind",
            });
    internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_apimachinery_pkg_runtime_Unknown_descriptor,
            new java.lang.String[] {
              "TypeMeta", "Raw", "ContentEncoding", "ContentType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
