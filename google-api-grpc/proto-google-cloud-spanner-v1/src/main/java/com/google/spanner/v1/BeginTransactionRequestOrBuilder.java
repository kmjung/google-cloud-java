// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface BeginTransactionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.BeginTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction runs.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction runs.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Required. Options for the new transaction.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.TransactionOptions options = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean hasOptions();
  /**
   *
   *
   * <pre>
   * Required. Options for the new transaction.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.TransactionOptions options = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.spanner.v1.TransactionOptions getOptions();
  /**
   *
   *
   * <pre>
   * Required. Options for the new transaction.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.TransactionOptions options = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.spanner.v1.TransactionOptionsOrBuilder getOptionsOrBuilder();
}
