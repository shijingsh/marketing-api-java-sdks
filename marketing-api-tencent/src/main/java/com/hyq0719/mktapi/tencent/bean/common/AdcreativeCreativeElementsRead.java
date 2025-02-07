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
 * 创意元素
 */
public class AdcreativeCreativeElementsRead implements IBean {
  @SerializedName("image")
  private String image = null;

  @SerializedName("image2")
  private String image2 = null;

  @SerializedName("image3")
  private String image3 = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("corporate")
  private AdcreativeCorporate corporate = null;

  @SerializedName("video")
  private String video = null;

  @SerializedName("link_name_type")
  private String linkNameType = null;

  @SerializedName("image_list")
  private List<String> imageList = null;

  @SerializedName("element_story")
  private List<AdcreativeElementStoryArrayItem> elementStory = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("bottom_text")
  private String bottomText = null;

  @SerializedName("label")
  private List<CreativeLabel> label = null;

  @SerializedName("product_tags")
  private List<String> productTags = null;

  @SerializedName("logo_description")
  private String logoDescription = null;

  @SerializedName("logo")
  private String logo = null;

  @SerializedName("left_button")
  private String leftButton = null;

  @SerializedName("right_button")
  private String rightButton = null;

  @SerializedName("left_bottom_txt")
  private String leftBottomTxt = null;

  @SerializedName("animation_effect")
  private String animationEffect = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("logo_page")
  private AdcreativeLogoPage logoPage = null;

  @SerializedName("video_popup_url")
  private String videoPopupUrl = null;

  @SerializedName("video_popup_button")
  private AdcreativeVideoPopupButton videoPopupButton = null;

  @SerializedName("video_popup_button_text")
  private String videoPopupButtonText = null;

  @SerializedName("video_popup_button_url")
  private String videoPopupButtonUrl = null;

  @SerializedName("long_video1")
  private String longVideo1 = null;

  @SerializedName("long_video2")
  private String longVideo2 = null;

  @SerializedName("short_video_struct")
  private ShortVideoStruct shortVideoStruct = null;

  @SerializedName("qzone_video_page_id")
  private String qzoneVideoPageId = null;

  @SerializedName("qq")
  private String qq = null;

  @SerializedName("left_canvas")
  private String leftCanvas = null;

  @SerializedName("right_canvas")
  private String rightCanvas = null;

  @SerializedName("sun_text")
  private String sunText = null;

  @SerializedName("cloud_text")
  private String cloudText = null;

  @SerializedName("overcast_text")
  private String overcastText = null;

  @SerializedName("rain_text")
  private String rainText = null;

  @SerializedName("snow_text")
  private String snowText = null;

  @SerializedName("fog_text")
  private String fogText = null;

  @SerializedName("sand_text")
  private String sandText = null;

  @SerializedName("haze_text")
  private String hazeText = null;

  @SerializedName("labelled_img")
  private AdcreativeLabelledImg labelledImg = null;

  @SerializedName("share_img")
  private String shareImg = null;

  @SerializedName("long_video_struct")
  private LongVideoStruct longVideoStruct = null;

  @SerializedName("banner_content")
  private AdcreativeBannerContent bannerContent = null;

  @SerializedName("card_content")
  private AdcreativeCardContent cardContent = null;

  @SerializedName("brand")
  private AdCreativeBrand brand = null;

  @SerializedName("full_screen_image")
  private String fullScreenImage = null;

  @SerializedName("zip_url")
  private String zipUrl = null;

  @SerializedName("end_page")
  private AdCreativeEndPage endPage = null;

  @SerializedName("shop_image")
  private String shopImage = null;

  @SerializedName("head_line")
  private String headLine = null;

  @SerializedName("countdown_expiring_timestamp")
  private Long countdownExpiringTimestamp = null;

  public AdcreativeCreativeElementsRead image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public AdcreativeCreativeElementsRead image2(String image2) {
    this.image2 = image2;
    return this;
  }

  /**
   * Get image2
   *
   * @return image2
   */
  public String getImage2() {
    return image2;
  }

  public void setImage2(String image2) {
    this.image2 = image2;
  }

  public AdcreativeCreativeElementsRead image3(String image3) {
    this.image3 = image3;
    return this;
  }

  /**
   * Get image3
   *
   * @return image3
   */
  public String getImage3() {
    return image3;
  }

  public void setImage3(String image3) {
    this.image3 = image3;
  }

  public AdcreativeCreativeElementsRead title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdcreativeCreativeElementsRead description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdcreativeCreativeElementsRead corporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
    return this;
  }

  /**
   * Get corporate
   *
   * @return corporate
   */
  public AdcreativeCorporate getCorporate() {
    return corporate;
  }

  public void setCorporate(AdcreativeCorporate corporate) {
    this.corporate = corporate;
  }

  public AdcreativeCreativeElementsRead video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   *
   * @return video
   */
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public AdcreativeCreativeElementsRead linkNameType(String linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  public String getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(String linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativeCreativeElementsRead imageList(List<String> imageList) {
    this.imageList = imageList;
    return this;
  }

  public AdcreativeCreativeElementsRead addImageListItem(String imageListItem) {
    if (this.imageList == null) {
      this.imageList = new ArrayList<String>();
    }
    this.imageList.add(imageListItem);
    return this;
  }

  /**
   * Get imageList
   *
   * @return imageList
   */
  public List<String> getImageList() {
    return imageList;
  }

  public void setImageList(List<String> imageList) {
    this.imageList = imageList;
  }

  public AdcreativeCreativeElementsRead elementStory(
    List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
    return this;
  }

  public AdcreativeCreativeElementsRead addElementStoryItem(
    AdcreativeElementStoryArrayItem elementStoryItem) {
    if (this.elementStory == null) {
      this.elementStory = new ArrayList<AdcreativeElementStoryArrayItem>();
    }
    this.elementStory.add(elementStoryItem);
    return this;
  }

  /**
   * Get elementStory
   *
   * @return elementStory
   */
  public List<AdcreativeElementStoryArrayItem> getElementStory() {
    return elementStory;
  }

  public void setElementStory(List<AdcreativeElementStoryArrayItem> elementStory) {
    this.elementStory = elementStory;
  }

  public AdcreativeCreativeElementsRead url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdcreativeCreativeElementsRead buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   *
   * @return buttonText
   */
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public AdcreativeCreativeElementsRead bottomText(String bottomText) {
    this.bottomText = bottomText;
    return this;
  }

  /**
   * Get bottomText
   *
   * @return bottomText
   */
  public String getBottomText() {
    return bottomText;
  }

  public void setBottomText(String bottomText) {
    this.bottomText = bottomText;
  }

  public AdcreativeCreativeElementsRead label(List<CreativeLabel> label) {
    this.label = label;
    return this;
  }

  public AdcreativeCreativeElementsRead addLabelItem(CreativeLabel labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<CreativeLabel>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   */
  public List<CreativeLabel> getLabel() {
    return label;
  }

  public void setLabel(List<CreativeLabel> label) {
    this.label = label;
  }

  public AdcreativeCreativeElementsRead productTags(List<String> productTags) {
    this.productTags = productTags;
    return this;
  }

  public AdcreativeCreativeElementsRead addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<String>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

  /**
   * Get productTags
   *
   * @return productTags
   */
  public List<String> getProductTags() {
    return productTags;
  }

  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }

  public AdcreativeCreativeElementsRead logoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
    return this;
  }

  /**
   * Get logoDescription
   *
   * @return logoDescription
   */
  public String getLogoDescription() {
    return logoDescription;
  }

  public void setLogoDescription(String logoDescription) {
    this.logoDescription = logoDescription;
  }

  public AdcreativeCreativeElementsRead logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   *
   * @return logo
   */
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AdcreativeCreativeElementsRead leftButton(String leftButton) {
    this.leftButton = leftButton;
    return this;
  }

  /**
   * Get leftButton
   *
   * @return leftButton
   */
  public String getLeftButton() {
    return leftButton;
  }

  public void setLeftButton(String leftButton) {
    this.leftButton = leftButton;
  }

  public AdcreativeCreativeElementsRead rightButton(String rightButton) {
    this.rightButton = rightButton;
    return this;
  }

  /**
   * Get rightButton
   *
   * @return rightButton
   */
  public String getRightButton() {
    return rightButton;
  }

  public void setRightButton(String rightButton) {
    this.rightButton = rightButton;
  }

  public AdcreativeCreativeElementsRead leftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
    return this;
  }

  /**
   * Get leftBottomTxt
   *
   * @return leftBottomTxt
   */
  public String getLeftBottomTxt() {
    return leftBottomTxt;
  }

  public void setLeftBottomTxt(String leftBottomTxt) {
    this.leftBottomTxt = leftBottomTxt;
  }

  public AdcreativeCreativeElementsRead animationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
    return this;
  }

  /**
   * Get animationEffect
   *
   * @return animationEffect
   */
  public String getAnimationEffect() {
    return animationEffect;
  }

  public void setAnimationEffect(String animationEffect) {
    this.animationEffect = animationEffect;
  }

  public AdcreativeCreativeElementsRead phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   *
   * @return phone
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AdcreativeCreativeElementsRead caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * Get caption
   *
   * @return caption
   */
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public AdcreativeCreativeElementsRead logoPage(AdcreativeLogoPage logoPage) {
    this.logoPage = logoPage;
    return this;
  }

  /**
   * Get logoPage
   *
   * @return logoPage
   */
  public AdcreativeLogoPage getLogoPage() {
    return logoPage;
  }

  public void setLogoPage(AdcreativeLogoPage logoPage) {
    this.logoPage = logoPage;
  }

  public AdcreativeCreativeElementsRead videoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
    return this;
  }

  /**
   * Get videoPopupUrl
   *
   * @return videoPopupUrl
   */
  public String getVideoPopupUrl() {
    return videoPopupUrl;
  }

  public void setVideoPopupUrl(String videoPopupUrl) {
    this.videoPopupUrl = videoPopupUrl;
  }

  public AdcreativeCreativeElementsRead videoPopupButton(
    AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
    return this;
  }

  /**
   * Get videoPopupButton
   *
   * @return videoPopupButton
   */
  public AdcreativeVideoPopupButton getVideoPopupButton() {
    return videoPopupButton;
  }

  public void setVideoPopupButton(AdcreativeVideoPopupButton videoPopupButton) {
    this.videoPopupButton = videoPopupButton;
  }

  public AdcreativeCreativeElementsRead videoPopupButtonText(String videoPopupButtonText) {
    this.videoPopupButtonText = videoPopupButtonText;
    return this;
  }

  /**
   * Get videoPopupButtonText
   *
   * @return videoPopupButtonText
   */
  public String getVideoPopupButtonText() {
    return videoPopupButtonText;
  }

  public void setVideoPopupButtonText(String videoPopupButtonText) {
    this.videoPopupButtonText = videoPopupButtonText;
  }

  public AdcreativeCreativeElementsRead videoPopupButtonUrl(String videoPopupButtonUrl) {
    this.videoPopupButtonUrl = videoPopupButtonUrl;
    return this;
  }

  /**
   * Get videoPopupButtonUrl
   *
   * @return videoPopupButtonUrl
   */
  public String getVideoPopupButtonUrl() {
    return videoPopupButtonUrl;
  }

  public void setVideoPopupButtonUrl(String videoPopupButtonUrl) {
    this.videoPopupButtonUrl = videoPopupButtonUrl;
  }

  public AdcreativeCreativeElementsRead longVideo1(String longVideo1) {
    this.longVideo1 = longVideo1;
    return this;
  }

  /**
   * Get longVideo1
   *
   * @return longVideo1
   */
  public String getLongVideo1() {
    return longVideo1;
  }

  public void setLongVideo1(String longVideo1) {
    this.longVideo1 = longVideo1;
  }

  public AdcreativeCreativeElementsRead longVideo2(String longVideo2) {
    this.longVideo2 = longVideo2;
    return this;
  }

  /**
   * Get longVideo2
   *
   * @return longVideo2
   */
  public String getLongVideo2() {
    return longVideo2;
  }

  public void setLongVideo2(String longVideo2) {
    this.longVideo2 = longVideo2;
  }

  public AdcreativeCreativeElementsRead shortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
    return this;
  }

  /**
   * Get shortVideoStruct
   *
   * @return shortVideoStruct
   */
  public ShortVideoStruct getShortVideoStruct() {
    return shortVideoStruct;
  }

  public void setShortVideoStruct(ShortVideoStruct shortVideoStruct) {
    this.shortVideoStruct = shortVideoStruct;
  }

  public AdcreativeCreativeElementsRead qzoneVideoPageId(String qzoneVideoPageId) {
    this.qzoneVideoPageId = qzoneVideoPageId;
    return this;
  }

  /**
   * Get qzoneVideoPageId
   *
   * @return qzoneVideoPageId
   */
  public String getQzoneVideoPageId() {
    return qzoneVideoPageId;
  }

  public void setQzoneVideoPageId(String qzoneVideoPageId) {
    this.qzoneVideoPageId = qzoneVideoPageId;
  }

  public AdcreativeCreativeElementsRead qq(String qq) {
    this.qq = qq;
    return this;
  }

  /**
   * Get qq
   *
   * @return qq
   */
  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public AdcreativeCreativeElementsRead leftCanvas(String leftCanvas) {
    this.leftCanvas = leftCanvas;
    return this;
  }

  /**
   * Get leftCanvas
   *
   * @return leftCanvas
   */
  public String getLeftCanvas() {
    return leftCanvas;
  }

  public void setLeftCanvas(String leftCanvas) {
    this.leftCanvas = leftCanvas;
  }

  public AdcreativeCreativeElementsRead rightCanvas(String rightCanvas) {
    this.rightCanvas = rightCanvas;
    return this;
  }

  /**
   * Get rightCanvas
   *
   * @return rightCanvas
   */
  public String getRightCanvas() {
    return rightCanvas;
  }

  public void setRightCanvas(String rightCanvas) {
    this.rightCanvas = rightCanvas;
  }

  public AdcreativeCreativeElementsRead sunText(String sunText) {
    this.sunText = sunText;
    return this;
  }

  /**
   * Get sunText
   *
   * @return sunText
   */
  public String getSunText() {
    return sunText;
  }

  public void setSunText(String sunText) {
    this.sunText = sunText;
  }

  public AdcreativeCreativeElementsRead cloudText(String cloudText) {
    this.cloudText = cloudText;
    return this;
  }

  /**
   * Get cloudText
   *
   * @return cloudText
   */
  public String getCloudText() {
    return cloudText;
  }

  public void setCloudText(String cloudText) {
    this.cloudText = cloudText;
  }

  public AdcreativeCreativeElementsRead overcastText(String overcastText) {
    this.overcastText = overcastText;
    return this;
  }

  /**
   * Get overcastText
   *
   * @return overcastText
   */
  public String getOvercastText() {
    return overcastText;
  }

  public void setOvercastText(String overcastText) {
    this.overcastText = overcastText;
  }

  public AdcreativeCreativeElementsRead rainText(String rainText) {
    this.rainText = rainText;
    return this;
  }

  /**
   * Get rainText
   *
   * @return rainText
   */
  public String getRainText() {
    return rainText;
  }

  public void setRainText(String rainText) {
    this.rainText = rainText;
  }

  public AdcreativeCreativeElementsRead snowText(String snowText) {
    this.snowText = snowText;
    return this;
  }

  /**
   * Get snowText
   *
   * @return snowText
   */
  public String getSnowText() {
    return snowText;
  }

  public void setSnowText(String snowText) {
    this.snowText = snowText;
  }

  public AdcreativeCreativeElementsRead fogText(String fogText) {
    this.fogText = fogText;
    return this;
  }

  /**
   * Get fogText
   *
   * @return fogText
   */
  public String getFogText() {
    return fogText;
  }

  public void setFogText(String fogText) {
    this.fogText = fogText;
  }

  public AdcreativeCreativeElementsRead sandText(String sandText) {
    this.sandText = sandText;
    return this;
  }

  /**
   * Get sandText
   *
   * @return sandText
   */
  public String getSandText() {
    return sandText;
  }

  public void setSandText(String sandText) {
    this.sandText = sandText;
  }

  public AdcreativeCreativeElementsRead hazeText(String hazeText) {
    this.hazeText = hazeText;
    return this;
  }

  /**
   * Get hazeText
   *
   * @return hazeText
   */
  public String getHazeText() {
    return hazeText;
  }

  public void setHazeText(String hazeText) {
    this.hazeText = hazeText;
  }

  public AdcreativeCreativeElementsRead labelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
    return this;
  }

  /**
   * Get labelledImg
   *
   * @return labelledImg
   */
  public AdcreativeLabelledImg getLabelledImg() {
    return labelledImg;
  }

  public void setLabelledImg(AdcreativeLabelledImg labelledImg) {
    this.labelledImg = labelledImg;
  }

  public AdcreativeCreativeElementsRead shareImg(String shareImg) {
    this.shareImg = shareImg;
    return this;
  }

  /**
   * Get shareImg
   *
   * @return shareImg
   */
  public String getShareImg() {
    return shareImg;
  }

  public void setShareImg(String shareImg) {
    this.shareImg = shareImg;
  }

  public AdcreativeCreativeElementsRead longVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
    return this;
  }

  /**
   * Get longVideoStruct
   *
   * @return longVideoStruct
   */
  public LongVideoStruct getLongVideoStruct() {
    return longVideoStruct;
  }

  public void setLongVideoStruct(LongVideoStruct longVideoStruct) {
    this.longVideoStruct = longVideoStruct;
  }

  public AdcreativeCreativeElementsRead bannerContent(AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
    return this;
  }

  /**
   * Get bannerContent
   *
   * @return bannerContent
   */
  public AdcreativeBannerContent getBannerContent() {
    return bannerContent;
  }

  public void setBannerContent(AdcreativeBannerContent bannerContent) {
    this.bannerContent = bannerContent;
  }

  public AdcreativeCreativeElementsRead cardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
    return this;
  }

  /**
   * Get cardContent
   *
   * @return cardContent
   */
  public AdcreativeCardContent getCardContent() {
    return cardContent;
  }

  public void setCardContent(AdcreativeCardContent cardContent) {
    this.cardContent = cardContent;
  }

  public AdcreativeCreativeElementsRead brand(AdCreativeBrand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   *
   * @return brand
   */
  public AdCreativeBrand getBrand() {
    return brand;
  }

  public void setBrand(AdCreativeBrand brand) {
    this.brand = brand;
  }

  public AdcreativeCreativeElementsRead fullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
    return this;
  }

  /**
   * Get fullScreenImage
   *
   * @return fullScreenImage
   */
  public String getFullScreenImage() {
    return fullScreenImage;
  }

  public void setFullScreenImage(String fullScreenImage) {
    this.fullScreenImage = fullScreenImage;
  }

  public AdcreativeCreativeElementsRead zipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
    return this;
  }

  /**
   * Get zipUrl
   *
   * @return zipUrl
   */
  public String getZipUrl() {
    return zipUrl;
  }

  public void setZipUrl(String zipUrl) {
    this.zipUrl = zipUrl;
  }

  public AdcreativeCreativeElementsRead endPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
    return this;
  }

  /**
   * Get endPage
   *
   * @return endPage
   */
  public AdCreativeEndPage getEndPage() {
    return endPage;
  }

  public void setEndPage(AdCreativeEndPage endPage) {
    this.endPage = endPage;
  }

  public AdcreativeCreativeElementsRead shopImage(String shopImage) {
    this.shopImage = shopImage;
    return this;
  }

  /**
   * Get shopImage
   *
   * @return shopImage
   */
  public String getShopImage() {
    return shopImage;
  }

  public void setShopImage(String shopImage) {
    this.shopImage = shopImage;
  }

  public AdcreativeCreativeElementsRead headLine(String headLine) {
    this.headLine = headLine;
    return this;
  }

  /**
   * Get headLine
   *
   * @return headLine
   */
  public String getHeadLine() {
    return headLine;
  }

  public void setHeadLine(String headLine) {
    this.headLine = headLine;
  }

  public AdcreativeCreativeElementsRead countdownExpiringTimestamp(
    Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
    return this;
  }

  /**
   * Get countdownExpiringTimestamp
   *
   * @return countdownExpiringTimestamp
   */
  public Long getCountdownExpiringTimestamp() {
    return countdownExpiringTimestamp;
  }

  public void setCountdownExpiringTimestamp(Long countdownExpiringTimestamp) {
    this.countdownExpiringTimestamp = countdownExpiringTimestamp;
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
