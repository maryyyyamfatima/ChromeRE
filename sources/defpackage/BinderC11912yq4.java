package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yq4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC11912yq4 extends Binder {
    public final CB0 a;

    public BinderC11912yq4(CB0 cb0) {
        this.a = cb0;
    }

    public final void a(final Bq4 bq4) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = bq4.a;
        DB0 db0 = this.a.a;
        db0.getClass();
        C6905kF3 c6905kF3 = new C6905kF3();
        db0.a.execute(new BB0(db0, intent, c6905kF3));
        c6905kF3.a.b(new VV0(), new InterfaceC1702Nc2() { // from class: xq4
            @Override // defpackage.InterfaceC1702Nc2
            public final void b(AF3 af3) {
                Bq4.this.b.d(null);
            }
        });
    }
}
