/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

public class V1beta1SchedulingBuilder
    extends io.kubernetes.client.openapi.models.V1beta1SchedulingFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1Scheduling,
        io.kubernetes.client.openapi.models.V1beta1SchedulingBuilder> {
  public V1beta1SchedulingBuilder() {
    this(false);
  }

  public V1beta1SchedulingBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1Scheduling(), validationEnabled);
  }

  public V1beta1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1Scheduling(), validationEnabled);
  }

  public V1beta1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Scheduling instance) {
    this(fluent, instance, false);
  }

  public V1beta1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1Scheduling instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1SchedulingBuilder(io.kubernetes.client.openapi.models.V1beta1Scheduling instance) {
    this(instance, false);
  }

  public V1beta1SchedulingBuilder(
      io.kubernetes.client.openapi.models.V1beta1Scheduling instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withNodeSelector(instance.getNodeSelector());

    this.withTolerations(instance.getTolerations());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1SchedulingFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1Scheduling build() {
    V1beta1Scheduling buildable = new V1beta1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.getTolerations());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1SchedulingBuilder that = (V1beta1SchedulingBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
