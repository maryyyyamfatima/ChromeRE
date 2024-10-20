package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageTypeProxy;
import defpackage.C1332Kg1;
import defpackage.C5338fi1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ImageTypeProxyImplFbs extends ImageTypeProxy {
    private final C5338fi1 imageType;

    public ImageTypeProxyImplFbs(C5338fi1 c5338fi1) {
        this.imageType = c5338fi1;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
    public ImageProxy image() {
        C5338fi1 c5338fi1 = this.imageType;
        c5338fi1.getClass();
        C1332Kg1 c1332Kg1 = new C1332Kg1();
        int b = c5338fi1.b(4);
        if (b != 0) {
            c1332Kg1.c(c5338fi1.a(b + c5338fi1.a), c5338fi1.b);
        } else {
            c1332Kg1 = null;
        }
        if (c1332Kg1 != null) {
            return new ImageProxyImplFbs(c1332Kg1);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
    public ImageProxy defaultImage() {
        C1332Kg1 h = this.imageType.h();
        if (h != null) {
            return new ImageProxyImplFbs(h);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
    public ImageProxy errorImage() {
        C1332Kg1 i = this.imageType.i();
        if (i != null) {
            return new ImageProxyImplFbs(i);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
    public float preloadWidthHint() {
        C5338fi1 c5338fi1 = this.imageType;
        int b = c5338fi1.b(12);
        if (b != 0) {
            return c5338fi1.b.getFloat(b + c5338fi1.a);
        }
        return 0.0f;
    }
}
