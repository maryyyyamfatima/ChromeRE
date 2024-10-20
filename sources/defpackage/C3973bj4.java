package defpackage;

import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bj4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3973bj4 implements InterfaceC0218Br2 {
    public final /* synthetic */ C4316cj4 a;

    public C3973bj4(C4316cj4 c4316cj4) {
        this.a = c4316cj4;
    }

    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        PostTask.c(AbstractC5103f04.a, new RunnableC3629aj4(this, iArr));
    }
}
