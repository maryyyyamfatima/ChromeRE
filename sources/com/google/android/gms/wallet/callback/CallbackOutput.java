package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C5527gF;
import defpackage.C5871hF;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C5871hF();
    public int a;
    public int g;
    public byte[] h;
    public String i;

    public CallbackOutput(int i, int i2, byte[] bArr, String str) {
        this.a = i;
        this.g = i2;
        this.h = bArr;
        this.i = str;
    }

    private CallbackOutput() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        int i2 = this.a;
        RT2.f(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.g;
        RT2.f(parcel, 2, 4);
        parcel.writeInt(i3);
        RT2.d(parcel, 3, this.h);
        RT2.o(parcel, 4, this.i);
        RT2.b(a, parcel);
    }

    public static C5527gF r1() {
        return new C5527gF(new CallbackOutput());
    }
}
