package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AgreementRef;
import org.openapitools.model.AttachmentRefOrValue;
import org.openapitools.model.BundledProductOffering;
import org.openapitools.model.CategoryRef;
import org.openapitools.model.ChannelRef;
import org.openapitools.model.MarketSegmentRef;
import org.openapitools.model.PlaceRef;
import org.openapitools.model.ProductOfferingPriceRefOrValue;
import org.openapitools.model.ProductOfferingRelationship;
import org.openapitools.model.ProductOfferingTerm;
import org.openapitools.model.ProductSpecificationCharacteristicValueUse;
import org.openapitools.model.ProductSpecificationRef;
import org.openapitools.model.ResourceCandidateRef;
import org.openapitools.model.SLARef;
import org.openapitools.model.ServiceCandidateRef;
import org.openapitools.model.TimePeriod;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
 */

@Schema(name = "ProductOffering", description = "Represents entities that are orderable from the provider of the catalog, this resource includes pricing information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
public class ProductOffering   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("href")
  private String href;

  @JsonProperty("description")
  private String description;

  @JsonProperty("isBundle")
  private Boolean isBundle;

  @JsonProperty("isSellable")
  private Boolean isSellable;

  @JsonProperty("lastUpdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdate;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus;

  @JsonProperty("name")
  private String name;

  @JsonProperty("statusReason")
  private String statusReason;

  @JsonProperty("version")
  private String version;

  @JsonProperty("agreement")
  @Valid
  private List<AgreementRef> agreement = null;

  @JsonProperty("attachment")
  @Valid
  private List<AttachmentRefOrValue> attachment = null;

  @JsonProperty("bundledProductOffering")
  @Valid
  private List<BundledProductOffering> bundledProductOffering = null;

  @JsonProperty("category")
  @Valid
  private List<CategoryRef> category = null;

  @JsonProperty("channel")
  @Valid
  private List<ChannelRef> channel = null;

  @JsonProperty("marketSegment")
  @Valid
  private List<MarketSegmentRef> marketSegment = null;

  @JsonProperty("place")
  @Valid
  private List<PlaceRef> place = null;

  @JsonProperty("prodSpecCharValueUse")
  @Valid
  private List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = null;

  @JsonProperty("productOfferingPrice")
  @Valid
  private List<ProductOfferingPriceRefOrValue> productOfferingPrice = null;

  @JsonProperty("productOfferingRelationship")
  @Valid
  private List<ProductOfferingRelationship> productOfferingRelationship = null;

  @JsonProperty("productOfferingTerm")
  @Valid
  private List<ProductOfferingTerm> productOfferingTerm = null;

  @JsonProperty("productSpecification")
  private ProductSpecificationRef productSpecification;

  @JsonProperty("resourceCandidate")
  private ResourceCandidateRef resourceCandidate;

  @JsonProperty("serviceCandidate")
  private ServiceCandidateRef serviceCandidate;

  @JsonProperty("serviceLevelAgreement")
  private SLARef serviceLevelAgreement;

  @JsonProperty("validFor")
  private TimePeriod validFor;

  @JsonProperty("@baseType")
  private String atBaseType;

  @JsonProperty("@schemaLocation")
  private URI atSchemaLocation;

  @JsonProperty("@type")
  private String atType;

  public ProductOffering id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the productOffering
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the productOffering", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOffering href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the ProductOffering
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the ProductOffering", required = false)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOffering description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOffering
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the productOffering", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOffering isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).
   * @return isBundle
  */
  
  @Schema(name = "isBundle", description = "isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).", required = false)
  public Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductOffering isSellable(Boolean isSellable) {
    this.isSellable = isSellable;
    return this;
  }

  /**
   * A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.
   * @return isSellable
  */
  
  @Schema(name = "isSellable", description = "A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.", required = false)
  public Boolean getIsSellable() {
    return isSellable;
  }

  public void setIsSellable(Boolean isSellable) {
    this.isSellable = isSellable;
  }

  public ProductOffering lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update
   * @return lastUpdate
  */
  @Valid 
  @Schema(name = "lastUpdate", description = "Date and time of the last update", required = false)
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOffering lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  */
  
  @Schema(name = "lifecycleStatus", description = "Used to indicate the current lifecycle status", required = false)
  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ProductOffering name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOffering
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the productOffering", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOffering statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * A string providing a complementary information on the value of the lifecycle status attribute.
   * @return statusReason
  */
  
  @Schema(name = "statusReason", description = "A string providing a complementary information on the value of the lifecycle status attribute.", required = false)
  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public ProductOffering version(String version) {
    this.version = version;
    return this;
  }

  /**
   * ProductOffering version
   * @return version
  */
  
  @Schema(name = "version", description = "ProductOffering version", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductOffering agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductOffering addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
   * @return agreement
  */
  @Valid 
  @Schema(name = "agreement", description = "An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.", required = false)
  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public ProductOffering attachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public ProductOffering addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Complements the description of an element (for instance a product) through video, pictures...
   * @return attachment
  */
  @Valid 
  @Schema(name = "attachment", description = "Complements the description of an element (for instance a product) through video, pictures...", required = false)
  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public ProductOffering bundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
    return this;
  }

  public ProductOffering addBundledProductOfferingItem(BundledProductOffering bundledProductOfferingItem) {
    if (this.bundledProductOffering == null) {
      this.bundledProductOffering = new ArrayList<>();
    }
    this.bundledProductOffering.add(bundledProductOfferingItem);
    return this;
  }

  /**
   * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
   * @return bundledProductOffering
  */
  @Valid 
  @Schema(name = "bundledProductOffering", description = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.", required = false)
  public List<BundledProductOffering> getBundledProductOffering() {
    return bundledProductOffering;
  }

  public void setBundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
  }

  public ProductOffering category(List<CategoryRef> category) {
    this.category = category;
    return this;
  }

  public ProductOffering addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
   * @return category
  */
  @Valid 
  @Schema(name = "category", description = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.", required = false)
  public List<CategoryRef> getCategory() {
    return category;
  }

  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }

  public ProductOffering channel(List<ChannelRef> channel) {
    this.channel = channel;
    return this;
  }

  public ProductOffering addChannelItem(ChannelRef channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<>();
    }
    this.channel.add(channelItem);
    return this;
  }

  /**
   * The channel defines the channel for selling product offerings.
   * @return channel
  */
  @Valid 
  @Schema(name = "channel", description = "The channel defines the channel for selling product offerings.", required = false)
  public List<ChannelRef> getChannel() {
    return channel;
  }

  public void setChannel(List<ChannelRef> channel) {
    this.channel = channel;
  }

  public ProductOffering marketSegment(List<MarketSegmentRef> marketSegment) {
    this.marketSegment = marketSegment;
    return this;
  }

  public ProductOffering addMarketSegmentItem(MarketSegmentRef marketSegmentItem) {
    if (this.marketSegment == null) {
      this.marketSegment = new ArrayList<>();
    }
    this.marketSegment.add(marketSegmentItem);
    return this;
  }

  /**
   * provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.
   * @return marketSegment
  */
  @Valid 
  @Schema(name = "marketSegment", description = "provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.", required = false)
  public List<MarketSegmentRef> getMarketSegment() {
    return marketSegment;
  }

  public void setMarketSegment(List<MarketSegmentRef> marketSegment) {
    this.marketSegment = marketSegment;
  }

  public ProductOffering place(List<PlaceRef> place) {
    this.place = place;
    return this;
  }

  public ProductOffering addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Place defines the places where the products are sold or delivered.
   * @return place
  */
  @Valid 
  @Schema(name = "place", description = "Place defines the places where the products are sold or delivered.", required = false)
  public List<PlaceRef> getPlace() {
    return place;
  }

  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }

  public ProductOffering prodSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOffering addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
  */
  @Valid 
  @Schema(name = "prodSpecCharValueUse", description = "A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.", required = false)
  public List<ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  public void setProdSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOffering productOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  public ProductOffering addProductOfferingPriceItem(ProductOfferingPriceRefOrValue productOfferingPriceItem) {
    if (this.productOfferingPrice == null) {
      this.productOfferingPrice = new ArrayList<>();
    }
    this.productOfferingPrice.add(productOfferingPriceItem);
    return this;
  }

  /**
   * An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.
   * @return productOfferingPrice
  */
  @Valid 
  @Schema(name = "productOfferingPrice", description = "An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.", required = false)
  public List<ProductOfferingPriceRefOrValue> getProductOfferingPrice() {
    return productOfferingPrice;
  }

  public void setProductOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  public ProductOffering productOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
    return this;
  }

  public ProductOffering addProductOfferingRelationshipItem(ProductOfferingRelationship productOfferingRelationshipItem) {
    if (this.productOfferingRelationship == null) {
      this.productOfferingRelationship = new ArrayList<>();
    }
    this.productOfferingRelationship.add(productOfferingRelationshipItem);
    return this;
  }

  /**
   * A relationship between this product offering and other product offerings.
   * @return productOfferingRelationship
  */
  @Valid 
  @Schema(name = "productOfferingRelationship", description = "A relationship between this product offering and other product offerings.", required = false)
  public List<ProductOfferingRelationship> getProductOfferingRelationship() {
    return productOfferingRelationship;
  }

  public void setProductOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
  }

  public ProductOffering productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOffering addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  /**
   * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
   * @return productOfferingTerm
  */
  @Valid 
  @Schema(name = "productOfferingTerm", description = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.", required = false)
  public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOffering productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
  */
  @Valid 
  @Schema(name = "productSpecification", required = false)
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductOffering resourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  /**
   * Get resourceCandidate
   * @return resourceCandidate
  */
  @Valid 
  @Schema(name = "resourceCandidate", required = false)
  public ResourceCandidateRef getResourceCandidate() {
    return resourceCandidate;
  }

  public void setResourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  public ProductOffering serviceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  /**
   * Get serviceCandidate
   * @return serviceCandidate
  */
  @Valid 
  @Schema(name = "serviceCandidate", required = false)
  public ServiceCandidateRef getServiceCandidate() {
    return serviceCandidate;
  }

  public void setServiceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }

  public ProductOffering serviceLevelAgreement(SLARef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
    return this;
  }

  /**
   * Get serviceLevelAgreement
   * @return serviceLevelAgreement
  */
  @Valid 
  @Schema(name = "serviceLevelAgreement", required = false)
  public SLARef getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }

  public void setServiceLevelAgreement(SLARef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
  }

  public ProductOffering validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", required = false)
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductOffering atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", required = false)
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public ProductOffering atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", required = false)
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public ProductOffering atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class Extensible name", required = false)
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOffering productOffering = (ProductOffering) o;
    return Objects.equals(this.id, productOffering.id) &&
        Objects.equals(this.href, productOffering.href) &&
        Objects.equals(this.description, productOffering.description) &&
        Objects.equals(this.isBundle, productOffering.isBundle) &&
        Objects.equals(this.isSellable, productOffering.isSellable) &&
        Objects.equals(this.lastUpdate, productOffering.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOffering.lifecycleStatus) &&
        Objects.equals(this.name, productOffering.name) &&
        Objects.equals(this.statusReason, productOffering.statusReason) &&
        Objects.equals(this.version, productOffering.version) &&
        Objects.equals(this.agreement, productOffering.agreement) &&
        Objects.equals(this.attachment, productOffering.attachment) &&
        Objects.equals(this.bundledProductOffering, productOffering.bundledProductOffering) &&
        Objects.equals(this.category, productOffering.category) &&
        Objects.equals(this.channel, productOffering.channel) &&
        Objects.equals(this.marketSegment, productOffering.marketSegment) &&
        Objects.equals(this.place, productOffering.place) &&
        Objects.equals(this.prodSpecCharValueUse, productOffering.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingPrice, productOffering.productOfferingPrice) &&
        Objects.equals(this.productOfferingRelationship, productOffering.productOfferingRelationship) &&
        Objects.equals(this.productOfferingTerm, productOffering.productOfferingTerm) &&
        Objects.equals(this.productSpecification, productOffering.productSpecification) &&
        Objects.equals(this.resourceCandidate, productOffering.resourceCandidate) &&
        Objects.equals(this.serviceCandidate, productOffering.serviceCandidate) &&
        Objects.equals(this.serviceLevelAgreement, productOffering.serviceLevelAgreement) &&
        Objects.equals(this.validFor, productOffering.validFor) &&
        Objects.equals(this.atBaseType, productOffering.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productOffering.atSchemaLocation) &&
        Objects.equals(this.atType, productOffering.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, isSellable, lastUpdate, lifecycleStatus, name, statusReason, version, agreement, attachment, bundledProductOffering, category, channel, marketSegment, place, prodSpecCharValueUse, productOfferingPrice, productOfferingRelationship, productOfferingTerm, productSpecification, resourceCandidate, serviceCandidate, serviceLevelAgreement, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOffering {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isSellable: ").append(toIndentedString(isSellable)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productOfferingRelationship: ").append(toIndentedString(productOfferingRelationship)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
    sb.append("    serviceLevelAgreement: ").append(toIndentedString(serviceLevelAgreement)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

