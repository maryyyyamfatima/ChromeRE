package com.google.android.libraries.lens.sdk.intent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C0907Gz1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LensImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0907Gz1();
    public final Bundle a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public LensImage(Uri uri) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putParcelable("BitmapUri", uri);
    }

    public LensImage(Uri uri, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putParcelable("BitmapUri", uri);
        bundle.putString("PageUrl", null);
        bundle.putString("PageDomain", str);
        bundle.putString("SrcUrl", str2);
        bundle.putString("TitleOrAltText", str3);
    }

    public LensImage(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.a = readBundle;
        if (readBundle != null) {
            readBundle.getString("FifeUrl");
            readBundle.getString("PageUrl");
            readBundle.getString("PageDomain");
            readBundle.getString("SrcUrl");
            readBundle.getString("TitleOrAltText");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
