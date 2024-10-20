package org.chromium.chrome.browser.password_check;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.K20;
import java.util.Objects;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CompromisedCredential implements Parcelable {
    public static final Parcelable.Creator CREATOR = new K20();
    public final String a;
    public final GURL g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CompromisedCredential(String str, GURL gurl, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.g = gurl;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = j;
        this.o = j2;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
    }

    public String getSignonRealm() {
        return this.a;
    }

    public String getUsername() {
        return this.h;
    }

    public GURL getAssociatedUrl() {
        return this.g;
    }

    public String getPassword() {
        return this.k;
    }

    public long getLastUsedTime() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompromisedCredential compromisedCredential = (CompromisedCredential) obj;
        return this.a.equals(compromisedCredential.a) && this.g.equals(compromisedCredential.g) && this.h.equals(compromisedCredential.h) && this.i.equals(compromisedCredential.i) && this.j.equals(compromisedCredential.j) && this.k.equals(compromisedCredential.k) && this.l.equals(compromisedCredential.l) && this.m.equals(compromisedCredential.m) && this.n == compromisedCredential.n && this.o == compromisedCredential.o && this.p == compromisedCredential.p && this.q == compromisedCredential.q && this.r == compromisedCredential.r && this.s == compromisedCredential.s;
    }

    public final String toString() {
        return "CompromisedCredential{signonRealm='" + this.a + ", associatedUrl='" + this.g + "'', username='" + this.h + "', displayOrigin='" + this.i + "', displayUsername='" + this.j + "', password='" + this.k + "', passwordChangeUrl='" + this.l + "', associatedApp='" + this.m + "', creationTime=" + this.n + ". lastUsedTime=" + this.o + ", leaked=" + this.p + ", phished=" + this.q + ", hasStartableScript=" + this.r + ", hasAutoChangeButton=" + this.s + '}';
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.g.a, this.h, this.i, this.j, this.k, this.l, this.m, Long.valueOf(this.n), Long.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.g.m());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
        parcel.writeLong(this.o);
        parcel.writeBooleanArray(new boolean[]{this.p, this.q, this.r, this.s});
    }
}
