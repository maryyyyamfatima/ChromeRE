package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3727b02 {
    public static final C3383a02 e = new C3383a02();
    public static final YZ1 f = new YZ1();
    public final ArrayList a;
    public final C3383a02 b;
    public final HashSet c;
    public final InterfaceC9208qx2 d;

    public C3727b02(C8974qH0 c8974qH0) {
        C3383a02 c3383a02 = e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = c8974qH0;
        this.b = c3383a02;
    }

    public final synchronized ArrayList e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ZZ1 zz1 = (ZZ1) it.next();
            if (zz1.a.isAssignableFrom(C5788h01.class) && zz1.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(zz1.c);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ZZ1 zz1 = (ZZ1) it.next();
                if (!this.c.contains(zz1) && zz1.a.isAssignableFrom(cls)) {
                    this.c.add(zz1);
                    InterfaceC8030nY1 c = zz1.c.c(this);
                    AbstractC6464iy2.b(c);
                    arrayList.add(c);
                    this.c.remove(zz1);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ZZ1 zz1 = (ZZ1) it.next();
            if (!arrayList.contains(zz1.b) && zz1.a.isAssignableFrom(cls)) {
                arrayList.add(zz1.b);
            }
        }
        return arrayList;
    }

    public final synchronized InterfaceC8030nY1 b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.a.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                ZZ1 zz1 = (ZZ1) it.next();
                if (this.c.contains(zz1)) {
                    z = true;
                } else {
                    if (!zz1.a.isAssignableFrom(cls) || !zz1.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.c.add(zz1);
                        arrayList.add(a(zz1));
                        this.c.remove(zz1);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C3383a02 c3383a02 = this.b;
                InterfaceC9208qx2 interfaceC9208qx2 = this.d;
                c3383a02.getClass();
                return new XZ1(arrayList, interfaceC9208qx2);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC8030nY1) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new IL2(cls, cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final InterfaceC8030nY1 a(ZZ1 zz1) {
        InterfaceC8030nY1 c = zz1.c.c(this);
        AbstractC6464iy2.b(c);
        return c;
    }
}
