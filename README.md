# Kagebili

BiliBili/Bstation patches for use with Morphe.

## ❓ About

Kagebili focuses exclusively on patches for the BiliBili/Bstation Android app. Patch requests and bug reports should relate to BiliBili/Bstation.

This is an independent project, not affiliated with or endorsed by BiliBili/Bstation or the Morphe project. Available patches and supported app versions are listed below when published.

### How to use these patches

Click the button below, or manually add this repo URL to Morphe Manager: https://github.com/Ikuradachi/Kagebili

<a href="https://morphe.software/add-source?github=Ikuradachi/Kagebili">
  <img src=".github/assets/add-to-morphe.svg" alt="Add to Morphe" height="48">
</a>

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.0.0-dev.1](https://github.com/Ikuradachi/Kagebili/releases/tag/v1.0.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;15 patches total
<details open>
<summary>📦 Bstation&nbsp;&nbsp;•&nbsp;&nbsp;15 patches</summary>
<br>

**Package name:** `com.bstar.intl`

**🎯 Supported versions:**

| 3.83.1 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Clean Me page](#clean-me-page) | Hide creator center section and selected menus (campaign, FAQs, feedback) on the Me profile page. | • Hide Creator Center<br>• Hide Campaign menu<br>• Hide FAQs menu<br>• Hide Feedback menu |
| [Debloat search landing page](#debloat-search-landing-page) | Debloats the search landing page by hiding trending searches, discovery modules, and promotional search bar hints. | • Hide trending searches<br>• Hide discovery modules<br>• Clean search bar hint |
| [Disable floating ads](#disable-floating-ads) | Disables bottom-right promotional floating advertisement overlay. |  |
| [Disable inner push banner](#disable-inner-push-banner) | Disables top slide-down promotional toast and inner-push banner notifications. |  |
| [Disable player outro unlock card](#disable-player-outro-unlock-card) | Disables video player outro unlock video guide bottom-right card. |  |
| [Disable player overlay ads](#disable-player-overlay-ads) | Disables video player in-stream bottom-right overlay ad banners. |  |
| [Disable player recommendation widget](#disable-player-recommendation-widget) | Disables fullscreen video player bottom-right recommendation widget. |  |
| [Disable player watermark](#disable-player-watermark) | Hides the top-right brand logo and copyright/premium watermark in the video player. |  |
| [Disable splash ads](#disable-splash-ads) | Disables cold-start splash advertisement loading and countdown timer. |  |
| [Disable tracking](#disable-tracking) | Disables internal Bilibili telemetry, APM profiling, TradPlus ad mediation, Firebase analytics, Crashlytics, and Facebook AppEvents. |  |
| [GmsCore support](#gmscore-support) | Uses Morphe GmsCore for Google sign-in and sign-out. |  |
| [Hide bottom navigation items](#hide-bottom-navigation-items) | Hide selected bottom navigation bar tabs (Discover, Create, Chats, Me, Shorts). | • Hide Discover tab<br>• Hide Create button (+)<br>• Hide Chats tab<br>• Hide Me tab<br>• Hide Shorts tab |
| [Hide home search bar](#hide-home-search-bar) | Hides the search bar on the Home screen. | • Hide home search bar |
| [Hide home tab bar items](#hide-home-tab-bar-items) | Hide selected horizontal tab bar items on the home screen (Featured, Plaza, Subscriptions, Anime, Shorts, Community, Campaigns). | • Hide Featured tab<br>• Hide Plaza tab<br>• Hide Campaign and Activity tabs<br>• Hide Subscriptions tab<br>• Hide Anime tab<br>• Hide Shorts tab<br>• Hide Community (Opus) tab |
| [Pure discover search bar](#pure-discover-search-bar) | Removes discover tabs and trending searches to make the Discover page a pure search bar. | • Hide discover tabs<br>• Hide trending searches |

</details>

<!-- PATCHES_END -->

### 🛠️ Building locally

- Run `./gradlew buildAndroid`
- The built patches .mpp file is found in `patches/build/libs/patches-*.mpp`
- Patch the mpp file using [Morphe-Desktop](https://github.com/MorpheApp/morphe-desktop)
  like any other patch bundle.

See the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation) for more information.

## 📜 License

Kagebili is licensed under the [GNU General Public License v3.0](LICENSE). See [NOTICE](NOTICE) for naming and branding restrictions.
