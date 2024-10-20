package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IN2 extends AbstractC2834Vv {
    public final Context F;
    public final ComponentCallbacks2C5575gO2 G;
    public final Class H;
    public final BZ0 I;

    /* renamed from: J, reason: collision with root package name */
    public C5623gY0 f11446J;
    public Object K;
    public ArrayList L;
    public IN2 M;
    public IN2 N;
    public boolean O = true;
    public boolean P;
    public boolean Q;

    static {
    }

    public IN2(a aVar, ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2, Class cls, Context context) {
        C7981nO2 c7981nO2;
        this.G = componentCallbacks2C5575gO2;
        this.H = cls;
        this.F = context;
        Map map = componentCallbacks2C5575gO2.a.h.f;
        C5623gY0 c5623gY0 = (C5623gY0) map.get(cls);
        if (c5623gY0 == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c5623gY0 = (C5623gY0) entry.getValue();
                }
            }
        }
        this.f11446J = c5623gY0 == null ? BZ0.k : c5623gY0;
        this.I = aVar.h;
        Iterator it = componentCallbacks2C5575gO2.n.iterator();
        while (it.hasNext()) {
            D((InterfaceC4200cO2) it.next());
        }
        synchronized (componentCallbacks2C5575gO2) {
            c7981nO2 = componentCallbacks2C5575gO2.o;
        }
        a(c7981nO2);
    }

    @Override // defpackage.AbstractC2834Vv
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public IN2 a(AbstractC2834Vv abstractC2834Vv) {
        AbstractC6464iy2.b(abstractC2834Vv);
        return (IN2) super.a(abstractC2834Vv);
    }

    public IN2 I(InterfaceC4597dZ0 interfaceC4597dZ0) {
        return O(interfaceC4597dZ0);
    }

    public IN2 J(BitmapDrawable bitmapDrawable) {
        return O(bitmapDrawable).a((C7981nO2) new C7981nO2().e(AbstractC6410ip0.a));
    }

    public IN2 M(String str) {
        return O(str);
    }

    public IN2 K(Uri uri) {
        return O(uri);
    }

    public IN2 L(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        IN2 O = O(num);
        ConcurrentHashMap concurrentHashMap = AbstractC0305Cj.a;
        Context context = this.F;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = AbstractC0305Cj.a;
        InterfaceC6098hu1 interfaceC6098hu1 = (InterfaceC6098hu1) concurrentHashMap2.get(packageName);
        if (interfaceC6098hu1 == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            R82 r82 = new R82(uuid);
            interfaceC6098hu1 = (InterfaceC6098hu1) concurrentHashMap2.putIfAbsent(packageName, r82);
            if (interfaceC6098hu1 == null) {
                interfaceC6098hu1 = r82;
            }
        }
        return O.a((C7981nO2) new C7981nO2().w(new C1819Oa(context.getResources().getConfiguration().uiMode & 48, interfaceC6098hu1)));
    }

    public IN2 N(byte[] bArr) {
        IN2 O = O(bArr);
        if (!AbstractC2834Vv.j(O.a, 4)) {
            O = O.a((C7981nO2) new C7981nO2().e(AbstractC6410ip0.a));
        }
        if (AbstractC2834Vv.j(O.a, 256)) {
            return O;
        }
        if (C7981nO2.F == null) {
            C7981nO2.F = (C7981nO2) ((C7981nO2) new C7981nO2().x(true)).b();
        }
        return O.a(C7981nO2.F);
    }

    @Override // defpackage.AbstractC2834Vv
    /* renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IN2 clone() {
        IN2 in2 = (IN2) super.clone();
        in2.f11446J = in2.f11446J.clone();
        if (in2.L != null) {
            in2.L = new ArrayList(in2.L);
        }
        IN2 in22 = in2.M;
        if (in22 != null) {
            in2.M = in22.c();
        }
        IN2 in23 = in2.N;
        if (in23 != null) {
            in2.N = in23.c();
        }
        return in2;
    }

    public final void H(TE3 te3, WN2 wn2, AbstractC2834Vv abstractC2834Vv, Executor executor) {
        AbstractC6464iy2.b(te3);
        if (!this.P) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        GN2 F = F(abstractC2834Vv.p, abstractC2834Vv.o, this.f11446J, abstractC2834Vv.i, abstractC2834Vv, null, wn2, te3, new Object(), executor);
        GN2 l = te3.l();
        if (F.b(l)) {
            if (!(!abstractC2834Vv.n && l.j())) {
                AbstractC6464iy2.b(l);
                if (l.isRunning()) {
                    return;
                }
                l.c();
                return;
            }
        }
        this.G.n(te3);
        te3.e(F);
        ComponentCallbacks2C5575gO2 componentCallbacks2C5575gO2 = this.G;
        synchronized (componentCallbacks2C5575gO2) {
            componentCallbacks2C5575gO2.k.a.add(te3);
            C9696sO2 c9696sO2 = componentCallbacks2C5575gO2.i;
            c9696sO2.a.add(F);
            if (!c9696sO2.c) {
                F.c();
            } else {
                F.clear();
                c9696sO2.b.add(F);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GN2 F(int i, int i2, C5623gY0 c5623gY0, EnumC7567mA2 enumC7567mA2, AbstractC2834Vv abstractC2834Vv, KN2 kn2, WN2 wn2, TE3 te3, Object obj, Executor executor) {
        ZC0 zc0;
        KN2 kn22;
        C3133Yc3 P;
        int i3;
        EnumC7567mA2 enumC7567mA22;
        int i4;
        int i5;
        if (this.N != null) {
            kn22 = new ZC0(obj, kn2);
            zc0 = kn22;
        } else {
            zc0 = 0;
            kn22 = kn2;
        }
        IN2 in2 = this.M;
        if (in2 == null) {
            P = P(i, i2, c5623gY0, enumC7567mA2, abstractC2834Vv, kn22, wn2, te3, obj, executor);
        } else {
            if (this.Q) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            C5623gY0 c5623gY02 = in2.O ? c5623gY0 : in2.f11446J;
            if (AbstractC2834Vv.j(in2.a, 8)) {
                enumC7567mA22 = this.M.i;
            } else {
                int ordinal = enumC7567mA2.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    enumC7567mA22 = EnumC7567mA2.IMMEDIATE;
                } else if (ordinal == 2) {
                    enumC7567mA22 = EnumC7567mA2.HIGH;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(this.i)));
                    }
                    enumC7567mA22 = EnumC7567mA2.NORMAL;
                }
            }
            EnumC7567mA2 enumC7567mA23 = enumC7567mA22;
            IN2 in22 = this.M;
            int i6 = in22.p;
            int i7 = in22.o;
            if (AbstractC10296u74.g(i, i2)) {
                IN2 in23 = this.M;
                if (!AbstractC10296u74.g(in23.p, in23.o)) {
                    i5 = abstractC2834Vv.p;
                    i4 = abstractC2834Vv.o;
                    KL3 kl3 = new KL3(obj, kn22);
                    C3133Yc3 P2 = P(i, i2, c5623gY0, enumC7567mA2, abstractC2834Vv, kl3, wn2, te3, obj, executor);
                    this.Q = true;
                    IN2 in24 = this.M;
                    GN2 F = in24.F(i5, i4, c5623gY02, enumC7567mA23, in24, kl3, wn2, te3, obj, executor);
                    this.Q = false;
                    kl3.c = P2;
                    kl3.d = F;
                    P = kl3;
                }
            }
            i4 = i7;
            i5 = i6;
            KL3 kl32 = new KL3(obj, kn22);
            C3133Yc3 P22 = P(i, i2, c5623gY0, enumC7567mA2, abstractC2834Vv, kl32, wn2, te3, obj, executor);
            this.Q = true;
            IN2 in242 = this.M;
            GN2 F2 = in242.F(i5, i4, c5623gY02, enumC7567mA23, in242, kl32, wn2, te3, obj, executor);
            this.Q = false;
            kl32.c = P22;
            kl32.d = F2;
            P = kl32;
        }
        if (zc0 == 0) {
            return P;
        }
        IN2 in25 = this.N;
        int i8 = in25.p;
        int i9 = in25.o;
        if (AbstractC10296u74.g(i, i2)) {
            IN2 in26 = this.N;
            if (!AbstractC10296u74.g(in26.p, in26.o)) {
                int i10 = abstractC2834Vv.p;
                i3 = abstractC2834Vv.o;
                i8 = i10;
                IN2 in27 = this.N;
                GN2 F3 = in27.F(i8, i3, in27.f11446J, in27.i, in27, zc0, wn2, te3, obj, executor);
                zc0.c = P;
                zc0.d = F3;
                return zc0;
            }
        }
        i3 = i9;
        IN2 in272 = this.N;
        GN2 F32 = in272.F(i8, i3, in272.f11446J, in272.i, in272, zc0, wn2, te3, obj, executor);
        zc0.c = P;
        zc0.d = F32;
        return zc0;
    }

    public final C3133Yc3 P(int i, int i2, C5623gY0 c5623gY0, EnumC7567mA2 enumC7567mA2, AbstractC2834Vv abstractC2834Vv, KN2 kn2, WN2 wn2, TE3 te3, Object obj, Executor executor) {
        Context context = this.F;
        Object obj2 = this.K;
        Class cls = this.H;
        ArrayList arrayList = this.L;
        BZ0 bz0 = this.I;
        return new C3133Yc3(context, bz0, obj, obj2, cls, abstractC2834Vv, i, i2, enumC7567mA2, te3, wn2, arrayList, kn2, bz0.g, c5623gY0.a, executor);
    }

    public IN2 D(InterfaceC4200cO2 interfaceC4200cO2) {
        if (this.A) {
            return c().D(interfaceC4200cO2);
        }
        if (interfaceC4200cO2 != null) {
            if (this.L == null) {
                this.L = new ArrayList();
            }
            this.L.add(interfaceC4200cO2);
        }
        u();
        return this;
    }

    public final IN2 O(Object obj) {
        if (this.A) {
            return c().O(obj);
        }
        this.K = obj;
        this.P = true;
        u();
        return this;
    }

    public IN2 Q(C5623gY0 c5623gY0) {
        if (this.A) {
            return c().Q(c5623gY0);
        }
        AbstractC6464iy2.b(c5623gY0);
        this.f11446J = c5623gY0;
        this.O = false;
        u();
        return this;
    }
}
