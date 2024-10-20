package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C11394xL0;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C11394xL0();
    public String a;
    public Bundle g;
    public String h;
    public final ApplicationErrorReport i;
    public String j;
    public BitmapTeleporter k;
    public final String l;
    public List m;
    public boolean n;
    public ThemeSettings o;
    public LogOptions p;
    public boolean q;
    public Bitmap r;
    public String s;
    public boolean t;
    public long u;
    public boolean v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.c(parcel, 3, this.g);
        RT2.o(parcel, 5, this.h);
        RT2.n(parcel, 6, this.i, i);
        RT2.o(parcel, 7, this.j);
        RT2.n(parcel, 8, this.k, i);
        RT2.o(parcel, 9, this.l);
        RT2.t(parcel, 10, this.m);
        boolean z = this.n;
        RT2.f(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        RT2.n(parcel, 12, this.o, i);
        RT2.n(parcel, 13, this.p, i);
        boolean z2 = this.q;
        RT2.f(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        RT2.n(parcel, 15, this.r, i);
        RT2.o(parcel, 16, this.s);
        boolean z3 = this.t;
        RT2.f(parcel, 17, 4);
        parcel.writeInt(z3 ? 1 : 0);
        long j = this.u;
        RT2.f(parcel, 18, 8);
        parcel.writeLong(j);
        boolean z4 = this.v;
        RT2.f(parcel, 19, 4);
        parcel.writeInt(z4 ? 1 : 0);
        RT2.b(a, parcel);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, ArrayList arrayList, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4) {
        this.a = str;
        this.g = bundle != null ? bundle : new Bundle();
        this.h = str2;
        this.i = applicationErrorReport != null ? applicationErrorReport : new ApplicationErrorReport();
        this.j = str3;
        this.k = bitmapTeleporter;
        this.l = str4;
        this.m = arrayList != null ? arrayList : new ArrayList();
        this.n = z;
        this.o = themeSettings;
        this.p = logOptions;
        this.q = z2;
        this.r = bitmap;
        this.s = str5;
        this.t = z3;
        this.u = j;
        this.v = z4;
    }

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0L, false);
    }
}
