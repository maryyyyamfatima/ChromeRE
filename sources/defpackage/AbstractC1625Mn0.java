package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.libraries.elements.interfaces.DimensionEdgesProxy;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.DimensionUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1625Mn0 {
    public static void b(DimensionEdgesProxy dimensionEdgesProxy, InterfaceC1496Ln0 interfaceC1496Ln0) {
        c(dimensionEdgesProxy.all() != null, EnumC10209ts4.o, dimensionEdgesProxy.all(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.horizontal() != null, EnumC10209ts4.m, dimensionEdgesProxy.horizontal(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.vertical() != null, EnumC10209ts4.n, dimensionEdgesProxy.vertical(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.start() != null, EnumC10209ts4.k, dimensionEdgesProxy.start(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.end() != null, EnumC10209ts4.l, dimensionEdgesProxy.end(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.top() != null, EnumC10209ts4.h, dimensionEdgesProxy.top(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.right() != null, EnumC10209ts4.i, dimensionEdgesProxy.right(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.bottom() != null, EnumC10209ts4.j, dimensionEdgesProxy.bottom(), interfaceC1496Ln0);
        c(dimensionEdgesProxy.left() != null, EnumC10209ts4.g, dimensionEdgesProxy.left(), interfaceC1496Ln0);
    }

    public static void c(boolean z, EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy, InterfaceC1496Ln0 interfaceC1496Ln0) {
        if (z) {
            interfaceC1496Ln0.a(enumC10209ts4, dimensionProxy);
        }
    }

    public static int a(Resources resources, DimensionProxy dimensionProxy) {
        if (dimensionProxy == null || dimensionProxy.unit() == DimensionUnit.DIMENSION_UNIT_FRACTION || dimensionProxy.value() <= 0.0f) {
            return -1;
        }
        return FH0.a(TypedValue.applyDimension(1, dimensionProxy.value(), resources.getDisplayMetrics()));
    }
}
