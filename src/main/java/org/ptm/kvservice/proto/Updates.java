// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReplicationService.proto

package org.ptm.kvservice.proto;

/**
 * Protobuf type {@code proto.Updates}
 */
public final class Updates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Updates)
    UpdatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Updates.newBuilder() to construct.
  private Updates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Updates() {
    updates_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Updates();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Updates(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            sequenceNumber_ = input.readInt64();
            break;
          }
          case 18: {

            updates_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ReplicationServiceOuterClass.internal_static_proto_Updates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ReplicationServiceOuterClass.internal_static_proto_Updates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Updates.class, Updates.Builder.class);
  }

  public static final int SEQUENCENUMBER_FIELD_NUMBER = 1;
  private long sequenceNumber_;
  /**
   * <code>int64 sequenceNumber = 1;</code>
   * @return The sequenceNumber.
   */
  @java.lang.Override
  public long getSequenceNumber() {
    return sequenceNumber_;
  }

  public static final int UPDATES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString updates_;
  /**
   * <code>bytes updates = 2;</code>
   * @return The updates.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUpdates() {
    return updates_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (sequenceNumber_ != 0L) {
      output.writeInt64(1, sequenceNumber_);
    }
    if (!updates_.isEmpty()) {
      output.writeBytes(2, updates_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sequenceNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sequenceNumber_);
    }
    if (!updates_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, updates_);
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
    if (!(obj instanceof Updates)) {
      return super.equals(obj);
    }
    Updates other = (Updates) obj;

    if (getSequenceNumber()
        != other.getSequenceNumber()) return false;
    if (!getUpdates()
        .equals(other.getUpdates())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEQUENCENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequenceNumber());
    hash = (37 * hash) + UPDATES_FIELD_NUMBER;
    hash = (53 * hash) + getUpdates().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Updates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Updates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Updates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Updates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Updates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Updates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Updates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Updates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Updates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Updates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Updates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Updates parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Updates prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Updates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Updates)
          UpdatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReplicationServiceOuterClass.internal_static_proto_Updates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReplicationServiceOuterClass.internal_static_proto_Updates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Updates.class, Updates.Builder.class);
    }

    // Construct using com.coccoc.bi.kvservice.proto.Updates.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sequenceNumber_ = 0L;

      updates_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ReplicationServiceOuterClass.internal_static_proto_Updates_descriptor;
    }

    @java.lang.Override
    public Updates getDefaultInstanceForType() {
      return Updates.getDefaultInstance();
    }

    @java.lang.Override
    public Updates build() {
      Updates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public Updates buildPartial() {
      Updates result = new Updates(this);
      result.sequenceNumber_ = sequenceNumber_;
      result.updates_ = updates_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Updates) {
        return mergeFrom((Updates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Updates other) {
      if (other == Updates.getDefaultInstance()) return this;
      if (other.getSequenceNumber() != 0L) {
        setSequenceNumber(other.getSequenceNumber());
      }
      if (other.getUpdates() != com.google.protobuf.ByteString.EMPTY) {
        setUpdates(other.getUpdates());
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
      Updates parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Updates) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long sequenceNumber_ ;
    /**
     * <code>int64 sequenceNumber = 1;</code>
     * @return The sequenceNumber.
     */
    @java.lang.Override
    public long getSequenceNumber() {
      return sequenceNumber_;
    }
    /**
     * <code>int64 sequenceNumber = 1;</code>
     * @param value The sequenceNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSequenceNumber(long value) {
      
      sequenceNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sequenceNumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSequenceNumber() {
      
      sequenceNumber_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString updates_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes updates = 2;</code>
     * @return The updates.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUpdates() {
      return updates_;
    }
    /**
     * <code>bytes updates = 2;</code>
     * @param value The updates to set.
     * @return This builder for chaining.
     */
    public Builder setUpdates(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      updates_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes updates = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpdates() {
      
      updates_ = getDefaultInstance().getUpdates();
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


    // @@protoc_insertion_point(builder_scope:proto.Updates)
  }

  // @@protoc_insertion_point(class_scope:proto.Updates)
  private static final Updates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Updates();
  }

  public static Updates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Updates>
      PARSER = new com.google.protobuf.AbstractParser<Updates>() {
    @java.lang.Override
    public Updates parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Updates(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Updates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Updates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public Updates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

