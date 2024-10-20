package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JSCommandResolver {
    public abstract Status resolve(byte[] bArr);

    public abstract void resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver);
}
