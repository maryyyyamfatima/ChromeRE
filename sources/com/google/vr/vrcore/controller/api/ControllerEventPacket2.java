package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.G80;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class ControllerEventPacket2 extends ControllerEventPacket {
    public int r;
    public boolean t;
    public long v;
    public static final ArrayDeque w = new ArrayDeque();
    public static final Object x = new Object();
    public static final Parcelable.Creator CREATOR = new G80();
    public final ControllerPositionEvent[] s = new ControllerPositionEvent[16];
    public final ControllerBatteryEvent u = new ControllerBatteryEvent();

    public ControllerEventPacket2() {
        for (int i = 0; i < 16; i++) {
            this.s[i] = new ControllerPositionEvent();
        }
        c();
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void c() {
        super.c();
        this.r = 0;
        this.t = false;
        this.v = 0L;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void m(int i) {
        super.m(i);
        ControllerEventPacket.l(i, this.r, this.s);
        this.u.g = i;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void g() {
        c();
        synchronized (x) {
            ArrayDeque arrayDeque = w;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ControllerPositionEvent[] controllerPositionEventArr;
        int dataPosition = parcel.dataPosition();
        int i2 = 24;
        for (int i3 = 0; i3 < this.a; i3++) {
            this.g[i3].getClass();
            i2 += 24;
        }
        for (int i4 = 0; i4 < this.h; i4++) {
            this.i[i4].getClass();
            i2 += 20;
        }
        for (int i5 = 0; i5 < this.j; i5++) {
            this.k[i5].getClass();
            i2 += 24;
        }
        for (int i6 = 0; i6 < this.l; i6++) {
            this.m[i6].getClass();
            i2 += 28;
        }
        for (int i7 = 0; i7 < this.n; i7++) {
            this.o[i7].getClass();
            i2 += 28;
        }
        int i8 = i2 + 4 + 4;
        int i9 = 0;
        while (true) {
            int i10 = this.r;
            controllerPositionEventArr = this.s;
            if (i9 >= i10) {
                break;
            }
            controllerPositionEventArr[i9].getClass();
            i8 += 24;
            i9++;
        }
        int i11 = i8 + 4;
        boolean z = this.t;
        ControllerBatteryEvent controllerBatteryEvent = this.u;
        if (z) {
            controllerBatteryEvent.getClass();
            i11 += 20;
        }
        int i12 = i11 + 8;
        parcel.writeInt(i12);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.r);
        for (int i13 = 0; i13 < this.r; i13++) {
            controllerPositionEventArr[i13].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.t ? 1 : 0);
        if (this.t) {
            controllerBatteryEvent.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.v);
        if (parcel.dataPosition() - dataPosition != i12) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void d(Parcel parcel) {
        int dataPosition = parcel.dataPosition() + parcel.readInt();
        super.d(parcel);
        if (parcel.dataPosition() < dataPosition) {
            int readInt = parcel.readInt();
            this.r = readInt;
            ControllerEventPacket.a(readInt);
            for (int i = 0; i < this.r; i++) {
                this.s[i].a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            boolean z = parcel.readInt() != 0;
            this.t = z;
            if (z) {
                this.u.a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            this.v = parcel.readLong();
        }
        parcel.setDataPosition(dataPosition);
    }
}
