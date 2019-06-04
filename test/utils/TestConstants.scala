package utils

import model._

object TestConstants {
  val testContineUrl = "continueUrl"

  object Lookup {
    val title = Some("lookupTitle")
    val heading = Some("lookupHeading")
    val filter = Some("filterLabel")
    val postcode = Some("postcodeLabel")
    val submit = Some("submitLabel")
    val limitExceeded = Some("resultsLimitExceeded")
    val noResultsFound = Some("noResultsFound")
    val enterManually = Some("enterAddressManually")
  }

  val fullV1JourneyConfig = JourneyConfig(
    continueUrl = testContineUrl,
    lookupPage = Some(LookupPage(Lookup.title, Lookup.heading, Lookup.filter, Lookup.postcode, Lookup.submit,
      Lookup.limitExceeded, Lookup.noResultsFound, Lookup.enterManually)),
    selectPage = ???,
    confirmPage = ???,
    editPage = ???,
    homeNavHref = ???,
    navTitle = ???,
    additionalStylesheetUrl = ???,
    showPhaseBanner = ???,
    alphaPhase = ???,
    phaseFeedbackLink = ???,
    phaseBannerHtml = ???,
    showBackButtons = ???,
    includeHMRCBranding = ???,
    deskProServiceName = ???,
    allowedCountryCodes = ???,
    timeout = ???,
    ukMode = ???
  )

  val fullV2JourneyLabelsEn = Some(JourneyLabels(
    en = Some(LanguageLabels(
      appLevelLabels = ???,
      selectPageLabels = ???,
      lookupPageLabels = Some(LookupPageLabels(Lookup.title, Lookup.heading, Lookup.filter, Lookup.postcode,
        Lookup.submit, Lookup.noResultsFound, Lookup.limitExceeded, Lookup.enterManually)),
      editPageLabels = ???,
      confirmPageLabels = ???
    ))
  ))

  val fullV2JourneyConfig = JourneyConfigV2(2, ???, fullV2JourneyLabelsEn)
}
