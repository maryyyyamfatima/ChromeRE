package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import defpackage.HU;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ClientResourceProxyImplFbs extends ClientResourceProxy {
    private final HU clientResource;

    public ClientResourceProxyImplFbs(HU hu) {
        this.clientResource = hu;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
    public String bundleId() {
        HU hu = this.clientResource;
        int b = hu.b(4);
        if (b != 0) {
            return hu.d(b + hu.a);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
    public String imageName() {
        HU hu = this.clientResource;
        int b = hu.b(6);
        if (b != 0) {
            return hu.d(b + hu.a);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
    public long imageColor() {
        if (this.clientResource.b(8) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }
}
