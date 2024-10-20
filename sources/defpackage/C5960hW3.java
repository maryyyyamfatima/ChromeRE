package defpackage;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hW3 */
/* loaded from: classes.dex */
public final class C5960hW3 implements InterfaceC12166zc {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ C6646jW3 b;

    public C5960hW3(C6646jW3 c6646jW3) {
        this.b = c6646jW3;
    }

    @Override // defpackage.InterfaceC12166zc
    public final void a(AbstractC6096hu abstractC6096hu) {
        g(abstractC6096hu);
    }

    @Override // defpackage.InterfaceC12166zc
    public final void b(AbstractC6096hu abstractC6096hu) {
        g(abstractC6096hu);
        if (TextUtils.isEmpty((String) this.b.c.d(abstractC6096hu.hashCode()))) {
            return;
        }
        abstractC6096hu.hashCode();
    }

    @Override // defpackage.InterfaceC12166zc
    public final void c(AbstractC6096hu abstractC6096hu) {
        DW3 dw3;
        C6646jW3 c6646jW3 = this.b;
        List<C11356xD2> list = (List) c6646jW3.a.get(abstractC6096hu);
        if (list != null && (dw3 = c6646jW3.i) != null) {
            for (C11356xD2 c11356xD2 : list) {
                Object obj = abstractC6096hu.b;
                dw3.getClass();
                InterfaceC11101wV0 interfaceC11101wV0 = (InterfaceC11101wV0) obj;
                if (interfaceC11101wV0 != null) {
                    String str = c11356xD2.a.b;
                    ((C6206iD0) interfaceC11101wV0).d(new WV3());
                }
            }
        }
        f(abstractC6096hu);
    }

    @Override // defpackage.InterfaceC12166zc
    public final void d(AbstractC6096hu abstractC6096hu) {
        f(abstractC6096hu);
    }

    @Override // defpackage.InterfaceC12166zc
    public final boolean e(AbstractC6096hu abstractC6096hu) {
        Float f;
        ArrayList arrayList = this.a;
        abstractC6096hu.a(arrayList);
        int size = arrayList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C10670vD2 c10670vD2 = (C10670vD2) arrayList.get(i);
            YV3 yv3 = c10670vD2.a.a;
            C6646jW3 c6646jW3 = this.b;
            C4241cW3 c4241cW3 = (C4241cW3) c6646jW3.b.a(yv3);
            C11356xD2 c11356xD2 = c10670vD2.a;
            C5272fW3 c5272fW3 = c4241cW3 != null ? (C5272fW3) c4241cW3.a.get(c11356xD2.b) : null;
            if (c6646jW3.k != null) {
                String.valueOf(yv3);
                c11356xD2.b.getName();
            }
            if (c5272fW3 == null) {
                z = false;
            }
            if (z && (f = c5272fW3.d) != null && f.floatValue() != c10670vD2.b) {
                z = false;
            }
        }
        arrayList.clear();
        return z;
    }

    public final void g(AbstractC6096hu abstractC6096hu) {
        ArrayList arrayList = this.a;
        abstractC6096hu.a(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C10670vD2 c10670vD2 = (C10670vD2) arrayList.get(i);
            C4241cW3 c4241cW3 = (C4241cW3) this.b.b.a(c10670vD2.a.a);
            if (c4241cW3 != null) {
                C5272fW3 c5272fW3 = (C5272fW3) c4241cW3.a.get(c10670vD2.a.b);
                c5272fW3.c = Float.valueOf(c10670vD2.b);
                c5272fW3.b = abstractC6096hu;
            }
        }
        arrayList.clear();
    }

    public final void f(AbstractC6096hu abstractC6096hu) {
        boolean z;
        List list;
        C3603af2 c3603af2;
        String str;
        C6646jW3 c6646jW3 = this.b;
        List list2 = (List) c6646jW3.a.remove(abstractC6096hu);
        if (list2 == null) {
            return;
        }
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C11356xD2 c11356xD2 = (C11356xD2) list2.get(i);
            YV3 yv3 = c11356xD2.a;
            ZV3 zv3 = c6646jW3.b;
            C4241cW3 c4241cW3 = (C4241cW3) zv3.a(yv3);
            boolean z2 = c4241cW3.c == 2;
            HashMap hashMap = c4241cW3.a;
            InterfaceC1045Ib interfaceC1045Ib = c11356xD2.b;
            if (z2) {
                C5272fW3 c5272fW3 = (C5272fW3) hashMap.get(interfaceC1045Ib);
                if (c5272fW3 == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                c5272fW3.e--;
                if (c4241cW3.c != 2) {
                    throw new RuntimeException("This should only be checked for disappearing animations");
                }
                Iterator it = hashMap.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C5272fW3) it.next()).e > 0) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z && c4241cW3.b != null) {
                    for (InterfaceC1045Ib interfaceC1045Ib2 : hashMap.keySet()) {
                        C3603af2 c3603af22 = c4241cW3.b;
                        short s = c3603af22.b;
                        for (int i2 = 0; i2 < s; i2++) {
                            interfaceC1045Ib2.a(c3603af22.b(i2));
                        }
                    }
                }
            } else {
                C5272fW3 c5272fW32 = (C5272fW3) hashMap.get(interfaceC1045Ib);
                if (c5272fW32 == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                int i3 = c5272fW32.e - 1;
                c5272fW32.e = i3;
                if (i3 > 0) {
                    z = false;
                } else {
                    hashMap.remove(interfaceC1045Ib);
                    boolean isEmpty = hashMap.isEmpty();
                    if (c4241cW3.b != null) {
                        float c = interfaceC1045Ib.c((C10926vy1) c4241cW3.e.c());
                        C3603af2 c3603af23 = c4241cW3.b;
                        short s2 = c3603af23.b;
                        for (int i4 = 0; i4 < s2; i4++) {
                            interfaceC1045Ib.b(c3603af23.b(i4), c);
                        }
                    }
                    z = isEmpty;
                }
            }
            if (z) {
                if (c6646jW3.k != null) {
                    String.valueOf(yv3);
                }
                C3603af2 c3603af24 = c4241cW3.b;
                if (c3603af24 != null) {
                    Object obj = c3603af24.a[3];
                    if (obj instanceof View) {
                        c6646jW3.f((View) obj, true);
                    }
                }
                DW3 dw3 = c6646jW3.i;
                if (dw3 != null) {
                    EW3 ew3 = dw3.b;
                    C3603af2 c3603af25 = (C3603af2) ew3.a.remove(yv3);
                    C3471aG0 c3471aG0 = dw3.a;
                    if (c3603af25 != null) {
                        FW3.f(c3471aG0, c3603af25);
                    } else {
                        if (!ew3.f.remove(yv3) && (str = ((EW3) c3471aG0.b).j) != null) {
                            Log.e(str, "Ending animation for id " + String.valueOf(yv3) + " but it wasn't recorded as animating!");
                        }
                        GW3 gw3 = ew3.i;
                        C3603af2 c3603af26 = gw3 != null ? (C3603af2) ((C0772Fy1) gw3).P.get(yv3) : null;
                        if (c3603af26 != null) {
                            short s3 = c3603af26.b;
                            int i5 = 0;
                            while (i5 < s3) {
                                FW3.q(c3471aG0, ew3.i, ((C0772Fy1) ew3.i).l(((C10926vy1) c3603af26.b(i5)).s), false);
                                i5++;
                                list2 = list2;
                            }
                        }
                    }
                }
                list = list2;
                zv3.b(yv3);
                if (c4241cW3.d != null) {
                    c3603af2 = null;
                    c4241cW3.d = null;
                } else {
                    c3603af2 = null;
                }
                if (c4241cW3.e != null) {
                    c4241cW3.e = c3603af2;
                }
            } else {
                list = list2;
            }
            i++;
            list2 = list;
        }
        int hashCode = abstractC6096hu.hashCode();
        C1593Mg3 c1593Mg3 = c6646jW3.c;
        if (TextUtils.isEmpty((String) c1593Mg3.d(hashCode))) {
            return;
        }
        abstractC6096hu.hashCode();
        c1593Mg3.h(abstractC6096hu.hashCode());
    }
}
