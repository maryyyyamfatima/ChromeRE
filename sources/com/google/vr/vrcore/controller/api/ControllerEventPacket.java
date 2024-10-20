package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.F80;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
@Deprecated
/* loaded from: classes4.dex */
public class ControllerEventPacket implements Parcelable {
    public int a;
    public int h;
    public int j;
    public int l;
    public int n;
    public static final ArrayDeque p = new ArrayDeque();
    public static final Object q = new Object();
    public static final Parcelable.Creator CREATOR = new F80();
    public final ControllerAccelEvent[] g = new ControllerAccelEvent[16];
    public final ControllerButtonEvent[] i = new ControllerButtonEvent[16];
    public final ControllerGyroEvent[] k = new ControllerGyroEvent[16];
    public final ControllerOrientationEvent[] m = new ControllerOrientationEvent[16];
    public final ControllerTouchEvent[] o = new ControllerTouchEvent[16];

    public ControllerEventPacket() {
        for (int i = 0; i < 16; i++) {
            this.g[i] = new ControllerAccelEvent();
            this.i[i] = new ControllerButtonEvent();
            this.k[i] = new ControllerGyroEvent();
            this.m[i] = new ControllerOrientationEvent();
            this.o[i] = new ControllerTouchEvent();
        }
        c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void c() {
        this.a = 0;
        this.h = 0;
        this.j = 0;
        this.l = 0;
        this.n = 0;
    }

    public void m(int i) {
        l(i, this.a, this.g);
        l(i, this.h, this.i);
        l(i, this.j, this.k);
        l(i, this.l, this.m);
        l(i, this.n, this.o);
    }

    public void g() {
        c();
        synchronized (q) {
            ArrayDeque arrayDeque = p;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.g[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h);
        for (int i3 = 0; i3 < this.h; i3++) {
            this.i[i3].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.j);
        for (int i4 = 0; i4 < this.j; i4++) {
            this.k[i4].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.l);
        for (int i5 = 0; i5 < this.l; i5++) {
            this.m[i5].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.n);
        for (int i6 = 0; i6 < this.n; i6++) {
            this.o[i6].writeToParcel(parcel, i);
        }
    }

    public void d(Parcel parcel) {
        parcel.readInt();
        int readInt = parcel.readInt();
        this.a = readInt;
        a(readInt);
        for (int i = 0; i < this.a; i++) {
            this.g[i].a(parcel);
        }
        int readInt2 = parcel.readInt();
        this.h = readInt2;
        a(readInt2);
        for (int i2 = 0; i2 < this.h; i2++) {
            this.i[i2].a(parcel);
        }
        int readInt3 = parcel.readInt();
        this.j = readInt3;
        a(readInt3);
        for (int i3 = 0; i3 < this.j; i3++) {
            this.k[i3].a(parcel);
        }
        int readInt4 = parcel.readInt();
        this.l = readInt4;
        a(readInt4);
        for (int i4 = 0; i4 < this.l; i4++) {
            this.m[i4].a(parcel);
        }
        int readInt5 = parcel.readInt();
        this.n = readInt5;
        a(readInt5);
        for (int i5 = 0; i5 < this.n; i5++) {
            this.o[i5].a(parcel);
        }
    }

    public static void a(int i) {
        if (i < 0 || i >= 16) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid event count: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void l(int i, int i2, ControllerEvent[] controllerEventArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            controllerEventArr[i3].g = i;
        }
    }
}
