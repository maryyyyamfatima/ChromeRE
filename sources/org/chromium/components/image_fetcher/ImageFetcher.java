package org.chromium.components.image_fetcher;

import defpackage.C0037Ah1;
import defpackage.C0557Eh1;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class ImageFetcher {
    public final C0557Eh1 a;

    public abstract void a();

    public abstract void b();

    public abstract void c(C0037Ah1 c0037Ah1, Callback callback);

    public abstract void d(C0037Ah1 c0037Ah1, Callback callback);

    public abstract int e();

    public ImageFetcher(ImageFetcher imageFetcher) {
        this.a = imageFetcher.a;
    }

    public ImageFetcher(C0557Eh1 c0557Eh1) {
        this.a = c0557Eh1;
    }
}
