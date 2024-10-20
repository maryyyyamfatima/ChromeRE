package defpackage;

import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ss4 implements InterfaceC8791pl, Js4, Es4 {
    public static final C6492j31 r = C6492j31.k("com/google/chrome/elements/video/players/YouTubeWrapper");
    public Rs4 c;
    public final C6442iu3 e;
    public final WB2 f;
    public final InterfaceC2938Wp3 g;
    public final Qs4 h;
    public Hs4 j;
    public Cv4 l;
    public Runnable m;
    public ViewGroup n;
    public C10907vu4 p;
    public long q;
    public int k = 1;
    public EnumC10787va4 o = EnumC10787va4.DEFAULT;
    public final HashMap i = new HashMap();
    public final HashSet d = new HashSet();

    public static void i(Hs4 hs4, C2669Uo c2669Uo) {
        C3697av0 c3697av0 = c2669Uo.b;
        Qt4 qt4 = Tt4.a;
        boolean z = c2669Uo.c;
        String str = c2669Uo.a;
        if (!z) {
            long j = c3697av0.a;
            if (!(j < 0)) {
                if (!(j == 0)) {
                    String format = String.format("https://www.youtube.com/embed/%s?t=%s", str, Long.valueOf(j / 1000));
                    Xt4 xt4 = hs4.b0.g;
                    xt4.i = qt4;
                    xt4.j = qt4;
                    xt4.l = qt4;
                    xt4.f();
                    xt4.d();
                    Cv4 cv4 = new Cv4(Boolean.class);
                    xt4.m = cv4;
                    xt4.g = new Ct4(xt4, format, cv4);
                    xt4.c();
                    return;
                }
            }
        }
        Xt4 xt42 = hs4.b0.g;
        xt42.i = qt4;
        xt42.j = qt4;
        xt42.l = qt4;
        xt42.f();
        xt42.d();
        xt42.g = new C12273zt4(xt42, str);
        xt42.c();
    }

    public final void f(Object obj) {
        Runnable runnable;
        int i;
        int i2;
        Is4 is4 = (Is4) obj;
        Cv4 cv4 = this.l;
        if (cv4 != null) {
            synchronized (cv4) {
                cv4.g.remove(this);
            }
            this.l = null;
        }
        if (this.j == null) {
            return;
        }
        Is4 is42 = Is4.SUCCESS;
        if (is4 != is42) {
            switch (is4.ordinal()) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                default:
                    i2 = 10;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i2 = 8;
                    break;
                case 4:
                    i2 = 9;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 2;
                    break;
                case 8:
                    i2 = 0;
                    break;
                case 9:
                    i2 = 5;
                    break;
                case 10:
                    i2 = 1;
                    break;
                case 11:
                    i2 = 4;
                    break;
            }
            boolean z = c(this.n).b.c;
            ((TK0) this.g).getClass();
            AbstractC4851eH1.d("Feed", "Feed video initialization error %d", Integer.valueOf(i2));
            EI2.h(i2, 11, TK0.d("InitializationError", z));
        }
        int ordinal = is4.ordinal();
        if (ordinal == 0) {
            this.k = 5;
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 9) {
            this.k = 2;
        } else {
            this.k = 3;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Ks4 ks4 = (Ks4) it.next();
            ks4.getClass();
            boolean equals = is4.equals(is42);
            HashSet hashSet = ks4.g;
            EnumC10444ua4 enumC10444ua4 = EnumC10444ua4.INIT_END;
            if (hashSet.contains(enumC10444ua4)) {
                if (equals) {
                    ks4.c(enumC10444ua4);
                } else {
                    switch (is4.ordinal()) {
                        case 1:
                            i = 3;
                            break;
                        case 2:
                        default:
                            i = 1;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            i = 16;
                            break;
                        case 4:
                            i = 17;
                            break;
                        case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                            i = 18;
                            break;
                        case 6:
                            i = 19;
                            break;
                        case 7:
                            i = 20;
                            break;
                        case 8:
                            i = 21;
                            break;
                        case 9:
                            i = 4;
                            break;
                        case 10:
                            i = 22;
                            break;
                        case 11:
                            i = 23;
                            break;
                    }
                    Fb4 fb4 = (Fb4) Ib4.m.j();
                    if (fb4.h) {
                        fb4.l();
                        fb4.h = false;
                    }
                    Ib4 ib4 = (Ib4) fb4.g;
                    ib4.getClass();
                    ib4.k = AbstractC2373Sg3.b(i);
                    ib4.j |= 1;
                    if (fb4.h) {
                        fb4.l();
                        fb4.h = false;
                    }
                    Ib4 ib42 = (Ib4) fb4.g;
                    ib42.j |= 2;
                    ib42.l = false;
                    ks4.b((Ib4) fb4.j());
                }
            }
            if (equals) {
                EnumC10444ua4 enumC10444ua42 = EnumC10444ua4.LOAD_START;
                if (hashSet.contains(enumC10444ua42)) {
                    ks4.c(enumC10444ua42);
                }
            }
            hashSet.clear();
        }
        if (AbstractC2373Sg3.a(this.k, 5) && (runnable = this.m) != null) {
            runnable.run();
        }
        this.m = null;
    }

    public Ss4(C6442iu3 c6442iu3, WB2 wb2, InterfaceC2938Wp3 interfaceC2938Wp3) {
        this.e = c6442iu3;
        this.f = wb2;
        this.g = interfaceC2938Wp3;
        this.h = new Qs4(wb2);
    }

    @Override // defpackage.Es4
    public final void a(C10221tu4 c10221tu4) {
        int i;
        h(EnumC10787va4.ERROR);
        int i2 = c10221tu4.a;
        if (i2 == 9) {
            this.k = 6;
        }
        int b = AbstractC2373Sg3.b(i2);
        int i3 = b != 0 ? b != 1 ? b != 2 ? b != 6 ? b != 11 ? b != 8 ? b != 9 ? 3 : 2 : 5 : 6 : 4 : 1 : 7 : 0;
        C2669Uo c2669Uo = c(this.n).b;
        boolean z = c2669Uo.c;
        TK0 tk0 = (TK0) this.g;
        tk0.getClass();
        AbstractC4851eH1.d("Feed", "Feed video play error %d", Integer.valueOf(i3));
        EI2.h(i3, 8, TK0.d("PlayError", z));
        tk0.e(5, c2669Uo.c);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Ks4 ks4 = (Ks4) it.next();
            ks4.getClass();
            if (this.n == ks4.d) {
                switch (AbstractC2373Sg3.b(c10221tu4.a)) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                    case 8:
                        i = 4;
                        break;
                    case 2:
                        i = 13;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        i = 14;
                        break;
                    case 4:
                        i = 15;
                        break;
                    case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 9:
                        i = 3;
                        break;
                    default:
                        i = 1;
                        break;
                }
                Fb4 fb4 = (Fb4) Ib4.m.j();
                if (fb4.h) {
                    fb4.l();
                    fb4.h = false;
                }
                Ib4 ib4 = (Ib4) fb4.g;
                ib4.getClass();
                ib4.k = AbstractC2373Sg3.b(i);
                ib4.j |= 1;
                if (fb4.h) {
                    fb4.l();
                    fb4.h = false;
                }
                Ib4 ib42 = (Ib4) fb4.g;
                ib42.j |= 2;
                ib42.l = false;
                ks4.b((Ib4) fb4.j());
            }
        }
    }

    @Override // defpackage.Js4
    public final void b(C10907vu4 c10907vu4) {
        this.p = c10907vu4;
        int b = AbstractC2373Sg3.b(c10907vu4.a);
        EnumC10787va4 enumC10787va4 = EnumC10787va4.SUSPENDED;
        EnumC10787va4 enumC10787va42 = EnumC10787va4.PLAYING;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    h(enumC10787va4);
                } else if (b != 3) {
                    h(EnumC10787va4.DEFAULT);
                }
            }
            this.e.getClass();
            this.q = System.currentTimeMillis();
            h(enumC10787va42);
        } else {
            h(EnumC10787va4.LOADING);
        }
        Ps4 c = c(this.n);
        C2669Uo c2669Uo = c.b;
        EnumC10787va4 enumC10787va43 = this.o;
        InterfaceC2938Wp3 interfaceC2938Wp3 = this.g;
        if (enumC10787va43 == enumC10787va42 && !c.f) {
            ((TK0) interfaceC2938Wp3).e(4, c2669Uo.c);
            c.f = true;
        }
        if (c2669Uo.c && this.o == enumC10787va4 && c.f && !c.g && d().a / 1000 >= 29) {
            ((TK0) interfaceC2938Wp3).e(1, c2669Uo.c);
            c.g = true;
        }
    }

    public final void h(EnumC10787va4 enumC10787va4) {
        Hs4 hs4;
        if (this.o.equals(enumC10787va4)) {
            return;
        }
        this.o = enumC10787va4;
        Ps4 c = c(this.n);
        if (c.e != 1) {
            EnumC10787va4 enumC10787va42 = this.o;
            if (enumC10787va42 == null) {
                enumC10787va42 = EnumC10787va4.DEFAULT;
            }
            int ordinal = enumC10787va42.ordinal();
            if ((ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) && (hs4 = this.j) != null) {
                boolean z = c.e == 2;
                Xt4 xt4 = hs4.b0.g;
                xt4.getClass();
                Nt4 nt4 = new Nt4(xt4, z);
                xt4.l = nt4;
                if (xt4.f != null) {
                    try {
                        nt4.a();
                        xt4.l = Tt4.a;
                    } catch (RemoteException unused) {
                        Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                    }
                }
                c.e = 1;
            }
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Ks4 ks4 = (Ks4) it.next();
            EnumC10787va4 enumC10787va43 = this.o;
            ks4.getClass();
            if (ks4.d == this.n) {
                ks4.k(enumC10787va43);
            }
        }
    }

    public final void g(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = this.n;
        if (viewGroup2 == viewGroup) {
            return;
        }
        this.n = viewGroup;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.c);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.c);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Ks4 ks4 = (Ks4) it.next();
            if (ks4.d == viewGroup2) {
                ks4.k(EnumC10787va4.DEFAULT);
            }
        }
    }

    public final C3697av0 d() {
        C10907vu4 c10907vu4;
        boolean a = AbstractC2373Sg3.a(this.k, 5);
        C3697av0 c3697av0 = C3697av0.b;
        if (!a || (c10907vu4 = this.p) == null) {
            return c3697av0;
        }
        long j = 0;
        if (!AbstractC2373Sg3.a(c10907vu4.a, 2)) {
            j = Math.max(this.p.b, 0L);
        } else if (this.q > 0) {
            this.e.getClass();
            j = this.p.b + (System.currentTimeMillis() - this.q);
        }
        return new C3697av0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ss4.e():void");
    }

    public final Ps4 c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            HashMap hashMap = this.i;
            if (hashMap.containsKey(viewGroup)) {
                return (Ps4) hashMap.get(viewGroup);
            }
        }
        return new Ps4();
    }
}
