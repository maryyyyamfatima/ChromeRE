package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.SizeProxy;
import defpackage.C8410oe3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SizeProxyFbs extends SizeProxy {
    private final C8410oe3 sizeFlat;

    public SizeProxyFbs(C8410oe3 c8410oe3) {
        this.sizeFlat = c8410oe3;
    }

    @Override // com.google.android.libraries.elements.interfaces.SizeProxy
    public float width() {
        C8410oe3 c8410oe3 = this.sizeFlat;
        return c8410oe3.b.getFloat(c8410oe3.a + 0);
    }

    @Override // com.google.android.libraries.elements.interfaces.SizeProxy
    public float height() {
        C8410oe3 c8410oe3 = this.sizeFlat;
        return c8410oe3.b.getFloat(c8410oe3.a + 4);
    }
}
