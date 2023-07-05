package com.miniorange.twofactor.jenkins.DTO;

public class MoOtpOverEmailDto {

  Boolean isEnabled;
  String senderEmailAddress;

  public MoOtpOverEmailDto(Boolean isEnabled, String senderEmailAddress) {
    this.isEnabled = isEnabled;
    this.senderEmailAddress = senderEmailAddress;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public String getSenderEmailAddress() {
    return senderEmailAddress;
  }
}
