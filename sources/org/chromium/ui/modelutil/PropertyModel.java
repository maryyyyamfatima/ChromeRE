package org.chromium.ui.modelutil;

import defpackage.AD2;
import defpackage.CD2;
import defpackage.DD2;
import defpackage.ED2;
import defpackage.FD2;
import defpackage.GD2;
import defpackage.HD2;
import defpackage.ID2;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.MD2;
import defpackage.ND2;
import defpackage.OD2;
import defpackage.PD2;
import defpackage.WD2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PropertyModel extends WD2 {
    public final Map b;

    public PropertyModel(FD2... fd2Arr) {
        this(e(fd2Arr));
    }

    public PropertyModel(List list) {
        this(e((FD2[]) list.toArray(new FD2[list.size()])));
    }

    public PropertyModel(Map map) {
        this.b = map;
    }

    public final float g(MD2 md2) {
        CD2 cd2 = (CD2) this.b.get(md2);
        if (cd2 == null) {
            return 0.0f;
        }
        return cd2.a;
    }

    public final void l(MD2 md2, float f) {
        Map map = this.b;
        CD2 cd2 = (CD2) map.get(md2);
        if (cd2 == null) {
            cd2 = new CD2();
            map.put(md2, cd2);
        } else if (cd2.a == f) {
            return;
        }
        cd2.a = f;
        c(md2);
    }

    public final int h(ID2 id2) {
        DD2 dd2 = (DD2) this.b.get(id2);
        if (dd2 == null) {
            return 0;
        }
        return dd2.a;
    }

    public final void m(ND2 nd2, int i) {
        Map map = this.b;
        DD2 dd2 = (DD2) map.get(nd2);
        if (dd2 == null) {
            dd2 = new DD2();
            map.put(nd2, dd2);
        } else if (dd2.a == i) {
            return;
        }
        dd2.a = i;
        c(nd2);
    }

    public final void n(OD2 od2, long j) {
        Map map = this.b;
        ED2 ed2 = (ED2) map.get(od2);
        if (ed2 == null) {
            ed2 = new ED2();
            map.put(od2, ed2);
        } else if (ed2.a == j) {
            return;
        }
        ed2.a = j;
        c(od2);
    }

    public final boolean j(HD2 hd2) {
        AD2 ad2 = (AD2) this.b.get(hd2);
        if (ad2 == null) {
            return false;
        }
        return ad2.a;
    }

    public final void k(LD2 ld2, boolean z) {
        Map map = this.b;
        AD2 ad2 = (AD2) map.get(ld2);
        if (ad2 == null) {
            ad2 = new AD2();
            map.put(ld2, ad2);
        } else if (ad2.a == z) {
            return;
        }
        ad2.a = z;
        c(ld2);
    }

    public final Object i(JD2 jd2) {
        GD2 gd2 = (GD2) this.b.get(jd2);
        if (gd2 == null) {
            return null;
        }
        return gd2.a;
    }

    public final void o(PD2 pd2, Object obj) {
        Map map = this.b;
        GD2 gd2 = (GD2) map.get(pd2);
        if (gd2 != null) {
            if (!pd2.b && Objects.equals(gd2.a, obj)) {
                return;
            }
        } else {
            gd2 = new GD2();
            map.put(pd2, gd2);
        }
        gd2.a = obj;
        c(pd2);
    }

    @Override // defpackage.WD2
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add((FD2) entry.getKey());
            }
        }
        return arrayList;
    }

    public static FD2[] f(FD2[] fd2Arr, FD2[] fd2Arr2) {
        FD2[] fd2Arr3 = new FD2[fd2Arr.length + fd2Arr2.length];
        System.arraycopy(fd2Arr, 0, fd2Arr3, 0, fd2Arr.length);
        System.arraycopy(fd2Arr2, 0, fd2Arr3, fd2Arr.length, fd2Arr2.length);
        return fd2Arr3;
    }

    public static HashMap e(FD2[] fd2Arr) {
        HashMap hashMap = new HashMap();
        for (FD2 fd2 : fd2Arr) {
            if (hashMap.containsKey(fd2)) {
                throw new IllegalArgumentException("Duplicate key: " + fd2);
            }
            hashMap.put(fd2, null);
        }
        return hashMap;
    }
}
