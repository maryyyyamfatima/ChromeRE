package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mL0 */
/* loaded from: classes.dex */
public abstract class AbstractC7620mL0 extends AbstractC8508ov {
    public AbstractC7620mL0(C6144i21 c6144i21) {
        super(AbstractC7964nL0.a, c6144i21);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return status == null ? Status.m : status;
    }
}
