package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.CellTypeProxy;
import defpackage.C8978qI;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CellTypeProxyImplFbs extends CellTypeProxy {
    private final C8978qI cellType;

    public CellTypeProxyImplFbs(C8978qI c8978qI) {
        this.cellType = c8978qI;
    }

    @Override // com.google.android.libraries.elements.interfaces.CellTypeProxy
    public long highlightedBackgroundColor() {
        if (this.cellType.b(4) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }
}
