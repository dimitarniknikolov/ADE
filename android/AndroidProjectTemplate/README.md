3Plenish Android Application
=========

3plenish is an application that aims ...

## Technical info
* support Android handheld devices (without specific design for tablets)
* support only portrait orientation
* android:minSdkVersion="14"

## Project Setup
* Import all related libraries from [Libraries](http://gitlab.mentormate.bg/3plenish/3plenish-android/tree/master/Libraries) directory in the repository
* Enable project specific settings
    * [android_formatter.xml](http://gitlab.mentormate.bg/3plenish/3plenish-android/blob/master/ProjectSetup/android_formatter.xml) - ProjectProperties/Java Code Style/Formatter 
    * [android.importorder](http://gitlab.mentormate.bg/3plenish/3plenish-android/blob/master/ProjectSetup/android.importorder) - ProjectProperties/Java Code Style/Orginize Imports
    * Save Actions - ProjectProperties/Java Editor/Save Actions

*see the files in [ProjectSetup](http://gitlab.mentormate.bg/3plenish/3plenish-android/tree/master/ProjectSetup) directory of the repository

## Custom Views
* [RobotoTextView*](http://gitlab.mentormate.bg/3plenish/3plenish-android/blob/master/3plenish/src/com/android/threeplenish/ui/widget/RobotoTextView.java)
* [RobotoEditText*](http://gitlab.mentormate.bg/3plenish/3plenish-android/blob/master/3plenish/src/com/android/threeplenish/ui/widget/RobotoEditText.java)
* [RobotoButton*](http://gitlab.mentormate.bg/3plenish/3plenish-android/blob/master/3plenish/src/com/android/threeplenish/ui/widget/RobotoButton.java)

*default Roboto typeface is Roboto-Light. To set a new typeface use app:roboto_typeface="@string/Roboto_Regular" for example.

## Don't forget
* put in Part.java, InventoryItem.java and Image.java:
    `@SerializedName("id")
    private String serverId;
    private Boolean isSynced = true;`
    That maps the id Json field from the server to the serverId in the database.
* in Part.getImages():
    `List<Image> imagesNew = targetDao._queryPart_Images(serverId);`
    instead of
    `List<Image> imagesNew = targetDao._queryPart_Images(_id);`
    That makes the relation Part-Image (oneToMany) to be on serverId column in tplenish_parts dbTable.

## Used Libraries
* [AppCompat](http://developer.android.com/tools/support-library/features.html)
* [GreenDao](http://greendao-orm.com/)
* [Google-Play-Services-Lib](http://developer.android.com/google/play-services/index.html) ([used MapFragment](http://developer.android.com/reference/com/google/android/gms/maps/MapFragment.html))
* [PullToRefresh-ABC](https://github.com/chrisbanes/ActionBar-PullToRefresh)
* PullToRefresh-main
* [SmoothProgressBar](https://github.com/castorflex/SmoothProgressBar)
* [ViewPagerIndicator](https://github.com/JakeWharton/Android-ViewPagerIndicator)
* [Volley](https://android.googlesource.com/platform/frameworks/volley/ "Volley")
* [Zxing](https://github.com/zxing/zxing) *NOTE set in Project Settings / Java Compiler / (under JDK Compliance) Compiler compliance level 1.7
 

## 3plenish on GooglePlay
Not available yet :(