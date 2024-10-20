package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.RT2;
import defpackage.WC0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new WC0();
    public final byte[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final String F;
    public final String G;
    public final String H;
    public final Bundle I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f11497J;
    public final int K;
    public final int L;
    public final boolean M;
    public final String N;
    public final String O;
    public final int P;
    public final String Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final BitmapTeleporter X;
    public final String Y;
    public final FileTeleporter[] Z;
    public final ApplicationErrorReport a;
    public final String[] a0;
    public final boolean b0;
    public String c0;
    public final ThemeSettings d0;
    public final LogOptions e0;
    public final String f0;
    public final String g;
    public final boolean g0;
    public final int h;
    public final Bundle h0;
    public final String i;
    public final List i0;
    public final String j;
    public final boolean j0;
    public final String k;
    public final Bitmap k0;
    public final String l;
    public final String l0;
    public final String m;
    public final List m0;
    public final String n;
    public final int n0;
    public final String o;
    public final int o0;
    public final int p;
    public final String[] p0;
    public final String q;
    public final String[] q0;
    public final String r;
    public final String[] r0;
    public final String s;
    public final boolean s0;
    public final String t;
    public final String u;
    public final String[] v;
    public final String[] w;
    public final String[] x;
    public final String y;
    public final String z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, this.g);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.o(parcel, 6, this.j);
        RT2.o(parcel, 7, this.k);
        RT2.o(parcel, 8, this.l);
        RT2.o(parcel, 9, this.m);
        RT2.o(parcel, 10, this.n);
        RT2.o(parcel, 11, this.o);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.p);
        RT2.o(parcel, 13, this.q);
        RT2.o(parcel, 14, this.r);
        RT2.o(parcel, 15, this.s);
        RT2.o(parcel, 16, this.t);
        RT2.o(parcel, 17, this.u);
        RT2.p(parcel, 18, this.v);
        RT2.p(parcel, 19, this.w);
        RT2.p(parcel, 20, this.x);
        RT2.o(parcel, 21, this.y);
        RT2.o(parcel, 22, this.z);
        RT2.d(parcel, 23, this.A);
        RT2.f(parcel, 24, 4);
        parcel.writeInt(this.B);
        RT2.f(parcel, 25, 4);
        parcel.writeInt(this.C);
        RT2.f(parcel, 26, 4);
        parcel.writeInt(this.D);
        RT2.f(parcel, 27, 4);
        parcel.writeInt(this.E);
        RT2.o(parcel, 28, this.F);
        RT2.o(parcel, 29, this.G);
        RT2.o(parcel, 30, this.H);
        RT2.c(parcel, 31, this.I);
        RT2.f(parcel, 32, 4);
        parcel.writeInt(this.f11497J ? 1 : 0);
        RT2.f(parcel, 33, 4);
        parcel.writeInt(this.K);
        RT2.f(parcel, 34, 4);
        parcel.writeInt(this.L);
        RT2.f(parcel, 35, 4);
        parcel.writeInt(this.M ? 1 : 0);
        RT2.o(parcel, 36, this.N);
        RT2.o(parcel, 37, this.O);
        RT2.f(parcel, 38, 4);
        parcel.writeInt(this.P);
        RT2.o(parcel, 39, this.Q);
        RT2.o(parcel, 40, this.R);
        RT2.o(parcel, 41, this.S);
        RT2.o(parcel, 42, this.T);
        RT2.o(parcel, 43, this.U);
        RT2.o(parcel, 44, this.V);
        RT2.o(parcel, 45, this.W);
        RT2.n(parcel, 46, this.X, i);
        RT2.o(parcel, 47, this.Y);
        RT2.r(parcel, 48, this.Z, i);
        RT2.p(parcel, 49, this.a0);
        RT2.f(parcel, 50, 4);
        parcel.writeInt(this.b0 ? 1 : 0);
        RT2.o(parcel, 51, this.c0);
        RT2.n(parcel, 52, this.d0, i);
        RT2.n(parcel, 53, this.e0, i);
        RT2.o(parcel, 54, this.f0);
        RT2.f(parcel, 55, 4);
        parcel.writeInt(this.g0 ? 1 : 0);
        RT2.c(parcel, 56, this.h0);
        RT2.t(parcel, 57, this.i0);
        RT2.f(parcel, 58, 4);
        parcel.writeInt(this.j0 ? 1 : 0);
        RT2.n(parcel, 59, this.k0, i);
        RT2.o(parcel, 60, this.l0);
        RT2.q(parcel, 61, this.m0);
        RT2.f(parcel, 62, 4);
        parcel.writeInt(this.n0);
        RT2.f(parcel, 63, 4);
        parcel.writeInt(this.o0);
        RT2.p(parcel, 64, this.p0);
        RT2.p(parcel, 65, this.q0);
        RT2.p(parcel, 66, this.r0);
        RT2.f(parcel, 67, 4);
        parcel.writeInt(this.s0 ? 1 : 0);
        RT2.b(a, parcel);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, ArrayList arrayList, boolean z5, Bitmap bitmap, String str31, ArrayList arrayList2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6) {
        this.a = new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.g = str;
        this.h = i;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
        this.p = i2;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = strArr;
        this.w = strArr2;
        this.x = strArr3;
        this.y = str14;
        this.z = str15;
        this.A = bArr;
        this.B = i3;
        this.C = i4;
        this.D = i5;
        this.E = i6;
        this.F = str16;
        this.G = str17;
        this.H = str18;
        this.I = bundle;
        this.f11497J = z;
        this.K = i7;
        this.L = i8;
        this.M = z2;
        this.N = str19;
        this.O = str20;
        this.P = i9;
        this.Q = str21;
        this.R = str22;
        this.S = str23;
        this.T = str24;
        this.U = str25;
        this.V = str26;
        this.W = str27;
        this.X = bitmapTeleporter;
        this.Y = str28;
        this.Z = fileTeleporterArr;
        this.a0 = strArr4;
        this.b0 = z3;
        this.c0 = str29;
        this.d0 = themeSettings;
        this.e0 = logOptions;
        this.f0 = str30;
        this.g0 = z4;
        this.h0 = bundle2;
        this.i0 = arrayList;
        this.j0 = z5;
        this.k0 = bitmap;
        this.l0 = str31;
        this.m0 = arrayList2;
        this.n0 = i10;
        this.o0 = i11;
        this.p0 = strArr5;
        this.q0 = strArr6;
        this.r0 = strArr7;
        this.s0 = z6;
    }

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        ApplicationErrorReport applicationErrorReport = new ApplicationErrorReport();
        this.a = applicationErrorReport;
        if (feedbackOptions == null) {
            return;
        }
        Bundle bundle = feedbackOptions.g;
        if (bundle != null && !bundle.isEmpty()) {
            this.I = feedbackOptions.g;
        }
        if (!TextUtils.isEmpty(feedbackOptions.a)) {
            this.G = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.h)) {
            this.g = feedbackOptions.h;
        }
        ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.i.crashInfo;
        if (crashInfo != null) {
            this.R = crashInfo.throwMethodName;
            this.P = crashInfo.throwLineNumber;
            this.Q = crashInfo.throwClassName;
            this.S = crashInfo.stackTrace;
            this.N = crashInfo.exceptionClassName;
            this.T = crashInfo.exceptionMessage;
            this.O = crashInfo.throwFileName;
        }
        ThemeSettings themeSettings = feedbackOptions.o;
        if (themeSettings != null) {
            this.d0 = themeSettings;
        }
        if (!TextUtils.isEmpty(feedbackOptions.j)) {
            this.U = feedbackOptions.j;
        }
        String str = feedbackOptions.l;
        if (!TextUtils.isEmpty(str)) {
            applicationErrorReport.packageName = str;
        }
        if (!TextUtils.isEmpty(feedbackOptions.s)) {
            this.l0 = feedbackOptions.s;
        }
        Bitmap bitmap = feedbackOptions.r;
        if (bitmap != null) {
            this.k0 = bitmap;
        }
        if (file != null) {
            BitmapTeleporter bitmapTeleporter = feedbackOptions.k;
            this.X = bitmapTeleporter;
            if (bitmapTeleporter != null) {
                bitmapTeleporter.k = file;
            }
            List list = feedbackOptions.m;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).j = file;
                }
                this.Z = (FileTeleporter[]) list.toArray(new FileTeleporter[0]);
            }
        }
        LogOptions logOptions = feedbackOptions.p;
        if (logOptions != null) {
            this.e0 = logOptions;
        }
        this.b0 = feedbackOptions.n;
        this.j0 = feedbackOptions.q;
        this.f11497J = feedbackOptions.t;
        this.s0 = feedbackOptions.v;
    }
}
