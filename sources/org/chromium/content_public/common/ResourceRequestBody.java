package org.chromium.content_public.common;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ResourceRequestBody {
    public final byte[] a;

    public ResourceRequestBody(byte[] bArr) {
        this.a = bArr;
    }

    public static ResourceRequestBody createFromEncodedNativeForm(byte[] bArr) {
        return new ResourceRequestBody(bArr);
    }

    public final byte[] getEncodedNativeForm() {
        return this.a;
    }
}
