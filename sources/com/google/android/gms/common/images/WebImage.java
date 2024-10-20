package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.Tm4;
import defpackage.W82;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new Tm4();
    public final int a;
    public final Uri g;
    public final int h;
    public final int i;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.g = uri;
        this.h = i2;
        this.i = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.n(parcel, 2, this.g, i);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.i);
        RT2.b(a, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WebImage(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r2 = 1
            r4.<init>(r2, r0, r1, r5)
            if (r0 == 0) goto L32
            if (r1 < 0) goto L2a
            if (r5 < 0) goto L2a
            return
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "width and height must not be negative"
            r5.<init>(r0)
            throw r5
        L32:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "url cannot be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.h), Integer.valueOf(this.i), this.g.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return W82.a(this.g, webImage.g) && this.h == webImage.h && this.i == webImage.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
