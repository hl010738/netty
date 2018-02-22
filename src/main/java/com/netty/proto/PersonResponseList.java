// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

package com.netty.proto;

/**
 * Protobuf type {@code com.netty.proto.PersonResponseList}
 */
public  final class PersonResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.netty.proto.PersonResponseList)
    PersonResponseListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PersonResponseList.newBuilder() to construct.
  private PersonResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PersonResponseList() {
    personResponseList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PersonResponseList(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              personResponseList_ = new java.util.ArrayList<com.netty.proto.PersonResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            personResponseList_.add(
                input.readMessage(com.netty.proto.PersonResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        personResponseList_ = java.util.Collections.unmodifiableList(personResponseList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.netty.proto.PersonProto.internal_static_com_netty_proto_PersonResponseList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.netty.proto.PersonProto.internal_static_com_netty_proto_PersonResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.netty.proto.PersonResponseList.class, com.netty.proto.PersonResponseList.Builder.class);
  }

  public static final int PERSONRESPONSELIST_FIELD_NUMBER = 1;
  private java.util.List<com.netty.proto.PersonResponse> personResponseList_;
  /**
   * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
   */
  public java.util.List<com.netty.proto.PersonResponse> getPersonResponseListList() {
    return personResponseList_;
  }
  /**
   * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
   */
  public java.util.List<? extends com.netty.proto.PersonResponseOrBuilder> 
      getPersonResponseListOrBuilderList() {
    return personResponseList_;
  }
  /**
   * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
   */
  public int getPersonResponseListCount() {
    return personResponseList_.size();
  }
  /**
   * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
   */
  public com.netty.proto.PersonResponse getPersonResponseList(int index) {
    return personResponseList_.get(index);
  }
  /**
   * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
   */
  public com.netty.proto.PersonResponseOrBuilder getPersonResponseListOrBuilder(
      int index) {
    return personResponseList_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < personResponseList_.size(); i++) {
      output.writeMessage(1, personResponseList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < personResponseList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, personResponseList_.get(i));
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
    if (!(obj instanceof com.netty.proto.PersonResponseList)) {
      return super.equals(obj);
    }
    com.netty.proto.PersonResponseList other = (com.netty.proto.PersonResponseList) obj;

    boolean result = true;
    result = result && getPersonResponseListList()
        .equals(other.getPersonResponseListList());
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
    if (getPersonResponseListCount() > 0) {
      hash = (37 * hash) + PERSONRESPONSELIST_FIELD_NUMBER;
      hash = (53 * hash) + getPersonResponseListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.netty.proto.PersonResponseList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.proto.PersonResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.netty.proto.PersonResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.netty.proto.PersonResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.netty.proto.PersonResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.netty.proto.PersonResponseList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.netty.proto.PersonResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.netty.proto.PersonResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.netty.proto.PersonResponseList)
      com.netty.proto.PersonResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.netty.proto.PersonProto.internal_static_com_netty_proto_PersonResponseList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.netty.proto.PersonProto.internal_static_com_netty_proto_PersonResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.netty.proto.PersonResponseList.class, com.netty.proto.PersonResponseList.Builder.class);
    }

    // Construct using com.netty.proto.PersonResponseList.newBuilder()
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
        getPersonResponseListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (personResponseListBuilder_ == null) {
        personResponseList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        personResponseListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.netty.proto.PersonProto.internal_static_com_netty_proto_PersonResponseList_descriptor;
    }

    public com.netty.proto.PersonResponseList getDefaultInstanceForType() {
      return com.netty.proto.PersonResponseList.getDefaultInstance();
    }

    public com.netty.proto.PersonResponseList build() {
      com.netty.proto.PersonResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.netty.proto.PersonResponseList buildPartial() {
      com.netty.proto.PersonResponseList result = new com.netty.proto.PersonResponseList(this);
      int from_bitField0_ = bitField0_;
      if (personResponseListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          personResponseList_ = java.util.Collections.unmodifiableList(personResponseList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.personResponseList_ = personResponseList_;
      } else {
        result.personResponseList_ = personResponseListBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.netty.proto.PersonResponseList) {
        return mergeFrom((com.netty.proto.PersonResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.netty.proto.PersonResponseList other) {
      if (other == com.netty.proto.PersonResponseList.getDefaultInstance()) return this;
      if (personResponseListBuilder_ == null) {
        if (!other.personResponseList_.isEmpty()) {
          if (personResponseList_.isEmpty()) {
            personResponseList_ = other.personResponseList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonResponseListIsMutable();
            personResponseList_.addAll(other.personResponseList_);
          }
          onChanged();
        }
      } else {
        if (!other.personResponseList_.isEmpty()) {
          if (personResponseListBuilder_.isEmpty()) {
            personResponseListBuilder_.dispose();
            personResponseListBuilder_ = null;
            personResponseList_ = other.personResponseList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personResponseListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPersonResponseListFieldBuilder() : null;
          } else {
            personResponseListBuilder_.addAllMessages(other.personResponseList_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.netty.proto.PersonResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.netty.proto.PersonResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.netty.proto.PersonResponse> personResponseList_ =
      java.util.Collections.emptyList();
    private void ensurePersonResponseListIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        personResponseList_ = new java.util.ArrayList<com.netty.proto.PersonResponse>(personResponseList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.netty.proto.PersonResponse, com.netty.proto.PersonResponse.Builder, com.netty.proto.PersonResponseOrBuilder> personResponseListBuilder_;

    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public java.util.List<com.netty.proto.PersonResponse> getPersonResponseListList() {
      if (personResponseListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(personResponseList_);
      } else {
        return personResponseListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public int getPersonResponseListCount() {
      if (personResponseListBuilder_ == null) {
        return personResponseList_.size();
      } else {
        return personResponseListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public com.netty.proto.PersonResponse getPersonResponseList(int index) {
      if (personResponseListBuilder_ == null) {
        return personResponseList_.get(index);
      } else {
        return personResponseListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder setPersonResponseList(
        int index, com.netty.proto.PersonResponse value) {
      if (personResponseListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonResponseListIsMutable();
        personResponseList_.set(index, value);
        onChanged();
      } else {
        personResponseListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder setPersonResponseList(
        int index, com.netty.proto.PersonResponse.Builder builderForValue) {
      if (personResponseListBuilder_ == null) {
        ensurePersonResponseListIsMutable();
        personResponseList_.set(index, builderForValue.build());
        onChanged();
      } else {
        personResponseListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder addPersonResponseList(com.netty.proto.PersonResponse value) {
      if (personResponseListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonResponseListIsMutable();
        personResponseList_.add(value);
        onChanged();
      } else {
        personResponseListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder addPersonResponseList(
        int index, com.netty.proto.PersonResponse value) {
      if (personResponseListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonResponseListIsMutable();
        personResponseList_.add(index, value);
        onChanged();
      } else {
        personResponseListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder addPersonResponseList(
        com.netty.proto.PersonResponse.Builder builderForValue) {
      if (personResponseListBuilder_ == null) {
        ensurePersonResponseListIsMutable();
        personResponseList_.add(builderForValue.build());
        onChanged();
      } else {
        personResponseListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder addPersonResponseList(
        int index, com.netty.proto.PersonResponse.Builder builderForValue) {
      if (personResponseListBuilder_ == null) {
        ensurePersonResponseListIsMutable();
        personResponseList_.add(index, builderForValue.build());
        onChanged();
      } else {
        personResponseListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder addAllPersonResponseList(
        java.lang.Iterable<? extends com.netty.proto.PersonResponse> values) {
      if (personResponseListBuilder_ == null) {
        ensurePersonResponseListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, personResponseList_);
        onChanged();
      } else {
        personResponseListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder clearPersonResponseList() {
      if (personResponseListBuilder_ == null) {
        personResponseList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personResponseListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public Builder removePersonResponseList(int index) {
      if (personResponseListBuilder_ == null) {
        ensurePersonResponseListIsMutable();
        personResponseList_.remove(index);
        onChanged();
      } else {
        personResponseListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public com.netty.proto.PersonResponse.Builder getPersonResponseListBuilder(
        int index) {
      return getPersonResponseListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public com.netty.proto.PersonResponseOrBuilder getPersonResponseListOrBuilder(
        int index) {
      if (personResponseListBuilder_ == null) {
        return personResponseList_.get(index);  } else {
        return personResponseListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public java.util.List<? extends com.netty.proto.PersonResponseOrBuilder> 
         getPersonResponseListOrBuilderList() {
      if (personResponseListBuilder_ != null) {
        return personResponseListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(personResponseList_);
      }
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public com.netty.proto.PersonResponse.Builder addPersonResponseListBuilder() {
      return getPersonResponseListFieldBuilder().addBuilder(
          com.netty.proto.PersonResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public com.netty.proto.PersonResponse.Builder addPersonResponseListBuilder(
        int index) {
      return getPersonResponseListFieldBuilder().addBuilder(
          index, com.netty.proto.PersonResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .com.netty.proto.PersonResponse PersonResponseList = 1;</code>
     */
    public java.util.List<com.netty.proto.PersonResponse.Builder> 
         getPersonResponseListBuilderList() {
      return getPersonResponseListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.netty.proto.PersonResponse, com.netty.proto.PersonResponse.Builder, com.netty.proto.PersonResponseOrBuilder> 
        getPersonResponseListFieldBuilder() {
      if (personResponseListBuilder_ == null) {
        personResponseListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.netty.proto.PersonResponse, com.netty.proto.PersonResponse.Builder, com.netty.proto.PersonResponseOrBuilder>(
                personResponseList_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        personResponseList_ = null;
      }
      return personResponseListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.netty.proto.PersonResponseList)
  }

  // @@protoc_insertion_point(class_scope:com.netty.proto.PersonResponseList)
  private static final com.netty.proto.PersonResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.netty.proto.PersonResponseList();
  }

  public static com.netty.proto.PersonResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PersonResponseList>
      PARSER = new com.google.protobuf.AbstractParser<PersonResponseList>() {
    public PersonResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PersonResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PersonResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PersonResponseList> getParserForType() {
    return PARSER;
  }

  public com.netty.proto.PersonResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
