package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.abstractdataimpl.fbs.LayoutPropertiesConverterImplFbs;
import com.google.android.libraries.elements.converters.h;
import com.google.android.libraries.elements.interfaces.AlignItems;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: By1 */
/* loaded from: classes.dex */
public final class C0252By1 implements InterfaceC9641sD2 {
    public static final TL2 a;

    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 168772996;
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C11269wy1 c11269wy1 = new C11269wy1();
        C11269wy1.h(byteBuffer, c11269wy1);
        return c11269wy1;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        LayoutPropertiesConverterImplFbs layoutPropertiesConverterImplFbs = new LayoutPropertiesConverterImplFbs((C11269wy1) obj);
        final TZ l = interfaceC8177nx0.l();
        float aspectRatio = layoutPropertiesConverterImplFbs.aspectRatio();
        if (aspectRatio > 0.0f) {
            l.b(aspectRatio);
        }
        if (layoutPropertiesConverterImplFbs.flexBasis() != null) {
            if (AbstractC0122Ay1.a[layoutPropertiesConverterImplFbs.flexBasis().unit().ordinal()] != 1) {
                ((BY) l.h.b0()).M0(l.a.a(layoutPropertiesConverterImplFbs.flexBasis().value()));
                l.k();
            } else {
                ((BY) l.h.b0()).X(layoutPropertiesConverterImplFbs.flexBasis().value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.hasFlexGrow()) {
            ((BY) l.h.b0()).s1(layoutPropertiesConverterImplFbs.flexGrow());
            l.k();
        }
        if (layoutPropertiesConverterImplFbs.hasFlexShrink()) {
            l.i(layoutPropertiesConverterImplFbs.flexShrink());
        }
        int i = AbstractC0122Ay1.b[layoutPropertiesConverterImplFbs.positionType().ordinal()];
        if (i == 1) {
            l.q(EnumC12267zs4.i);
        } else if (i == 2 || i == 3) {
            l.q(EnumC12267zs4.h);
        }
        if (layoutPropertiesConverterImplFbs.width() != null) {
            DimensionProxy width = layoutPropertiesConverterImplFbs.width();
            if (AbstractC0122Ay1.a[width.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).F0(l.a.a(width.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).Q(width.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.height() != null) {
            DimensionProxy height = layoutPropertiesConverterImplFbs.height();
            if (AbstractC0122Ay1.a[height.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).d(l.a.a(height.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).A0(height.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.maxWidth() != null) {
            DimensionProxy maxWidth = layoutPropertiesConverterImplFbs.maxWidth();
            if (AbstractC0122Ay1.a[maxWidth.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).f1(l.a.a(maxWidth.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).g0(maxWidth.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.maxHeight() != null) {
            DimensionProxy maxHeight = layoutPropertiesConverterImplFbs.maxHeight();
            if (AbstractC0122Ay1.a[maxHeight.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).z0(l.a.a(maxHeight.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).J1(maxHeight.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.minWidth() != null) {
            DimensionProxy minWidth = layoutPropertiesConverterImplFbs.minWidth();
            if (AbstractC0122Ay1.a[minWidth.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).V1(l.a.a(minWidth.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).i1(minWidth.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.minHeight() != null) {
            DimensionProxy minHeight = layoutPropertiesConverterImplFbs.minHeight();
            if (AbstractC0122Ay1.a[minHeight.unit().ordinal()] != 1) {
                ((BY) l.h.b0()).O(l.a.a(minHeight.value()));
                l.k();
            } else {
                ((BY) l.h.b0()).O1(minHeight.value() * 100.0f);
                l.k();
            }
        }
        if (layoutPropertiesConverterImplFbs.margin() != null) {
            AbstractC1625Mn0.b(layoutPropertiesConverterImplFbs.margin(), new InterfaceC1496Ln0() { // from class: xy1
                @Override // defpackage.InterfaceC1496Ln0
                public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                    int i2 = AbstractC0122Ay1.a[dimensionProxy.unit().ordinal()];
                    TZ tz = TZ.this;
                    if (i2 == 1) {
                        ((BY) tz.h.b0()).y0(enumC10209ts4, dimensionProxy.value() * 100.0f);
                        tz.k();
                    } else {
                        tz.o(enumC10209ts4, tz.a.a(dimensionProxy.value()));
                    }
                }
            });
        }
        if (layoutPropertiesConverterImplFbs.position() != null) {
            AbstractC1625Mn0.b(layoutPropertiesConverterImplFbs.position(), new InterfaceC1496Ln0() { // from class: yy1
                @Override // defpackage.InterfaceC1496Ln0
                public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                    int i2 = AbstractC0122Ay1.a[dimensionProxy.unit().ordinal()];
                    TZ tz = TZ.this;
                    if (i2 == 1) {
                        ((BY) tz.h.b0()).S0(enumC10209ts4, dimensionProxy.value() * 100.0f);
                        tz.k();
                    } else {
                        tz.p(enumC10209ts4, tz.a.a(dimensionProxy.value()));
                    }
                }
            });
        }
        AlignItems alignSelf = layoutPropertiesConverterImplFbs.alignSelf();
        AlignItems alignItems = AlignItems.ALIGN_ITEMS_UNKNOWN;
        TL2 tl2 = a;
        if (alignSelf != alignItems) {
            ((BY) l.h.b0()).e0((EnumC8151ns4) tl2.get(alignSelf));
            l.k();
        }
        if (layoutPropertiesConverterImplFbs.padding() != null) {
            AbstractC1625Mn0.b(layoutPropertiesConverterImplFbs.padding(), new InterfaceC1496Ln0() { // from class: zy1
                @Override // defpackage.InterfaceC1496Ln0
                public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                    int i2 = AbstractC0122Ay1.a[dimensionProxy.unit().ordinal()];
                    TZ tz = TZ.this;
                    if (i2 == 1) {
                        ((BY) tz.h.b0()).c1(enumC10209ts4, dimensionProxy.value() * 100.0f);
                        tz.k();
                    } else {
                        ((BY) tz.h.b0()).a1(enumC10209ts4, tz.a.a(dimensionProxy.value()));
                        tz.k();
                    }
                }
            });
        }
        boolean z = l instanceof T40;
        if (z || (l instanceof C11118wY2)) {
            EnumC10552us4 enumC10552us4 = null;
            EnumC8151ns4 enumC8151ns4 = layoutPropertiesConverterImplFbs.alignItems() != alignItems ? (EnumC8151ns4) tl2.get(layoutPropertiesConverterImplFbs.alignItems()) : null;
            EnumC8151ns4 enumC8151ns42 = layoutPropertiesConverterImplFbs.alignContent() != alignItems ? (EnumC8151ns4) tl2.get(layoutPropertiesConverterImplFbs.alignContent()) : null;
            int i2 = AbstractC0122Ay1.c[layoutPropertiesConverterImplFbs.flexWrap().ordinal()];
            Bs4 bs4 = i2 != 2 ? i2 != 3 ? i2 != 4 ? null : Bs4.i : Bs4.h : Bs4.g;
            switch (AbstractC0122Ay1.d[layoutPropertiesConverterImplFbs.justifyContent().ordinal()]) {
                case 1:
                case 2:
                    enumC10552us4 = EnumC10552us4.g;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    enumC10552us4 = EnumC10552us4.i;
                    break;
                case 4:
                    enumC10552us4 = EnumC10552us4.h;
                    break;
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    enumC10552us4 = EnumC10552us4.j;
                    break;
                case 6:
                    enumC10552us4 = EnumC10552us4.k;
                    break;
                case 7:
                    enumC10552us4 = EnumC10552us4.l;
                    break;
            }
            if (z) {
                T40 t40 = (T40) l;
                if (enumC8151ns4 != null) {
                    t40.x(enumC8151ns4);
                }
                if (bs4 != null) {
                    t40.F(bs4);
                }
                if (enumC10552us4 != null) {
                    t40.z(enumC10552us4);
                }
                if (enumC8151ns42 != null) {
                    t40.w(enumC8151ns42);
                }
            } else {
                C11118wY2 c11118wY2 = (C11118wY2) l;
                if (enumC8151ns4 != null) {
                    c11118wY2.x(enumC8151ns4);
                }
                if (bs4 != null) {
                    c11118wY2.z(bs4);
                }
                if (enumC10552us4 != null) {
                    c11118wY2.y(enumC10552us4);
                }
                if (enumC8151ns42 != null) {
                    c11118wY2.w(enumC8151ns42);
                }
            }
        }
        int i3 = AbstractC0122Ay1.e[layoutPropertiesConverterImplFbs.semanticContentAttribute().ordinal()];
        if (i3 == 1) {
            ((BY) l.h.b0()).j1(EnumC9866ss4.i);
            l.k();
        } else if (i3 == 2 || i3 == 3 || i3 == 4) {
            ((BY) l.h.b0()).j1(EnumC9866ss4.h);
            l.k();
        } else {
            ((BY) l.h.b0()).j1(EnumC9866ss4.g);
            l.k();
        }
    }

    static {
        C0822Gi1 a2 = AbstractC0952Hi1.a();
        a2.b(AlignItems.ALIGN_ITEMS_AUTO, EnumC8151ns4.g);
        a2.b(AlignItems.ALIGN_ITEMS_START, EnumC8151ns4.h);
        a2.b(AlignItems.ALIGN_ITEMS_END, EnumC8151ns4.j);
        a2.b(AlignItems.ALIGN_ITEMS_CENTER, EnumC8151ns4.i);
        a2.b(AlignItems.ALIGN_ITEMS_STRETCH, EnumC8151ns4.k);
        AlignItems alignItems = AlignItems.ALIGN_ITEMS_BASELINE_FIRST;
        EnumC8151ns4 enumC8151ns4 = EnumC8151ns4.l;
        a2.b(alignItems, enumC8151ns4);
        a2.b(AlignItems.ALIGN_ITEMS_BASELINE_LAST, enumC8151ns4);
        a = a2.a(true);
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void c(InterfaceC8177nx0 interfaceC8177nx0) {
        ((h) interfaceC8177nx0).d.i(1.0f);
    }
}
