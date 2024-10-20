package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.C8289oH1;
import defpackage.InterfaceC0209Bp3;
import defpackage.MU;
import defpackage.RT2;
import defpackage.W82;
import defpackage.Y5;
import defpackage.YT;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C8289oH1();
    public static final String[] s = new String[0];
    public final InterfaceC0209Bp3 a;
    public final MU g;
    public final PlayLoggerContext h;
    public byte[] i;
    public final int[] j;
    public final String[] k;
    public final String[] l;
    public final int[] m;
    public final byte[][] n;
    public final ExperimentTokens[] o;
    public final boolean p;
    public LogVerifierResultParcelable q;
    public YT r;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.h, i);
        RT2.d(parcel, 3, this.i);
        RT2.h(parcel, 4, this.j);
        RT2.p(parcel, 5, this.k);
        RT2.h(parcel, 6, this.m);
        RT2.e(parcel, 7, this.n);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.p ? 1 : 0);
        RT2.r(parcel, 9, this.o, i);
        RT2.n(parcel, 11, this.q, i);
        String[] strArr = this.l;
        if (strArr == null) {
            strArr = s;
        }
        RT2.p(parcel, 12, strArr);
        RT2.b(a, parcel);
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, YT yt, InterfaceC0209Bp3 interfaceC0209Bp3, MU mu, int[] iArr, String[] strArr, int[] iArr2, boolean z) {
        this.h = playLoggerContext;
        this.r = yt;
        this.a = interfaceC0209Bp3;
        this.g = mu;
        this.j = iArr;
        this.k = strArr;
        this.m = iArr2;
        this.n = null;
        this.o = null;
        this.l = null;
        this.p = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, LogVerifierResultParcelable logVerifierResultParcelable, String[] strArr2) {
        this.h = playLoggerContext;
        this.i = bArr;
        this.j = iArr;
        this.k = strArr;
        this.r = null;
        this.a = null;
        this.g = null;
        this.m = iArr2;
        this.n = bArr2;
        this.o = experimentTokensArr;
        this.p = z;
        this.l = strArr2;
        this.q = logVerifierResultParcelable;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, this.i, this.j, this.k, this.r, this.a, this.g, this.m, this.n, this.o, Boolean.valueOf(this.p), this.l, this.q});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return W82.a(this.h, logEventParcelable.h) && Arrays.equals(this.i, logEventParcelable.i) && Arrays.equals(this.j, logEventParcelable.j) && Arrays.equals(this.k, logEventParcelable.k) && W82.a(this.r, logEventParcelable.r) && W82.a(this.a, logEventParcelable.a) && W82.a(this.g, logEventParcelable.g) && Arrays.equals(this.m, logEventParcelable.m) && Arrays.deepEquals(this.n, logEventParcelable.n) && Arrays.equals(this.o, logEventParcelable.o) && Arrays.equals(this.l, logEventParcelable.l) && this.p == logEventParcelable.p && W82.a(this.q, logEventParcelable.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.h);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.i;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.j));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.k));
        sb.append(", LogEvent: ");
        sb.append(this.r);
        sb.append(", SourceExtensionByteStringProvider: ");
        sb.append(this.a);
        sb.append(", VeProducer: ");
        sb.append(this.g);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.m));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.n));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.o));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.l));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.p);
        sb.append(", LogVerifierResult: ");
        LogVerifierResultParcelable logVerifierResultParcelable = this.q;
        return Y5.a(sb, logVerifierResultParcelable != null ? logVerifierResultParcelable.toString() : null, "]");
    }
}
