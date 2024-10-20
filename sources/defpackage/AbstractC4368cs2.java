package defpackage;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cs2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4368cs2 implements J44 {
    public static final HashMap m = new HashMap();
    public static final HashSet n = new HashSet();
    public final Tab a;
    public final InterfaceC7805ms2 g;
    public final String h;
    public long i = 0;
    public C8385oa2 j;
    public C2297Rr2 k;
    public boolean l;

    public abstract boolean b(ByteBuffer byteBuffer);

    public abstract InterfaceC7876n43 g();

    public long h() {
        return Long.MAX_VALUE;
    }

    public abstract String i();

    public AbstractC4368cs2(Tab tab, InterfaceC7805ms2 interfaceC7805ms2, String str) {
        this.a = tab;
        this.g = interfaceC7805ms2;
        this.h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [Ur2] */
    public static void e(final Tab tab, final InterfaceC7117ks2 interfaceC7117ks2, final Callback callback, final Class cls, final Callback callback2) {
        Object obj = ThreadUtils.a;
        final AbstractC4368cs2 abstractC4368cs2 = (AbstractC4368cs2) cls.cast(tab.F().b(cls));
        if (abstractC4368cs2 != null) {
            if (abstractC4368cs2.j()) {
                callback.onResult(new Callback() { // from class: Sr2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj2) {
                        return new ZE(this, obj2);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj2) {
                        final AbstractC4368cs2 abstractC4368cs22 = (AbstractC4368cs2) obj2;
                        Tab tab2 = Tab.this;
                        boolean isDestroyed = tab2.isDestroyed();
                        final Callback callback3 = callback2;
                        if (isDestroyed) {
                            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Vr2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Callback.this.onResult(null);
                                }
                            });
                            return;
                        }
                        if (abstractC4368cs22 != null) {
                            abstractC4368cs22.i = System.currentTimeMillis();
                        }
                        if (abstractC4368cs22 != null) {
                        }
                        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Wr2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Callback.this.onResult(abstractC4368cs22);
                            }
                        });
                    }
                });
                return;
            } else {
                PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Tr2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Callback.this.onResult(abstractC4368cs2);
                    }
                });
                return;
            }
        }
        final String format = String.format(Locale.ENGLISH, "%d-%s", Integer.valueOf(tab.getId()), cls.toString());
        HashMap hashMap = m;
        if (!hashMap.containsKey(format)) {
            hashMap.put(format, new LinkedList());
        }
        ((List) hashMap.get(format)).add(callback2);
        if (((List) hashMap.get(format)).size() > 1) {
            return;
        }
        final EnumC6773js2 a = EnumC6773js2.a(cls, tab.isIncognito());
        a.b().b(tab.getId(), a.a, new Callback() { // from class: Ur2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                ByteBuffer byteBuffer = (ByteBuffer) obj2;
                Callback callback3 = Callback.this;
                final Tab tab2 = tab;
                final Class cls2 = cls;
                final String str = format;
                if (byteBuffer == null) {
                    callback3.onResult(new Callback() { // from class: Xr2
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj3) {
                            return new ZE(this, obj3);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj3) {
                            AbstractC4368cs2 abstractC4368cs22 = (AbstractC4368cs2) obj3;
                            if (abstractC4368cs22 != null) {
                                abstractC4368cs22.i = System.currentTimeMillis();
                            }
                            AbstractC4368cs2.k(cls2, str, Tab.this, abstractC4368cs22);
                        }
                    });
                    return;
                }
                EnumC6773js2 enumC6773js2 = a;
                InterfaceC7805ms2 b = enumC6773js2.b();
                C3337Zr2 c3337Zr2 = new C3337Zr2(callback3, tab2, cls2, str);
                interfaceC7117ks2.a(byteBuffer, b, enumC6773js2.a, c3337Zr2);
            }
        });
    }

    public boolean j() {
        if (h() == Long.MAX_VALUE) {
            return false;
        }
        long j = this.i;
        return j == 0 || h() + j < System.currentTimeMillis();
    }

    public static void k(Class cls, String str, Tab tab, final AbstractC4368cs2 abstractC4368cs2) {
        if (tab.isDestroyed()) {
            abstractC4368cs2 = null;
        }
        if (abstractC4368cs2 != null) {
        }
        HashMap hashMap = m;
        for (final Callback callback : (List) hashMap.get(str)) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: Yr2
                @Override // java.lang.Runnable
                public final void run() {
                    Callback.this.onResult(abstractC4368cs2);
                }
            });
        }
        hashMap.remove(str);
    }

    public static AbstractC4368cs2 d(Tab tab, Class cls) {
        return (AbstractC4368cs2) tab.F().b(cls);
    }

    public void l() {
        C8385oa2 c8385oa2 = this.j;
        if (c8385oa2 == null || !((Boolean) c8385oa2.g).booleanValue()) {
            return;
        }
        this.g.f(this.a.getId(), this.h, f());
    }

    public final C4025bs2 f() {
        InterfaceC7876n43 interfaceC7876n43;
        try {
            interfaceC7876n43 = g();
        } catch (OutOfMemoryError e) {
            AbstractC4851eH1.a("PTD", "Out of memory error when attempting to save PersistedTabData " + e.getMessage(), new Object[0]);
            interfaceC7876n43 = null;
        }
        return new C4025bs2(this, interfaceC7876n43);
    }

    public void a() {
        this.g.a(this.a.getId(), this.h);
    }

    @Override // defpackage.J44
    public void destroy() {
        C8385oa2 c8385oa2 = this.j;
        if (c8385oa2 != null) {
            c8385oa2.n(this.k);
            this.k = null;
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        TraceEvent i = TraceEvent.i("PersistedTabData.Deserialize", null);
        try {
            boolean b = b(byteBuffer);
            if (i != null) {
                i.close();
            }
            EI2.b("Tabs.PersistedTabData.Deserialize." + i(), b);
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
