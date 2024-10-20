package com.youtube.android.libraries.elements.templates;

import defpackage.AbstractC0901Gy0;
import defpackage.C3709ax0;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EkoProcessor {
    public static native Status nativeProcess(byte[] bArr, byte[] bArr2, boolean z, byte[][] bArr3);

    static {
        AbstractC0901Gy0.a();
    }

    public static C3709ax0 a(byte[] bArr, byte[] bArr2, boolean z) {
        byte[][] bArr3 = {null, null};
        Status nativeProcess = nativeProcess(bArr, bArr2, z, bArr3);
        if (nativeProcess.b()) {
            return new C3709ax0(nativeProcess, bArr3[0]);
        }
        return new C3709ax0(nativeProcess, null);
    }
}
