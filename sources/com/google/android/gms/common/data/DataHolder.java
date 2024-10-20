package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C4981eg0;
import defpackage.RT2;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new C4981eg0();
    public final int a;
    public final String[] g;
    public Bundle h;
    public final CursorWindow[] i;
    public final int j;
    public final Bundle k;
    public int[] l;
    public int m;
    public boolean n = false;
    public final boolean o = true;

    static {
        new ArrayList();
        new HashMap();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.p(parcel, 1, this.g);
        RT2.r(parcel, 2, this.i, i);
        RT2.f(parcel, 3, 4);
        parcel.writeInt(this.j);
        RT2.c(parcel, 4, this.k);
        RT2.f(parcel, 1000, 4);
        parcel.writeInt(this.a);
        RT2.b(a, parcel);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.g = strArr;
        this.i = cursorWindowArr;
        this.j = i2;
        this.k = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.n) {
                this.n = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.i;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.o && this.i.length > 0) {
                synchronized (this) {
                    z = this.n;
                }
                if (!z) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }
}
