package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cz1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4407cz1 implements VD2 {
    public final WD2 a;
    public final Object g;
    public final C3720az1 h;
    public final InterfaceC8411oe4 i;
    public final TD2 j;
    public boolean k;
    public Object l;
    public final HashSet m;

    public C4407cz1(PropertyModel propertyModel, Object obj, C3720az1 c3720az1, InterfaceC8411oe4 interfaceC8411oe4, TD2 td2) {
        HashSet hashSet = new HashSet();
        this.m = hashSet;
        this.a = propertyModel;
        this.g = obj;
        this.h = c3720az1;
        this.i = interfaceC8411oe4;
        this.j = td2;
        hashSet.addAll(propertyModel.b());
        interfaceC8411oe4.a(new Callback() { // from class: bz1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                C4407cz1 c4407cz1 = C4407cz1.this;
                c4407cz1.l = obj2;
                c4407cz1.k = false;
                c4407cz1.a();
            }
        });
        propertyModel.a(this);
    }

    public final void a() {
        WD2 wd2;
        TD2 td2;
        Object obj;
        HashSet hashSet = this.m;
        Iterator it = hashSet.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            wd2 = this.a;
            td2 = this.j;
            obj = this.g;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (next == obj) {
                z = true;
            } else {
                td2.d(wd2, this.l, next);
            }
        }
        if (z) {
            td2.d(wd2, this.l, obj);
        }
        hashSet.clear();
    }

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        this.m.add(obj);
        C3720az1 c3720az1 = this.h;
        c3720az1.getClass();
        if (((PropertyModel) this.a).j(c3720az1.a) || obj == this.g) {
            if (this.l == null) {
                if (this.k) {
                    return;
                }
                this.k = true;
                this.i.b();
                return;
            }
            a();
        }
    }
}
