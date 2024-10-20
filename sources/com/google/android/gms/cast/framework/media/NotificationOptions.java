package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractBinderC6002he1;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC2444Sv;
import defpackage.C5658ge1;
import defpackage.C8237o72;
import defpackage.InterfaceC6346ie1;
import defpackage.RT2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f11496J;
    public final InterfaceC6346ie1 K;
    public final boolean L;
    public final boolean M;
    public final ArrayList a;
    public final int[] g;
    public final long h;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        AbstractC0562Ei1.q("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING");
        CREATOR = new C8237o72();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.q(parcel, 2, this.a);
        int[] iArr = this.g;
        RT2.h(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        RT2.f(parcel, 4, 8);
        parcel.writeLong(this.h);
        RT2.o(parcel, 5, this.i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.k);
        RT2.f(parcel, 8, 4);
        parcel.writeInt(this.l);
        RT2.f(parcel, 9, 4);
        parcel.writeInt(this.m);
        RT2.f(parcel, 10, 4);
        parcel.writeInt(this.n);
        RT2.f(parcel, 11, 4);
        parcel.writeInt(this.o);
        RT2.f(parcel, 12, 4);
        parcel.writeInt(this.p);
        RT2.f(parcel, 13, 4);
        parcel.writeInt(this.q);
        RT2.f(parcel, 14, 4);
        parcel.writeInt(this.r);
        RT2.f(parcel, 15, 4);
        parcel.writeInt(this.s);
        RT2.f(parcel, 16, 4);
        parcel.writeInt(this.t);
        RT2.f(parcel, 17, 4);
        parcel.writeInt(this.u);
        RT2.f(parcel, 18, 4);
        parcel.writeInt(this.v);
        RT2.f(parcel, 19, 4);
        parcel.writeInt(this.w);
        RT2.f(parcel, 20, 4);
        parcel.writeInt(this.x);
        RT2.f(parcel, 21, 4);
        parcel.writeInt(this.y);
        RT2.f(parcel, 22, 4);
        parcel.writeInt(this.z);
        RT2.f(parcel, 23, 4);
        parcel.writeInt(this.A);
        RT2.f(parcel, 24, 4);
        parcel.writeInt(this.B);
        RT2.f(parcel, 25, 4);
        parcel.writeInt(this.C);
        RT2.f(parcel, 26, 4);
        parcel.writeInt(this.D);
        RT2.f(parcel, 27, 4);
        parcel.writeInt(this.E);
        RT2.f(parcel, 28, 4);
        parcel.writeInt(this.F);
        RT2.f(parcel, 29, 4);
        parcel.writeInt(this.G);
        RT2.f(parcel, 30, 4);
        parcel.writeInt(this.H);
        RT2.f(parcel, 31, 4);
        parcel.writeInt(this.I);
        RT2.f(parcel, 32, 4);
        parcel.writeInt(this.f11496J);
        InterfaceC6346ie1 interfaceC6346ie1 = this.K;
        RT2.g(parcel, 33, interfaceC6346ie1 == null ? null : ((AbstractC2444Sv) interfaceC6346ie1).a);
        RT2.f(parcel, 34, 4);
        parcel.writeInt(this.L ? 1 : 0);
        RT2.f(parcel, 35, 4);
        parcel.writeInt(this.M ? 1 : 0);
        RT2.b(a, parcel);
    }

    public NotificationOptions(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        InterfaceC6346ie1 c5658ge1;
        this.a = new ArrayList(list);
        this.g = Arrays.copyOf(iArr, iArr.length);
        this.h = j;
        this.i = str;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        this.o = i6;
        this.p = i7;
        this.q = i8;
        this.r = i9;
        this.s = i10;
        this.t = i11;
        this.u = i12;
        this.v = i13;
        this.w = i14;
        this.x = i15;
        this.y = i16;
        this.z = i17;
        this.A = i18;
        this.B = i19;
        this.C = i20;
        this.D = i21;
        this.E = i22;
        this.F = i23;
        this.G = i24;
        this.H = i25;
        this.I = i26;
        this.f11496J = i27;
        this.L = z;
        this.M = z2;
        if (iBinder == null) {
            this.K = null;
            return;
        }
        int i28 = AbstractBinderC6002he1.a;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        if (queryLocalInterface instanceof InterfaceC6346ie1) {
            c5658ge1 = (InterfaceC6346ie1) queryLocalInterface;
        } else {
            c5658ge1 = new C5658ge1(iBinder);
        }
        this.K = c5658ge1;
    }
}
