// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package com.example.grpc;

/**
 * Protobuf type {@code grpc.LocationInfo}
 */
public  final class LocationInfo extends
    com.google.protobuf.GeneratedMessageLite<
        LocationInfo, LocationInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:grpc.LocationInfo)
    LocationInfoOrBuilder {
  private LocationInfo() {
    address_ = "";
    time_ = "";
  }
  public static final int ADDRESS_FIELD_NUMBER = 1;
  private java.lang.String address_;
  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    return address_;
  }
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(address_);
  }
  /**
   * <code>string address = 1;</code>
   * @param value The address to set.
   */
  private void setAddress(
      java.lang.String value) {
    value.getClass();
  
    address_ = value;
  }
  /**
   * <code>string address = 1;</code>
   */
  private void clearAddress() {
    
    address_ = getDefaultInstance().getAddress();
  }
  /**
   * <code>string address = 1;</code>
   * @param value The bytes for address to set.
   */
  private void setAddressBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    address_ = value.toStringUtf8();
    
  }

  public static final int LATITUDE_FIELD_NUMBER = 2;
  private double latitude_;
  /**
   * <code>double latitude = 2;</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }
  /**
   * <code>double latitude = 2;</code>
   * @param value The latitude to set.
   */
  private void setLatitude(double value) {
    
    latitude_ = value;
  }
  /**
   * <code>double latitude = 2;</code>
   */
  private void clearLatitude() {
    
    latitude_ = 0D;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 3;
  private double longitude_;
  /**
   * <code>double longitude = 3;</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }
  /**
   * <code>double longitude = 3;</code>
   * @param value The longitude to set.
   */
  private void setLongitude(double value) {
    
    longitude_ = value;
  }
  /**
   * <code>double longitude = 3;</code>
   */
  private void clearLongitude() {
    
    longitude_ = 0D;
  }

  public static final int TIME_FIELD_NUMBER = 4;
  private java.lang.String time_;
  /**
   * <code>string time = 4;</code>
   * @return The time.
   */
  @java.lang.Override
  public java.lang.String getTime() {
    return time_;
  }
  /**
   * <code>string time = 4;</code>
   * @return The bytes for time.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(time_);
  }
  /**
   * <code>string time = 4;</code>
   * @param value The time to set.
   */
  private void setTime(
      java.lang.String value) {
    value.getClass();
  
    time_ = value;
  }
  /**
   * <code>string time = 4;</code>
   */
  private void clearTime() {
    
    time_ = getDefaultInstance().getTime();
  }
  /**
   * <code>string time = 4;</code>
   * @param value The bytes for time to set.
   */
  private void setTimeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    time_ = value.toStringUtf8();
    
  }

  public static com.example.grpc.LocationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.example.grpc.LocationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.grpc.LocationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.example.grpc.LocationInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.example.grpc.LocationInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code grpc.LocationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.example.grpc.LocationInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.LocationInfo)
      com.example.grpc.LocationInfoOrBuilder {
    // Construct using com.example.grpc.LocationInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string address = 1;</code>
     * @return The address.
     */
    @java.lang.Override
    public java.lang.String getAddress() {
      return instance.getAddress();
    }
    /**
     * <code>string address = 1;</code>
     * @return The bytes for address.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAddressBytes() {
      return instance.getAddressBytes();
    }
    /**
     * <code>string address = 1;</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      copyOnWrite();
      instance.setAddress(value);
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      copyOnWrite();
      instance.clearAddress();
      return this;
    }
    /**
     * <code>string address = 1;</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAddressBytes(value);
      return this;
    }

    /**
     * <code>double latitude = 2;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return instance.getLatitude();
    }
    /**
     * <code>double latitude = 2;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      copyOnWrite();
      instance.setLatitude(value);
      return this;
    }
    /**
     * <code>double latitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      copyOnWrite();
      instance.clearLatitude();
      return this;
    }

    /**
     * <code>double longitude = 3;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return instance.getLongitude();
    }
    /**
     * <code>double longitude = 3;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      copyOnWrite();
      instance.setLongitude(value);
      return this;
    }
    /**
     * <code>double longitude = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      copyOnWrite();
      instance.clearLongitude();
      return this;
    }

    /**
     * <code>string time = 4;</code>
     * @return The time.
     */
    @java.lang.Override
    public java.lang.String getTime() {
      return instance.getTime();
    }
    /**
     * <code>string time = 4;</code>
     * @return The bytes for time.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTimeBytes() {
      return instance.getTimeBytes();
    }
    /**
     * <code>string time = 4;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        java.lang.String value) {
      copyOnWrite();
      instance.setTime(value);
      return this;
    }
    /**
     * <code>string time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      copyOnWrite();
      instance.clearTime();
      return this;
    }
    /**
     * <code>string time = 4;</code>
     * @param value The bytes for time to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTimeBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:grpc.LocationInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.example.grpc.LocationInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "address_",
            "latitude_",
            "longitude_",
            "time_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0000" +
              "\u0003\u0000\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.example.grpc.LocationInfo> parser = PARSER;
        if (parser == null) {
          synchronized (com.example.grpc.LocationInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.example.grpc.LocationInfo>(
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


  // @@protoc_insertion_point(class_scope:grpc.LocationInfo)
  private static final com.example.grpc.LocationInfo DEFAULT_INSTANCE;
  static {
    LocationInfo defaultInstance = new LocationInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LocationInfo.class, defaultInstance);
  }

  public static com.example.grpc.LocationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LocationInfo> PARSER;

  public static com.google.protobuf.Parser<LocationInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

