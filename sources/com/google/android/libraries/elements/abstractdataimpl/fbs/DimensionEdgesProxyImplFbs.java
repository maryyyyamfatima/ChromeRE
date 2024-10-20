package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.DimensionEdgesProxy;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import defpackage.C0976Hn0;
import defpackage.C1106In0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DimensionEdgesProxyImplFbs extends DimensionEdgesProxy {
    private final C1106In0 dimensionEdges;

    public DimensionEdgesProxyImplFbs(C1106In0 c1106In0) {
        this.dimensionEdges = c1106In0;
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy top() {
        return returnValue(this.dimensionEdges.o());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy left() {
        return returnValue(this.dimensionEdges.l());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy bottom() {
        return returnValue(this.dimensionEdges.i());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy right() {
        return returnValue(this.dimensionEdges.m());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy start() {
        return returnValue(this.dimensionEdges.n());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy end() {
        return returnValue(this.dimensionEdges.j());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy horizontal() {
        return returnValue(this.dimensionEdges.k());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy vertical() {
        return returnValue(this.dimensionEdges.p());
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
    public DimensionProxy all() {
        return returnValue(this.dimensionEdges.h());
    }

    public static DimensionProxy returnValue(C0976Hn0 c0976Hn0) {
        if (c0976Hn0 != null) {
            return new DimensionProxyImplFbs(c0976Hn0);
        }
        return null;
    }
}
