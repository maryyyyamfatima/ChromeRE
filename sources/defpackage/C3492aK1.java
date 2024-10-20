package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3492aK1 {
    public final C6162i51 a = new C6162i51();
    public final ZJ1 b = new ZJ1();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final int e;
    public int f;

    public C3492aK1(int i) {
        this.e = i;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC1994Pj d = d(cls);
        int b = d.b(obj);
        int a = d.a() * b;
        int i = 1;
        if (a <= this.e / 2) {
            YJ1 yj1 = (YJ1) this.b.b();
            yj1.b = b;
            yj1.c = cls;
            this.a.b(yj1, obj);
            NavigableMap f = f(cls);
            Integer num = (Integer) f.get(Integer.valueOf(yj1.b));
            Integer valueOf = Integer.valueOf(yj1.b);
            if (num != null) {
                i = 1 + num.intValue();
            }
            f.put(valueOf, Integer.valueOf(i));
            this.f += a;
            b(this.e);
        }
    }

    public final synchronized Object c(Class cls, int i) {
        YJ1 yj1;
        boolean z;
        Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
        boolean z2 = false;
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2) {
                z = false;
                if (!z || num.intValue() <= i * 8) {
                    z2 = true;
                }
            }
            z = true;
            if (!z) {
            }
            z2 = true;
        }
        if (z2) {
            ZJ1 zj1 = this.b;
            int intValue = num.intValue();
            yj1 = (YJ1) zj1.b();
            yj1.b = intValue;
            yj1.c = cls;
        } else {
            YJ1 yj12 = (YJ1) this.b.b();
            yj12.b = i;
            yj12.c = cls;
            yj1 = yj12;
        }
        return e(yj1, cls);
    }

    public final Object e(YJ1 yj1, Class cls) {
        InterfaceC1994Pj d = d(cls);
        Object a = this.a.a(yj1);
        if (a != null) {
            this.f -= d.a() * d.b(a);
            a(cls, d.b(a));
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(d.getTag(), 2)) {
            d.getTag();
        }
        return d.newArray(yj1.b);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object c = this.a.c();
            AbstractC6464iy2.b(c);
            InterfaceC1994Pj d = d(c.getClass());
            this.f -= d.a() * d.b(c);
            a(c.getClass(), d.b(c));
            if (Log.isLoggable(d.getTag(), 2)) {
                d.getTag();
                d.b(c);
            }
        }
    }

    public final void a(Class cls, int i) {
        NavigableMap f = f(cls);
        Integer num = (Integer) f.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + String.valueOf(this));
        }
        if (num.intValue() == 1) {
            f.remove(Integer.valueOf(i));
        } else {
            f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final InterfaceC1994Pj d(Class cls) {
        HashMap hashMap = this.d;
        InterfaceC1994Pj interfaceC1994Pj = (InterfaceC1994Pj) hashMap.get(cls);
        if (interfaceC1994Pj == null) {
            if (cls.equals(int[].class)) {
                interfaceC1994Pj = new C0982Ho1();
            } else if (cls.equals(byte[].class)) {
                interfaceC1994Pj = new C10324uD();
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, interfaceC1994Pj);
        }
        return interfaceC1994Pj;
    }
}
