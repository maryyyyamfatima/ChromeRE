package defpackage;

import com.google.android.libraries.elements.interfaces.ImageProxy;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Og1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1851Og1 {
    public static AbstractC9095qe2 a(ImageProxy imageProxy) {
        Iterator it = imageProxy.sources().iterator();
        while (it.hasNext()) {
            ImageSourceProxy imageSourceProxy = (ImageSourceProxy) it.next();
            if (imageSourceProxy.imageData().length != 0) {
                return new C3242Yy2(imageSourceProxy.imageData());
            }
        }
        return C5785h.a;
    }
}
