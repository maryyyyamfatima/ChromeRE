package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.android.libraries.elements.interfaces.DimensionUnit;
import defpackage.C0976Hn0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DimensionProxyImplFbs extends DimensionProxy {
    private final C0976Hn0 dimension;

    public DimensionProxyImplFbs(C0976Hn0 c0976Hn0) {
        this.dimension = c0976Hn0;
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionProxy
    public float value() {
        return this.dimension.b();
    }

    @Override // com.google.android.libraries.elements.interfaces.DimensionProxy
    public DimensionUnit unit() {
        C0976Hn0 c0976Hn0 = this.dimension;
        int i = c0976Hn0.b.getInt(c0976Hn0.a + 4);
        if (i == 1) {
            return DimensionUnit.DIMENSION_UNIT_POINT;
        }
        if (i == 2) {
            return DimensionUnit.DIMENSION_UNIT_FRACTION;
        }
        return DimensionUnit.DIMENSION_UNIT_UNKNOWN;
    }
}
