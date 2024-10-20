package defpackage;

import J.N;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nb0 */
/* loaded from: classes.dex */
public class C1695Nb0 extends AbstractC4368cs2 {
    public static final C1436Lb0 B = new C1436Lb0();
    public boolean A;
    public String o;
    public GURL p;
    public int q;
    public int r;
    public long s;
    public Gl4 t;
    public int u;
    public String v;
    public int w;
    public Integer x;
    public final C12157za2 y;
    public int z;

    @Override // defpackage.AbstractC4368cs2
    public final String i() {
        return "Critical";
    }

    public C1695Nb0(Tab tab, String str, String str2, int i, int i2, long j, Gl4 gl4, int i3, String str3, int i4, Integer num, int i5) {
        super(tab, EnumC6773js2.a(C1695Nb0.class, tab.isIncognito()).b(), EnumC6773js2.a(C1695Nb0.class, tab.isIncognito()).a);
        this.y = new C12157za2();
        this.p = (str == null || str.isEmpty()) ? GURL.emptyGURL() : new GURL(str);
        this.o = str2;
        this.q = i;
        this.r = i2;
        this.s = j;
        this.t = gl4;
        this.u = i3;
        this.v = str3;
        this.w = i4;
        this.x = num;
        this.z = i5;
    }

    public static C1695Nb0 m(Tab tab) {
        AbstractC4368cs2 d = AbstractC4368cs2.d(tab, C1695Nb0.class);
        if (d == null) {
            K44 F = tab.F();
            C1695Nb0 c1695Nb0 = new C1695Nb0(tab, "", "", -1, tab.getId(), -1L, null, -1, "", 0, null, 0);
            c1695Nb0.l();
            d = (AbstractC4368cs2) F.d(C1695Nb0.class, c1695Nb0);
        }
        return (C1695Nb0) d;
    }

    public static Integer n(int i) {
        switch (i) {
            case -2:
                return 19;
            case -1:
                return null;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return 3;
            case 4:
                return 4;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            default:
                return null;
        }
    }

    @Override // defpackage.AbstractC4368cs2
    public final InterfaceC7876n43 g() {
        return new C1565Mb0(this);
    }

    @Override // defpackage.AbstractC4368cs2
    public final void a() {
        super.a();
    }

    @Override // defpackage.AbstractC4368cs2
    public final void l() {
        GURL gurl;
        boolean z = this.A;
        Tab tab = this.a;
        boolean z2 = false;
        if (z && (gurl = this.p) != null && !gurl.k() && (!T34.k(this.p) || tab.h() || tab.j())) {
            GURL gurl2 = this.p;
            if (!(gurl2 != null && gurl2.h().equals("content"))) {
                z2 = true;
            }
        }
        if (z2) {
            C1306Kb0 c1306Kb0 = new C1306Kb0(this);
            C8385oa2 c8385oa2 = this.j;
            if (c8385oa2 == null || !((Boolean) c8385oa2.g).booleanValue()) {
                return;
            }
            this.g.g(tab.getId(), this.h, f(), c1306Kb0);
        }
    }

    @Override // defpackage.AbstractC4368cs2, defpackage.J44
    public final void destroy() {
        this.y.clear();
    }

    @Override // defpackage.AbstractC4368cs2
    public final boolean b(ByteBuffer byteBuffer) {
        ByteBuffer slice;
        GURL gurl;
        String str = null;
        TraceEvent i = TraceEvent.i("CriticalPersistedTabData.Deserialize", null);
        try {
            C1825Ob0 c1825Ob0 = new C1825Ob0();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c1825Ob0.c(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
            int i2 = 4;
            int b = c1825Ob0.b(4);
            int i3 = 0;
            this.q = b != 0 ? c1825Ob0.b.getInt(b + c1825Ob0.a) : 0;
            int b2 = c1825Ob0.b(6);
            this.r = b2 != 0 ? c1825Ob0.b.getInt(b2 + c1825Ob0.a) : 0;
            int b3 = c1825Ob0.b(8);
            this.s = b3 != 0 ? c1825Ob0.b.getLong(b3 + c1825Ob0.a) : 0L;
            ByteBuffer f = c1825Ob0.f(10);
            if (f == null) {
                slice = ByteBuffer.allocateDirect(0);
            } else {
                slice = f.slice();
            }
            Gl4 gl4 = new Gl4(slice);
            this.t = gl4;
            gl4.b = 2;
            if (N.MNZ4eg9q(slice, 2) == null) {
                gurl = GURL.emptyGURL();
            } else {
                Gl4 gl42 = this.t;
                gurl = new GURL(N.MNZ4eg9q(gl42.a, gl42.b));
            }
            this.p = gurl;
            Gl4 gl43 = this.t;
            this.o = N.MZZlQD12(gl43.a, gl43.b);
            int b4 = c1825Ob0.b(12);
            this.u = b4 != 0 ? c1825Ob0.b.getInt(b4 + c1825Ob0.a) : 0;
            if (!" ".equals(c1825Ob0.h())) {
                str = c1825Ob0.h();
            }
            this.v = str;
            int b5 = c1825Ob0.b(16);
            this.w = b5 != 0 ? c1825Ob0.b.getInt(b5 + c1825Ob0.a) : 0;
            int b6 = c1825Ob0.b(18);
            this.x = n(b6 != 0 ? c1825Ob0.b.getInt(b6 + c1825Ob0.a) : 0);
            int b7 = c1825Ob0.b(20);
            int i4 = b7 != 0 ? c1825Ob0.b.getInt(b7 + c1825Ob0.a) : 0;
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                } else if (i4 == 3) {
                    i2 = 3;
                } else if (i4 != 4) {
                }
                i3 = i2;
            }
            this.z = i3;
            if (i != null) {
                i.close();
            }
            return true;
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

    public final void q(GURL gurl) {
        if (gurl == null && this.p == null) {
            return;
        }
        if (gurl == null || !gurl.equals(this.p)) {
            this.p = gurl;
            l();
        }
    }

    public final void o(int i) {
        if (this.r == i) {
            return;
        }
        Tab tab = this.a;
        if (tab.isDestroyed()) {
            return;
        }
        this.r = i;
        Iterator it = this.y.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((AbstractC1429Kz3) c11814ya2.next()).V0(i, tab);
            } else {
                JA3.a(tab).b(true);
                l();
                return;
            }
        }
    }

    public final void p(long j) {
        if (this.s == j) {
            return;
        }
        this.s = j;
        Iterator it = this.y.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((AbstractC1429Kz3) c11814ya2.next()).Y0(this.a, j);
            } else {
                l();
                return;
            }
        }
    }

    public final void r(Gl4 gl4) {
        if (gl4 == null && this.t == null) {
            return;
        }
        if (gl4 == null || !gl4.equals(this.t)) {
            this.t = gl4;
            l();
        }
    }
}
