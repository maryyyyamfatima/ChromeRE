package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.ContainerTypeProxy;
import defpackage.Y40;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ContainerTypeProxyImplFbs extends ContainerTypeProxy {
    private final Y40 containerType;

    public ContainerTypeProxyImplFbs(Y40 y40) {
        this.containerType = y40;
    }

    @Override // com.google.android.libraries.elements.interfaces.ContainerTypeProxy
    public boolean shouldMaterializeView() {
        Y40 y40 = this.containerType;
        int b = y40.b(4);
        return (b == 0 || y40.b.get(b + y40.a) == 0) ? false : true;
    }
}
