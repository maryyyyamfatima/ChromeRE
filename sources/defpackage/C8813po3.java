package defpackage;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import com.google.android.libraries.elements.abstractdataimpl.fbs.StylePropertiesProxyImplFbs;
import com.google.android.libraries.elements.converters.h;
import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.RectCornersProxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: po3 */
/* loaded from: classes.dex */
public final class C8813po3 implements InterfaceC9641sD2 {
    public final AbstractC9896sy0 a;
    public final TL2 b;
    public final TL2 c;
    public final boolean d = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 168774549;
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C8126no3 c8126no3 = new C8126no3();
        c8126no3.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return c8126no3;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        UF0 uf0;
        TZ tz;
        long j;
        C8126no3 c8126no3 = (C8126no3) obj;
        StylePropertiesProxyImplFbs stylePropertiesProxyImplFbs = new StylePropertiesProxyImplFbs(c8126no3);
        TZ l = interfaceC8177nx0.l();
        DisplayMetrics displayMetrics = c7849n00.f().getDisplayMetrics();
        int borderColor = (int) stylePropertiesProxyImplFbs.borderColor();
        float borderWidth = stylePropertiesProxyImplFbs.borderWidth();
        float max = borderWidth > 1.0f ? Math.max(0.0f, stylePropertiesProxyImplFbs.borderRadius() - (borderWidth / 2.0f)) : stylePropertiesProxyImplFbs.borderRadius();
        RectCornersProxy borderRadiusCorners = stylePropertiesProxyImplFbs.borderRadiusCorners();
        boolean a = AbstractC11769yR2.a(c7849n00.a);
        C7782mo3 c7782mo3 = new C7782mo3();
        if (borderColor != 0 || borderWidth != 0.0f || max != 0.0f) {
            C8257oB c8257oB = new C8257oB(c7849n00);
            C8600pB c8600pB = c8257oB.a;
            if (borderColor != 0) {
                c8257oB.a();
                C8600pB.d(c8600pB.h, borderColor);
                c7782mo3.b = borderColor;
                C8257oB c8257oB2 = c7782mo3.c;
                if (c8257oB2 != null) {
                    c8257oB2.a();
                    C8600pB.d(c8257oB2.a.h, borderColor);
                }
            }
            if (borderWidth != 0.0f) {
                c8257oB.a();
                int a2 = c8257oB.b.a(borderWidth);
                c8257oB.a();
                if (a2 < 0) {
                    c8600pB.getClass();
                    throw new IllegalArgumentException(AbstractC9307rF1.a("Given negative border width value: ", a2, " for edge ALL"));
                }
                C8600pB.d(c8600pB.g, a2);
            }
            if (max != 0.0f) {
                if (borderRadiusCorners == null) {
                    c8257oB.a();
                    int a3 = c8257oB.b.a(max);
                    c8257oB.a();
                    int i = 4;
                    int i2 = 0;
                    while (i2 < i) {
                        c8600pB.a[i2] = a3;
                        i2++;
                        i = 4;
                        c8600pB = c8600pB;
                    }
                } else {
                    if (borderRadiusCorners.topLeft() || ((!a && borderRadiusCorners.topStart()) || (a && borderRadiusCorners.topEnd()))) {
                        c8257oB.b(0, max);
                    }
                    if (borderRadiusCorners.topRight() || ((!a && borderRadiusCorners.topEnd()) || (a && borderRadiusCorners.topStart()))) {
                        c8257oB.b(1, max);
                    }
                    if (borderRadiusCorners.bottomLeft() || ((!a && borderRadiusCorners.bottomStart()) || (a && borderRadiusCorners.bottomEnd()))) {
                        c8257oB.b(3, max);
                    }
                    if (borderRadiusCorners.bottomRight() || ((!a && borderRadiusCorners.bottomEnd()) || (a && borderRadiusCorners.bottomStart()))) {
                        c8257oB.b(2, max);
                    }
                }
            }
            c7782mo3.c = c8257oB;
        }
        float opacity = stylePropertiesProxyImplFbs.opacity();
        double d = opacity;
        if (d >= 0.0d && d < 1.0d) {
            interfaceC8177nx0.m(EnumC8123no0.h, new C10223tv0(Float.valueOf(opacity)));
            l.a(opacity);
        }
        float scale = stylePropertiesProxyImplFbs.scale();
        double d2 = scale;
        if (d2 != 0.0d && d2 != 1.0d) {
            interfaceC8177nx0.m(EnumC8123no0.k, new C10223tv0(Float.valueOf(scale)));
            BY by = (BY) l.h.b0();
            C3975bk0 U1 = by.U1();
            U1.n = scale;
            if (scale == 1.0f) {
                U1.N &= -524289;
            } else {
                U1.N |= 524288;
            }
            if (scale == 1.0f) {
                by.a = (byte) (by.a & (-5));
            } else {
                by.a = (byte) (by.a | 4);
            }
            l.k();
        }
        float rotation = stylePropertiesProxyImplFbs.rotation();
        if (rotation != 0.0d) {
            interfaceC8177nx0.m(EnumC8123no0.l, new C10223tv0(Float.valueOf(rotation)));
            BY by2 = (BY) l.h.b0();
            C3975bk0 U12 = by2.U1();
            U12.p = rotation;
            if (rotation == 0.0f) {
                U12.N &= -2097153;
            } else {
                U12.N |= 2097152;
            }
            if (rotation == 0.0f) {
                by2.a = (byte) (by2.a & (-17));
            } else {
                by2.a = (byte) (by2.a | 16);
            }
            l.k();
        }
        PointProxy translation = stylePropertiesProxyImplFbs.translation();
        if (translation != null) {
            float x = translation.x();
            float y = translation.y();
            if (x < 0.0f || x > 0.0f) {
                C10223tv0 c10223tv0 = new C10223tv0(Float.valueOf(TypedValue.applyDimension(1, x, displayMetrics)));
                interfaceC8177nx0.m(EnumC8123no0.i, c10223tv0);
                l.h.a0().put(2, c10223tv0);
                l.k();
            }
            if (y < 0.0f || y > 0.0f) {
                C10223tv0 c10223tv02 = new C10223tv0(Float.valueOf(TypedValue.applyDimension(1, y, displayMetrics)));
                interfaceC8177nx0.m(EnumC8123no0.j, c10223tv02);
                l.h.a0().put(3, c10223tv02);
                l.k();
            }
        }
        if (max != 0.0f) {
            c7782mo3.a = TypedValue.applyDimension(1, max, displayMetrics);
        }
        if (borderRadiusCorners != null) {
            c7782mo3.d = borderRadiusCorners;
        }
        boolean equals = "deprecated_option_force_clip_bounds".equals(str);
        if (this.d || equals) {
            if (c8126no3.b(16) != 0) {
                l.g(c8126no3.h());
                if (c8126no3.h() && c7782mo3.a > 0.0f) {
                    C8470oo3 c8470oo3 = new C8470oo3(((int) c7782mo3.a) + ((int) (TypedValue.applyDimension(1, borderWidth, displayMetrics) / 2.0f)));
                    C3975bk0 U13 = ((BY) l.h.b0()).U1();
                    U13.N |= 32768;
                    U13.k = c8470oo3;
                    l.k();
                    C3975bk0 U14 = ((BY) l.h.b0()).U1();
                    U14.N |= 65536;
                    U14.l = true;
                    l.k();
                }
            }
        }
        int backgroundColor = (int) stylePropertiesProxyImplFbs.backgroundColor();
        if (backgroundColor != 0) {
            C1000Hs c1000Hs = new C1000Hs();
            c1000Hs.e = backgroundColor;
            c1000Hs.f = c7782mo3.a;
            c1000Hs.g = c7782mo3.d;
            c1000Hs.i = a;
            c7782mo3.e = c1000Hs;
        }
        c8126no3.getClass();
        UF0 uf02 = new UF0();
        int b = c8126no3.b(20);
        if (b != 0) {
            uf02.c(c8126no3.a(b + c8126no3.a), c8126no3.b);
        } else {
            uf02 = null;
        }
        if (uf02 != null) {
            UF0 uf03 = new UF0();
            int b2 = c8126no3.b(20);
            if (b2 != 0) {
                uf03.c(c8126no3.a(b2 + c8126no3.a), c8126no3.b);
                uf0 = uf03;
            } else {
                uf0 = null;
            }
            int i3 = 0;
            while (i3 < uf0.i()) {
                TF0 h = uf0.h(new TF0(), i3);
                if (h.k() == 1) {
                    if (((C0740Fs) this.b.get(Integer.valueOf(h.j()))) == null) {
                        throw new C10239ty0(AbstractC9076qb1.a("Unknown Flatbuffer extension: ", h.j()));
                    }
                    ByteBuffer f = h.f(6);
                    AbstractC7895n74.d();
                    int position = f.position() + TW1.a(f, ByteOrder.LITTLE_ENDIAN);
                    int i4 = position - f.getInt(position);
                    short s = f.getShort(i4);
                    if ((4 < s ? f.getShort(i4 + 4) : (short) 0) != 0) {
                        tz = l;
                        j = f.getInt(r10 + position) & 4294967295L;
                    } else {
                        tz = l;
                        j = 0;
                    }
                    int i5 = (int) j;
                    int i6 = (int) ((6 < s ? f.getShort(i4 + 6) : (short) 0) != 0 ? f.getInt(r4 + position) & 4294967295L : 0L);
                    if (i5 != 0 || i6 != 0) {
                        Drawable drawable = c7782mo3.e;
                        if (drawable == null) {
                            C1000Hs c1000Hs2 = new C1000Hs();
                            c1000Hs2.c = i6;
                            c1000Hs2.d = i5;
                            c1000Hs2.f = c7782mo3.a;
                            c1000Hs2.g = c7782mo3.d;
                            c7782mo3.e = c1000Hs2;
                        } else {
                            boolean z = drawable instanceof C1000Hs;
                            C1000Hs c1000Hs3 = (C1000Hs) drawable;
                            c1000Hs3.c = i6;
                            c1000Hs3.d = i5;
                        }
                    }
                } else {
                    tz = l;
                    int k = h.k();
                    AbstractC9896sy0 abstractC9896sy0 = this.a;
                    if (k == 2) {
                        Pair pair = (Pair) this.c.get(Integer.valueOf(h.j()));
                        if (pair != null) {
                            try {
                                try {
                                    ((C8678pQ2) pair.first).a(c7849n00, AbstractC5180fE1.a(h.f(6), (InterfaceC7751mj2) pair.second, XF0.d()), c7782mo3);
                                } catch (C1127Ir1 e) {
                                    e = e;
                                    abstractC9896sy0.d(EnumC11438xU.y, AbstractC9076qb1.a("Failed to set PB Style Property Extension in StylePropertiesConverterFlat. Extension id: ", h.j()), u80, e);
                                    i3++;
                                    l = tz;
                                }
                            } catch (C1127Ir1 e2) {
                                e = e2;
                            }
                        }
                    } else {
                        abstractC9896sy0.d(EnumC11438xU.u, AbstractC9076qb1.a("StylePropertiesExtensionConverterFlat: extension with unknown format: ", h.j()), u80, null);
                    }
                    i3++;
                    l = tz;
                }
                i3++;
                l = tz;
            }
        }
        TZ tz2 = l;
        Drawable drawable2 = c7782mo3.e;
        if (tz2 instanceof T40) {
            T40 t40 = (T40) tz2;
            t40.A(c7782mo3.a);
            if (drawable2 != null) {
                t40.y(drawable2);
            }
        } else if (drawable2 != null) {
            tz2.c(drawable2);
        }
        C8257oB c8257oB3 = c7782mo3.c;
        if (c8257oB3 != null) {
            c8257oB3.a();
            c8257oB3.b = null;
            C8600pB c8600pB2 = c8257oB3.a;
            c8600pB2.getClass();
            AY e3 = ((BY) tz2.h.b0()).e();
            e3.a |= 8192;
            e3.p = c8600pB2;
            tz2.k();
        }
    }

    public C8813po3(TL2 tl2, TL2 tl22, AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
        C0822Gi1 c0822Gi1 = new C0822Gi1(4);
        C14 it = ((QL2) tl2.entrySet()).iterator();
        while (true) {
            AbstractC11277x abstractC11277x = (AbstractC11277x) it;
            if (!abstractC11277x.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC11277x.next();
            ((C0740Fs) entry.getValue()).getClass();
            c0822Gi1.b(189078944, (C0740Fs) entry.getValue());
        }
        C0822Gi1 c0822Gi12 = new C0822Gi1(4);
        C14 it2 = ((QL2) tl22.entrySet()).iterator();
        while (true) {
            AbstractC11277x abstractC11277x2 = (AbstractC11277x) it2;
            if (abstractC11277x2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) abstractC11277x2.next();
                ((C8678pQ2) ((Pair) entry2.getValue()).first).getClass();
                c0822Gi12.b(Integer.valueOf(C9021qQ2.p.d.a), (Pair) entry2.getValue());
            } else {
                this.b = c0822Gi1.a(true);
                this.c = c0822Gi12.a(true);
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void c(InterfaceC8177nx0 interfaceC8177nx0) {
        TZ tz = ((h) interfaceC8177nx0).d;
        tz.a(1.0f);
        tz.g(true);
    }
}
