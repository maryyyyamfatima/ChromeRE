package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pL2 */
/* loaded from: classes.dex */
public final class HandlerC8653pL2 extends Handler {
    public final WeakReference a;

    public HandlerC8653pL2(C7622mL2 c7622mL2) {
        this.a = new WeakReference(c7622mL2);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C3522aQ1 c3522aQ1;
        C7622mL2 c7622mL2 = (C7622mL2) this.a.get();
        if (c7622mL2 != null) {
            int i = message.what;
            int i2 = message.arg1;
            int i3 = message.arg2;
            Object obj = message.obj;
            Bundle peekData = message.peekData();
            SparseArray sparseArray = c7622mL2.h;
            InterfaceC7966nL2 interfaceC7966nL2 = null;
            ServiceConnectionC10024tL2 serviceConnectionC10024tL2 = c7622mL2.i;
            switch (i) {
                case 0:
                    if (i2 == c7622mL2.g) {
                        c7622mL2.g = 0;
                        if (serviceConnectionC10024tL2.s == c7622mL2) {
                            serviceConnectionC10024tL2.l();
                        }
                    }
                    if (((C8996qL2) sparseArray.get(i2)) != null) {
                        sparseArray.remove(i2);
                        return;
                    }
                    return;
                case 1:
                default:
                    return;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle = (Bundle) obj;
                        if (c7622mL2.f == 0 && i2 == c7622mL2.g && i3 >= 1) {
                            c7622mL2.g = 0;
                            c7622mL2.f = i3;
                            C5928hQ1 a = C5928hQ1.a(bundle);
                            if (serviceConnectionC10024tL2.s == c7622mL2) {
                                serviceConnectionC10024tL2.g(a);
                            }
                            if (serviceConnectionC10024tL2.s == c7622mL2) {
                                serviceConnectionC10024tL2.t = true;
                                ArrayList arrayList = serviceConnectionC10024tL2.p;
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    ((InterfaceC7966nL2) arrayList.get(i4)).b(serviceConnectionC10024tL2.s);
                                }
                                WP1 wp1 = serviceConnectionC10024tL2.j;
                                if (wp1 != null) {
                                    C7622mL2 c7622mL22 = serviceConnectionC10024tL2.s;
                                    int i5 = c7622mL22.d;
                                    c7622mL22.d = i5 + 1;
                                    c7622mL22.b(10, i5, 0, wp1.a, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle2 = (Bundle) obj;
                        C8996qL2 c8996qL2 = (C8996qL2) sparseArray.get(i2);
                        if (c8996qL2 != null) {
                            sparseArray.remove(i2);
                            c8996qL2.a(bundle2);
                            return;
                        }
                        return;
                    }
                    return;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        if (peekData != null) {
                            peekData.getString("error");
                        }
                        Bundle bundle3 = (Bundle) obj;
                        if (((C8996qL2) sparseArray.get(i2)) != null) {
                            sparseArray.remove(i2);
                            Objects.toString(bundle3);
                            return;
                        }
                        return;
                    }
                    return;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle4 = (Bundle) obj;
                        if (c7622mL2.f != 0) {
                            C5928hQ1 a2 = C5928hQ1.a(bundle4);
                            if (serviceConnectionC10024tL2.s == c7622mL2) {
                                serviceConnectionC10024tL2.g(a2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 6:
                    if (obj instanceof Bundle) {
                        Bundle bundle5 = (Bundle) obj;
                        C8996qL2 c8996qL22 = (C8996qL2) sparseArray.get(i2);
                        if (bundle5 != null && bundle5.containsKey("routeId")) {
                            sparseArray.remove(i2);
                            c8996qL22.a(bundle5);
                            return;
                        } else {
                            c8996qL22.getClass();
                            Objects.toString(bundle5);
                            return;
                        }
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        Bundle bundle6 = (Bundle) obj;
                        if (c7622mL2.f != 0) {
                            Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                            TP1 tp1 = bundle7 != null ? new TP1(bundle7) : null;
                            ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = parcelableArrayList.iterator();
                            while (it.hasNext()) {
                                Bundle bundle8 = (Bundle) it.next();
                                if (bundle8 == null) {
                                    c3522aQ1 = null;
                                } else {
                                    Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                    c3522aQ1 = new C3522aQ1(bundle9 != null ? new TP1(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                }
                                arrayList2.add(c3522aQ1);
                            }
                            if (serviceConnectionC10024tL2.s == c7622mL2) {
                                Iterator it2 = serviceConnectionC10024tL2.p.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        InterfaceC7966nL2 interfaceC7966nL22 = (InterfaceC7966nL2) it2.next();
                                        if (interfaceC7966nL22.a() == i3) {
                                            interfaceC7966nL2 = interfaceC7966nL22;
                                        }
                                    }
                                }
                                if (interfaceC7966nL2 instanceof C9338rL2) {
                                    ((C9338rL2) interfaceC7966nL2).j(tp1, arrayList2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 8:
                    if (serviceConnectionC10024tL2.s == c7622mL2) {
                        ArrayList arrayList3 = serviceConnectionC10024tL2.p;
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                InterfaceC7966nL2 interfaceC7966nL23 = (InterfaceC7966nL2) it3.next();
                                if (interfaceC7966nL23.a() == i3) {
                                    interfaceC7966nL2 = interfaceC7966nL23;
                                }
                            }
                        }
                        C10367uL2 c10367uL2 = serviceConnectionC10024tL2.u;
                        if (c10367uL2 != null && (interfaceC7966nL2 instanceof AbstractC4896eQ1)) {
                            AbstractC4896eQ1 abstractC4896eQ1 = (AbstractC4896eQ1) interfaceC7966nL2;
                            C11420xQ1 c11420xQ1 = c10367uL2.a.b;
                            if (c11420xQ1.u == abstractC4896eQ1) {
                                c11420xQ1.k(c11420xQ1.c(), 2);
                            }
                        }
                        arrayList3.remove(interfaceC7966nL2);
                        interfaceC7966nL2.c();
                        serviceConnectionC10024tL2.m();
                        return;
                    }
                    return;
            }
        }
    }
}
