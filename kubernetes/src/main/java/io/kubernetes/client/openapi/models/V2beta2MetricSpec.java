/*
Copyright 2021 The Kubernetes Authors.
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * MetricSpec specifies how to scale based on a single metric (only &#x60;type&#x60; and one other
 * matching field should be set at once).
 */
@ApiModel(
    description =
        "MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V2beta2MetricSpec {
  public static final String SERIALIZED_NAME_CONTAINER_RESOURCE = "containerResource";

  @SerializedName(SERIALIZED_NAME_CONTAINER_RESOURCE)
  private V2beta2ContainerResourceMetricSource containerResource;

  public static final String SERIALIZED_NAME_EXTERNAL = "external";

  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private V2beta2ExternalMetricSource external;

  public static final String SERIALIZED_NAME_OBJECT = "object";

  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V2beta2ObjectMetricSource _object;

  public static final String SERIALIZED_NAME_PODS = "pods";

  @SerializedName(SERIALIZED_NAME_PODS)
  private V2beta2PodsMetricSource pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";

  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private V2beta2ResourceMetricSource resource;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V2beta2MetricSpec containerResource(
      V2beta2ContainerResourceMetricSource containerResource) {

    this.containerResource = containerResource;
    return this;
  }

  /**
   * Get containerResource
   *
   * @return containerResource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ContainerResourceMetricSource getContainerResource() {
    return containerResource;
  }

  public void setContainerResource(V2beta2ContainerResourceMetricSource containerResource) {
    this.containerResource = containerResource;
  }

  public V2beta2MetricSpec external(V2beta2ExternalMetricSource external) {

    this.external = external;
    return this;
  }

  /**
   * Get external
   *
   * @return external
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ExternalMetricSource getExternal() {
    return external;
  }

  public void setExternal(V2beta2ExternalMetricSource external) {
    this.external = external;
  }

  public V2beta2MetricSpec _object(V2beta2ObjectMetricSource _object) {

    this._object = _object;
    return this;
  }

  /**
   * Get _object
   *
   * @return _object
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ObjectMetricSource getObject() {
    return _object;
  }

  public void setObject(V2beta2ObjectMetricSource _object) {
    this._object = _object;
  }

  public V2beta2MetricSpec pods(V2beta2PodsMetricSource pods) {

    this.pods = pods;
    return this;
  }

  /**
   * Get pods
   *
   * @return pods
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2PodsMetricSource getPods() {
    return pods;
  }

  public void setPods(V2beta2PodsMetricSource pods) {
    this.pods = pods;
  }

  public V2beta2MetricSpec resource(V2beta2ResourceMetricSource resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V2beta2ResourceMetricSource getResource() {
    return resource;
  }

  public void setResource(V2beta2ResourceMetricSource resource) {
    this.resource = resource;
  }

  public V2beta2MetricSpec type(String type) {

    this.type = type;
    return this;
  }

  /**
   * type is the type of metric source. It should be one of \&quot;ContainerResource\&quot;,
   * \&quot;External\&quot;, \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;,
   * each mapping to a matching field in the object. Note: \&quot;ContainerResource\&quot; type is
   * available on when the feature-gate HPAContainerMetrics is enabled
   *
   * @return type
   */
  @ApiModelProperty(
      required = true,
      value =
          "type is the type of metric source.  It should be one of \"ContainerResource\", \"External\", \"Object\", \"Pods\" or \"Resource\", each mapping to a matching field in the object. Note: \"ContainerResource\" type is available on when the feature-gate HPAContainerMetrics is enabled")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2MetricSpec v2beta2MetricSpec = (V2beta2MetricSpec) o;
    return Objects.equals(this.containerResource, v2beta2MetricSpec.containerResource)
        && Objects.equals(this.external, v2beta2MetricSpec.external)
        && Objects.equals(this._object, v2beta2MetricSpec._object)
        && Objects.equals(this.pods, v2beta2MetricSpec.pods)
        && Objects.equals(this.resource, v2beta2MetricSpec.resource)
        && Objects.equals(this.type, v2beta2MetricSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerResource, external, _object, pods, resource, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2MetricSpec {\n");
    sb.append("    containerResource: ").append(toIndentedString(containerResource)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}