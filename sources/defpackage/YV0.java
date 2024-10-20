package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YV0 implements InterfaceC5565gM2 {
    public final KH a;
    public C3462aE1 b;
    public boolean c = true;
    public final /* synthetic */ ZV0 d;

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        YD1 yd1;
        boolean z;
        C3462aE1 c3462aE1;
        C10684vG1 c10684vG1 = (C10684vG1) obj;
        C6905kF3 c6905kF3 = (C6905kF3) obj2;
        synchronized (this) {
            yd1 = this.b.c;
            z = this.c;
            C3462aE1 c3462aE12 = this.b;
            c3462aE12.b = null;
            c3462aE12.c = null;
        }
        if (yd1 == null) {
            c6905kF3.b(Boolean.FALSE);
            return;
        }
        this.a.getClass();
        synchronized (c10684vG1.G) {
            BinderC9998tG1 binderC9998tG1 = (BinderC9998tG1) c10684vG1.G.remove(yd1);
            if (binderC9998tG1 == null) {
                c6905kF3.b(Boolean.FALSE);
                return;
            }
            YV0 yv0 = binderC9998tG1.g;
            synchronized (yv0) {
                c3462aE1 = yv0.b;
            }
            c3462aE1.b = null;
            c3462aE1.c = null;
            if (z) {
                if (c10684vG1.y(AbstractC12065zI0.a)) {
                    InterfaceC11825yc1 interfaceC11825yc1 = (InterfaceC11825yc1) c10684vG1.m();
                    LocationReceiver locationReceiver = new LocationReceiver(2, null, binderC9998tG1.asBinder(), null, null, null);
                    BinderC7940nG1 binderC7940nG1 = new BinderC7940nG1(Boolean.TRUE, c6905kF3);
                    C11139wc1 c11139wc1 = (C11139wc1) interfaceC11825yc1;
                    Parcel a = c11139wc1.a();
                    AbstractC11786yV.b(a, locationReceiver);
                    AbstractC11786yV.c(a, binderC7940nG1);
                    c11139wc1.h(89, a);
                } else {
                    InterfaceC11825yc1 interfaceC11825yc12 = (InterfaceC11825yc1) c10684vG1.m();
                    LocationRequestUpdateData locationRequestUpdateData = new LocationRequestUpdateData(2, null, null, binderC9998tG1.asBinder(), null, new BinderC8284oG1(c6905kF3, Boolean.TRUE).asBinder(), null);
                    C11139wc1 c11139wc12 = (C11139wc1) interfaceC11825yc12;
                    Parcel a2 = c11139wc12.a();
                    AbstractC11786yV.b(a2, locationRequestUpdateData);
                    c11139wc12.h(59, a2);
                }
            } else {
                c6905kF3.b(Boolean.TRUE);
            }
        }
    }

    public YV0(ZV0 zv0, C3462aE1 c3462aE1, KH kh) {
        this.d = zv0;
        this.b = c3462aE1;
        this.a = kh;
    }
}
