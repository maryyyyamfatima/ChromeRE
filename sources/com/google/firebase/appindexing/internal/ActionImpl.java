package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C84;
import defpackage.EW1;
import defpackage.RT2;
import defpackage.S4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new S4();
    public final String a;
    public final String g;
    public final String h;
    public final String i;
    public final MetadataImpl j;
    public final String k;
    public final Bundle l;

    public ActionImpl(String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5, Bundle bundle) {
        this.a = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = metadataImpl;
        this.k = str5;
        if (bundle != null) {
            this.l = bundle;
        } else {
            this.l = Bundle.EMPTY;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        C84.a(classLoader);
        this.l.setClassLoader(classLoader);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new EW1();
        public int a;
        public final boolean g;
        public final String h;
        public final String i;
        public final byte[] j;
        public final boolean k;

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = RT2.a(20293, parcel);
            int i2 = this.a;
            RT2.f(parcel, 1, 4);
            parcel.writeInt(i2);
            RT2.f(parcel, 2, 4);
            parcel.writeInt(this.g ? 1 : 0);
            RT2.o(parcel, 3, this.h);
            RT2.o(parcel, 4, this.i);
            RT2.d(parcel, 5, this.j);
            RT2.f(parcel, 6, 4);
            parcel.writeInt(this.k ? 1 : 0);
            RT2.b(a, parcel);
        }

        public MetadataImpl(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.a = i;
            this.g = z;
            this.h = str;
            this.i = str2;
            this.j = bArr;
            this.k = z2;
        }

        public MetadataImpl(boolean z) {
            this.a = 0;
            this.g = z;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MetadataImpl { { eventStatus: '");
            sb.append(this.a);
            sb.append("' } { uploadable: '");
            sb.append(this.g);
            sb.append("' } ");
            String str = this.h;
            if (str != null) {
                sb.append("{ completionToken: '");
                sb.append(str);
                sb.append("' } ");
            }
            String str2 = this.i;
            if (str2 != null) {
                sb.append("{ accountName: '");
                sb.append(str2);
                sb.append("' } ");
            }
            byte[] bArr = this.j;
            if (bArr != null) {
                sb.append("{ ssbContext: [ ");
                for (byte b : bArr) {
                    sb.append("0x");
                    sb.append(Integer.toHexString(b));
                    sb.append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '");
            sb.append(this.k);
            sb.append("' } }");
            return sb.toString();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 1, this.a);
        RT2.o(parcel, 2, this.g);
        RT2.o(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.n(parcel, 5, this.j, i);
        RT2.o(parcel, 6, this.k);
        RT2.c(parcel, 7, this.l);
        RT2.b(a, parcel);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionImpl { { actionType: '");
        sb.append(this.a);
        sb.append("' } { objectName: '");
        sb.append(this.g);
        sb.append("' } { objectUrl: '");
        sb.append(this.h);
        sb.append("' } ");
        String str = this.i;
        if (str != null) {
            sb.append("{ objectSameAs: '");
            sb.append(str);
            sb.append("' } ");
        }
        MetadataImpl metadataImpl = this.j;
        if (metadataImpl != null) {
            sb.append("{ metadata: '");
            sb.append(metadataImpl.toString());
            sb.append("' } ");
        }
        String str2 = this.k;
        if (str2 != null) {
            sb.append("{ actionStatus: '");
            sb.append(str2);
            sb.append("' } ");
        }
        Bundle bundle = this.l;
        if (!bundle.isEmpty()) {
            sb.append("{ ");
            sb.append(bundle);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }
}
