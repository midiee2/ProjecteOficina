package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Lloc;
import io.swagger.model.Projecte;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tecnic
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-22T16:17:54.505Z")

public class Tecnic   {
  @JsonProperty("idTecnic")
  private Integer idTecnic = null;

  @JsonProperty("nomCognom")
  private String nomCognom = null;

  @JsonProperty("estat")
  private String estat = "noAssignat";

  @JsonProperty("dataAlta")
  private String dataAlta = null;

  @JsonProperty("dataBaixa")
  private String dataBaixa = "null";

  @JsonProperty("projecte")
  private Projecte projecte = null;

  @JsonProperty("lloc")
  private Lloc lloc = null;

  public Tecnic idTecnic(Integer idTecnic) {
    this.idTecnic = idTecnic;
    return this;
  }

   /**
   * Get idTecnic
   * @return idTecnic
  **/
  @ApiModelProperty(example = "600985", required = true, value = "")
  @NotNull


  public Integer getIdTecnic() {
    return idTecnic;
  }

  public void setIdTecnic(Integer idTecnic) {
    this.idTecnic = idTecnic;
  }

  public Tecnic nomCognom(String nomCognom) {
    this.nomCognom = nomCognom;
    return this;
  }

   /**
   * Get nomCognom
   * @return nomCognom
  **/
  @ApiModelProperty(example = "Ramona Flowers", required = true, value = "")
  @NotNull


  public String getNomCognom() {
    return nomCognom;
  }

  public void setNomCognom(String nomCognom) {
    this.nomCognom = nomCognom;
  }

  public Tecnic estat(String estat) {
    this.estat = estat;
    return this;
  }

   /**
   * Get estat
   * @return estat
  **/
  @ApiModelProperty(example = "noAssignat", value = "")


  public String getEstat() {
    return estat;
  }

  public void setEstat(String estat) {
    this.estat = estat;
  }

  public Tecnic dataAlta(String dataAlta) {
    this.dataAlta = dataAlta;
    return this;
  }

   /**
   * Get dataAlta
   * @return dataAlta
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  @NotNull


  public String getDataAlta() {
    return dataAlta;
  }

  public void setDataAlta(String dataAlta) {
    this.dataAlta = dataAlta;
  }

  public Tecnic dataBaixa(String dataBaixa) {
    this.dataBaixa = dataBaixa;
    return this;
  }

   /**
   * Get dataBaixa
   * @return dataBaixa
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", value = "")


  public String getDataBaixa() {
    return dataBaixa;
  }

  public void setDataBaixa(String dataBaixa) {
    this.dataBaixa = dataBaixa;
  }

  public Tecnic projecte(Projecte projecte) {
    this.projecte = projecte;
    return this;
  }

   /**
   * Get projecte
   * @return projecte
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Projecte getProjecte() {
    return projecte;
  }

  public void setProjecte(Projecte projecte) {
    this.projecte = projecte;
  }

  public Tecnic lloc(Lloc lloc) {
    this.lloc = lloc;
    return this;
  }

   /**
   * Get lloc
   * @return lloc
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Lloc getLloc() {
    return lloc;
  }

  public void setLloc(Lloc lloc) {
    this.lloc = lloc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tecnic tecnic = (Tecnic) o;
    return Objects.equals(this.idTecnic, tecnic.idTecnic) &&
        Objects.equals(this.nomCognom, tecnic.nomCognom) &&
        Objects.equals(this.estat, tecnic.estat) &&
        Objects.equals(this.dataAlta, tecnic.dataAlta) &&
        Objects.equals(this.dataBaixa, tecnic.dataBaixa) &&
        Objects.equals(this.projecte, tecnic.projecte) &&
        Objects.equals(this.lloc, tecnic.lloc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTecnic, nomCognom, estat, dataAlta, dataBaixa, projecte, lloc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tecnic {\n");
    
    sb.append("    idTecnic: ").append(toIndentedString(idTecnic)).append("\n");
    sb.append("    nomCognom: ").append(toIndentedString(nomCognom)).append("\n");
    sb.append("    estat: ").append(toIndentedString(estat)).append("\n");
    sb.append("    dataAlta: ").append(toIndentedString(dataAlta)).append("\n");
    sb.append("    dataBaixa: ").append(toIndentedString(dataBaixa)).append("\n");
    sb.append("    projecte: ").append(toIndentedString(projecte)).append("\n");
    sb.append("    lloc: ").append(toIndentedString(lloc)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

