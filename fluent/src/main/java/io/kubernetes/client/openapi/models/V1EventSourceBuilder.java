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

public class V1EventSourceBuilder
    extends io.kubernetes.client.openapi.models.V1EventSourceFluentImpl<
        io.kubernetes.client.openapi.models.V1EventSourceBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1EventSource,
        io.kubernetes.client.openapi.models.V1EventSourceBuilder> {
  public V1EventSourceBuilder() {
    this(false);
  }

  public V1EventSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EventSource(), validationEnabled);
  }

  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1EventSourceBuilder(
      io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1EventSource(), validationEnabled);
  }

  public V1EventSourceBuilder(
      io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EventSource instance) {
    this(fluent, instance, false);
  }

  public V1EventSourceBuilder(
      io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1EventSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withComponent(instance.getComponent());

    fluent.withHost(instance.getHost());

    this.validationEnabled = validationEnabled;
  }

  public V1EventSourceBuilder(io.kubernetes.client.openapi.models.V1EventSource instance) {
    this(instance, false);
  }

  public V1EventSourceBuilder(
      io.kubernetes.client.openapi.models.V1EventSource instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withComponent(instance.getComponent());

    this.withHost(instance.getHost());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1EventSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1EventSource build() {
    V1EventSource buildable = new V1EventSource();
    buildable.setComponent(fluent.getComponent());
    buildable.setHost(fluent.getHost());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EventSourceBuilder that = (V1EventSourceBuilder) o;
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
