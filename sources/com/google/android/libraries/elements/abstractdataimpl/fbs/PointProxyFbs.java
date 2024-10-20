package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.PointProxy;
import defpackage.C2322Rw2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PointProxyFbs extends PointProxy {
    private final C2322Rw2 pointFlat;

    public PointProxyFbs(C2322Rw2 c2322Rw2) {
        this.pointFlat = c2322Rw2;
    }

    @Override // com.google.android.libraries.elements.interfaces.PointProxy
    public float x() {
        return this.pointFlat.b();
    }

    @Override // com.google.android.libraries.elements.interfaces.PointProxy
    public float y() {
        return this.pointFlat.c();
    }
}
