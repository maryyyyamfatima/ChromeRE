package com.google.android.libraries.elements.abstractdataimpl.fbs;

import com.google.android.libraries.elements.interfaces.ContentMode;
import com.google.android.libraries.elements.interfaces.ImageFormatHint;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import defpackage.C1332Kg1;
import defpackage.C4651di1;
import defpackage.RP0;
import defpackage.TF0;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ImageProxyImplFbs extends ImageProxy {
    private final C1332Kg1 image;
    private final ArrayList imageSourceProxies;

    public ImageProxyImplFbs(C1332Kg1 c1332Kg1) {
        this.image = c1332Kg1;
        int b = c1332Kg1.b(4);
        this.imageSourceProxies = new ArrayList(b != 0 ? c1332Kg1.g(b) : 0);
        int i = 0;
        while (true) {
            int b2 = c1332Kg1.b(4);
            if (i >= (b2 != 0 ? c1332Kg1.g(b2) : 0)) {
                return;
            }
            ArrayList arrayList = this.imageSourceProxies;
            C4651di1 c4651di1 = new C4651di1();
            int b3 = c1332Kg1.b(4);
            if (b3 != 0) {
                c4651di1.c(c1332Kg1.a((i * 4) + c1332Kg1.e(b3)), c1332Kg1.b);
            } else {
                c4651di1 = null;
            }
            arrayList.add(new ImageSourceProxyImplFbs(c4651di1));
            i++;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageProxy
    public ArrayList sources() {
        return this.imageSourceProxies;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageProxy
    public boolean flipForRtlLayout() {
        C1332Kg1 c1332Kg1 = this.image;
        int b = c1332Kg1.b(10);
        return (b == 0 || c1332Kg1.b.get(b + c1332Kg1.a) == 0) ? false : true;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageProxy
    public ImageFormatHint imageFormatHint() {
        C1332Kg1 c1332Kg1 = this.image;
        int b = c1332Kg1.b(12);
        int i = b != 0 ? c1332Kg1.b.getInt(b + c1332Kg1.a) : 0;
        if (i == 1) {
            return ImageFormatHint.IMAGE_FORMAT_STATIC_WEBP;
        }
        if (i == 2) {
            return ImageFormatHint.IMAGE_FORMAT_STATIC_GIF;
        }
        if (i == 3) {
            return ImageFormatHint.IMAGE_FORMAT_ANIMATED_WEBP;
        }
        if (i == 4) {
            return ImageFormatHint.IMAGE_FORMAT_ANIMATED_GIF;
        }
        return ImageFormatHint.IMAGE_FORMAT_DEFAULT;
    }

    @Override // com.google.android.libraries.elements.interfaces.ImageProxy
    public ContentMode contentMode() {
        C1332Kg1 c1332Kg1 = this.image;
        int b = c1332Kg1.b(6);
        int i = b != 0 ? c1332Kg1.b.getInt(b + c1332Kg1.a) : 0;
        if (i == 1) {
            return ContentMode.CONTENT_MODE_SCALE_TO_FILL;
        }
        if (i == 2) {
            return ContentMode.CONTENT_MODE_SCALE_ASPECT_FIT;
        }
        if (i == 3) {
            return ContentMode.CONTENT_MODE_SCALE_ASPECT_FILL;
        }
        if (i == 4) {
            return ContentMode.CONTENT_MODE_CENTER;
        }
        return ContentMode.CONTENT_MODE_UNKNOWN;
    }

    public TF0 getProcessor() {
        C1332Kg1 c1332Kg1 = this.image;
        c1332Kg1.getClass();
        TF0 tf0 = new TF0();
        int b = c1332Kg1.b(8);
        if (b == 0) {
            return null;
        }
        tf0.c(c1332Kg1.a(b + c1332Kg1.a), c1332Kg1.b);
        return tf0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ImageProxyImplFbs) {
            return RP0.l(this.image, ((ImageProxyImplFbs) obj).image);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.image);
    }
}
