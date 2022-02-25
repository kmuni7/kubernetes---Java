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
public interface V1beta1EndpointPortFluent<
        A extends io.kubernetes.client.openapi.models.V1beta1EndpointPortFluent<A>>
    extends io.kubernetes.client.fluent.Fluent<A> {
  public java.lang.String getAppProtocol();

  public A withAppProtocol(java.lang.String appProtocol);

  public java.lang.Boolean hasAppProtocol();

  /** Method is deprecated. use withAppProtocol instead. */
  @java.lang.Deprecated
  public A withNewAppProtocol(java.lang.String original);

  public java.lang.String getName();

  public A withName(java.lang.String name);

  public java.lang.Boolean hasName();

  /** Method is deprecated. use withName instead. */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original);

  public java.lang.Integer getPort();

  public A withPort(java.lang.Integer port);

  public java.lang.Boolean hasPort();

  public java.lang.String getProtocol();

  public A withProtocol(java.lang.String protocol);

  public java.lang.Boolean hasProtocol();

  /** Method is deprecated. use withProtocol instead. */
  @java.lang.Deprecated
  public A withNewProtocol(java.lang.String original);
}
