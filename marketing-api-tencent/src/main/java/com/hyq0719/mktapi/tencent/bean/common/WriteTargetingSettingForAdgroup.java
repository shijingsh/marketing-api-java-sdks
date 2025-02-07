/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 定向详细设置
 */
public class WriteTargetingSettingForAdgroup implements IBean {
  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("education")
  private List<String> education = null;

  @SerializedName("marital_status")
  private List<String> maritalStatus = null;

  @SerializedName("working_status")
  private List<String> workingStatus = null;

  @SerializedName("geo_location")
  private GeoLocations geoLocation = null;

  @SerializedName("user_os")
  private List<String> userOs = null;

  @SerializedName("new_device")
  private List<String> newDevice = null;

  @SerializedName("device_price")
  private List<String> devicePrice = null;

  @SerializedName("device_brand_model")
  private DeviceBrandModel deviceBrandModel = null;

  @SerializedName("network_type")
  private List<String> networkType = null;

  @SerializedName("network_operator")
  private List<String> networkOperator = null;

  @SerializedName("network_scene")
  private List<String> networkScene = null;

  @SerializedName("dressing_index")
  private List<String> dressingIndex = null;

  @SerializedName("uv_index")
  private List<String> uvIndex = null;

  @SerializedName("makeup_index")
  private List<String> makeupIndex = null;

  @SerializedName("climate")
  private List<String> climate = null;

  @SerializedName("temperature")
  private List<TemperatureStruct> temperature = null;

  @SerializedName("air_quality_index")
  private List<String> airQualityIndex = null;

  @SerializedName("app_install_status")
  private List<String> appInstallStatus = null;

  @SerializedName("consumption_status")
  private List<String> consumptionStatus = null;

  @SerializedName("game_consumption_level")
  private List<String> gameConsumptionLevel = null;

  @SerializedName("residential_community_price")
  private List<ResidentialCommunityPriceStruct> residentialCommunityPrice = null;

  @SerializedName("financial_situation")
  private List<String> financialSituation = null;

  @SerializedName("consumption_type")
  private List<String> consumptionType = null;

  @SerializedName("wechat_ad_behavior")
  private WechatAdBehavior wechatAdBehavior = null;

  @SerializedName("custom_audience")
  private List<Long> customAudience = null;

  @SerializedName("excluded_custom_audience")
  private List<Long> excludedCustomAudience = null;

  @SerializedName("behavior_or_interest")
  private BehaviorOrInterest behaviorOrInterest = null;

  @SerializedName("wechat_official_account_category")
  private List<Long> wechatOfficialAccountCategory = null;

  @SerializedName("mobile_union_category")
  private List<Long> mobileUnionCategory = null;

  @SerializedName("mini_game_qq_status")
  private List<String> miniGameQqStatus = null;

  @SerializedName("excluded_converted_audience")
  private ExcludedConvertedAudienceStruct excludedConvertedAudience = null;

  public WriteTargetingSettingForAdgroup age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public WriteTargetingSettingForAdgroup addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public WriteTargetingSettingForAdgroup gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public WriteTargetingSettingForAdgroup addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public WriteTargetingSettingForAdgroup education(List<String> education) {
    this.education = education;
    return this;
  }

  public WriteTargetingSettingForAdgroup addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  public WriteTargetingSettingForAdgroup maritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  public WriteTargetingSettingForAdgroup addMaritalStatusItem(String maritalStatusItem) {
    if (this.maritalStatus == null) {
      this.maritalStatus = new ArrayList<String>();
    }
    this.maritalStatus.add(maritalStatusItem);
    return this;
  }

  /**
   * Get maritalStatus
   *
   * @return maritalStatus
   */
  public List<String> getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(List<String> maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public WriteTargetingSettingForAdgroup workingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
    return this;
  }

  public WriteTargetingSettingForAdgroup addWorkingStatusItem(String workingStatusItem) {
    if (this.workingStatus == null) {
      this.workingStatus = new ArrayList<String>();
    }
    this.workingStatus.add(workingStatusItem);
    return this;
  }

  /**
   * Get workingStatus
   *
   * @return workingStatus
   */
  public List<String> getWorkingStatus() {
    return workingStatus;
  }

  public void setWorkingStatus(List<String> workingStatus) {
    this.workingStatus = workingStatus;
  }

  public WriteTargetingSettingForAdgroup geoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

  /**
   * Get geoLocation
   *
   * @return geoLocation
   */
  public GeoLocations getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocations geoLocation) {
    this.geoLocation = geoLocation;
  }

  public WriteTargetingSettingForAdgroup userOs(List<String> userOs) {
    this.userOs = userOs;
    return this;
  }

  public WriteTargetingSettingForAdgroup addUserOsItem(String userOsItem) {
    if (this.userOs == null) {
      this.userOs = new ArrayList<String>();
    }
    this.userOs.add(userOsItem);
    return this;
  }

  /**
   * Get userOs
   *
   * @return userOs
   */
  public List<String> getUserOs() {
    return userOs;
  }

  public void setUserOs(List<String> userOs) {
    this.userOs = userOs;
  }

  public WriteTargetingSettingForAdgroup newDevice(List<String> newDevice) {
    this.newDevice = newDevice;
    return this;
  }

  public WriteTargetingSettingForAdgroup addNewDeviceItem(String newDeviceItem) {
    if (this.newDevice == null) {
      this.newDevice = new ArrayList<String>();
    }
    this.newDevice.add(newDeviceItem);
    return this;
  }

  /**
   * Get newDevice
   *
   * @return newDevice
   */
  public List<String> getNewDevice() {
    return newDevice;
  }

  public void setNewDevice(List<String> newDevice) {
    this.newDevice = newDevice;
  }

  public WriteTargetingSettingForAdgroup devicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
    return this;
  }

  public WriteTargetingSettingForAdgroup addDevicePriceItem(String devicePriceItem) {
    if (this.devicePrice == null) {
      this.devicePrice = new ArrayList<String>();
    }
    this.devicePrice.add(devicePriceItem);
    return this;
  }

  /**
   * Get devicePrice
   *
   * @return devicePrice
   */
  public List<String> getDevicePrice() {
    return devicePrice;
  }

  public void setDevicePrice(List<String> devicePrice) {
    this.devicePrice = devicePrice;
  }

  public WriteTargetingSettingForAdgroup deviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
    return this;
  }

  /**
   * Get deviceBrandModel
   *
   * @return deviceBrandModel
   */
  public DeviceBrandModel getDeviceBrandModel() {
    return deviceBrandModel;
  }

  public void setDeviceBrandModel(DeviceBrandModel deviceBrandModel) {
    this.deviceBrandModel = deviceBrandModel;
  }

  public WriteTargetingSettingForAdgroup networkType(List<String> networkType) {
    this.networkType = networkType;
    return this;
  }

  public WriteTargetingSettingForAdgroup addNetworkTypeItem(String networkTypeItem) {
    if (this.networkType == null) {
      this.networkType = new ArrayList<String>();
    }
    this.networkType.add(networkTypeItem);
    return this;
  }

  /**
   * Get networkType
   *
   * @return networkType
   */
  public List<String> getNetworkType() {
    return networkType;
  }

  public void setNetworkType(List<String> networkType) {
    this.networkType = networkType;
  }

  public WriteTargetingSettingForAdgroup networkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
    return this;
  }

  public WriteTargetingSettingForAdgroup addNetworkOperatorItem(String networkOperatorItem) {
    if (this.networkOperator == null) {
      this.networkOperator = new ArrayList<String>();
    }
    this.networkOperator.add(networkOperatorItem);
    return this;
  }

  /**
   * Get networkOperator
   *
   * @return networkOperator
   */
  public List<String> getNetworkOperator() {
    return networkOperator;
  }

  public void setNetworkOperator(List<String> networkOperator) {
    this.networkOperator = networkOperator;
  }

  public WriteTargetingSettingForAdgroup networkScene(List<String> networkScene) {
    this.networkScene = networkScene;
    return this;
  }

  public WriteTargetingSettingForAdgroup addNetworkSceneItem(String networkSceneItem) {
    if (this.networkScene == null) {
      this.networkScene = new ArrayList<String>();
    }
    this.networkScene.add(networkSceneItem);
    return this;
  }

  /**
   * Get networkScene
   *
   * @return networkScene
   */
  public List<String> getNetworkScene() {
    return networkScene;
  }

  public void setNetworkScene(List<String> networkScene) {
    this.networkScene = networkScene;
  }

  public WriteTargetingSettingForAdgroup dressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
    return this;
  }

  public WriteTargetingSettingForAdgroup addDressingIndexItem(String dressingIndexItem) {
    if (this.dressingIndex == null) {
      this.dressingIndex = new ArrayList<String>();
    }
    this.dressingIndex.add(dressingIndexItem);
    return this;
  }

  /**
   * Get dressingIndex
   *
   * @return dressingIndex
   */
  public List<String> getDressingIndex() {
    return dressingIndex;
  }

  public void setDressingIndex(List<String> dressingIndex) {
    this.dressingIndex = dressingIndex;
  }

  public WriteTargetingSettingForAdgroup uvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
    return this;
  }

  public WriteTargetingSettingForAdgroup addUvIndexItem(String uvIndexItem) {
    if (this.uvIndex == null) {
      this.uvIndex = new ArrayList<String>();
    }
    this.uvIndex.add(uvIndexItem);
    return this;
  }

  /**
   * Get uvIndex
   *
   * @return uvIndex
   */
  public List<String> getUvIndex() {
    return uvIndex;
  }

  public void setUvIndex(List<String> uvIndex) {
    this.uvIndex = uvIndex;
  }

  public WriteTargetingSettingForAdgroup makeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
    return this;
  }

  public WriteTargetingSettingForAdgroup addMakeupIndexItem(String makeupIndexItem) {
    if (this.makeupIndex == null) {
      this.makeupIndex = new ArrayList<String>();
    }
    this.makeupIndex.add(makeupIndexItem);
    return this;
  }

  /**
   * Get makeupIndex
   *
   * @return makeupIndex
   */
  public List<String> getMakeupIndex() {
    return makeupIndex;
  }

  public void setMakeupIndex(List<String> makeupIndex) {
    this.makeupIndex = makeupIndex;
  }

  public WriteTargetingSettingForAdgroup climate(List<String> climate) {
    this.climate = climate;
    return this;
  }

  public WriteTargetingSettingForAdgroup addClimateItem(String climateItem) {
    if (this.climate == null) {
      this.climate = new ArrayList<String>();
    }
    this.climate.add(climateItem);
    return this;
  }

  /**
   * Get climate
   *
   * @return climate
   */
  public List<String> getClimate() {
    return climate;
  }

  public void setClimate(List<String> climate) {
    this.climate = climate;
  }

  public WriteTargetingSettingForAdgroup temperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
    return this;
  }

  public WriteTargetingSettingForAdgroup addTemperatureItem(TemperatureStruct temperatureItem) {
    if (this.temperature == null) {
      this.temperature = new ArrayList<TemperatureStruct>();
    }
    this.temperature.add(temperatureItem);
    return this;
  }

  /**
   * Get temperature
   *
   * @return temperature
   */
  public List<TemperatureStruct> getTemperature() {
    return temperature;
  }

  public void setTemperature(List<TemperatureStruct> temperature) {
    this.temperature = temperature;
  }

  public WriteTargetingSettingForAdgroup airQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
    return this;
  }

  public WriteTargetingSettingForAdgroup addAirQualityIndexItem(String airQualityIndexItem) {
    if (this.airQualityIndex == null) {
      this.airQualityIndex = new ArrayList<String>();
    }
    this.airQualityIndex.add(airQualityIndexItem);
    return this;
  }

  /**
   * Get airQualityIndex
   *
   * @return airQualityIndex
   */
  public List<String> getAirQualityIndex() {
    return airQualityIndex;
  }

  public void setAirQualityIndex(List<String> airQualityIndex) {
    this.airQualityIndex = airQualityIndex;
  }

  public WriteTargetingSettingForAdgroup appInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
    return this;
  }

  public WriteTargetingSettingForAdgroup addAppInstallStatusItem(String appInstallStatusItem) {
    if (this.appInstallStatus == null) {
      this.appInstallStatus = new ArrayList<String>();
    }
    this.appInstallStatus.add(appInstallStatusItem);
    return this;
  }

  /**
   * Get appInstallStatus
   *
   * @return appInstallStatus
   */
  public List<String> getAppInstallStatus() {
    return appInstallStatus;
  }

  public void setAppInstallStatus(List<String> appInstallStatus) {
    this.appInstallStatus = appInstallStatus;
  }

  public WriteTargetingSettingForAdgroup consumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
    return this;
  }

  public WriteTargetingSettingForAdgroup addConsumptionStatusItem(String consumptionStatusItem) {
    if (this.consumptionStatus == null) {
      this.consumptionStatus = new ArrayList<String>();
    }
    this.consumptionStatus.add(consumptionStatusItem);
    return this;
  }

  /**
   * Get consumptionStatus
   *
   * @return consumptionStatus
   */
  public List<String> getConsumptionStatus() {
    return consumptionStatus;
  }

  public void setConsumptionStatus(List<String> consumptionStatus) {
    this.consumptionStatus = consumptionStatus;
  }

  public WriteTargetingSettingForAdgroup gameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
    return this;
  }

  public WriteTargetingSettingForAdgroup addGameConsumptionLevelItem(
    String gameConsumptionLevelItem) {
    if (this.gameConsumptionLevel == null) {
      this.gameConsumptionLevel = new ArrayList<String>();
    }
    this.gameConsumptionLevel.add(gameConsumptionLevelItem);
    return this;
  }

  /**
   * Get gameConsumptionLevel
   *
   * @return gameConsumptionLevel
   */
  public List<String> getGameConsumptionLevel() {
    return gameConsumptionLevel;
  }

  public void setGameConsumptionLevel(List<String> gameConsumptionLevel) {
    this.gameConsumptionLevel = gameConsumptionLevel;
  }

  public WriteTargetingSettingForAdgroup residentialCommunityPrice(
    List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
    return this;
  }

  public WriteTargetingSettingForAdgroup addResidentialCommunityPriceItem(
    ResidentialCommunityPriceStruct residentialCommunityPriceItem) {
    if (this.residentialCommunityPrice == null) {
      this.residentialCommunityPrice = new ArrayList<ResidentialCommunityPriceStruct>();
    }
    this.residentialCommunityPrice.add(residentialCommunityPriceItem);
    return this;
  }

  /**
   * Get residentialCommunityPrice
   *
   * @return residentialCommunityPrice
   */
  public List<ResidentialCommunityPriceStruct> getResidentialCommunityPrice() {
    return residentialCommunityPrice;
  }

  public void setResidentialCommunityPrice(
    List<ResidentialCommunityPriceStruct> residentialCommunityPrice) {
    this.residentialCommunityPrice = residentialCommunityPrice;
  }

  public WriteTargetingSettingForAdgroup financialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
    return this;
  }

  public WriteTargetingSettingForAdgroup addFinancialSituationItem(String financialSituationItem) {
    if (this.financialSituation == null) {
      this.financialSituation = new ArrayList<String>();
    }
    this.financialSituation.add(financialSituationItem);
    return this;
  }

  /**
   * Get financialSituation
   *
   * @return financialSituation
   */
  public List<String> getFinancialSituation() {
    return financialSituation;
  }

  public void setFinancialSituation(List<String> financialSituation) {
    this.financialSituation = financialSituation;
  }

  public WriteTargetingSettingForAdgroup consumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
    return this;
  }

  public WriteTargetingSettingForAdgroup addConsumptionTypeItem(String consumptionTypeItem) {
    if (this.consumptionType == null) {
      this.consumptionType = new ArrayList<String>();
    }
    this.consumptionType.add(consumptionTypeItem);
    return this;
  }

  /**
   * Get consumptionType
   *
   * @return consumptionType
   */
  public List<String> getConsumptionType() {
    return consumptionType;
  }

  public void setConsumptionType(List<String> consumptionType) {
    this.consumptionType = consumptionType;
  }

  public WriteTargetingSettingForAdgroup wechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
    return this;
  }

  /**
   * Get wechatAdBehavior
   *
   * @return wechatAdBehavior
   */
  public WechatAdBehavior getWechatAdBehavior() {
    return wechatAdBehavior;
  }

  public void setWechatAdBehavior(WechatAdBehavior wechatAdBehavior) {
    this.wechatAdBehavior = wechatAdBehavior;
  }

  public WriteTargetingSettingForAdgroup customAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
    return this;
  }

  public WriteTargetingSettingForAdgroup addCustomAudienceItem(Long customAudienceItem) {
    if (this.customAudience == null) {
      this.customAudience = new ArrayList<Long>();
    }
    this.customAudience.add(customAudienceItem);
    return this;
  }

  /**
   * Get customAudience
   *
   * @return customAudience
   */
  public List<Long> getCustomAudience() {
    return customAudience;
  }

  public void setCustomAudience(List<Long> customAudience) {
    this.customAudience = customAudience;
  }

  public WriteTargetingSettingForAdgroup excludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
    return this;
  }

  public WriteTargetingSettingForAdgroup addExcludedCustomAudienceItem(
    Long excludedCustomAudienceItem) {
    if (this.excludedCustomAudience == null) {
      this.excludedCustomAudience = new ArrayList<Long>();
    }
    this.excludedCustomAudience.add(excludedCustomAudienceItem);
    return this;
  }

  /**
   * Get excludedCustomAudience
   *
   * @return excludedCustomAudience
   */
  public List<Long> getExcludedCustomAudience() {
    return excludedCustomAudience;
  }

  public void setExcludedCustomAudience(List<Long> excludedCustomAudience) {
    this.excludedCustomAudience = excludedCustomAudience;
  }

  public WriteTargetingSettingForAdgroup behaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
    return this;
  }

  /**
   * Get behaviorOrInterest
   *
   * @return behaviorOrInterest
   */
  public BehaviorOrInterest getBehaviorOrInterest() {
    return behaviorOrInterest;
  }

  public void setBehaviorOrInterest(BehaviorOrInterest behaviorOrInterest) {
    this.behaviorOrInterest = behaviorOrInterest;
  }

  public WriteTargetingSettingForAdgroup wechatOfficialAccountCategory(
    List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
    return this;
  }

  public WriteTargetingSettingForAdgroup addWechatOfficialAccountCategoryItem(
    Long wechatOfficialAccountCategoryItem) {
    if (this.wechatOfficialAccountCategory == null) {
      this.wechatOfficialAccountCategory = new ArrayList<Long>();
    }
    this.wechatOfficialAccountCategory.add(wechatOfficialAccountCategoryItem);
    return this;
  }

  /**
   * Get wechatOfficialAccountCategory
   *
   * @return wechatOfficialAccountCategory
   */
  public List<Long> getWechatOfficialAccountCategory() {
    return wechatOfficialAccountCategory;
  }

  public void setWechatOfficialAccountCategory(List<Long> wechatOfficialAccountCategory) {
    this.wechatOfficialAccountCategory = wechatOfficialAccountCategory;
  }

  public WriteTargetingSettingForAdgroup mobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
    return this;
  }

  public WriteTargetingSettingForAdgroup addMobileUnionCategoryItem(Long mobileUnionCategoryItem) {
    if (this.mobileUnionCategory == null) {
      this.mobileUnionCategory = new ArrayList<Long>();
    }
    this.mobileUnionCategory.add(mobileUnionCategoryItem);
    return this;
  }

  /**
   * Get mobileUnionCategory
   *
   * @return mobileUnionCategory
   */
  public List<Long> getMobileUnionCategory() {
    return mobileUnionCategory;
  }

  public void setMobileUnionCategory(List<Long> mobileUnionCategory) {
    this.mobileUnionCategory = mobileUnionCategory;
  }

  public WriteTargetingSettingForAdgroup miniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
    return this;
  }

  public WriteTargetingSettingForAdgroup addMiniGameQqStatusItem(String miniGameQqStatusItem) {
    if (this.miniGameQqStatus == null) {
      this.miniGameQqStatus = new ArrayList<String>();
    }
    this.miniGameQqStatus.add(miniGameQqStatusItem);
    return this;
  }

  /**
   * Get miniGameQqStatus
   *
   * @return miniGameQqStatus
   */
  public List<String> getMiniGameQqStatus() {
    return miniGameQqStatus;
  }

  public void setMiniGameQqStatus(List<String> miniGameQqStatus) {
    this.miniGameQqStatus = miniGameQqStatus;
  }

  public WriteTargetingSettingForAdgroup excludedConvertedAudience(
    ExcludedConvertedAudienceStruct excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
    return this;
  }

  /**
   * Get excludedConvertedAudience
   *
   * @return excludedConvertedAudience
   */
  public ExcludedConvertedAudienceStruct getExcludedConvertedAudience() {
    return excludedConvertedAudience;
  }

  public void setExcludedConvertedAudience(
    ExcludedConvertedAudienceStruct excludedConvertedAudience) {
    this.excludedConvertedAudience = excludedConvertedAudience;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
