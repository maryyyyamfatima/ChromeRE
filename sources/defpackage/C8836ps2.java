package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ps2 */
/* loaded from: classes.dex */
public final class C8836ps2 implements InterfaceC9790sg0 {
    public static final C6492j31 i = C6492j31.j();
    public final String a;
    public final EnumC6432is4 b;
    public final C0743Fs2 c;
    public final Tr4 d;
    public final C1870Ok0 e;
    public final C11236ws2 f;
    public final Object g;
    public C10893vs2 h;

    @Override // defpackage.InterfaceC9790sg0
    public final void b(String str, byte[] bArr) {
        d(str, bArr);
    }

    public C8836ps2(C0743Fs2 c0743Fs2, C11579xs2 c11579xs2, P90 p90, P90 p902, Tr4 tr4) {
        EnumC6432is4 enumC6432is4 = EnumC6432is4.o;
        this.a = "/persistent/";
        this.b = enumC6432is4;
        this.c = c0743Fs2;
        this.d = tr4;
        C1870Ok0 c1870Ok0 = new C1870Ok0();
        this.e = c1870Ok0;
        P90 p903 = (P90) c11579xs2.a.get();
        C11579xs2.a(3, p903);
        C9596s52 c9596s52 = (C9596s52) c11579xs2.b.get();
        C11579xs2.a(4, c9596s52);
        Tr4 tr42 = (Tr4) c11579xs2.c.get();
        C11579xs2.a(5, tr42);
        this.f = new C11236ws2(c1870Ok0, p903, c9596s52, tr42);
        this.g = new Object();
        C8493os2 c8493os2 = new C8493os2(this, null);
        r c6126hz1 = new C6126hz1(I90.a(p902, C7221lA0.a), c8493os2);
        c6126hz1.M(2, c6126hz1, c8493os2);
    }

    public final void c() {
        boolean z;
        synchronized (this.g) {
            if (this.h == null) {
                this.h = this.f.a(this.c, this.a);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            InterfaceC5462g31 f = i.f();
            GW1 gw1 = Tr4.c;
            Sr4 a = this.d.a();
            JX0 jx0 = (JX0) a.l(PX0.NEW_BUILDER);
            jx0.m(a);
            Rr4 rr4 = (Rr4) jx0;
            EnumC6432is4 enumC6432is4 = this.b;
            AbstractC0087Ar1.e(enumC6432is4, "value");
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr4 = (Sr4) rr4.g;
            sr4.getClass();
            sr4.l = enumC6432is4.a;
            sr4.j |= 2;
            QX0 j = rr4.j();
            AbstractC0087Ar1.d(j, "_builder.build()");
            AbstractC6690je3.a((InterfaceC5462g31) f.l(gw1, (Sr4) j), "PersistentByteStore is not subscribed to a ByteStore before first access", "com/google/android/libraries/search/rendering/xuikit/runtime/persistentstore/PersistentByteStore", "ensureInitialized", 139, "PersistentByteStore.kt");
        }
    }

    public final void d(String str, byte[] bArr) {
        AbstractC0087Ar1.e(str, "key");
        AbstractC0087Ar1.e(bArr, "entity");
        c();
        this.e.c(str, bArr);
    }

    @Override // defpackage.InterfaceC9790sg0
    public final void remove(String str) {
        AbstractC0087Ar1.e(str, "key");
        c();
        this.e.remove(str);
    }

    @Override // defpackage.InterfaceC9790sg0
    public final C5499g92 a(String str) {
        AbstractC0087Ar1.e(str, "key");
        c();
        return this.e.a(str);
    }
}
