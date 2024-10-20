package defpackage;

import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC8384oa1 extends AbstractBinderC7826mw {
    public AbstractBinderC8384oa1() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ObjectWrapper objectWrapper = new ObjectWrapper((SQ1) this);
            parcel2.writeNoException();
            AbstractC11786yV.c(parcel2, objectWrapper);
        } else if (i == 2) {
            ((SQ1) this).a.n();
            parcel2.writeNoException();
        } else if (i == 3) {
            final UQ1 uq1 = ((SQ1) this).a;
            uq1.getClass();
            UQ1.f.a("Stopping RouteDiscovery.", new Object[0]);
            uq1.c.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                TQ1 tq1 = uq1.e;
                if (tq1.b == null) {
                    tq1.b = MQ1.d(tq1.a);
                }
                MQ1 mq1 = tq1.b;
                if (mq1 != null) {
                    mq1.j(uq1);
                }
            } else {
                new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: PQ1
                    @Override // java.lang.Runnable
                    public final void run() {
                        UQ1 uq12 = UQ1.this;
                        TQ1 tq12 = uq12.e;
                        if (tq12.b == null) {
                            tq12.b = MQ1.d(tq12.a);
                        }
                        MQ1 mq12 = tq12.b;
                        if (mq12 != null) {
                            mq12.j(uq12);
                        }
                    }
                });
            }
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(222980000);
        }
        return true;
    }
}
