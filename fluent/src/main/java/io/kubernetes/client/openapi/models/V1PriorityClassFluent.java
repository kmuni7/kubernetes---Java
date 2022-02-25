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

/** Generated */
public interface V1PriorityClassFluent<
        A extends io.kubernetes.client.openapi.models.V1PriorityClassFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getApiVersion();

  public A withApiVersion(java.lang.String apiVersion);

  public java.lang.Boolean hasApiVersion();

  /** Method is deprecated. use withApiVersion instead. */
  @java.lang.Deprecated
  public A withNewApiVersion(java.lang.String original);

  public java.lang.String getDescription();

  public A withDescription(java.lang.String description);

  public java.lang.Boolean hasDescription();

  /** Method is deprecated. use withDescription instead. */
  @java.lang.Deprecated
  public A withNewDescription(java.lang.String original);

  public java.lang.Boolean getGlobalDefault();

  public A withGlobalDefault(java.lang.Boolean globalDefault);

  public java.lang.Boolean hasGlobalDefault();

  public java.lang.String getKind();

  public A withKind(java.lang.String kind);

  public java.lang.Boolean hasKind();

  /** Method is deprecated. use withKind instead. */
  @java.lang.Deprecated
  public A withNewKind(java.lang.String original);

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();

  public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();

  public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);

  public java.lang.Boolean hasMetadata();

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      withNewMetadata();

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A> editMetadata();

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      editOrNewMetadata();

  public io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);

  public java.lang.String getPreemptionPolicy();

  public A withPreemptionPolicy(java.lang.String preemptionPolicy);

  public java.lang.Boolean hasPreemptionPolicy();

  /** Method is deprecated. use withPreemptionPolicy instead. */
  @java.lang.Deprecated
  public A withNewPreemptionPolicy(java.lang.String original);

  public java.lang.Integer getValue();

  public A withValue(java.lang.Integer value);

  public java.lang.Boolean hasValue();

  public interface MetadataNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          io.kubernetes.client.openapi.models.V1ObjectMetaFluent<
              io.kubernetes.client.openapi.models.V1PriorityClassFluent.MetadataNested<N>> {
    public N and();

    public N endMetadata();
  }
}
