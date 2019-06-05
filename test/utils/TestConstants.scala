package utils

import model._

object TestConstants {
  val testContinueUrl = "continueUrl"
  val testHomeNavRef = Some("homeNavRef")
  val testNavTitle = Some("navTitle")
  val testAdditionalStylesheetUrl = Some("additionalStylesheetUrl")
  val testShowPhaseBanner = Some(true)
  val testAlphaPhase = Some(true)
  val testPhaseFeedbackLink = Some("phaseFeedbackLink")
  val testPhaseBannerHtml = Some("phaseBannerHtml")
  val testShowBackButtons = Some(true)
  val testIncludeHmrcBranding = Some(true)
  val testDeskproServiceName = Some("deskproServiceName")
  val testAllowedCountryCodes = Some(Set("GB", "UK"))
  val testTimeoutAmount = 20
  val testTimeoutUrl = "timeoutUrl"
  val testUkMode = Some(true)

  object Lookup {
    val title = Some("lookupTitle")
    val heading = Some("lookupHeading")
    val filter = Some("filterLabel")
    val postcode = Some("postcodeLabel")
    val submit = Some("lookupSubmitLabel")
    val limitExceeded = Some("resultsLimitExceeded")
    val noResultsFound = Some("noResultsFound")
    val enterManually = Some("enterAddressManually")
  }

  object Select {
    val title = Some("selectTitle")
    val heading = Some("selectHeading")
    val headingWithPostcode = Some("selectHeadingWithPostcode")
    val proposalListLabel = Some("proposalListLabel")
    val submitLabel = Some("selectSubmitLabel")
    val proposalListLimit = Some(50)
    val showSearchagainLink = Some(true)
    val searchAgainLinkText = Some("selectSearchAgainLinkText")
    val editAddressLinkText = Some("editAddressLinkText")
  }

  object Edit {
    val title = Some("editTitle")
    val heading = Some("editHeading")
    val line1 = Some("editLine1")
    val line2 = Some("editLine2")
    val line3 = Some("editLine3")
    val town = Some("editLine4")
    val postcode = Some("editPostcode")
    val country = Some("editCountry")
    val submit = Some("editSubmit")
  }

  object Confirm {
    val title = Some("confirmTitle")
    val heading = Some("confirmHeading")
    val showSubHeading = Some(true)
    val infoSubheading = Some("infoSubHeading")
    val infoMessage = Some("infoMessage")
    val submitLabel = Some("confirmSubmitLabel")
    val showSearchAgainLink = Some(true)
    val searchAgainLinkText = Some("confirmSearchAgainLinkText")
    val showChangeLink = Some(true)
    val changeLinkText = Some("changeLinkText")
    val showConfirmChangeLink = Some(true)
    val confirmChangeText = Some("confirmChangeText")
  }

  val fullV1LookupConfig = Some(LookupPage(Lookup.title, Lookup.heading, Lookup.filter, Lookup.postcode, Lookup.submit,
    Lookup.limitExceeded, Lookup.noResultsFound, Lookup.enterManually))

  val fullV1SelectConfig = Some(SelectPage(Select.title, Select.heading, Select.headingWithPostcode,
    Select.proposalListLabel, Select.submitLabel, Select.proposalListLimit, Select.showSearchagainLink,
    Select.searchAgainLinkText, Select.editAddressLinkText))

  val fullV1EditConfig = Some(EditPage(Edit.title, Edit.heading, Edit.line1, Edit.line2, Edit.line3, Edit.town,
    Edit.postcode, Edit.country, Edit.submit))

  val fullV1ConfirmConfig = Some(ConfirmPage(Confirm.title, Confirm.heading, Confirm.showSubHeading, Confirm.infoSubheading,
    Confirm.infoMessage, Confirm.submitLabel, Confirm.showSearchAgainLink, Confirm.searchAgainLinkText, Confirm.showChangeLink,
    Confirm.changeLinkText, Confirm.showConfirmChangeLink, Confirm.confirmChangeText))

  val fullV1TimeoutConfig = Some(Timeout(testTimeoutAmount, testTimeoutUrl))

  val fullV1JourneyConfig = JourneyConfig(
    continueUrl = testContinueUrl,
    lookupPage = fullV1LookupConfig,
    selectPage = fullV1SelectConfig,
    confirmPage = fullV1ConfirmConfig,
    editPage = fullV1EditConfig,
    homeNavHref = testHomeNavRef,
    navTitle = testNavTitle,
    additionalStylesheetUrl = testAdditionalStylesheetUrl,
    showPhaseBanner = testShowPhaseBanner,
    alphaPhase = testAlphaPhase,
    phaseFeedbackLink = testPhaseFeedbackLink,
    phaseBannerHtml = testPhaseBannerHtml,
    showBackButtons = testShowBackButtons,
    includeHMRCBranding = testIncludeHmrcBranding,
    deskProServiceName = testDeskproServiceName,
    allowedCountryCodes = testAllowedCountryCodes,
    timeout = fullV1TimeoutConfig,
    ukMode = testUkMode
  )

  val fullV2AppLabels = Some(AppLevelLabels(testNavTitle, testPhaseBannerHtml))

  val fullV2SelectLabels = Some(SelectPageLabels(Select.title, Select.heading, Select.headingWithPostcode,
    Select.proposalListLabel, Select.submitLabel, Select.searchAgainLinkText, Select.editAddressLinkText))

  val fullV2LookupLabels = Some(LookupPageLabels(Lookup.title, Lookup.heading, Lookup.filter, Lookup.postcode,
    Lookup.submit, Lookup.noResultsFound, Lookup.limitExceeded, Lookup.enterManually))

  val fullV2EditLabels = Some(EditPageLabels(Edit.title, Edit.heading, Edit.line1, Edit.line2, Edit.line3, Edit.town,
    Edit.postcode, Edit.country, Edit.submit))

  val fullV2ConfirmLabels = Some(ConfirmPageLabels(Confirm.title, Confirm.heading, Confirm.infoSubheading,
    Confirm.infoMessage, Confirm.submitLabel, Confirm.searchAgainLinkText, Confirm.changeLinkText, Confirm.confirmChangeText))

  val fullV2SelectPageConfig = Some(SelectPageConfig(Select.proposalListLimit, Select.showSearchagainLink))

  val fullV2ConfirmPageConfig = Some(ConfirmPageConfig(Confirm.showSearchAgainLink, Confirm.showSubHeading, Confirm.showChangeLink, Confirm.showConfirmChangeLink))

  val fullV2TimeoutConfig = Some(TimeoutConfig(testTimeoutAmount, testTimeoutUrl))

  val fullV2JourneyOptions = JourneyOptions(testContinueUrl, testHomeNavRef, testAdditionalStylesheetUrl,
    testPhaseFeedbackLink, testDeskproServiceName, testShowPhaseBanner, testAlphaPhase, testShowBackButtons,
    testIncludeHmrcBranding, testUkMode, testAllowedCountryCodes, fullV2SelectPageConfig, fullV2ConfirmPageConfig,
    fullV2TimeoutConfig)

  val fullV2JourneyLabelsEn = Some(JourneyLabels(
    en = Some(LanguageLabels(
      appLevelLabels = fullV2AppLabels,
      selectPageLabels = fullV2SelectLabels,
      lookupPageLabels = fullV2LookupLabels,
      editPageLabels = fullV2EditLabels,
      confirmPageLabels = fullV2ConfirmLabels
    ))
  ))

  val fullV2JourneyConfig = JourneyConfigV2(2, fullV2JourneyOptions, fullV2JourneyLabelsEn)
}
