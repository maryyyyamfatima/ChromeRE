package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.C3400a31;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C3400a31();
    public ErrorReport A;
    public final TogglingData B;
    public final int C;
    public final PendingIntent D;
    public int E;
    public boolean F;
    public boolean G;
    public final int H;
    public final String I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f11498J;
    public final String K;
    public final boolean L;
    public final ND4CSettings M;
    public final boolean N;
    public final List O;
    public final int a;
    public final String g;
    public final Account h;
    public Bundle i;
    public final String j;
    public final String k;
    public final Bitmap l;
    public final boolean m;
    public final boolean n;
    public final List o;
    public final Bundle p;
    public final Bitmap q;
    public final byte[] r;
    public final int s;
    public final int t;
    public final String u;
    public Uri v;
    public final List w;
    public ThemeSettings x;
    public final List y;
    public final boolean z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.f(parcel, 1, 4);
        parcel.writeInt(this.a);
        RT2.o(parcel, 2, this.g);
        RT2.n(parcel, 3, this.h, i);
        RT2.c(parcel, 4, this.i);
        RT2.f(parcel, 5, 4);
        parcel.writeInt(this.m ? 1 : 0);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.n ? 1 : 0);
        RT2.q(parcel, 7, this.o);
        RT2.c(parcel, 10, this.p);
        RT2.n(parcel, 11, this.q, i);
        RT2.o(parcel, 14, this.u);
        RT2.n(parcel, 15, this.v, i);
        RT2.t(parcel, 16, this.w);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(0);
        RT2.t(parcel, 18, this.y);
        RT2.d(parcel, 19, this.r);
        RT2.f(parcel, 20, 4);
        parcel.writeInt(this.s);
        RT2.f(parcel, 21, 4);
        parcel.writeInt(this.t);
        RT2.f(parcel, 22, 4);
        parcel.writeInt(this.z ? 1 : 0);
        RT2.n(parcel, 23, this.A, i);
        RT2.n(parcel, 25, this.x, i);
        RT2.o(parcel, 28, this.j);
        RT2.n(parcel, 31, this.B, i);
        RT2.f(parcel, 32, 4);
        parcel.writeInt(this.C);
        RT2.n(parcel, 33, this.D, i);
        RT2.o(parcel, 34, this.k);
        RT2.n(parcel, 35, this.l, i);
        int i2 = this.E;
        RT2.f(parcel, 36, 4);
        parcel.writeInt(i2);
        boolean z = this.F;
        RT2.f(parcel, 37, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.G;
        RT2.f(parcel, 38, 4);
        parcel.writeInt(z2 ? 1 : 0);
        RT2.f(parcel, 39, 4);
        parcel.writeInt(this.H);
        RT2.o(parcel, 40, this.I);
        RT2.f(parcel, 41, 4);
        parcel.writeInt(this.f11498J ? 1 : 0);
        RT2.o(parcel, 42, this.K);
        RT2.f(parcel, 43, 4);
        parcel.writeInt(this.L ? 1 : 0);
        RT2.n(parcel, 44, this.M, i);
        RT2.f(parcel, 45, 4);
        parcel.writeInt(this.N ? 1 : 0);
        RT2.t(parcel, 46, this.O);
        RT2.b(a, parcel);
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, ArrayList arrayList, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, ArrayList arrayList2, int i4, ThemeSettings themeSettings, ArrayList arrayList3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, ArrayList arrayList4) {
        this.A = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.E = i6;
        this.F = z4;
        this.G = z5;
        this.H = i7;
        this.I = str5;
        this.g = str;
        this.h = account;
        this.i = bundle;
        this.j = str2;
        this.k = str3;
        this.l = bitmap;
        this.m = z;
        this.n = z2;
        this.f11498J = z6;
        this.o = arrayList;
        this.D = pendingIntent;
        this.p = bundle2;
        this.q = bitmap2;
        this.r = bArr;
        this.s = i2;
        this.t = i3;
        this.u = str4;
        this.v = uri;
        this.w = arrayList2;
        if (i < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.a = i4;
            this.x = themeSettings2;
        } else {
            this.x = themeSettings == null ? new ThemeSettings() : themeSettings;
        }
        this.y = arrayList3;
        this.z = z3;
        this.A = errorReport;
        if (errorReport != null) {
            errorReport.c0 = "GoogleHelp";
        }
        this.B = togglingData;
        this.C = i5;
        this.K = str6;
        this.L = z7;
        this.M = nD4CSettings;
        this.N = z8;
        this.O = arrayList4;
    }
}
