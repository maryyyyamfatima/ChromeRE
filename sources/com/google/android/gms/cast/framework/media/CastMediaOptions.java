package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.AbstractBinderC2351Sc1;
import defpackage.AbstractC2444Sv;
import defpackage.BH;
import defpackage.C2221Rc1;
import defpackage.InterfaceC2481Tc1;
import defpackage.RT2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new BH();
    public final String a;
    public final String g;
    public final InterfaceC2481Tc1 h;
    public final NotificationOptions i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.o(parcel, 2, this.a);
        RT2.o(parcel, 3, this.g);
        InterfaceC2481Tc1 interfaceC2481Tc1 = this.h;
        RT2.g(parcel, 4, interfaceC2481Tc1 == null ? null : ((AbstractC2444Sv) interfaceC2481Tc1).a);
        RT2.n(parcel, 5, this.i, i);
        RT2.f(parcel, 6, 4);
        parcel.writeInt(this.j ? 1 : 0);
        RT2.f(parcel, 7, 4);
        parcel.writeInt(this.k ? 1 : 0);
        RT2.b(a, parcel);
    }

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        InterfaceC2481Tc1 c2221Rc1;
        this.a = str;
        this.g = str2;
        if (iBinder == null) {
            c2221Rc1 = null;
        } else {
            int i = AbstractBinderC2351Sc1.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof InterfaceC2481Tc1) {
                c2221Rc1 = (InterfaceC2481Tc1) queryLocalInterface;
            } else {
                c2221Rc1 = new C2221Rc1(iBinder);
            }
        }
        this.h = c2221Rc1;
        this.i = notificationOptions;
        this.j = z;
        this.k = z2;
    }
}
