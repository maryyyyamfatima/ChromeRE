package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ad1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0017Ad1 extends AbstractBinderC7826mw implements InterfaceC0147Bd1 {
    public AbstractBinderC0017Ad1() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0407Dd1 interfaceC0407Dd1 = null;
        Bundle bundle = null;
        int i2 = 0;
        r3 = 0;
        int i3 = 0;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    interfaceC0407Dd1 = queryLocalInterface instanceof InterfaceC0407Dd1 ? (InterfaceC0407Dd1) queryLocalInterface : new C0277Cd1(readStrongBinder);
                }
                AbstractBinderC7826mw.g1(parcel);
                BinderC6619jR1 binderC6619jR1 = (BinderC6619jR1) this;
                C6614jQ1 b = C6614jQ1.b(bundle2);
                if (b != null) {
                    HashMap hashMap = binderC6619jR1.h;
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new OQ1(interfaceC0407Dd1));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                final int readInt = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                final BinderC6619jR1 binderC6619jR12 = (BinderC6619jR1) this;
                final C6614jQ1 b2 = C6614jQ1.b(bundle3);
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        binderC6619jR12.h1(b2, readInt);
                    } else {
                        new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: hR1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BinderC6619jR1 binderC6619jR13 = BinderC6619jR1.this;
                                C6614jQ1 c6614jQ1 = b2;
                                int i4 = readInt;
                                synchronized (binderC6619jR13.h) {
                                    binderC6619jR13.h1(c6614jQ1, i4);
                                }
                            }
                        });
                    }
                }
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Bundle bundle4 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                AbstractBinderC7826mw.g1(parcel);
                final BinderC6619jR1 binderC6619jR13 = (BinderC6619jR1) this;
                final C6614jQ1 b3 = C6614jQ1.b(bundle4);
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        binderC6619jR13.i1(b3);
                    } else {
                        new HandlerC10413uU3(Looper.getMainLooper()).post(new Runnable() { // from class: iR1
                            @Override // java.lang.Runnable
                            public final void run() {
                                BinderC6619jR1.this.i1(b3);
                            }
                        });
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) AbstractC11786yV.a(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                BinderC6619jR1 binderC6619jR14 = (BinderC6619jR1) this;
                C6614jQ1 b4 = C6614jQ1.b(bundle5);
                if (b4 != null) {
                    binderC6619jR14.a.getClass();
                    i2 = MQ1.i(b4, readInt2);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                String readString = parcel.readString();
                AbstractBinderC7826mw.g1(parcel);
                C4856eI1 c4856eI1 = BinderC6619jR1.j;
                c4856eI1.a("select route with routeId = %s", readString);
                ((BinderC6619jR1) this).a.getClass();
                Iterator it = MQ1.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        DQ1 dq1 = (DQ1) it.next();
                        if (dq1.c.equals(readString)) {
                            c4856eI1.a("media route is found and selected", new Object[0]);
                            MQ1.k(dq1);
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                ((BinderC6619jR1) this).a.getClass();
                MQ1.b();
                DQ1 dq12 = MQ1.c().r;
                if (dq12 == null) {
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                MQ1.k(dq12);
                parcel2.writeNoException();
                return true;
            case 7:
                ((BinderC6619jR1) this).a.getClass();
                MQ1.b();
                DQ1 dq13 = MQ1.c().r;
                if (dq13 == null) {
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                int i4 = MQ1.g().c.equals(dq13.c) ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC11786yV.a;
                parcel2.writeInt(i4);
                return true;
            case 8:
                String readString2 = parcel.readString();
                AbstractBinderC7826mw.g1(parcel);
                ((BinderC6619jR1) this).a.getClass();
                Iterator it2 = MQ1.f().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        DQ1 dq14 = (DQ1) it2.next();
                        if (dq14.c.equals(readString2)) {
                            bundle = dq14.r;
                        }
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC11786yV.a;
                if (bundle == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                }
                return true;
            case 9:
                ((BinderC6619jR1) this).a.getClass();
                String str = MQ1.g().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(222980000);
                return true;
            case 11:
                BinderC6619jR1 binderC6619jR15 = (BinderC6619jR1) this;
                HashMap hashMap2 = binderC6619jR15.h;
                Iterator it3 = hashMap2.values().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Set) it3.next()).iterator();
                    while (it4.hasNext()) {
                        binderC6619jR15.a.j((AbstractC6958kQ1) it4.next());
                    }
                }
                hashMap2.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                ((BinderC6619jR1) this).a.getClass();
                MQ1.b();
                C11420xQ1 c = MQ1.c();
                DQ1 dq15 = c != null ? c.s : null;
                if (dq15 != null && MQ1.g().c.equals(dq15.c)) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC11786yV.a;
                parcel2.writeInt(i3);
                return true;
            case 13:
                int readInt3 = parcel.readInt();
                AbstractBinderC7826mw.g1(parcel);
                ((BinderC6619jR1) this).a.getClass();
                MQ1.m(readInt3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
