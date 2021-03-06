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

public final class V1Policy {
  private V1Policy() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface EvictionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1.Eviction)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    boolean hasDeleteOptions();
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions();
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * Eviction evicts a pod from its node subject to certain policies and safety constraints.
   * This is a subresource of Pod.  A request to cause such an eviction is
   * created by POSTing to .../pods/&lt;pod name&gt;/evictions.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1.Eviction}
   */
  public static final class Eviction extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1.Eviction)
      EvictionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Eviction.newBuilder() to construct.
    private Eviction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Eviction() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Eviction(
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
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.DeleteOptions.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = deleteOptions_.toBuilder();
                }
                deleteOptions_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.DeleteOptions.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(deleteOptions_);
                  deleteOptions_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_Eviction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_Eviction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Policy.Eviction.class,
              io.kubernetes.client.proto.V1Policy.Eviction.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * ObjectMeta describes the pod that is being evicted.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int DELETEOPTIONS_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.DeleteOptions deleteOptions_;
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    public boolean hasDeleteOptions() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions() {
      return deleteOptions_ == null
          ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
          : deleteOptions_;
    }
    /**
     *
     *
     * <pre>
     * DeleteOptions may be provided
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder() {
      return deleteOptions_ == null
          ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
          : deleteOptions_;
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
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getDeleteOptions());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeleteOptions());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Policy.Eviction)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Policy.Eviction other =
          (io.kubernetes.client.proto.V1Policy.Eviction) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasDeleteOptions() == other.hasDeleteOptions());
      if (hasDeleteOptions()) {
        result = result && getDeleteOptions().equals(other.getDeleteOptions());
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
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasDeleteOptions()) {
        hash = (37 * hash) + DELETEOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getDeleteOptions().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1Policy.Eviction prototype) {
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
     * Eviction evicts a pod from its node subject to certain policies and safety constraints.
     * This is a subresource of Pod.  A request to cause such an eviction is
     * created by POSTing to .../pods/&lt;pod name&gt;/evictions.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1.Eviction}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1.Eviction)
        io.kubernetes.client.proto.V1Policy.EvictionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_Eviction_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_Eviction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Policy.Eviction.class,
                io.kubernetes.client.proto.V1Policy.Eviction.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Policy.Eviction.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getDeleteOptionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = null;
        } else {
          deleteOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_Eviction_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.Eviction getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Policy.Eviction.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.Eviction build() {
        io.kubernetes.client.proto.V1Policy.Eviction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.Eviction buildPartial() {
        io.kubernetes.client.proto.V1Policy.Eviction result =
            new io.kubernetes.client.proto.V1Policy.Eviction(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (deleteOptionsBuilder_ == null) {
          result.deleteOptions_ = deleteOptions_;
        } else {
          result.deleteOptions_ = deleteOptionsBuilder_.build();
        }
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
        if (other instanceof io.kubernetes.client.proto.V1Policy.Eviction) {
          return mergeFrom((io.kubernetes.client.proto.V1Policy.Eviction) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Policy.Eviction other) {
        if (other == io.kubernetes.client.proto.V1Policy.Eviction.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasDeleteOptions()) {
          mergeDeleteOptions(other.getDeleteOptions());
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
        io.kubernetes.client.proto.V1Policy.Eviction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Policy.Eviction) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * ObjectMeta describes the pod that is being evicted.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.Meta.DeleteOptions deleteOptions_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.DeleteOptions,
              io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
              io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>
          deleteOptionsBuilder_;
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public boolean hasDeleteOptions() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptions getDeleteOptions() {
        if (deleteOptionsBuilder_ == null) {
          return deleteOptions_ == null
              ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
              : deleteOptions_;
        } else {
          return deleteOptionsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder setDeleteOptions(io.kubernetes.client.proto.Meta.DeleteOptions value) {
        if (deleteOptionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deleteOptions_ = value;
          onChanged();
        } else {
          deleteOptionsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder setDeleteOptions(
          io.kubernetes.client.proto.Meta.DeleteOptions.Builder builderForValue) {
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = builderForValue.build();
          onChanged();
        } else {
          deleteOptionsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder mergeDeleteOptions(io.kubernetes.client.proto.Meta.DeleteOptions value) {
        if (deleteOptionsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && deleteOptions_ != null
              && deleteOptions_
                  != io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()) {
            deleteOptions_ =
                io.kubernetes.client.proto.Meta.DeleteOptions.newBuilder(deleteOptions_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            deleteOptions_ = value;
          }
          onChanged();
        } else {
          deleteOptionsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public Builder clearDeleteOptions() {
        if (deleteOptionsBuilder_ == null) {
          deleteOptions_ = null;
          onChanged();
        } else {
          deleteOptionsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptions.Builder getDeleteOptionsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDeleteOptionsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder getDeleteOptionsOrBuilder() {
        if (deleteOptionsBuilder_ != null) {
          return deleteOptionsBuilder_.getMessageOrBuilder();
        } else {
          return deleteOptions_ == null
              ? io.kubernetes.client.proto.Meta.DeleteOptions.getDefaultInstance()
              : deleteOptions_;
        }
      }
      /**
       *
       *
       * <pre>
       * DeleteOptions may be provided
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.DeleteOptions deleteOptions = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.DeleteOptions,
              io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
              io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>
          getDeleteOptionsFieldBuilder() {
        if (deleteOptionsBuilder_ == null) {
          deleteOptionsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.DeleteOptions,
                  io.kubernetes.client.proto.Meta.DeleteOptions.Builder,
                  io.kubernetes.client.proto.Meta.DeleteOptionsOrBuilder>(
                  getDeleteOptions(), getParentForChildren(), isClean());
          deleteOptions_ = null;
        }
        return deleteOptionsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1.Eviction)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1.Eviction)
    private static final io.kubernetes.client.proto.V1Policy.Eviction DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Policy.Eviction();
    }

    public static io.kubernetes.client.proto.V1Policy.Eviction getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Eviction> PARSER =
        new com.google.protobuf.AbstractParser<Eviction>() {
          @java.lang.Override
          public Eviction parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Eviction(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Eviction> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Eviction> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Policy.Eviction getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1.PodDisruptionBudget)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus getStatus();
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudget}
   */
  public static final class PodDisruptionBudget extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1.PodDisruptionBudget)
      PodDisruptionBudgetOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudget.newBuilder() to construct.
    private PodDisruptionBudget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudget() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudget(
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
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.class,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus status_;
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Most recently observed status of the PodDisruptionBudget.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
          : status_;
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
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudget)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Policy.PodDisruptionBudget other =
          (io.kubernetes.client.proto.V1Policy.PodDisruptionBudget) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
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
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudget prototype) {
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
     * PodDisruptionBudget is an object to define the max disruption that can be caused to a collection of pods
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudget}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1.PodDisruptionBudget)
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.class,
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget build() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget buildPartial() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudget result =
            new io.kubernetes.client.proto.V1Policy.PodDisruptionBudget(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
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
        if (other instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudget) {
          return mergeFrom((io.kubernetes.client.proto.V1Policy.PodDisruptionBudget) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Policy.PodDisruptionBudget other) {
        if (other == io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Policy.PodDisruptionBudget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Most recently observed status of the PodDisruptionBudget.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.policy.v1.PodDisruptionBudgetStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1.PodDisruptionBudget)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1.PodDisruptionBudget)
    private static final io.kubernetes.client.proto.V1Policy.PodDisruptionBudget DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Policy.PodDisruptionBudget();
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudget> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudget>() {
          @java.lang.Override
          public PodDisruptionBudget parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudget(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1.PodDisruptionBudgetList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetList}
   */
  public static final class PodDisruptionBudgetList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1.PodDisruptionBudgetList)
      PodDisruptionBudgetListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetList.newBuilder() to construct.
    private PodDisruptionBudgetList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetList(
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
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Policy.PodDisruptionBudget>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.PARSER,
                        extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.class,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of PodDisruptionBudgets
     * </pre>
     *
     * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
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
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList other =
          (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
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
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList prototype) {
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
     * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1.PodDisruptionBudgetList)
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.class,
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList build() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList buildPartial() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList result =
            new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
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
        if (other instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList) {
          return mergeFrom((io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList other) {
        if (other
            == io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget>
          getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Policy.PodDisruptionBudget value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Policy.PodDisruptionBudget value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Policy.PodDisruptionBudget value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Policy.PodDisruptionBudget>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of PodDisruptionBudgets
       * </pre>
       *
       * <code>repeated .k8s.io.api.policy.v1.PodDisruptionBudget items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudget,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudget.Builder,
                  io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1.PodDisruptionBudgetList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1.PodDisruptionBudgetList)
    private static final io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList();
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetList> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetList>() {
          @java.lang.Override
          public PodDisruptionBudgetList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1.PodDisruptionBudgetSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    boolean hasMinAvailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder();

    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    boolean hasMaxUnavailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable();
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetSpec}
   */
  public static final class PodDisruptionBudgetSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1.PodDisruptionBudgetSpec)
      PodDisruptionBudgetSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetSpec.newBuilder() to construct.
    private PodDisruptionBudgetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetSpec() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetSpec(
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
                io.kubernetes.client.proto.IntStr.IntOrString.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = minAvailable_.toBuilder();
                }
                minAvailable_ =
                    input.readMessage(
                        io.kubernetes.client.proto.IntStr.IntOrString.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(minAvailable_);
                  minAvailable_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.IntStr.IntOrString.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = maxUnavailable_.toBuilder();
                }
                maxUnavailable_ =
                    input.readMessage(
                        io.kubernetes.client.proto.IntStr.IntOrString.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(maxUnavailable_);
                  maxUnavailable_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.class,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder.class);
    }

    private int bitField0_;
    public static final int MINAVAILABLE_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.IntStr.IntOrString minAvailable_;
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public boolean hasMinAvailable() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable() {
      return minAvailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : minAvailable_;
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at least "minAvailable" pods selected by
     * "selector" will still be available after the eviction, i.e. even in the
     * absence of the evicted pod.  So for example you can prevent all voluntary
     * evictions by specifying "100%".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder() {
      return minAvailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : minAvailable_;
    }

    public static final int SELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * Label query over pods whose evictions are managed by the disruption
     * budget.
     * A null selector will match no pods, while an empty ({}) selector will select
     * all pods within the namespace.
     * +patchStrategy=replace
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int MAXUNAVAILABLE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.IntStr.IntOrString maxUnavailable_;
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    public boolean hasMaxUnavailable() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable() {
      return maxUnavailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : maxUnavailable_;
    }
    /**
     *
     *
     * <pre>
     * An eviction is allowed if at most "maxUnavailable" pods selected by
     * "selector" are unavailable after the eviction, i.e. even in absence of
     * the evicted pod. For example, one can prevent all voluntary evictions
     * by specifying 0. This is a mutually exclusive setting with "minAvailable".
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder() {
      return maxUnavailable_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : maxUnavailable_;
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
        output.writeMessage(1, getMinAvailable());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getMaxUnavailable());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMinAvailable());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getMaxUnavailable());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec other =
          (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec) obj;

      boolean result = true;
      result = result && (hasMinAvailable() == other.hasMinAvailable());
      if (hasMinAvailable()) {
        result = result && getMinAvailable().equals(other.getMinAvailable());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && (hasMaxUnavailable() == other.hasMaxUnavailable());
      if (hasMaxUnavailable()) {
        result = result && getMaxUnavailable().equals(other.getMaxUnavailable());
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
      if (hasMinAvailable()) {
        hash = (37 * hash) + MINAVAILABLE_FIELD_NUMBER;
        hash = (53 * hash) + getMinAvailable().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (hasMaxUnavailable()) {
        hash = (37 * hash) + MAXUNAVAILABLE_FIELD_NUMBER;
        hash = (53 * hash) + getMaxUnavailable().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec prototype) {
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
     * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1.PodDisruptionBudgetSpec)
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.class,
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMinAvailableFieldBuilder();
          getSelectorFieldBuilder();
          getMaxUnavailableFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (minAvailableBuilder_ == null) {
          minAvailable_ = null;
        } else {
          minAvailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = null;
        } else {
          maxUnavailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec build() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec buildPartial() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec result =
            new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (minAvailableBuilder_ == null) {
          result.minAvailable_ = minAvailable_;
        } else {
          result.minAvailable_ = minAvailableBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (maxUnavailableBuilder_ == null) {
          result.maxUnavailable_ = maxUnavailable_;
        } else {
          result.maxUnavailable_ = maxUnavailableBuilder_.build();
        }
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
        if (other instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec other) {
        if (other
            == io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec.getDefaultInstance())
          return this;
        if (other.hasMinAvailable()) {
          mergeMinAvailable(other.getMinAvailable());
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (other.hasMaxUnavailable()) {
          mergeMaxUnavailable(other.getMaxUnavailable());
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
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.IntStr.IntOrString minAvailable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          minAvailableBuilder_;
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public boolean hasMinAvailable() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString getMinAvailable() {
        if (minAvailableBuilder_ == null) {
          return minAvailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : minAvailable_;
        } else {
          return minAvailableBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public Builder setMinAvailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (minAvailableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          minAvailable_ = value;
          onChanged();
        } else {
          minAvailableBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public Builder setMinAvailable(
          io.kubernetes.client.proto.IntStr.IntOrString.Builder builderForValue) {
        if (minAvailableBuilder_ == null) {
          minAvailable_ = builderForValue.build();
          onChanged();
        } else {
          minAvailableBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public Builder mergeMinAvailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (minAvailableBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && minAvailable_ != null
              && minAvailable_
                  != io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()) {
            minAvailable_ =
                io.kubernetes.client.proto.IntStr.IntOrString.newBuilder(minAvailable_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            minAvailable_ = value;
          }
          onChanged();
        } else {
          minAvailableBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public Builder clearMinAvailable() {
        if (minAvailableBuilder_ == null) {
          minAvailable_ = null;
          onChanged();
        } else {
          minAvailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString.Builder getMinAvailableBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMinAvailableFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMinAvailableOrBuilder() {
        if (minAvailableBuilder_ != null) {
          return minAvailableBuilder_.getMessageOrBuilder();
        } else {
          return minAvailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : minAvailable_;
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at least "minAvailable" pods selected by
       * "selector" will still be available after the eviction, i.e. even in the
       * absence of the evicted pod.  So for example you can prevent all voluntary
       * evictions by specifying "100%".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString minAvailable = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          getMinAvailableFieldBuilder() {
        if (minAvailableBuilder_ == null) {
          minAvailableBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.IntStr.IntOrString,
                  io.kubernetes.client.proto.IntStr.IntOrString.Builder,
                  io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>(
                  getMinAvailable(), getParentForChildren(), isClean());
          minAvailable_ = null;
        }
        return minAvailableBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * Label query over pods whose evictions are managed by the disruption
       * budget.
       * A null selector will match no pods, while an empty ({}) selector will select
       * all pods within the namespace.
       * +patchStrategy=replace
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      private io.kubernetes.client.proto.IntStr.IntOrString maxUnavailable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          maxUnavailableBuilder_;
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public boolean hasMaxUnavailable() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString getMaxUnavailable() {
        if (maxUnavailableBuilder_ == null) {
          return maxUnavailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : maxUnavailable_;
        } else {
          return maxUnavailableBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public Builder setMaxUnavailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (maxUnavailableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          maxUnavailable_ = value;
          onChanged();
        } else {
          maxUnavailableBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public Builder setMaxUnavailable(
          io.kubernetes.client.proto.IntStr.IntOrString.Builder builderForValue) {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = builderForValue.build();
          onChanged();
        } else {
          maxUnavailableBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public Builder mergeMaxUnavailable(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (maxUnavailableBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && maxUnavailable_ != null
              && maxUnavailable_
                  != io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()) {
            maxUnavailable_ =
                io.kubernetes.client.proto.IntStr.IntOrString.newBuilder(maxUnavailable_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            maxUnavailable_ = value;
          }
          onChanged();
        } else {
          maxUnavailableBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public Builder clearMaxUnavailable() {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailable_ = null;
          onChanged();
        } else {
          maxUnavailableBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString.Builder getMaxUnavailableBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getMaxUnavailableFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getMaxUnavailableOrBuilder() {
        if (maxUnavailableBuilder_ != null) {
          return maxUnavailableBuilder_.getMessageOrBuilder();
        } else {
          return maxUnavailable_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : maxUnavailable_;
        }
      }
      /**
       *
       *
       * <pre>
       * An eviction is allowed if at most "maxUnavailable" pods selected by
       * "selector" are unavailable after the eviction, i.e. even in absence of
       * the evicted pod. For example, one can prevent all voluntary evictions
       * by specifying 0. This is a mutually exclusive setting with "minAvailable".
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString maxUnavailable = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          getMaxUnavailableFieldBuilder() {
        if (maxUnavailableBuilder_ == null) {
          maxUnavailableBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.IntStr.IntOrString,
                  io.kubernetes.client.proto.IntStr.IntOrString.Builder,
                  io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>(
                  getMaxUnavailable(), getParentForChildren(), isClean());
          maxUnavailable_ = null;
        }
        return maxUnavailableBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1.PodDisruptionBudgetSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1.PodDisruptionBudgetSpec)
    private static final io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec();
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetSpec> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetSpec>() {
          @java.lang.Override
          public PodDisruptionBudgetSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodDisruptionBudgetStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.policy.v1.PodDisruptionBudgetStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
     * status information is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    boolean hasObservedGeneration();
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
     * status information is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    long getObservedGeneration();

    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    int getDisruptedPodsCount();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    boolean containsDisruptedPods(java.lang.String key);
    /** Use {@link #getDisruptedPodsMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> getDisruptedPods();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> getDisruptedPodsMap();
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
        java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue);
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    boolean hasDisruptionsAllowed();
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    int getDisruptionsAllowed();

    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    boolean hasCurrentHealthy();
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    int getCurrentHealthy();

    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    boolean hasDesiredHealthy();
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    int getDesiredHealthy();

    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    boolean hasExpectedPods();
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    int getExpectedPods();

    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    java.util.List<io.kubernetes.client.proto.Meta.Condition> getConditionsList();
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    io.kubernetes.client.proto.Meta.Condition getConditions(int index);
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    int getConditionsCount();
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.Meta.ConditionOrBuilder>
        getConditionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    io.kubernetes.client.proto.Meta.ConditionOrBuilder getConditionsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * PodDisruptionBudgetStatus represents information about the status of a
   * PodDisruptionBudget. Status may trail the actual state of a system.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetStatus}
   */
  public static final class PodDisruptionBudgetStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.policy.v1.PodDisruptionBudgetStatus)
      PodDisruptionBudgetStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodDisruptionBudgetStatus.newBuilder() to construct.
    private PodDisruptionBudgetStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodDisruptionBudgetStatus() {
      observedGeneration_ = 0L;
      disruptionsAllowed_ = 0;
      currentHealthy_ = 0;
      desiredHealthy_ = 0;
      expectedPods_ = 0;
      conditions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodDisruptionBudgetStatus(
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
                observedGeneration_ = input.readInt64();
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  disruptedPods_ =
                      com.google.protobuf.MapField.newMapField(
                          DisruptedPodsDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000002;
                }
                com.google.protobuf.MapEntry<java.lang.String, io.kubernetes.client.proto.Meta.Time>
                    disruptedPods__ =
                        input.readMessage(
                            DisruptedPodsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                disruptedPods_
                    .getMutableMap()
                    .put(disruptedPods__.getKey(), disruptedPods__.getValue());
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000002;
                disruptionsAllowed_ = input.readInt32();
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000004;
                currentHealthy_ = input.readInt32();
                break;
              }
            case 40:
              {
                bitField0_ |= 0x00000008;
                desiredHealthy_ = input.readInt32();
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000010;
                expectedPods_ = input.readInt32();
                break;
              }
            case 58:
              {
                if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                  conditions_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.Meta.Condition>();
                  mutable_bitField0_ |= 0x00000040;
                }
                conditions_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Condition.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetDisruptedPods();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Policy
          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.class,
              io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder.class);
    }

    private int bitField0_;
    public static final int OBSERVEDGENERATION_FIELD_NUMBER = 1;
    private long observedGeneration_;
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
     * status information is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public boolean hasObservedGeneration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
     * status information is valid only if observedGeneration equals to PDB's object generation.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public long getObservedGeneration() {
      return observedGeneration_;
    }

    public static final int DISRUPTEDPODS_FIELD_NUMBER = 2;

    private static final class DisruptedPodsDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
              java.lang.String, io.kubernetes.client.proto.Meta.Time>
          defaultEntry =
              com.google.protobuf.MapEntry
                  .<java.lang.String, io.kubernetes.client.proto.Meta.Time>newDefaultInstance(
                      io.kubernetes.client.proto.V1Policy
                          .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor,
                      com.google.protobuf.WireFormat.FieldType.STRING,
                      "",
                      com.google.protobuf.WireFormat.FieldType.MESSAGE,
                      io.kubernetes.client.proto.Meta.Time.getDefaultInstance());
    }

    private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        disruptedPods_;

    private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        internalGetDisruptedPods() {
      if (disruptedPods_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            DisruptedPodsDefaultEntryHolder.defaultEntry);
      }
      return disruptedPods_;
    }

    public int getDisruptedPodsCount() {
      return internalGetDisruptedPods().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    public boolean containsDisruptedPods(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetDisruptedPods().getMap().containsKey(key);
    }
    /** Use {@link #getDisruptedPodsMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        getDisruptedPods() {
      return getDisruptedPodsMap();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
        getDisruptedPodsMap() {
      return internalGetDisruptedPods().getMap();
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
        java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
          internalGetDisruptedPods().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not
     * yet been observed by the PodDisruptionBudget controller.
     * A pod will be in this map from the time when the API server processed the
     * eviction request to the time when the pod is seen by PDB controller
     * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
     * and the value is the time when the API server processed the eviction request. If
     * the deletion didn't occur and a pod is still there it will be removed from
     * the list automatically by PodDisruptionBudget controller after some time.
     * If everything goes smooth this map should be empty for the most of the time.
     * Large number of entries in the map may indicate problems with pod deletions.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
          internalGetDisruptedPods().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int DISRUPTIONSALLOWED_FIELD_NUMBER = 3;
    private int disruptionsAllowed_;
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    public boolean hasDisruptionsAllowed() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Number of pod disruptions that are currently allowed.
     * </pre>
     *
     * <code>optional int32 disruptionsAllowed = 3;</code>
     */
    public int getDisruptionsAllowed() {
      return disruptionsAllowed_;
    }

    public static final int CURRENTHEALTHY_FIELD_NUMBER = 4;
    private int currentHealthy_;
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    public boolean hasCurrentHealthy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * current number of healthy pods
     * </pre>
     *
     * <code>optional int32 currentHealthy = 4;</code>
     */
    public int getCurrentHealthy() {
      return currentHealthy_;
    }

    public static final int DESIREDHEALTHY_FIELD_NUMBER = 5;
    private int desiredHealthy_;
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    public boolean hasDesiredHealthy() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * minimum desired number of healthy pods
     * </pre>
     *
     * <code>optional int32 desiredHealthy = 5;</code>
     */
    public int getDesiredHealthy() {
      return desiredHealthy_;
    }

    public static final int EXPECTEDPODS_FIELD_NUMBER = 6;
    private int expectedPods_;
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    public boolean hasExpectedPods() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * total number of pods counted by this disruption budget
     * </pre>
     *
     * <code>optional int32 expectedPods = 6;</code>
     */
    public int getExpectedPods() {
      return expectedPods_;
    }

    public static final int CONDITIONS_FIELD_NUMBER = 7;
    private java.util.List<io.kubernetes.client.proto.Meta.Condition> conditions_;
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    public java.util.List<io.kubernetes.client.proto.Meta.Condition> getConditionsList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.Meta.ConditionOrBuilder>
        getConditionsOrBuilderList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    public int getConditionsCount() {
      return conditions_.size();
    }
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    public io.kubernetes.client.proto.Meta.Condition getConditions(int index) {
      return conditions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Conditions contain conditions for PDB. The disruption controller sets the
     * DisruptionAllowed condition. The following are known values for the reason field
     * (additional reasons could be added in the future):
     * - SyncFailed: The controller encountered an error and wasn't able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * +optional
     * +patchMergeKey=type
     * +patchStrategy=merge
     * +listType=map
     * +listMapKey=type
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
     */
    public io.kubernetes.client.proto.Meta.ConditionOrBuilder getConditionsOrBuilder(int index) {
      return conditions_.get(index);
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
        output.writeInt64(1, observedGeneration_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetDisruptedPods(), DisruptedPodsDefaultEntryHolder.defaultEntry, 2);
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(3, disruptionsAllowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(4, currentHealthy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(5, desiredHealthy_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(6, expectedPods_);
      }
      for (int i = 0; i < conditions_.size(); i++) {
        output.writeMessage(7, conditions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, observedGeneration_);
      }
      for (java.util.Map.Entry<java.lang.String, io.kubernetes.client.proto.Meta.Time> entry :
          internalGetDisruptedPods().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, io.kubernetes.client.proto.Meta.Time>
            disruptedPods__ =
                DisruptedPodsDefaultEntryHolder.defaultEntry
                    .newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, disruptedPods__);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, disruptionsAllowed_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, currentHealthy_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, desiredHealthy_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(6, expectedPods_);
      }
      for (int i = 0; i < conditions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(7, conditions_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus other =
          (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus) obj;

      boolean result = true;
      result = result && (hasObservedGeneration() == other.hasObservedGeneration());
      if (hasObservedGeneration()) {
        result = result && (getObservedGeneration() == other.getObservedGeneration());
      }
      result = result && internalGetDisruptedPods().equals(other.internalGetDisruptedPods());
      result = result && (hasDisruptionsAllowed() == other.hasDisruptionsAllowed());
      if (hasDisruptionsAllowed()) {
        result = result && (getDisruptionsAllowed() == other.getDisruptionsAllowed());
      }
      result = result && (hasCurrentHealthy() == other.hasCurrentHealthy());
      if (hasCurrentHealthy()) {
        result = result && (getCurrentHealthy() == other.getCurrentHealthy());
      }
      result = result && (hasDesiredHealthy() == other.hasDesiredHealthy());
      if (hasDesiredHealthy()) {
        result = result && (getDesiredHealthy() == other.getDesiredHealthy());
      }
      result = result && (hasExpectedPods() == other.hasExpectedPods());
      if (hasExpectedPods()) {
        result = result && (getExpectedPods() == other.getExpectedPods());
      }
      result = result && getConditionsList().equals(other.getConditionsList());
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
      if (hasObservedGeneration()) {
        hash = (37 * hash) + OBSERVEDGENERATION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getObservedGeneration());
      }
      if (!internalGetDisruptedPods().getMap().isEmpty()) {
        hash = (37 * hash) + DISRUPTEDPODS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetDisruptedPods().hashCode();
      }
      if (hasDisruptionsAllowed()) {
        hash = (37 * hash) + DISRUPTIONSALLOWED_FIELD_NUMBER;
        hash = (53 * hash) + getDisruptionsAllowed();
      }
      if (hasCurrentHealthy()) {
        hash = (37 * hash) + CURRENTHEALTHY_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentHealthy();
      }
      if (hasDesiredHealthy()) {
        hash = (37 * hash) + DESIREDHEALTHY_FIELD_NUMBER;
        hash = (53 * hash) + getDesiredHealthy();
      }
      if (hasExpectedPods()) {
        hash = (37 * hash) + EXPECTEDPODS_FIELD_NUMBER;
        hash = (53 * hash) + getExpectedPods();
      }
      if (getConditionsCount() > 0) {
        hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getConditionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parseFrom(
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

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus prototype) {
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
     * PodDisruptionBudgetStatus represents information about the status of a
     * PodDisruptionBudget. Status may trail the actual state of a system.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.policy.v1.PodDisruptionBudgetStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.policy.v1.PodDisruptionBudgetStatus)
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 2:
            return internalGetDisruptedPods();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 2:
            return internalGetMutableDisruptedPods();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.class,
                io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getConditionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        observedGeneration_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableDisruptedPods().clear();
        disruptionsAllowed_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        currentHealthy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        desiredHealthy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        expectedPods_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Policy
            .internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus build() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus buildPartial() {
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus result =
            new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.observedGeneration_ = observedGeneration_;
        result.disruptedPods_ = internalGetDisruptedPods();
        result.disruptedPods_.makeImmutable();
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.disruptionsAllowed_ = disruptionsAllowed_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.currentHealthy_ = currentHealthy_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.desiredHealthy_ = desiredHealthy_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.expectedPods_ = expectedPods_;
        if (conditionsBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)) {
            conditions_ = java.util.Collections.unmodifiableList(conditions_);
            bitField0_ = (bitField0_ & ~0x00000040);
          }
          result.conditions_ = conditions_;
        } else {
          result.conditions_ = conditionsBuilder_.build();
        }
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
        if (other instanceof io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus) {
          return mergeFrom((io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus other) {
        if (other
            == io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus.getDefaultInstance())
          return this;
        if (other.hasObservedGeneration()) {
          setObservedGeneration(other.getObservedGeneration());
        }
        internalGetMutableDisruptedPods().mergeFrom(other.internalGetDisruptedPods());
        if (other.hasDisruptionsAllowed()) {
          setDisruptionsAllowed(other.getDisruptionsAllowed());
        }
        if (other.hasCurrentHealthy()) {
          setCurrentHealthy(other.getCurrentHealthy());
        }
        if (other.hasDesiredHealthy()) {
          setDesiredHealthy(other.getDesiredHealthy());
        }
        if (other.hasExpectedPods()) {
          setExpectedPods(other.getExpectedPods());
        }
        if (conditionsBuilder_ == null) {
          if (!other.conditions_.isEmpty()) {
            if (conditions_.isEmpty()) {
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000040);
            } else {
              ensureConditionsIsMutable();
              conditions_.addAll(other.conditions_);
            }
            onChanged();
          }
        } else {
          if (!other.conditions_.isEmpty()) {
            if (conditionsBuilder_.isEmpty()) {
              conditionsBuilder_.dispose();
              conditionsBuilder_ = null;
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000040);
              conditionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getConditionsFieldBuilder()
                      : null;
            } else {
              conditionsBuilder_.addAllMessages(other.conditions_);
            }
          }
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
        io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long observedGeneration_;
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
       * status information is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public boolean hasObservedGeneration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
       * status information is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public long getObservedGeneration() {
        return observedGeneration_;
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
       * status information is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder setObservedGeneration(long value) {
        bitField0_ |= 0x00000001;
        observedGeneration_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other
       * status information is valid only if observedGeneration equals to PDB's object generation.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder clearObservedGeneration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        observedGeneration_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          disruptedPods_;

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          internalGetDisruptedPods() {
        if (disruptedPods_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              DisruptedPodsDefaultEntryHolder.defaultEntry);
        }
        return disruptedPods_;
      }

      private com.google.protobuf.MapField<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          internalGetMutableDisruptedPods() {
        onChanged();
        ;
        if (disruptedPods_ == null) {
          disruptedPods_ =
              com.google.protobuf.MapField.newMapField(
                  DisruptedPodsDefaultEntryHolder.defaultEntry);
        }
        if (!disruptedPods_.isMutable()) {
          disruptedPods_ = disruptedPods_.copy();
        }
        return disruptedPods_;
      }

      public int getDisruptedPodsCount() {
        return internalGetDisruptedPods().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public boolean containsDisruptedPods(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetDisruptedPods().getMap().containsKey(key);
      }
      /** Use {@link #getDisruptedPodsMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getDisruptedPods() {
        return getDisruptedPodsMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getDisruptedPodsMap() {
        return internalGetDisruptedPods().getMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrDefault(
          java.lang.String key, io.kubernetes.client.proto.Meta.Time defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
            internalGetDisruptedPods().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getDisruptedPodsOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> map =
            internalGetDisruptedPods().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearDisruptedPods() {
        internalGetMutableDisruptedPods().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder removeDisruptedPods(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableDisruptedPods().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time>
          getMutableDisruptedPods() {
        return internalGetMutableDisruptedPods().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder putDisruptedPods(
          java.lang.String key, io.kubernetes.client.proto.Meta.Time value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableDisruptedPods().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * DisruptedPods contains information about pods whose eviction was
       * processed by the API server eviction subresource handler but has not
       * yet been observed by the PodDisruptionBudget controller.
       * A pod will be in this map from the time when the API server processed the
       * eviction request to the time when the pod is seen by PDB controller
       * as having been marked for deletion (or after a timeout). The key in the map is the name of the pod
       * and the value is the time when the API server processed the eviction request. If
       * the deletion didn't occur and a pod is still there it will be removed from
       * the list automatically by PodDisruptionBudget controller after some time.
       * If everything goes smooth this map should be empty for the most of the time.
       * Large number of entries in the map may indicate problems with pod deletions.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, .k8s.io.apimachinery.pkg.apis.meta.v1.Time&gt; disruptedPods = 2;
       * </code>
       */
      public Builder putAllDisruptedPods(
          java.util.Map<java.lang.String, io.kubernetes.client.proto.Meta.Time> values) {
        internalGetMutableDisruptedPods().getMutableMap().putAll(values);
        return this;
      }

      private int disruptionsAllowed_;
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public boolean hasDisruptionsAllowed() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public int getDisruptionsAllowed() {
        return disruptionsAllowed_;
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public Builder setDisruptionsAllowed(int value) {
        bitField0_ |= 0x00000004;
        disruptionsAllowed_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Number of pod disruptions that are currently allowed.
       * </pre>
       *
       * <code>optional int32 disruptionsAllowed = 3;</code>
       */
      public Builder clearDisruptionsAllowed() {
        bitField0_ = (bitField0_ & ~0x00000004);
        disruptionsAllowed_ = 0;
        onChanged();
        return this;
      }

      private int currentHealthy_;
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public boolean hasCurrentHealthy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public int getCurrentHealthy() {
        return currentHealthy_;
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public Builder setCurrentHealthy(int value) {
        bitField0_ |= 0x00000008;
        currentHealthy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * current number of healthy pods
       * </pre>
       *
       * <code>optional int32 currentHealthy = 4;</code>
       */
      public Builder clearCurrentHealthy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        currentHealthy_ = 0;
        onChanged();
        return this;
      }

      private int desiredHealthy_;
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public boolean hasDesiredHealthy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public int getDesiredHealthy() {
        return desiredHealthy_;
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public Builder setDesiredHealthy(int value) {
        bitField0_ |= 0x00000010;
        desiredHealthy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * minimum desired number of healthy pods
       * </pre>
       *
       * <code>optional int32 desiredHealthy = 5;</code>
       */
      public Builder clearDesiredHealthy() {
        bitField0_ = (bitField0_ & ~0x00000010);
        desiredHealthy_ = 0;
        onChanged();
        return this;
      }

      private int expectedPods_;
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public boolean hasExpectedPods() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public int getExpectedPods() {
        return expectedPods_;
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public Builder setExpectedPods(int value) {
        bitField0_ |= 0x00000020;
        expectedPods_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * total number of pods counted by this disruption budget
       * </pre>
       *
       * <code>optional int32 expectedPods = 6;</code>
       */
      public Builder clearExpectedPods() {
        bitField0_ = (bitField0_ & ~0x00000020);
        expectedPods_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.Meta.Condition> conditions_ =
          java.util.Collections.emptyList();

      private void ensureConditionsIsMutable() {
        if (!((bitField0_ & 0x00000040) == 0x00000040)) {
          conditions_ =
              new java.util.ArrayList<io.kubernetes.client.proto.Meta.Condition>(conditions_);
          bitField0_ |= 0x00000040;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Condition,
              io.kubernetes.client.proto.Meta.Condition.Builder,
              io.kubernetes.client.proto.Meta.ConditionOrBuilder>
          conditionsBuilder_;

      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public java.util.List<io.kubernetes.client.proto.Meta.Condition> getConditionsList() {
        if (conditionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(conditions_);
        } else {
          return conditionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public int getConditionsCount() {
        if (conditionsBuilder_ == null) {
          return conditions_.size();
        } else {
          return conditionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public io.kubernetes.client.proto.Meta.Condition getConditions(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder setConditions(int index, io.kubernetes.client.proto.Meta.Condition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.set(index, value);
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder setConditions(
          int index, io.kubernetes.client.proto.Meta.Condition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.set(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder addConditions(io.kubernetes.client.proto.Meta.Condition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder addConditions(int index, io.kubernetes.client.proto.Meta.Condition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(index, value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.Meta.Condition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder addConditions(
          int index, io.kubernetes.client.proto.Meta.Condition.Builder builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder addAllConditions(
          java.lang.Iterable<? extends io.kubernetes.client.proto.Meta.Condition> values) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conditions_);
          onChanged();
        } else {
          conditionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder clearConditions() {
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000040);
          onChanged();
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public Builder removeConditions(int index) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.remove(index);
          onChanged();
        } else {
          conditionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public io.kubernetes.client.proto.Meta.Condition.Builder getConditionsBuilder(int index) {
        return getConditionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public io.kubernetes.client.proto.Meta.ConditionOrBuilder getConditionsOrBuilder(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.Meta.ConditionOrBuilder>
          getConditionsOrBuilderList() {
        if (conditionsBuilder_ != null) {
          return conditionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(conditions_);
        }
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public io.kubernetes.client.proto.Meta.Condition.Builder addConditionsBuilder() {
        return getConditionsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.Meta.Condition.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public io.kubernetes.client.proto.Meta.Condition.Builder addConditionsBuilder(int index) {
        return getConditionsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.Meta.Condition.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Conditions contain conditions for PDB. The disruption controller sets the
       * DisruptionAllowed condition. The following are known values for the reason field
       * (additional reasons could be added in the future):
       * - SyncFailed: The controller encountered an error and wasn't able to compute
       *               the number of allowed disruptions. Therefore no disruptions are
       *               allowed and the status of the condition will be False.
       * - InsufficientPods: The number of pods are either at or below the number
       *                     required by the PodDisruptionBudget. No disruptions are
       *                     allowed and the status of the condition will be False.
       * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
       *                   The condition will be True, and the number of allowed
       *                   disruptions are provided by the disruptionsAllowed property.
       * +optional
       * +patchMergeKey=type
       * +patchStrategy=merge
       * +listType=map
       * +listMapKey=type
       * </pre>
       *
       * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.Condition conditions = 7;</code>
       */
      public java.util.List<io.kubernetes.client.proto.Meta.Condition.Builder>
          getConditionsBuilderList() {
        return getConditionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Condition,
              io.kubernetes.client.proto.Meta.Condition.Builder,
              io.kubernetes.client.proto.Meta.ConditionOrBuilder>
          getConditionsFieldBuilder() {
        if (conditionsBuilder_ == null) {
          conditionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Condition,
                  io.kubernetes.client.proto.Meta.Condition.Builder,
                  io.kubernetes.client.proto.Meta.ConditionOrBuilder>(
                  conditions_,
                  ((bitField0_ & 0x00000040) == 0x00000040),
                  getParentForChildren(),
                  isClean());
          conditions_ = null;
        }
        return conditionsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.policy.v1.PodDisruptionBudgetStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.policy.v1.PodDisruptionBudgetStatus)
    private static final io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus();
    }

    public static io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodDisruptionBudgetStatus> PARSER =
        new com.google.protobuf.AbstractParser<PodDisruptionBudgetStatus>() {
          @java.lang.Override
          public PodDisruptionBudgetStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodDisruptionBudgetStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodDisruptionBudgetStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodDisruptionBudgetStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Policy.PodDisruptionBudgetStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_Eviction_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_Eviction_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$k8s.io/api/policy/v1/generated.proto\022\024"
          + "k8s.io.api.policy.v1\0324k8s.io/apimachiner"
          + "y/pkg/apis/meta/v1/generated.proto\032/k8s."
          + "io/apimachinery/pkg/runtime/generated.pr"
          + "oto\0326k8s.io/apimachinery/pkg/runtime/sch"
          + "ema/generated.proto\0323k8s.io/apimachinery"
          + "/pkg/util/intstr/generated.proto\"\232\001\n\010Evi"
          + "ction\022B\n\010metadata\030\001 \001(\01320.k8s.io.apimach"
          + "inery.pkg.apis.meta.v1.ObjectMeta\022J\n\rdel"
          + "eteOptions\030\002 \001(\01323.k8s.io.apimachinery.p"
          + "kg.apis.meta.v1.DeleteOptions\"\327\001\n\023PodDis"
          + "ruptionBudget\022B\n\010metadata\030\001 \001(\01320.k8s.io"
          + ".apimachinery.pkg.apis.meta.v1.ObjectMet"
          + "a\022;\n\004spec\030\002 \001(\0132-.k8s.io.api.policy.v1.P"
          + "odDisruptionBudgetSpec\022?\n\006status\030\003 \001(\0132/"
          + ".k8s.io.api.policy.v1.PodDisruptionBudge"
          + "tStatus\"\225\001\n\027PodDisruptionBudgetList\022@\n\010m"
          + "etadata\030\001 \001(\0132..k8s.io.apimachinery.pkg."
          + "apis.meta.v1.ListMeta\0228\n\005items\030\002 \003(\0132).k"
          + "8s.io.api.policy.v1.PodDisruptionBudget\""
          + "\362\001\n\027PodDisruptionBudgetSpec\022F\n\014minAvaila"
          + "ble\030\001 \001(\01320.k8s.io.apimachinery.pkg.util"
          + ".intstr.IntOrString\022E\n\010selector\030\002 \001(\01323."
          + "k8s.io.apimachinery.pkg.apis.meta.v1.Lab"
          + "elSelector\022H\n\016maxUnavailable\030\003 \001(\01320.k8s"
          + ".io.apimachinery.pkg.util.intstr.IntOrSt"
          + "ring\"\233\003\n\031PodDisruptionBudgetStatus\022\032\n\022ob"
          + "servedGeneration\030\001 \001(\003\022Y\n\rdisruptedPods\030"
          + "\002 \003(\0132B.k8s.io.api.policy.v1.PodDisrupti"
          + "onBudgetStatus.DisruptedPodsEntry\022\032\n\022dis"
          + "ruptionsAllowed\030\003 \001(\005\022\026\n\016currentHealthy\030"
          + "\004 \001(\005\022\026\n\016desiredHealthy\030\005 \001(\005\022\024\n\014expecte"
          + "dPods\030\006 \001(\005\022C\n\nconditions\030\007 \003(\0132/.k8s.io"
          + ".apimachinery.pkg.apis.meta.v1.Condition"
          + "\032`\n\022DisruptedPodsEntry\022\013\n\003key\030\001 \001(\t\0229\n\005v"
          + "alue\030\002 \001(\0132*.k8s.io.apimachinery.pkg.api"
          + "s.meta.v1.Time:\0028\001B*\n\032io.kubernetes.clie"
          + "nt.protoB\010V1PolicyZ\002v1"
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
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
          io.kubernetes.client.proto.IntStr.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_policy_v1_Eviction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_policy_v1_Eviction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_Eviction_descriptor,
            new java.lang.String[] {
              "Metadata", "DeleteOptions",
            });
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_PodDisruptionBudget_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetSpec_descriptor,
            new java.lang.String[] {
              "MinAvailable", "Selector", "MaxUnavailable",
            });
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor,
            new java.lang.String[] {
              "ObservedGeneration",
              "DisruptedPods",
              "DisruptionsAllowed",
              "CurrentHealthy",
              "DesiredHealthy",
              "ExpectedPods",
              "Conditions",
            });
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor =
        internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_policy_v1_PodDisruptionBudgetStatus_DisruptedPodsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
    io.kubernetes.client.proto.IntStr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
