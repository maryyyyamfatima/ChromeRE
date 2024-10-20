package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C1770Nq0;
import defpackage.RT2;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String a;
    public final RegisterSectionInfo g;
    public final int h;
    public final byte[] i;
    public static final int j = Integer.parseInt("-1");
    public static final Parcelable.Creator CREATOR = new C1770Nq0();

    static {
        ArrayList arrayList = new ArrayList();
        new RegisterSectionInfo("SsbContext", "blob", true, 1, false, null, (Feature[]) arrayList.toArray(new Feature[arrayList.size()]), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DocumentSection(java.lang.String r4, com.google.android.gms.appdatasearch.RegisterSectionInfo r5, int r6, byte[] r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 10
            int r1 = com.google.android.gms.appdatasearch.DocumentSection.j
            if (r6 == r1) goto L14
            java.lang.String[] r2 = defpackage.AbstractC9908t01.a
            if (r6 < 0) goto L14
            if (r6 < r0) goto L10
            goto L14
        L10:
            java.lang.String[] r2 = defpackage.AbstractC9908t01.a
            r2 = r2[r6]
        L14:
            r3.a = r4
            r3.g = r5
            r3.h = r6
            r3.i = r7
            r5 = 0
            if (r6 == r1) goto L35
            java.lang.String[] r1 = defpackage.AbstractC9908t01.a
            if (r6 < 0) goto L2b
            if (r6 < r0) goto L26
            goto L2b
        L26:
            java.lang.String[] r0 = defpackage.AbstractC9908t01.a
            r0 = r0[r6]
            goto L2c
        L2b:
            r0 = r5
        L2c:
            if (r0 != 0) goto L35
            java.lang.String r4 = "Invalid section type "
            java.lang.String r5 = defpackage.AbstractC9076qb1.a(r4, r6)
            goto L3b
        L35:
            if (r4 == 0) goto L3b
            if (r7 == 0) goto L3b
            java.lang.String r5 = "Both content and blobContent set"
        L3b:
            if (r5 != 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.DocumentSection.<init>(java.lang.String, com.google.android.gms.appdatasearch.RegisterSectionInfo, int, byte[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.n(parcel, 3, this.g, i);
        RT2.f(parcel, 4, 4);
        parcel.writeInt(this.h);
        RT2.d(parcel, 5, this.i);
        RT2.b(a, parcel);
    }
}
