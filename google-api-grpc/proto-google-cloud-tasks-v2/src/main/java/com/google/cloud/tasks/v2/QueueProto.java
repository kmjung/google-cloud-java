// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/queue.proto

package com.google.cloud.tasks.v2;

public final class QueueProto {
  private QueueProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_Queue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_Queue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_RateLimits_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_RateLimits_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2_RetryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2_RetryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/tasks/v2/queue.proto\022\025goo"
          + "gle.cloud.tasks.v2\032\031google/api/resource."
          + "proto\032\"google/cloud/tasks/v2/target.prot"
          + "o\032\036google/protobuf/duration.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\034google/api/a"
          + "nnotations.proto\"\335\003\n\005Queue\022\014\n\004name\030\001 \001(\t"
          + "\022L\n\033app_engine_routing_override\030\002 \001(\0132\'."
          + "google.cloud.tasks.v2.AppEngineRouting\0226"
          + "\n\013rate_limits\030\003 \001(\0132!.google.cloud.tasks"
          + ".v2.RateLimits\0228\n\014retry_config\030\004 \001(\0132\".g"
          + "oogle.cloud.tasks.v2.RetryConfig\0221\n\005stat"
          + "e\030\005 \001(\0162\".google.cloud.tasks.v2.Queue.St"
          + "ate\022.\n\npurge_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\"E\n\005State\022\025\n\021STATE_UNSPECIFIE"
          + "D\020\000\022\013\n\007RUNNING\020\001\022\n\n\006PAUSED\020\002\022\014\n\010DISABLED"
          + "\020\003:\\\352AY\n\037cloudtasks.googleapis.com/Queue"
          + "\0226projects/{project}/locations/{location"
          + "}/queues/{queue}\"j\n\nRateLimits\022!\n\031max_di"
          + "spatches_per_second\030\001 \001(\001\022\026\n\016max_burst_s"
          + "ize\030\002 \001(\005\022!\n\031max_concurrent_dispatches\030\003"
          + " \001(\005\"\321\001\n\013RetryConfig\022\024\n\014max_attempts\030\001 \001"
          + "(\005\0225\n\022max_retry_duration\030\002 \001(\0132\031.google."
          + "protobuf.Duration\022.\n\013min_backoff\030\003 \001(\0132\031"
          + ".google.protobuf.Duration\022.\n\013max_backoff"
          + "\030\004 \001(\0132\031.google.protobuf.Duration\022\025\n\rmax"
          + "_doublings\030\005 \001(\005Be\n\031com.google.cloud.tas"
          + "ks.v2B\nQueueProtoP\001Z:google.golang.org/g"
          + "enproto/googleapis/cloud/tasks/v2;tasksb"
          + "\006proto3"
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
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.tasks.v2.TargetProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_tasks_v2_Queue_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2_Queue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_Queue_descriptor,
            new java.lang.String[] {
              "Name", "AppEngineRoutingOverride", "RateLimits", "RetryConfig", "State", "PurgeTime",
            });
    internal_static_google_cloud_tasks_v2_RateLimits_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2_RateLimits_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_RateLimits_descriptor,
            new java.lang.String[] {
              "MaxDispatchesPerSecond", "MaxBurstSize", "MaxConcurrentDispatches",
            });
    internal_static_google_cloud_tasks_v2_RetryConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2_RetryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2_RetryConfig_descriptor,
            new java.lang.String[] {
              "MaxAttempts", "MaxRetryDuration", "MinBackoff", "MaxBackoff", "MaxDoublings",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
