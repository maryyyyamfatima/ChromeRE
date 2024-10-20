package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bg3 */
/* loaded from: classes.dex */
public final class C3954bg3 {
    public final C7123kt2 a;
    public final Uri b;
    public final String c;

    public C3954bg3(C7123kt2 c7123kt2, String str, String str2, boolean z) {
        this.a = c7123kt2;
        this.c = str;
        Context context = c7123kt2.a;
        Pattern pattern = AbstractC3576ab.a;
        C3249Za c3249Za = new C3249Za(context);
        c3249Za.b();
        String str3 = str2 + "/" + str + ".pb";
        c3249Za.e = str3.startsWith("/") ? str3.substring(1) : str3;
        if (z && AbstractC6404io0.b()) {
            Set set = AbstractC3576ab.d;
            AbstractC5778gy2.a(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
            c3249Za.b = "directboot-files";
        }
        this.b = c3249Za.a();
    }

    public final D0 a(String str) {
        C7123kt2 c7123kt2 = this.a;
        final C5900hK3 c5900hK3 = (C5900hK3) c7123kt2.c.get();
        C4374ct2 c4374ct2 = c5900hK3.a;
        c4374ct2.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C3687at2(this.c, str);
        AF3 b = c4374ct2.b(0, c5531gF3.a());
        Executor executor = EnumC6747jo0.a;
        AF3 h = b.h(executor, new InterfaceC9269r80() { // from class: gK3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.InterfaceC9269r80
            public final Object a(AF3 af3) {
                C12100zP0 c12100zP0;
                C5900hK3.this.getClass();
                Configurations configurations = (Configurations) af3.k();
                Y20 y20 = (Y20) Z20.r.j();
                String str2 = configurations.a;
                int i = 0;
                if (y20.h) {
                    y20.l();
                    y20.h = false;
                }
                Z20 z20 = (Z20) y20.g;
                z20.getClass();
                str2.getClass();
                z20.j |= 1;
                z20.k = str2;
                if (y20.h) {
                    y20.l();
                    y20.h = false;
                }
                Z20 z202 = (Z20) y20.g;
                z202.getClass();
                String str3 = configurations.h;
                str3.getClass();
                int i2 = 4;
                z202.j |= 4;
                z202.m = str3;
                if (y20.h) {
                    y20.l();
                    y20.h = false;
                }
                Z20 z203 = (Z20) y20.g;
                z203.j |= 8;
                z203.p = configurations.k;
                if (y20.h) {
                    y20.l();
                    y20.h = false;
                }
                Z20 z204 = (Z20) y20.g;
                z204.j |= 16;
                z204.q = configurations.l;
                int i3 = 2;
                byte[] bArr = configurations.g;
                if (bArr != null) {
                    ZD f = AbstractC4147cE.f(bArr, 0, bArr.length);
                    if (y20.h) {
                        y20.l();
                        y20.h = false;
                    }
                    Z20 z205 = (Z20) y20.g;
                    z205.getClass();
                    z205.j |= 2;
                    z205.l = f;
                }
                Configuration[] configurationArr = configurations.i;
                int length = configurationArr.length;
                int i4 = 0;
                while (i < length) {
                    Configuration configuration = configurationArr[i];
                    Flag[] flagArr = configuration.g;
                    int length2 = flagArr.length;
                    int i5 = i2;
                    boolean z = i4;
                    while (i4 < length2) {
                        Flag flag = flagArr[i4];
                        int i6 = flag.l;
                        String str4 = flag.a;
                        if (i6 == 1) {
                            C11757yP0 c11757yP0 = (C11757yP0) C12100zP0.n.j();
                            if (c11757yP0.h) {
                                c11757yP0.l();
                                c11757yP0.h = false;
                            }
                            C12100zP0 c12100zP02 = (C12100zP0) c11757yP0.g;
                            c12100zP02.getClass();
                            str4.getClass();
                            c12100zP02.j |= 1;
                            c12100zP02.m = str4;
                            if (i6 != 1) {
                                throw new IllegalArgumentException("Not a long type");
                            }
                            if (c11757yP0.h) {
                                c11757yP0.l();
                                c11757yP0.h = false;
                            }
                            C12100zP0 c12100zP03 = (C12100zP0) c11757yP0.g;
                            c12100zP03.k = 1;
                            c12100zP03.l = Long.valueOf(flag.g);
                            c12100zP0 = (C12100zP0) c11757yP0.j();
                        } else if (i6 == i3) {
                            C11757yP0 c11757yP02 = (C11757yP0) C12100zP0.n.j();
                            if (c11757yP02.h) {
                                c11757yP02.l();
                                c11757yP02.h = false;
                            }
                            C12100zP0 c12100zP04 = (C12100zP0) c11757yP02.g;
                            c12100zP04.getClass();
                            str4.getClass();
                            c12100zP04.j |= 1;
                            c12100zP04.m = str4;
                            if (i6 != 2) {
                                throw new IllegalArgumentException("Not a boolean type");
                            }
                            if (c11757yP02.h) {
                                c11757yP02.l();
                                c11757yP02.h = false;
                            }
                            C12100zP0 c12100zP05 = (C12100zP0) c11757yP02.g;
                            c12100zP05.k = 2;
                            c12100zP05.l = Boolean.valueOf(flag.h);
                            c12100zP0 = (C12100zP0) c11757yP02.j();
                        } else if (i6 == 3) {
                            C11757yP0 c11757yP03 = (C11757yP0) C12100zP0.n.j();
                            if (c11757yP03.h) {
                                c11757yP03.l();
                                c11757yP03.h = false;
                            }
                            C12100zP0 c12100zP06 = (C12100zP0) c11757yP03.g;
                            c12100zP06.getClass();
                            str4.getClass();
                            c12100zP06.j |= 1;
                            c12100zP06.m = str4;
                            if (i6 != 3) {
                                throw new IllegalArgumentException("Not a double type");
                            }
                            if (c11757yP03.h) {
                                c11757yP03.l();
                                c11757yP03.h = false;
                            }
                            C12100zP0 c12100zP07 = (C12100zP0) c11757yP03.g;
                            c12100zP07.k = 3;
                            c12100zP07.l = Double.valueOf(flag.i);
                            c12100zP0 = (C12100zP0) c11757yP03.j();
                        } else if (i6 == i5) {
                            C11757yP0 c11757yP04 = (C11757yP0) C12100zP0.n.j();
                            if (c11757yP04.h) {
                                c11757yP04.l();
                                c11757yP04.h = false;
                            }
                            C12100zP0 c12100zP08 = (C12100zP0) c11757yP04.g;
                            c12100zP08.getClass();
                            str4.getClass();
                            c12100zP08.j |= 1;
                            c12100zP08.m = str4;
                            if (i6 != 4) {
                                throw new IllegalArgumentException("Not a String type");
                            }
                            if (c11757yP04.h) {
                                c11757yP04.l();
                                c11757yP04.h = false;
                            }
                            C12100zP0 c12100zP09 = (C12100zP0) c11757yP04.g;
                            c12100zP09.getClass();
                            String str5 = flag.j;
                            str5.getClass();
                            c12100zP09.k = 4;
                            c12100zP09.l = str5;
                            c12100zP0 = (C12100zP0) c11757yP04.j();
                        } else {
                            if (i6 != 5) {
                                throw new IllegalArgumentException(AbstractC9076qb1.a("Unrecognized flag type: ", i6));
                            }
                            C11757yP0 c11757yP05 = (C11757yP0) C12100zP0.n.j();
                            if (c11757yP05.h) {
                                c11757yP05.l();
                                c11757yP05.h = z;
                            }
                            C12100zP0 c12100zP010 = (C12100zP0) c11757yP05.g;
                            c12100zP010.getClass();
                            str4.getClass();
                            c12100zP010.j |= 1;
                            c12100zP010.m = str4;
                            if (i6 != 5) {
                                throw new IllegalArgumentException("Not a bytes type");
                            }
                            ZD d = AbstractC4147cE.d(flag.k);
                            if (c11757yP05.h) {
                                c11757yP05.l();
                                c11757yP05.h = false;
                            }
                            C12100zP0 c12100zP011 = (C12100zP0) c11757yP05.g;
                            c12100zP011.getClass();
                            c12100zP011.k = 5;
                            c12100zP011.l = d;
                            c12100zP0 = (C12100zP0) c11757yP05.j();
                        }
                        if (y20.h) {
                            y20.l();
                            y20.h = false;
                        }
                        Z20 z206 = (Z20) y20.g;
                        z206.getClass();
                        c12100zP0.getClass();
                        InterfaceC1377Kp1 interfaceC1377Kp1 = z206.n;
                        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                            z206.n = QX0.r(interfaceC1377Kp1);
                        }
                        z206.n.add(c12100zP0);
                        i4++;
                        i3 = 2;
                        z = 0;
                        i5 = 4;
                    }
                    String[] strArr = configuration.h;
                    if (strArr != null) {
                        for (String str6 : strArr) {
                            if (y20.h) {
                                y20.l();
                                y20.h = false;
                            }
                            Z20 z207 = (Z20) y20.g;
                            z207.getClass();
                            str6.getClass();
                            InterfaceC1377Kp1 interfaceC1377Kp12 = z207.o;
                            if (!((AbstractC7504m0) interfaceC1377Kp12).a) {
                                z207.o = QX0.r(interfaceC1377Kp12);
                            }
                            z207.o.add(str6);
                        }
                    }
                    i4 = 0;
                    i++;
                    i3 = 2;
                    i2 = 4;
                }
                return (Z20) y20.j();
            }
        });
        C11367xF3 c11367xF3 = new C11367xF3(h);
        h.b(executor, new C11024wF3(c11367xF3));
        C7847n a = AbstractC5957hW0.a(c11367xF3, C10114td.class, new C5212fK3(), executor);
        CV0 cv0 = new CV0() { // from class: ag3
            @Override // defpackage.CV0
            public final Object apply(Object obj) {
                Z20 z20 = (Z20) obj;
                C4297cg3 c4297cg3 = (C4297cg3) C4641dg3.q.j();
                if (z20 == null) {
                    return (C4641dg3) c4297cg3.j();
                }
                Iterator it = z20.n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        String str2 = z20.m;
                        if (c4297cg3.h) {
                            c4297cg3.l();
                            c4297cg3.h = false;
                        }
                        C4641dg3 c4641dg3 = (C4641dg3) c4297cg3.g;
                        c4641dg3.getClass();
                        str2.getClass();
                        c4641dg3.j = 4 | c4641dg3.j;
                        c4641dg3.m = str2;
                        String str3 = z20.k;
                        if (c4297cg3.h) {
                            c4297cg3.l();
                            c4297cg3.h = false;
                        }
                        C4641dg3 c4641dg32 = (C4641dg3) c4297cg3.g;
                        c4641dg32.getClass();
                        str3.getClass();
                        c4641dg32.j |= 1;
                        c4641dg32.k = str3;
                        long j = z20.q;
                        if (c4297cg3.h) {
                            c4297cg3.l();
                            c4297cg3.h = false;
                        }
                        C4641dg3 c4641dg33 = (C4641dg3) c4297cg3.g;
                        c4641dg33.j |= 8;
                        c4641dg33.n = j;
                        if ((z20.j & 2) != 0) {
                            AbstractC4147cE abstractC4147cE = z20.l;
                            if (c4297cg3.h) {
                                c4297cg3.l();
                                c4297cg3.h = false;
                            }
                            C4641dg3 c4641dg34 = (C4641dg3) c4297cg3.g;
                            c4641dg34.getClass();
                            abstractC4147cE.getClass();
                            c4641dg34.j |= 2;
                            c4641dg34.l = abstractC4147cE;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (c4297cg3.h) {
                            c4297cg3.l();
                            c4297cg3.h = false;
                        }
                        C4641dg3 c4641dg35 = (C4641dg3) c4297cg3.g;
                        c4641dg35.j |= 16;
                        c4641dg35.o = currentTimeMillis;
                        return (C4641dg3) c4297cg3.j();
                    }
                    C12100zP0 c12100zP0 = (C12100zP0) it.next();
                    C4984eg3 c4984eg3 = (C4984eg3) C5328fg3.n.j();
                    String str4 = c12100zP0.m;
                    if (c4984eg3.h) {
                        c4984eg3.l();
                        c4984eg3.h = false;
                    }
                    C5328fg3 c5328fg3 = (C5328fg3) c4984eg3.g;
                    c5328fg3.getClass();
                    str4.getClass();
                    c5328fg3.j |= 1;
                    c5328fg3.m = str4;
                    int i = c12100zP0.k;
                    int b2 = AbstractC2373Sg3.b(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6);
                    if (b2 == 0) {
                        long longValue = c12100zP0.k == 1 ? ((Long) c12100zP0.l).longValue() : 0L;
                        if (c4984eg3.h) {
                            c4984eg3.l();
                            c4984eg3.h = false;
                        }
                        C5328fg3 c5328fg32 = (C5328fg3) c4984eg3.g;
                        c5328fg32.k = 2;
                        c5328fg32.l = Long.valueOf(longValue);
                    } else if (b2 == 1) {
                        boolean booleanValue = c12100zP0.k == 2 ? ((Boolean) c12100zP0.l).booleanValue() : false;
                        if (c4984eg3.h) {
                            c4984eg3.l();
                            c4984eg3.h = false;
                        }
                        C5328fg3 c5328fg33 = (C5328fg3) c4984eg3.g;
                        c5328fg33.k = 3;
                        c5328fg33.l = Boolean.valueOf(booleanValue);
                    } else if (b2 == 2) {
                        double doubleValue = c12100zP0.k == 3 ? ((Double) c12100zP0.l).doubleValue() : 0.0d;
                        if (c4984eg3.h) {
                            c4984eg3.l();
                            c4984eg3.h = false;
                        }
                        C5328fg3 c5328fg34 = (C5328fg3) c4984eg3.g;
                        c5328fg34.k = 4;
                        c5328fg34.l = Double.valueOf(doubleValue);
                    } else if (b2 == 3) {
                        String str5 = c12100zP0.k == 4 ? (String) c12100zP0.l : "";
                        if (c4984eg3.h) {
                            c4984eg3.l();
                            c4984eg3.h = false;
                        }
                        C5328fg3 c5328fg35 = (C5328fg3) c4984eg3.g;
                        c5328fg35.getClass();
                        str5.getClass();
                        c5328fg35.k = 5;
                        c5328fg35.l = str5;
                    } else {
                        if (b2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        Object obj2 = c12100zP0.k == 5 ? (AbstractC4147cE) c12100zP0.l : AbstractC4147cE.g;
                        if (c4984eg3.h) {
                            c4984eg3.l();
                            c4984eg3.h = false;
                        }
                        C5328fg3 c5328fg36 = (C5328fg3) c4984eg3.g;
                        c5328fg36.getClass();
                        obj2.getClass();
                        c5328fg36.k = 6;
                        c5328fg36.l = obj2;
                    }
                    C5328fg3 c5328fg37 = (C5328fg3) c4984eg3.j();
                    if (c4297cg3.h) {
                        c4297cg3.l();
                        c4297cg3.h = false;
                    }
                    C4641dg3 c4641dg36 = (C4641dg3) c4297cg3.g;
                    c4641dg36.getClass();
                    c5328fg37.getClass();
                    InterfaceC1377Kp1 interfaceC1377Kp1 = c4641dg36.p;
                    if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                        c4641dg36.p = QX0.r(interfaceC1377Kp1);
                    }
                    c4641dg36.p.add(c5328fg37);
                }
            }
        };
        Executor a2 = c7123kt2.a();
        int i = E0.l;
        D0 d0 = new D0(a, cv0);
        if (a2 != executor) {
            a2 = new OY1(a2, d0);
        }
        a.f(d0, a2);
        return d0;
    }

    public static TL2 b(C4641dg3 c4641dg3) {
        int size = c4641dg3.p.size() + 3;
        RV.b(size, "expectedSize");
        C0822Gi1 c0822Gi1 = new C0822Gi1(size);
        Iterator it = c4641dg3.p.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0822Gi1.b("__phenotype_server_token", c4641dg3.m);
                c0822Gi1.b("__phenotype_snapshot_token", c4641dg3.k);
                c0822Gi1.b("__phenotype_configuration_version", Long.valueOf(c4641dg3.n));
                return c0822Gi1.a(false);
            }
            C5328fg3 c5328fg3 = (C5328fg3) it.next();
            int i = c5328fg3.k;
            int b = AbstractC2373Sg3.b(i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6);
            if (b == 0) {
                c0822Gi1.b(c5328fg3.m, Long.valueOf(c5328fg3.k == 2 ? ((Long) c5328fg3.l).longValue() : 0L));
            } else if (b == 1) {
                c0822Gi1.b(c5328fg3.m, Boolean.valueOf(c5328fg3.k == 3 ? ((Boolean) c5328fg3.l).booleanValue() : false));
            } else if (b == 2) {
                c0822Gi1.b(c5328fg3.m, Double.valueOf(c5328fg3.k == 4 ? ((Double) c5328fg3.l).doubleValue() : 0.0d));
            } else if (b == 3) {
                c0822Gi1.b(c5328fg3.m, c5328fg3.k == 5 ? (String) c5328fg3.l : "");
            } else if (b == 4) {
                c0822Gi1.b(c5328fg3.m, (c5328fg3.k == 6 ? (AbstractC4147cE) c5328fg3.l : AbstractC4147cE.g).p());
            }
        }
    }
}
