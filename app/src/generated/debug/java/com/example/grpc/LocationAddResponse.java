// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package com.example.grpc;

/**
 * Protobuf type {@code grpc.LocationAddResponse}
 */
public  final class LocationAddResponse extends
    com.google.protobuf.GeneratedMessageLite<
        LocationAddResponse, LocationAddResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:grpc.LocationAddResponse)
    LocationAddResponseOrBuilder {
  private LocationAddResponse() {
    response_ = "";
  }
  public static final int RESPONSE_FIELD_NUMBER = 1;
  private java.lang.String response_;
  /**
   * <code>string response = 1;</code>
   * @return The response.
   */
  @java.lang.Override
  public java.lang.String getResponse() {
    return response_;
  }
  /**
   * <code>string response = 1;</code>
   * @return The bytes for response.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResponseBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(response_);
  }
  /**
   * <code>string response = 1;</code>
   * @param value The response to set.
   */
  private void setResponse(
      java.lang.String value) {
    value.getClass();
  
    response_ = value;
  }
  /**
   * <code>string response = 1;</code>
   */
  private void clearResponse() {
    
    response_ = getDefaultInstance().getResponse();
  }
  /**
   * <code>string response = 1;</code>
   * @param value The bytes for response to set.
   */
  private void setResponseBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    response_ = value.toStringUtf8();
    
  }

  public static com.example.grpc.LocationAddResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.grpc.LocationAddResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationAddResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationAddResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.grpc.LocationAddResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code grpc.LocationAddResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.grpc.LocationAddResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.LocationAddResponse)
      com.example.grpc.LocationAddResponseOrBuilder {
    // Construct using com.example.grpc.LocationAddResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string response = 1;</code>
     * @return The response.
     */
    @java.lang.Override
    public java.lang.String getResponse() {
      return instance.getResponse();
    }
    /**
     * <code>string response = 1;</code>
     * @return The bytes for response.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResponseBytes() {
      return instance.getResponseBytes();
    }
    /**
     * <code>string response = 1;</code>
     * @param value The response to set.
     * @return This builder for chaining.
     */
    public Builder setResponse(
        java.lang.String value) {
      copyOnWrite();
      instance.setResponse(value);
      return this;
    }
    /**
     * <code>string response = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponse() {
      copyOnWrite();
      instance.clearResponse();
      return this;
    }
    /**
     * <code>string response = 1;</code>
     * @param value The bytes for response to set.
     * @return This builder for chaining.
     */
    public Builder setResponseBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResponseBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:grpc.LocationAddResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.grpc.LocationAddResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "response_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.grpc.LocationAddResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.grpc.LocationAddResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.grpc.LocationAddResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:grpc.LocationAddResponse)
  private static final com.example.grpc.LocationAddResponse DEFAULT_INSTANCE;
  static {
    LocationAddResponse defaultInstance = new LocationAddResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LocationAddResponse.class, defaultInstance);
  }

  public static com.example.grpc.LocationAddResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LocationAddResponse> PARSER;

  public static com.google.protobuf.Parser<LocationAddResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

