package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11978z21 extends AbstractBinderC11635y21 {
    public final byte[] h;

    public BinderC11978z21(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.h = bArr;
    }

    @Override // defpackage.AbstractBinderC11635y21
    public final byte[] i1() {
        return this.h;
    }
}
