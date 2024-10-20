package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;
import com.android.chrome.R;
import com.bumptech.glide.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.abstractdataimpl.fbs.ImageProxyImplFbs;
import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QZ0 extends WZ {
    public static final /* synthetic */ int Q = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Boolean D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C12160zb E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ImageProxy G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ImageProxy H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ImageProxy I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC2376Sh1 f11463J;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    float K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C2506Th1 L;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 N;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean O;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean P;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 30;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean r() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    public QZ0() {
        super("GlideImage");
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new PZ0();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || QZ0.class != wz.getClass()) {
            return false;
        }
        QZ0 qz0 = (QZ0) wz;
        Boolean bool = this.D;
        if (bool == null ? qz0.D != null : !bool.equals(qz0.D)) {
            return false;
        }
        C12160zb c12160zb = this.E;
        if (c12160zb == null ? qz0.E != null : !c12160zb.equals(qz0.E)) {
            return false;
        }
        U80 u80 = this.F;
        if (u80 == null ? qz0.F != null : !u80.equals(qz0.F)) {
            return false;
        }
        ImageProxy imageProxy = this.G;
        if (imageProxy == null ? qz0.G != null : !imageProxy.equals(qz0.G)) {
            return false;
        }
        ImageProxy imageProxy2 = this.H;
        if (imageProxy2 == null ? qz0.H != null : !imageProxy2.equals(qz0.H)) {
            return false;
        }
        ImageProxy imageProxy3 = this.I;
        if (imageProxy3 == null ? qz0.I != null : !imageProxy3.equals(qz0.I)) {
            return false;
        }
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.f11463J;
        if (interfaceC2376Sh1 == null ? qz0.f11463J != null : !interfaceC2376Sh1.equals(qz0.f11463J)) {
            return false;
        }
        if (Float.compare(this.K, qz0.K) != 0) {
            return false;
        }
        C2506Th1 c2506Th1 = this.L;
        if (c2506Th1 == null ? qz0.L != null : !c2506Th1.equals(qz0.L)) {
            return false;
        }
        if (this.M != qz0.M) {
            return false;
        }
        AbstractC9896sy0 abstractC9896sy0 = this.N;
        if (abstractC9896sy0 == null ? qz0.N == null : abstractC9896sy0.equals(qz0.N)) {
            return this.O == qz0.O && this.P == qz0.P;
        }
        return false;
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        PZ0 pz0 = (PZ0) interfaceC2671Uo1;
        PZ0 pz02 = (PZ0) interfaceC2671Uo12;
        pz0.a = pz02.a;
        pz0.b = pz02.b;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        QZ0 qz0 = (QZ0) super.k0();
        qz0.A = new PZ0();
        return qz0;
    }

    @Override // defpackage.AbstractC10593v00
    public final void K(C7849n00 c7849n00) {
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        float f = this.K;
        if (f > 0.0f) {
            C0251By0 c0251By0 = new C0251By0(f);
            WZ wz = c7849n00.f;
            String c = c7849n00.c();
            wz.getClass();
            if (wz.k == null) {
                wz.k = new ArrayList();
            }
            wz.k.add(new Nq4("imageprefetch", c0251By0, wz, c));
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        float width;
        ImageProxy imageProxy = this.I;
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        if (imageProxy.sources().isEmpty()) {
            width = 1.0f;
        } else {
            ImageSourceProxy imageSourceProxy = (ImageSourceProxy) imageProxy.sources().get(0);
            width = ((float) imageSourceProxy.width()) / ((float) imageSourceProxy.height());
        }
        PM1.b(i, i2, width, c8753pe3);
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        return new ImageView(context);
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        C10314uB c10314uB;
        AbstractC7809mt0 abstractC7809mt0;
        ImageProxy imageProxy = this.I;
        int i = this.M;
        AbstractC9896sy0 abstractC9896sy0 = this.N;
        ImageProxy imageProxy2 = this.G;
        ImageProxy imageProxy3 = this.H;
        U80 u80 = this.F;
        boolean z = this.O;
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        Context context = c7849n00.a;
        C8753pe3 c8753pe3 = new C8753pe3(interfaceC3331Zq1.getWidth(), interfaceC3331Zq1.getHeight());
        IN2 a = AbstractC3286Zh1.a(context, imageProxy, imageProxy2, imageProxy3, interfaceC3331Zq1.getWidth(), interfaceC3331Zq1.getHeight(), z);
        IN2 in2 = null;
        C12301zz c12301zz = null;
        if (a != null) {
            if (i == 1) {
                a.Q((C5623gY0) AbstractC3726b01.a.get());
            }
            TF0 processor = ((ImageProxyImplFbs) imageProxy).getProcessor();
            if (processor == null || processor.j() != 154604025) {
                c10314uB = null;
            } else {
                ByteBuffer f = processor.f(6);
                c10314uB = new C10314uB();
                c10314uB.c(f.position() + TW1.a(f, ByteOrder.LITTLE_ENDIAN), f);
            }
            if (c10314uB != null) {
                C12301zz c12301zz2 = new C12301zz();
                int b = c10314uB.b(20);
                if (b != 0) {
                    c12301zz2.c(c10314uB.a(b + c10314uB.a), c10314uB.b);
                } else {
                    c12301zz2 = null;
                }
                if (c12301zz2 != null) {
                    C12301zz c12301zz3 = new C12301zz();
                    int b2 = c10314uB.b(20);
                    if (b2 != 0) {
                        c12301zz3.c(c10314uB.a(b2 + c10314uB.a), c10314uB.b);
                        c12301zz = c12301zz3;
                    }
                    int b3 = c12301zz.b(4);
                    float f2 = b3 != 0 ? c12301zz.b.getFloat(b3 + c12301zz.a) : 0.0f;
                    if (f2 > 0.01f) {
                        ContentMode contentMode = imageProxy.contentMode();
                        Context context2 = c7849n00.a;
                        IN2 in22 = (IN2) a.y(new C0255Bz(context2, u80, abstractC9896sy0, contentMode, TypedValue.applyDimension(1, f2, context2.getResources().getDisplayMetrics())));
                        int i2 = AbstractC0125Az.a[imageProxy.contentMode().ordinal()];
                        if (i2 == 1) {
                            abstractC7809mt0 = AbstractC7809mt0.d;
                        } else if (i2 == 2) {
                            abstractC7809mt0 = AbstractC7809mt0.a;
                        } else {
                            abstractC7809mt0 = AbstractC7809mt0.c;
                        }
                        a = (IN2) in22.f(abstractC7809mt0);
                    }
                }
            }
            in2 = a;
        }
        PZ0 pz0 = (PZ0) this.A;
        pz0.a = in2;
        pz0.b = c8753pe3;
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        IN2 in2;
        C2506Th1 c2506Th1;
        ImageView imageView = (ImageView) obj;
        ImageProxy imageProxy = this.I;
        ImageProxy imageProxy2 = this.G;
        ImageProxy imageProxy3 = this.H;
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.f11463J;
        Boolean bool = this.D;
        U80 u80 = this.F;
        C12160zb c12160zb = this.E;
        PZ0 pz0 = (PZ0) this.A;
        IN2 in22 = pz0.a;
        C8753pe3 c8753pe3 = pz0.b;
        AbstractC9896sy0 abstractC9896sy0 = this.N;
        C2506Th1 c2506Th12 = this.L;
        boolean z = this.P;
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        if (in22 == null) {
            if (!z || AbstractC3286Zh1.d(c7849n00.a)) {
                return;
            }
            abstractC9896sy0.d(EnumC11438xU.v, AbstractC9307rF1.a("Failed to find a valid source for the image. Sources: ", imageProxy.sources().size(), ". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data."), u80, null);
            return;
        }
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.d(imageView.hashCode());
        }
        in22.D(new C3382a01());
        if (bool == null || !bool.booleanValue()) {
            in2 = in22;
            c2506Th1 = c2506Th12;
        } else {
            C1856Oh1 c1856Oh1 = (C1856Oh1) C1986Ph1.l.j();
            Iterator it = imageProxy.sources().iterator();
            while (it.hasNext()) {
                ImageSourceProxy imageSourceProxy = (ImageSourceProxy) it.next();
                C2116Qh1 c2116Qh1 = (C2116Qh1) C2246Rh1.o.j();
                IN2 in23 = in22;
                C2506Th1 c2506Th13 = c2506Th12;
                int width = (int) imageSourceProxy.width();
                if (c2116Qh1.h) {
                    c2116Qh1.l();
                    c2116Qh1.h = false;
                }
                C2246Rh1 c2246Rh1 = (C2246Rh1) c2116Qh1.g;
                c2246Rh1.j |= 8;
                c2246Rh1.m = width;
                int height = (int) imageSourceProxy.height();
                if (c2116Qh1.h) {
                    c2116Qh1.l();
                    c2116Qh1.h = false;
                }
                C2246Rh1 c2246Rh12 = (C2246Rh1) c2116Qh1.g;
                c2246Rh12.j |= 16;
                c2246Rh12.n = height;
                if (imageSourceProxy.url() != null) {
                    String url = imageSourceProxy.url();
                    if (c2116Qh1.h) {
                        c2116Qh1.l();
                        c2116Qh1.h = false;
                    }
                    C2246Rh1 c2246Rh13 = (C2246Rh1) c2116Qh1.g;
                    c2246Rh13.getClass();
                    url.getClass();
                    c2246Rh13.k = 1;
                    c2246Rh13.l = url;
                }
                if (c1856Oh1.h) {
                    c1856Oh1.l();
                    c1856Oh1.h = false;
                }
                C1986Ph1 c1986Ph1 = (C1986Ph1) c1856Oh1.g;
                C2246Rh1 c2246Rh14 = (C2246Rh1) c2116Qh1.j();
                c1986Ph1.getClass();
                c2246Rh14.getClass();
                InterfaceC1377Kp1 interfaceC1377Kp1 = c1986Ph1.j;
                if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
                    c1986Ph1.j = QX0.r(interfaceC1377Kp1);
                }
                c1986Ph1.j.add(c2246Rh14);
                in22 = in23;
                c2506Th12 = c2506Th13;
            }
            in2 = in22;
            c2506Th1 = c2506Th12;
            imageView.setTag(R.id.elements_image, (C1986Ph1) c1856Oh1.j());
        }
        IN2 in24 = in2;
        in24.H(new ZZ0(c8753pe3, imageView, imageProxy, interfaceC2376Sh1, imageProxy2, imageProxy3, c12160zb, abstractC9896sy0, c2506Th1), null, in24, DE0.a);
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        ImageView imageView = (ImageView) obj;
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.f11463J;
        Boolean bool = this.D;
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.e(imageView.hashCode());
        }
        Context context = c7849n00.a;
        if (!AbstractC3286Zh1.d(context)) {
            ComponentCallbacks2C5575gO2 d = a.d(context);
            d.getClass();
            d.n(new C4887eO2(imageView));
        }
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        imageView.setTag(R.id.elements_image, null);
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        QZ0 qz0 = (QZ0) wz;
        QZ0 qz02 = (QZ0) wz2;
        ImageProxy imageProxy = qz0 == null ? null : qz0.I;
        ImageProxy imageProxy2 = qz02.I;
        ImageProxy imageProxy3 = qz0 == null ? null : qz0.G;
        ImageProxy imageProxy4 = qz02.G;
        ImageProxy imageProxy5 = qz0 != null ? qz0.H : null;
        ImageProxy imageProxy6 = qz02.H;
        InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        return (Objects.equals(imageProxy2, imageProxy) && Objects.equals(imageProxy4, imageProxy3) && Objects.equals(imageProxy6, imageProxy5)) ? false : true;
    }

    @Override // defpackage.AbstractC10593v00
    public final void h(String str) {
        String url;
        str.getClass();
        if (str.equals("imageprefetch")) {
            PZ0 pz0 = (PZ0) this.A;
            IN2 in2 = pz0.a;
            C8753pe3 c8753pe3 = pz0.b;
            ImageProxy imageProxy = this.I;
            InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
            if (in2 != null) {
                boolean z = false;
                if (!imageProxy.sources().isEmpty() && (url = ((ImageSourceProxy) imageProxy.sources().get(0)).url()) != null) {
                    String scheme = AbstractC3286Zh1.c(url).getScheme();
                    if ("http".equals(scheme) || "https".equals(scheme)) {
                        z = true;
                    }
                }
                if (z && c8753pe3.a > 0 && c8753pe3.b > 0) {
                    IN2 in22 = (IN2) in2.c().e(AbstractC6410ip0.b);
                    int i = c8753pe3.a;
                    int i2 = c8753pe3.b;
                    in22.getClass();
                    in22.H(new C2982Wy2(in22.G, i, i2), null, in22, DE0.a);
                }
            }
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void j(String str) {
        str.getClass();
        if (str.equals("imageprefetch")) {
            InterfaceC0209Bp3 interfaceC0209Bp3 = AbstractC3726b01.a;
        }
    }
}
