package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.ClientResourceProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import defpackage.C4651di1;
import defpackage.HU;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ImageSourceProxyImplFbs extends ImageSourceProxy {
    private byte[] imageData;
    private final C4651di1 imageSource;

    public ImageSourceProxyImplFbs(C4651di1 c4651di1) {
        this.imageData = new byte[0];
        this.imageSource = c4651di1;
        int b = c4651di1.b(6);
        if ((b != 0 ? c4651di1.g(b) : 0) != 0) {
            ByteBuffer f = c4651di1.f(6);
            byte[] bArr = new byte[f.remaining()];
            this.imageData = bArr;
            f.get(bArr);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
    public String url() {
        C4651di1 c4651di1 = this.imageSource;
        int b = c4651di1.b(4);
        if (b != 0) {
            return c4651di1.d(b + c4651di1.a);
        }
        return null;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
    public byte[] imageData() {
        return this.imageData;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
    public long width() {
        if (this.imageSource.b(10) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
    public long height() {
        if (this.imageSource.b(12) != 0) {
            return r0.b.getInt(r1 + r0.a) & 4294967295L;
        }
        return 0L;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
    public ClientResourceProxy clientResource() {
        C4651di1 c4651di1 = this.imageSource;
        c4651di1.getClass();
        HU hu = new HU();
        int b = c4651di1.b(8);
        HU hu2 = null;
        if (b != 0) {
            hu.c(c4651di1.a(b + c4651di1.a), c4651di1.b);
        } else {
            hu = null;
        }
        if (hu == null) {
            return null;
        }
        C4651di1 c4651di12 = this.imageSource;
        c4651di12.getClass();
        HU hu3 = new HU();
        int b2 = c4651di12.b(8);
        if (b2 != 0) {
            hu3.c(c4651di12.a(b2 + c4651di12.a), c4651di12.b);
            hu2 = hu3;
        }
        return new ClientResourceProxyImplFbs(hu2);
    }
}
