package defpackage;

import android.graphics.Rect;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zJ1 */
/* loaded from: classes.dex */
public abstract class AbstractC12071zJ1 {
    public static final C2826Vt1 a = C2826Vt1.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final C2826Vt1 b = C2826Vt1.a("id", "layers", "w", "h", "p", "u");
    public static final C2826Vt1 c = C2826Vt1.a("list");
    public static final C2826Vt1 d = C2826Vt1.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0047. Please report as an issue. */
    public static C8985qJ1 a(C3346Zt1 c3346Zt1) {
        HashMap hashMap;
        ArrayList arrayList;
        C1593Mg3 c1593Mg3;
        float f;
        float f2;
        HashMap hashMap2;
        C1593Mg3 c1593Mg32;
        int i;
        int i2;
        float f3;
        float f4;
        int i3;
        ArrayList arrayList2;
        float c2 = C74.c();
        C3487aJ1 c3487aJ1 = new C3487aJ1();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        C1593Mg3 c1593Mg33 = new C1593Mg3();
        C8985qJ1 c8985qJ1 = new C8985qJ1();
        c3346Zt1.c();
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        while (c3346Zt1.i()) {
            float f8 = f5;
            int i6 = 1;
            switch (c3346Zt1.C(a)) {
                case 0:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg3 = c1593Mg33;
                    f = f6;
                    f2 = f7;
                    i4 = c3346Zt1.r();
                    f5 = f8;
                    c1593Mg33 = c1593Mg3;
                    f7 = f2;
                    hashMap5 = hashMap;
                    f6 = f;
                    break;
                case 1:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg3 = c1593Mg33;
                    f = f6;
                    f2 = f7;
                    i5 = c3346Zt1.r();
                    f5 = f8;
                    c1593Mg33 = c1593Mg3;
                    f7 = f2;
                    hashMap5 = hashMap;
                    f6 = f;
                    break;
                case 2:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    i = i4;
                    i2 = i5;
                    f6 = (float) c3346Zt1.k();
                    f5 = f8;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    i = i4;
                    i2 = i5;
                    f7 = ((float) c3346Zt1.k()) - 0.01f;
                    f5 = f8;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 4:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    i = i4;
                    i2 = i5;
                    f5 = (float) c3346Zt1.k();
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    f3 = f6;
                    f4 = f7;
                    i = i4;
                    i2 = i5;
                    String[] split = c3346Zt1.s().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        c8985qJ1.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 6:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    f3 = f6;
                    f4 = f7;
                    i = i4;
                    i2 = i5;
                    c3346Zt1.b();
                    int i7 = 0;
                    while (c3346Zt1.i()) {
                        C2456Sx1 a2 = AbstractC2586Tx1.a(c3346Zt1, c8985qJ1);
                        if (a2.e == 3) {
                            i7++;
                        }
                        arrayList3.add(a2);
                        c3487aJ1.i(a2.d, a2);
                        if (i7 > 4) {
                            AbstractC5888hI1.a("You have " + i7 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    c3346Zt1.e();
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 7:
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    f4 = f7;
                    c3346Zt1.b();
                    while (c3346Zt1.i()) {
                        ArrayList arrayList5 = new ArrayList();
                        C3487aJ1 c3487aJ12 = new C3487aJ1();
                        c3346Zt1.c();
                        HashMap hashMap6 = hashMap5;
                        String str = null;
                        String str2 = null;
                        int i8 = 0;
                        int i9 = 0;
                        while (c3346Zt1.i()) {
                            float f9 = f6;
                            int C = c3346Zt1.C(b);
                            if (C != 0) {
                                int i10 = i5;
                                if (C != 1) {
                                    if (C == 2) {
                                        i8 = c3346Zt1.r();
                                    } else if (C == 3) {
                                        i9 = c3346Zt1.r();
                                    } else if (C == 4) {
                                        str2 = c3346Zt1.s();
                                    } else if (C == 5) {
                                        c3346Zt1.s();
                                    } else {
                                        c3346Zt1.F();
                                        c3346Zt1.I();
                                        i3 = i4;
                                    }
                                    f6 = f9;
                                    i5 = i10;
                                } else {
                                    c3346Zt1.b();
                                    while (c3346Zt1.i()) {
                                        C2456Sx1 a3 = AbstractC2586Tx1.a(c3346Zt1, c8985qJ1);
                                        c3487aJ12.i(a3.d, a3);
                                        arrayList5.add(a3);
                                        i4 = i4;
                                    }
                                    i3 = i4;
                                    c3346Zt1.e();
                                }
                                i4 = i3;
                                f6 = f9;
                                i5 = i10;
                            } else {
                                str = c3346Zt1.s();
                                f6 = f9;
                            }
                        }
                        float f10 = f6;
                        int i11 = i4;
                        int i12 = i5;
                        c3346Zt1.f();
                        if (str2 != null) {
                            hashMap4.put(str, new LJ1(i8, str, str2, i9));
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        i4 = i11;
                        hashMap5 = hashMap6;
                        f6 = f10;
                        i5 = i12;
                    }
                    hashMap2 = hashMap5;
                    f3 = f6;
                    i = i4;
                    i2 = i5;
                    c3346Zt1.e();
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 8:
                    arrayList = arrayList4;
                    c3346Zt1.c();
                    while (c3346Zt1.i()) {
                        if (c3346Zt1.C(c) == 0) {
                            c3346Zt1.b();
                            while (c3346Zt1.i()) {
                                C2826Vt1 c2826Vt1 = DR0.a;
                                c3346Zt1.c();
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                while (c3346Zt1.i()) {
                                    C1593Mg3 c1593Mg34 = c1593Mg33;
                                    int C2 = c3346Zt1.C(DR0.a);
                                    if (C2 != 0) {
                                        float f11 = f7;
                                        if (C2 == 1) {
                                            str4 = c3346Zt1.s();
                                        } else if (C2 == 2) {
                                            str5 = c3346Zt1.s();
                                        } else if (C2 == 3) {
                                            c3346Zt1.k();
                                        } else {
                                            c3346Zt1.F();
                                            c3346Zt1.I();
                                        }
                                        c1593Mg33 = c1593Mg34;
                                        f7 = f11;
                                    } else {
                                        str3 = c3346Zt1.s();
                                        c1593Mg33 = c1593Mg34;
                                    }
                                }
                                c3346Zt1.f();
                                hashMap5.put(str4, new C11424xR0(str3, str4, str5));
                                c1593Mg33 = c1593Mg33;
                            }
                            c3346Zt1.e();
                        } else {
                            c3346Zt1.F();
                            c3346Zt1.I();
                        }
                    }
                    c1593Mg32 = c1593Mg33;
                    f4 = f7;
                    c3346Zt1.f();
                    hashMap2 = hashMap5;
                    f3 = f6;
                    i = i4;
                    i2 = i5;
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 9:
                    c3346Zt1.b();
                    while (c3346Zt1.i()) {
                        C2826Vt1 c2826Vt12 = AR0.a;
                        ArrayList arrayList6 = new ArrayList();
                        c3346Zt1.c();
                        String str6 = null;
                        String str7 = null;
                        double d2 = 0.0d;
                        char c3 = 0;
                        while (c3346Zt1.i()) {
                            int C3 = c3346Zt1.C(AR0.a);
                            if (C3 != 0) {
                                arrayList2 = arrayList4;
                                if (C3 == 1) {
                                    c3346Zt1.k();
                                } else if (C3 == 2) {
                                    d2 = c3346Zt1.k();
                                } else if (C3 == 3) {
                                    str6 = c3346Zt1.s();
                                } else if (C3 == 4) {
                                    str7 = c3346Zt1.s();
                                } else if (C3 == 5) {
                                    c3346Zt1.c();
                                    while (c3346Zt1.i()) {
                                        if (c3346Zt1.C(AR0.b) == 0) {
                                            c3346Zt1.b();
                                            while (c3346Zt1.i()) {
                                                arrayList6.add((C3420a63) D50.a(c3346Zt1, c8985qJ1));
                                            }
                                            c3346Zt1.e();
                                        } else {
                                            c3346Zt1.F();
                                            c3346Zt1.I();
                                        }
                                    }
                                    c3346Zt1.f();
                                } else {
                                    c3346Zt1.F();
                                    c3346Zt1.I();
                                }
                            } else {
                                arrayList2 = arrayList4;
                                c3 = c3346Zt1.s().charAt(0);
                            }
                            arrayList4 = arrayList2;
                        }
                        ArrayList arrayList7 = arrayList4;
                        c3346Zt1.f();
                        C12110zR0 c12110zR0 = new C12110zR0(arrayList6, c3, d2, str6, str7);
                        c1593Mg33.g(c12110zR0.hashCode(), c12110zR0);
                        arrayList4 = arrayList7;
                    }
                    arrayList = arrayList4;
                    c3346Zt1.e();
                    hashMap2 = hashMap5;
                    c1593Mg32 = c1593Mg33;
                    f3 = f6;
                    f4 = f7;
                    i = i4;
                    i2 = i5;
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                case 10:
                    c3346Zt1.b();
                    while (c3346Zt1.i()) {
                        c3346Zt1.c();
                        while (c3346Zt1.i()) {
                            int C4 = c3346Zt1.C(d);
                            if (C4 == 0) {
                                c3346Zt1.s();
                            } else if (C4 == i6) {
                                c3346Zt1.k();
                            } else if (C4 == 2) {
                                c3346Zt1.k();
                            } else {
                                c3346Zt1.F();
                                c3346Zt1.I();
                            }
                            i6 = 1;
                        }
                        c3346Zt1.f();
                        arrayList4.add(new C4876eM1());
                        i6 = 1;
                    }
                    c3346Zt1.e();
                    arrayList = arrayList4;
                    hashMap2 = hashMap5;
                    c1593Mg32 = c1593Mg33;
                    f3 = f6;
                    f4 = f7;
                    i = i4;
                    i2 = i5;
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
                default:
                    hashMap2 = hashMap5;
                    arrayList = arrayList4;
                    c1593Mg32 = c1593Mg33;
                    f3 = f6;
                    f4 = f7;
                    i = i4;
                    i2 = i5;
                    c3346Zt1.F();
                    c3346Zt1.I();
                    f5 = f8;
                    f7 = f4;
                    f6 = f3;
                    i4 = i;
                    c1593Mg33 = c1593Mg32;
                    hashMap5 = hashMap2;
                    i5 = i2;
                    break;
            }
            arrayList4 = arrayList;
        }
        c8985qJ1.i = new Rect(0, 0, (int) (i4 * c2), (int) (i5 * c2));
        c8985qJ1.j = f6;
        c8985qJ1.k = f7;
        c8985qJ1.l = f5;
        c8985qJ1.h = arrayList3;
        c8985qJ1.g = c3487aJ1;
        c8985qJ1.c = hashMap3;
        c8985qJ1.d = hashMap4;
        c8985qJ1.f = c1593Mg33;
        c8985qJ1.e = hashMap5;
        return c8985qJ1;
    }
}
