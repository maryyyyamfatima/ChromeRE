package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C12251zq0;
import defpackage.RT2;
import defpackage.W82;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C12251zq0();
    public final DocumentSection[] a;
    public final String g;
    public final boolean h;
    public final Account i;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.g = str;
        this.h = z;
        this.i = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.r(parcel, 1, this.a, i);
        RT2.o(parcel, 2, this.g);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.h ? 1 : 0);
        RT2.n(parcel, 4, this.i, i);
        RT2.b(a, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, Boolean.valueOf(this.h), this.i, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DocumentContents)) {
            return false;
        }
        DocumentContents documentContents = (DocumentContents) obj;
        return W82.a(this.g, documentContents.g) && W82.a(Boolean.valueOf(this.h), Boolean.valueOf(documentContents.h)) && W82.a(this.i, documentContents.i) && Arrays.equals(this.a, documentContents.a);
    }
}
