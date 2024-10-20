package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8281oF3 extends BasePendingResult {
    public final InterfaceC8624pF3 o;

    public C8281oF3(JH jh) {
        super((AbstractC10600v11) null);
        this.o = jh;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return this.o.a(status);
    }
}
