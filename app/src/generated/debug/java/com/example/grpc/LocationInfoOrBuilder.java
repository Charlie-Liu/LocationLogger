// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: location.proto

package com.example.grpc;

public interface LocationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.LocationInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string address = 1;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>double latitude = 2;</code>
   * @return The latitude.
   */
  double getLatitude();

  /**
   * <code>double longitude = 3;</code>
   * @return The longitude.
   */
  double getLongitude();

  /**
   * <code>string time = 4;</code>
   * @return The time.
   */
  java.lang.String getTime();
  /**
   * <code>string time = 4;</code>
   * @return The bytes for time.
   */
  com.google.protobuf.ByteString
      getTimeBytes();
}