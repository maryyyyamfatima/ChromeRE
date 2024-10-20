package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.RemoteException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.usage_stats.idl.ParcelableWellbeingRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gn0 */
/* loaded from: classes2.dex */
public final class C0846Gn0 extends C12233zn0 {
    public final ServiceConnectionC0456Dn0 a = new ServiceConnectionC0456Dn0(this);
    public MC2 b;

    public final MC2 e(final Uo4 uo4) {
        final MC2 mc2 = new MC2();
        MC2 mc22 = this.b;
        if (!(mc22 != null)) {
            mc22 = new MC2();
            List<ResolveInfo> queryIntentServices = V60.a.getPackageManager().queryIntentServices(new Intent("org.chromium.chrome.browser.usage_stats.service.WELLBEING").setPackage("com.google.android.apps.wellbeing"), 0);
            Intent className = (queryIntentServices == null || queryIntentServices.isEmpty()) ? null : new Intent().setClassName("com.google.android.apps.wellbeing", queryIntentServices.get(0).serviceInfo.name);
            if (!(className != null && V60.a.bindService(className, this.a, 1))) {
                AbstractC4851eH1.a("DWClient", "WellbeingService not found", new Object[0]);
                mc22.e(null);
            } else {
                this.b = mc22;
            }
        }
        mc22.h(new Callback() { // from class: Bn0
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Uo4 uo42 = Uo4.this;
                MC2 mc23 = mc2;
                InterfaceC5670gg1 interfaceC5670gg1 = (InterfaceC5670gg1) obj;
                try {
                    ParcelableWellbeingRequest parcelableWellbeingRequest = new ParcelableWellbeingRequest(new C5001ej2(uo42.toByteArray()));
                    BinderC0716Fn0 binderC0716Fn0 = new BinderC0716Fn0(mc23);
                    C4982eg1 c4982eg1 = (C4982eg1) interfaceC5670gg1;
                    c4982eg1.getClass();
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("org.chromium.chrome.browser.usage_stats.idl.IWellbeingService");
                        obtain.writeInt(1);
                        parcelableWellbeingRequest.writeToParcel(obtain, 0);
                        obtain.writeStrongInterface(binderC0716Fn0);
                        c4982eg1.a.transact(1, obtain, null, 1);
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    AbstractC4851eH1.a("DWClient", "Error calling DigitalWellbeing", e);
                    mc23.b((Wo4) ((Vo4) Wo4.j.j()).j());
                }
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, new Callback() { // from class: Cn0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AbstractC4851eH1.a("DWClient", "Failed to bind to WellbeingService", new Object[0]);
                MC2.this.b((Wo4) ((Vo4) Wo4.j.j()).j());
            }
        });
        return mc2;
    }

    @Override // defpackage.C12233zn0
    public final void a() {
        To4 to4 = (To4) Uo4.l.j();
        C3591ad2 c3591ad2 = (C3591ad2) ((C3002Xc2) C3591ad2.o.j()).j();
        if (to4.h) {
            to4.l();
            to4.h = false;
        }
        Uo4 uo4 = (Uo4) to4.g;
        uo4.getClass();
        c3591ad2.getClass();
        uo4.k = c3591ad2;
        uo4.j = 3;
        e((Uo4) to4.j()).f(new C0066An0());
    }

    @Override // defpackage.C12233zn0
    public final void d(boolean z) {
        int i = z ? 3 : 2;
        To4 to4 = (To4) Uo4.l.j();
        C8403od2 c8403od2 = (C8403od2) C8746pd2.l.j();
        if (c8403od2.h) {
            c8403od2.l();
            c8403od2.h = false;
        }
        C8746pd2 c8746pd2 = (C8746pd2) c8403od2.g;
        c8746pd2.getClass();
        c8746pd2.k = AbstractC2373Sg3.b(i);
        c8746pd2.j |= 1;
        C8746pd2 c8746pd22 = (C8746pd2) c8403od2.j();
        if (to4.h) {
            to4.l();
            to4.h = false;
        }
        Uo4 uo4 = (Uo4) to4.g;
        uo4.getClass();
        c8746pd22.getClass();
        uo4.k = c8746pd22;
        uo4.j = 2;
        e((Uo4) to4.j()).f(new C0066An0());
    }

    @Override // defpackage.C12233zn0
    public final void b(long j, long j2) {
        C3002Xc2 c3002Xc2 = (C3002Xc2) C3591ad2.o.j();
        C10721vN3 a = BinderC6159i44.a(j);
        if (c3002Xc2.h) {
            c3002Xc2.l();
            c3002Xc2.h = false;
        }
        C3591ad2 c3591ad2 = (C3591ad2) c3002Xc2.g;
        c3591ad2.getClass();
        a.getClass();
        c3591ad2.m = a;
        c3591ad2.j |= 1;
        C10721vN3 a2 = BinderC6159i44.a(j2);
        if (c3002Xc2.h) {
            c3002Xc2.l();
            c3002Xc2.h = false;
        }
        C3591ad2 c3591ad22 = (C3591ad2) c3002Xc2.g;
        c3591ad22.getClass();
        a2.getClass();
        c3591ad22.n = a2;
        c3591ad22.j |= 2;
        C3591ad2 c3591ad23 = (C3591ad2) c3002Xc2.j();
        To4 to4 = (To4) Uo4.l.j();
        if (to4.h) {
            to4.l();
            to4.h = false;
        }
        Uo4 uo4 = (Uo4) to4.g;
        uo4.getClass();
        c3591ad23.getClass();
        uo4.k = c3591ad23;
        uo4.j = 3;
        e((Uo4) to4.j()).f(new C0066An0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.C12233zn0
    public final void c(ArrayList arrayList) {
        C3002Xc2 c3002Xc2 = (C3002Xc2) C3591ad2.o.j();
        C3132Yc2 c3132Yc2 = (C3132Yc2) C3262Zc2.k.j();
        if (c3132Yc2.h) {
            c3132Yc2.l();
            c3132Yc2.h = false;
        }
        C3262Zc2 c3262Zc2 = (C3262Zc2) c3132Yc2.g;
        InterfaceC1377Kp1 interfaceC1377Kp1 = c3262Zc2.j;
        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
            c3262Zc2.j = QX0.r(interfaceC1377Kp1);
        }
        List list = c3262Zc2.j;
        Charset charset = AbstractC1507Lp1.a;
        if (arrayList instanceof InterfaceC6812jz1) {
            List e = ((InterfaceC6812jz1) arrayList).e();
            InterfaceC6812jz1 interfaceC6812jz1 = (InterfaceC6812jz1) list;
            int size = list.size();
            for (Object obj : e) {
                if (obj == null) {
                    String a = AbstractC9307rF1.a("Element at index ", interfaceC6812jz1.size() - size, " is null.");
                    int size2 = interfaceC6812jz1.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            interfaceC6812jz1.remove(size2);
                        }
                    }
                    throw new NullPointerException(a);
                }
                if (obj instanceof AbstractC4147cE) {
                    interfaceC6812jz1.h((AbstractC4147cE) obj);
                } else {
                    interfaceC6812jz1.add((String) obj);
                }
            }
        } else if (arrayList instanceof InterfaceC2337Rz2) {
            list.addAll(arrayList);
        } else {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
            }
            int size3 = list.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    String a2 = AbstractC9307rF1.a("Element at index ", list.size() - size3, " is null.");
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            list.remove(size4);
                        }
                    }
                    throw new NullPointerException(a2);
                }
                list.add(next);
            }
        }
        C3262Zc2 c3262Zc22 = (C3262Zc2) c3132Yc2.j();
        if (c3002Xc2.h) {
            c3002Xc2.l();
            c3002Xc2.h = false;
        }
        C3591ad2 c3591ad2 = (C3591ad2) c3002Xc2.g;
        c3591ad2.getClass();
        c3262Zc22.getClass();
        c3591ad2.l = c3262Zc22;
        c3591ad2.k = 3;
        C3591ad2 c3591ad22 = (C3591ad2) c3002Xc2.j();
        To4 to4 = (To4) Uo4.l.j();
        if (to4.h) {
            to4.l();
            to4.h = false;
        }
        Uo4 uo4 = (Uo4) to4.g;
        uo4.getClass();
        c3591ad22.getClass();
        uo4.k = c3591ad22;
        uo4.j = 3;
        e((Uo4) to4.j()).f(new C0066An0());
    }
}
